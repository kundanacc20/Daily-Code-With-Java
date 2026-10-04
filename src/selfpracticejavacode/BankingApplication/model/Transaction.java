package selfpracticejavacode.BankingApplication.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record Transaction(
        String transactionId,
        long fromAccount,
        long toAccount,
        BigDecimal amount,
        TransactionStatus status,
        LocalDateTime timestamp,
        String message
) {
    public static Transaction create(
            long from,
            long to,
            BigDecimal amount,
            TransactionStatus status,
            String message
    ) {
        return new Transaction(
                UUID.randomUUID().toString(),
                from,
                to,
                amount,
                status,
                LocalDateTime.now(),
                message
        );
    }
}
