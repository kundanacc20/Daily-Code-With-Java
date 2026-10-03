package exceptional.handling.bank;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {
    private final Map<Integer, BankAccount> accounts =
            new HashMap<>();

    public void addAccount(BankAccount account){
        accounts.put(account.getAccountNumber(),account);
    }

    private BankAccount findAccount(int accountNumber)
        throws AccountNotFoundException {
        BankAccount account = accounts.get(accountNumber);

        if(account == null){
            throw new AccountNotFoundException(
                    "Account not found: "+accountNumber
            );
        }
        return account;
    }

    public void transfer(int from, int to, double amount)
        throws BankException {
        String transactionId = UUID.randomUUID().toString();

        BankAccount sender = findAccount(from);
        BankAccount receiver = findAccount(to);

        if(from == to) {
            throw new InvalidAmountException(
                    "Source and destination accounts must differ."
            );
        }

            boolean debited = false;

            try {
                synchronized (sender){
                    synchronized (receiver){
                        sender.validateWithdrawal(amount);
                        sender.debit(amount);
                        debited = true;

                        if(amount > 8000){
                            throw new IllegalStateException(
                                    "simulated credit operation failure"
                            );
                        }
                        receiver.credit(amount);

                        Transaction transaction = new Transaction(
                                transactionId,
                                from,
                                to,
                                amount,
                                TransactionType.TRANSFER,
                                TransactionStatus.SUCCESS,
                                LocalDate.now()
                        );
                        sender.addTransaction(transaction);
                        receiver.addTransaction(transaction);
                    }
                }
            } catch (BankException e){
                throw e;
            } catch (RuntimeException e){
                if(debited){
                    sender.rollbackDebit(amount);
                }

                Transaction failedTransaction = new Transaction(
                        transactionId,
                        from,
                        to,
                        amount,
                        TransactionType.TRANSFER,
                        TransactionStatus.ROLLED_BACK,
                        LocalDate.now()
                );
                sender.addTransaction(failedTransaction);

                throw new TransactionFailedException(
                        "Transaction "+transactionId
                        +" failed and was rolled back", e
                );
            }
        }
        public void displayBalance(int accountNumber) throws
                AccountNotFoundException {
        BankAccount account = findAccount(accountNumber);

        System.out.println(
                account.getAccountNumber()+" : "
                +account.getBalance()
        );
    }
}
