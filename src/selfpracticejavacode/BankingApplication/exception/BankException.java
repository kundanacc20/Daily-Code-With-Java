package selfpracticejavacode.BankingApplication.exception;

public class BankException extends Exception {
    private final String errorCode;

    public BankException(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public BankException(
            String errorCode,
            String message,
            Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
