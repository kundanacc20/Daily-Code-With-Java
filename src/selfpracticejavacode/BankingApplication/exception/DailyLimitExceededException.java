package selfpracticejavacode.BankingApplication.exception;

public class DailyLimitExceededException extends BankException {
    public DailyLimitExceededException(String message){
        super("Bank_005",message);
    }
}
