package selfpracticejavacode.BankingApplication.exception;

public class InsufficientBalanceException extends BankException {
    public InsufficientBalanceException(String message){
        super("Bank_002",message);
    }
}
