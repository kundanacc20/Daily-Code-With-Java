package exceptional.handling.bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final int accountNumber;
    private final String holderName;
    private double balance;
    private double dailyWithdrawn;
    private final double dailyLimit = 10000;

    private final List<Transaction> transactions =
            new ArrayList<>();
    public BankAccount(int accountNumber,
                       String holderName,
                       double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public synchronized void validateWithdrawal(double amount)
        throws BankException {
        if(amount <= 0){
            throw new InvalidAmountException(
                    "Amount must be greater than zero"
            );
        }

        if(dailyWithdrawn + amount > dailyLimit){
            throw new DailyLimitExceededException(
                    "Daily withdrawal limit exceed."
            );
        }
    }

    public synchronized void debit(double amount){
        balance -= amount;
        dailyWithdrawn += amount;
    }

    public synchronized void credit(double amount){
        balance = balance+amount;
    }

    public synchronized void rollbackDebit(double amount){
        balance = balance + amount;
        dailyWithdrawn -= amount;
    }

    public synchronized void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public synchronized double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public synchronized void displayTransactions(){
        transactions.forEach(System.out::println);
    }
}
