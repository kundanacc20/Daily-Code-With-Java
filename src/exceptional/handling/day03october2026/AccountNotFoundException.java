package exceptional.handling.day03october2026;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message){
        super(message);
    }
}
