package selfpracticejavacode.BankingApplication.exception;

public class InvalidAmountException extends BankException {
    public InvalidAmountException(String message){
        super("Bank_003",message);
    }
}
