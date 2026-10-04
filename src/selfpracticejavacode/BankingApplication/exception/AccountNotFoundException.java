package selfpracticejavacode.BankingApplication.exception;

public class AccountNotFoundException extends BankException {
    public AccountNotFoundException(String message){
        super("Bank_001",message);
    }
}
