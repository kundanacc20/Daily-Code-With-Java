package selfpracticejavacode.BankingApplication.service;

import selfpracticejavacode.BankingApplication.model.Account;
import selfpracticejavacode.BankingApplication.model.Transaction;
import selfpracticejavacode.BankingApplication.exception.AccountNotFoundException;
import selfpracticejavacode.BankingApplication.exception.BankException;
import selfpracticejavacode.BankingApplication.exception.InvalidAmountException;
import selfpracticejavacode.BankingApplication.exception.AccountBlockedException;
import selfpracticejavacode.BankingApplication.exception.TransactionConflictException;
import selfpracticejavacode.BankingApplication.model.AccountStatus;
import selfpracticejavacode.BankingApplication.model.TransactionStatus;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankService {

    private final Map<Long, Account> accounts =
            new ConcurrentHashMap<>();

    private final AuditService auditService;

    public BankService(AuditService auditService) {
        this.auditService = auditService;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    private Account findAccount(long accountNumber)
            throws AccountNotFoundException {

        Account account = accounts.get(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException(
                    "Account not found: " + accountNumber
            );
        }

        return account;
    }

    public synchronized Transaction transfer(
            long from,
            long to,
            BigDecimal amount) throws BankException {

        Account sender = findAccount(from);
        Account receiver = findAccount(to);

        if (from == to) {
            throw new InvalidAmountException(
                    "Cannot transfer to the same account."
            );
        }

        if (amount == null ||
                amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException(
                    "Transfer amount must be positive."
            );
        }

        if (receiver.getStatus() != AccountStatus.ACTIVE) {
            throw new AccountBlockedException(
                    "Receiver account is not active."
            );
        }

        sender.validateWithdrawal(amount);

        boolean debited = false;
        boolean credited = false;

        try {
            sender.debit(amount);
            debited = true;

            // Simulate payment gateway failure.
            if (amount.compareTo(new BigDecimal("8000")) > 0) {
                throw new IllegalStateException(
                        "Payment gateway processing failed."
                );
            }

            receiver.credit(amount);
            credited = true;

            Transaction transaction = Transaction.create(
                    from,
                    to,
                    amount,
                    TransactionStatus.SUCCESS,
                    "Transfer successful"
            );

            auditService.log(transaction);

            return transaction;

        } catch (RuntimeException e) {

            if (credited) {
                receiver.rollbackCredit(amount);
            }

            if (debited) {
                sender.rollbackDebit(amount);
            }

            Transaction transaction = Transaction.create(
                    from,
                    to,
                    amount,
                    TransactionStatus.ROLLED_BACK,
                    "Transfer rolled back"
            );

            auditService.log(transaction);

            throw new TransactionConflictException(
                    "Transfer failed. Changes rolled back.",
                    e
            );
        }
    }

    public Account getAccount(long accountNumber)
            throws AccountNotFoundException {

        return findAccount(accountNumber);
    }
}