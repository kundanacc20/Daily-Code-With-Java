package exceptional.handling.day03october2026;

public class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String message){
        super(message);
    }
}
