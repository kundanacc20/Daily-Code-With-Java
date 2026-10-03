package exceptional.handling.bank;

public class TransactionFailedException extends BankException {
    public TransactionFailedException(String message, Throwable cause){
        super(message, cause);
    }
}
