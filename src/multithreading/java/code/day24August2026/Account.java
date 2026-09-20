package multithreading.java.code.day24August2026;

public class Account {
    private int balance;

    Account(int balance){
        this.balance =balance;
    }

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public  void deposit(int amount){
        balance += amount;
    }
}
/*
Problem:
Two accounts are transferring money between each other concurrently.
Implement a thread-safe transfer operation.
 */
