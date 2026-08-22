package multithreading.java.code.day22August2026;

public class BankAccount {
    private int balance = 0;

    synchronized void deposit(int amount){
        balance += amount;
    }

    int getBalance(){
        return balance;
    }
}
