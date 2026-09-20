package bank;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private final Map<Integer,Account> accounts = new HashMap<>();

    public void createAccount(int accNo, String name, double initialBalance){
        if(accounts.containsKey(accNo)){
            throw new RuntimeException("Account already exists!");
        }
        accounts.put(accNo, new Account(accNo, name, initialBalance));
        System.out.println("Account Created Successfully!");
    }

    public Account getAccount(int accNo){
        Account acc = accounts.get(accNo);
        if (acc == null){
            throw new RuntimeException("Account not found!");
        }
        return acc;
    }

    public void deposit(int accNo, double amount){
        getAccount(accNo).deposit(amount);
        System.out.println("withdraw successfully!");
    }

    public void withdraw(int accNo, double amount){
        getAccount(accNo).withdraw(amount);
        System.out.println("withdraw successfully !");
    }
    public void checkBalance(int accNo){
        System.out.println("Balance: "+getAccount(accNo).getBalance());
    }

    public void printTransactions(int accNo){
        Account acc = getAccount(accNo);
        acc.getTransactions().forEach(System.out::println);
    }
}
