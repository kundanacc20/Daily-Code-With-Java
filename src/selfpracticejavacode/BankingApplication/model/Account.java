package selfpracticejavacode.BankingApplication.model;

import selfpracticejavacode.BankingApplication.exception.BankException;
import selfpracticejavacode.BankingApplication.exception.AccountBlockedException;
import selfpracticejavacode.BankingApplication.exception.DailyLimitExceededException;
import selfpracticejavacode.BankingApplication.exception.InsufficientBalanceException;
import selfpracticejavacode.BankingApplication.exception.InvalidAmountException;

import java.math.BigDecimal;

import java.math.BigDecimal;

public class Account {
    private final long accountNumber;
    private final String customerName;

    private BigDecimal balance;
    private BigDecimal dailyWithdrawn = BigDecimal.ZERO;

    private final BigDecimal dailyLimit =
            new BigDecimal("10000");

    private AccountStatus status = AccountStatus.ACTIVE;
    private long version = 0;

    public Account(
            long accountNumber,
            String customerName,
            BigDecimal balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void validateWithdrawal(BigDecimal amount)
        throws BankException {
        if(amount == null || amount.compareTo(BigDecimal.ZERO)<= 0){
            throw new InvalidAmountException(
                    "Amount must be greater than zero"
            );
        }
        if(status != AccountStatus.ACTIVE){
            throw new AccountBlockedException(
                    "Account is not active: "+accountNumber);
        }
        if(balance.compareTo(amount)<0){
            throw new InsufficientBalanceException(
                    "Insufficient balance in account: "
                    +accountNumber
            );
        }

        if(dailyWithdrawn.add(amount).compareTo(dailyLimit)>0){
            throw new DailyLimitExceededException(
                    "Daily limit exceed for account: "
                    +accountNumber
            );
        }
    }

    public void debit(BigDecimal amount){
        balance = balance.subtract(amount);
        dailyWithdrawn = dailyWithdrawn.add(amount);
        version++;
    }

    public void credit(BigDecimal amount){
        balance = balance.add(amount);
        version++;
    }

    public void rollbackDebit(BigDecimal amount){
        balance = balance.add(amount);
        dailyWithdrawn = dailyWithdrawn.subtract(amount);
        version++;
    }

    public void rollbackCredit(BigDecimal amount){
        balance = balance.subtract(amount);
        version++;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public long getVersion(){
        return version;
    }

    public AccountStatus getStatus(){
        return status;
    }

    public void setStatus(AccountStatus status){
        this.status = status;
    }
}
