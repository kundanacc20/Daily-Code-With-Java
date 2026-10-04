package selfpracticejavacode.BankingApplication.handler;

import selfpracticejavacode.BankingApplication.exception.BankException;

public class GlobalExceptionHandler {
    public void handle(BankException exception){
        System.out.println("Error Code: "
        + exception.getErrorCode());

        System.out.println("Error Message: "
        +exception.getMessage());

        if(exception.getCause() != null){
            System.out.println("Root Cause: "
            +exception.getCause().getMessage());
        }

        System.out.println("Action: "
        +getSuggestedAction(exception));
    }

    private String getSuggestedAction(BankException exception){
        return switch (exception.getErrorCode()){
            case "Bank_001" -> "verify account details";
            case "Bank_002" -> "check account balance";
            case "Bank_003" -> "check a valid amount";
            case "Bank_004"->"contact bank support";
            case "Bank_005" -> "Try again after the daily limit resets";
            case "Bank_006" -> "Review transaction logs and retry if safe";
            default -> "contact technical support.";
        };
    }
}
