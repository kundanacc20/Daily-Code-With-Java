package exceptional.handling.day03october2026;

import bank.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    private double dailyWithdrawn;
    private final double dailyLimit = 10000;

    private List<String> transactions = new ArrayList<>();

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
//Deposit Method
    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0){
            throw new InvalidAmountException(
                    "Deposit Amount must be positive"
            );
        }
        balance = balance + amount;
        transactions.add("Deposited: "+amount);
        System.out.println("Deposit is successful: ");
    }

    //withdraw

    public void withdraw(double amount) throws InsufficientBalanceException
    , InvalidAmountException,DailyLimitExceededException{
        if(amount <= 0){
            throw new InvalidAmountException(
                    "withdrawal must be positive"
            );
        }
        if(amount > balance){
            throw new InsufficientBalanceException(
                    "insufficient balance"
            );
        }

        if(dailyWithdrawn + amount > dailyLimit){
            throw new DailyLimitExceededException(
                    "Daily withdraw limit exceed"
            );
        }
        balance = balance -amount;
        dailyWithdrawn = dailyWithdrawn+amount;

        transactions.add("Transaction: "+amount);
        System.out.println("withdrawal is successful: ");
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name : "+holderName);
        System.out.println("Balance: "+balance);
        System.out.println("Daily withdrawn: "+dailyWithdrawn);
    }

    public void showTransactions(){
        System.out.println("Transaction History: ");

        for (String transaction : transactions){
            System.out.println(transaction);
        }
    }
}
