package selfpracticejavacode.BankingApplication.service;

import selfpracticejavacode.BankingApplication.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AuditService {

    private final List<Transaction> transactions =
            new ArrayList<>();

    public synchronized void log(Transaction transaction) {
        transactions.add(transaction);
        System.out.println("Audit: " + transaction);
    }

    public synchronized void showAllTransactions() {
        transactions.forEach(System.out::println);
    }
}