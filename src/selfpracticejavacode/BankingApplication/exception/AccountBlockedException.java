package selfpracticejavacode.BankingApplication.exception;

public class AccountBlockedException extends BankException {
    public AccountBlockedException(String message){
        super("Bank_004",message);
    }
}
