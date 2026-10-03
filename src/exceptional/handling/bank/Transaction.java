package exceptional.handling.bank;

import java.time.LocalDate;

record Transaction(
        String transactionId,
        int fromAccount,
        int toAccount,
        double amount,
        TransactionType type,
        TransactionStatus status,
        LocalDate timestamp
)
{}
