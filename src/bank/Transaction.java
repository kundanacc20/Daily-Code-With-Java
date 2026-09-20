package bank;

import java.time.LocalDateTime;

public record Transaction(TransactionType type, double amount, LocalDateTime time) {
    public Transaction(TransactionType type, double amount){
        this(type,amount,LocalDateTime.now());
    }
}
