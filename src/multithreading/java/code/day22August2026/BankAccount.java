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
/*
Problem:
Multiple threads try to deposit money into the same bank account.
Make the deposit() operation thread-safe.

Concept:
A synchronized instance method locks the current object (this).
Only one thread can execute that synchronized method on the
same object at a time.
 */
