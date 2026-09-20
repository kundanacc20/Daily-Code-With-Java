package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final int accountNumber;
    private final String holderName;
    private double balance;
    private final List<Transaction> transactions = new ArrayList<>();

    public Account(int accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount));
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new RuntimeException("Insufficient Balance!");
        }
        balance -= amount;
        transactions.add(new Transaction(TransactionType.WITHDRAW, amount));
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
