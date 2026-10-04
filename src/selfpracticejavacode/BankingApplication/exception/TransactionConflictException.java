package selfpracticejavacode.BankingApplication.exception;

public class TransactionConflictException extends BankException {
    public TransactionConflictException(String message){
        super("Bank_006",message);
    }

    public TransactionConflictException(String message, Throwable cause){
        super("Bank_006",message,cause);
    }
}
