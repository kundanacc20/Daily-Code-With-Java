package selfpracticejavacode.BankingApplication;

import selfpracticejavacode.BankingApplication.exception.BankException;
import selfpracticejavacode.BankingApplication.handler.GlobalExceptionHandler;
import selfpracticejavacode.BankingApplication.model.Account;
import selfpracticejavacode.BankingApplication.model.Transaction;
import selfpracticejavacode.BankingApplication.service.AuditService;
import selfpracticejavacode.BankingApplication.service.BankService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        AuditService auditService = new AuditService();
        BankService bank = new BankService(auditService);

        GlobalExceptionHandler handler =
                new GlobalExceptionHandler();
        Account a1 = new Account(
                101,"Kundan",new BigDecimal("25000")
        );
        Account a2 = new Account(
                102,"Harshit",new BigDecimal("15000")
        );

        bank.addAccount(a1);
        bank.addAccount(a2);

        try {
            System.out.println("\n--Scenario 1--");

            Transaction tx = bank.transfer(
                    101,102,new BigDecimal("5000")
            );
            System.out.println("Result: "+tx.status());
        } catch (BankException e){
            handler.handle(e);
        }
        try {
            System.out.println("\n--scanario 2--");
            bank.transfer(
                    101,102,new BigDecimal("9000")
            );
        } catch (BankException e){
            handler.handle(e);
        }
        try {
            System.out.println("\n--scanario 3--");
            bank.transfer(
                    101,999,new BigDecimal("1000")
            );
        } catch (BankException e ){
            handler.handle(e);
        }
        try {
            System.out.println("\n---Scanario 4--");
            bank.transfer(
                    101,102,new BigDecimal("-500")
            );
        } catch (BankException e){
            handler.handle(e);
        }
        try {
            System.out.println("\n---scanario 5---");
            bank.transfer(
                    101,102,new BigDecimal("8000")
            );
        } catch (BankException e){
            handler.handle(e);
        }

        System.out.println("\n--final Balances---");
        System.out.println("Kundan: "+a1.getBalance());
        System.out.println("Harshit: "+a2.getBalance());

        System.out.println("\n---audit logs---");
        auditService.showAllTransactions();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
