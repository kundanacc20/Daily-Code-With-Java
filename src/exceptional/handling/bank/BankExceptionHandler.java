package exceptional.handling.bank;

public class BankExceptionHandler {
    public void handle(BankException e){
        System.out.println("Banking Error:: "+e.getMessage());

        if(e instanceof TransactionFailedException){
            System.out.println("Action : check transaction logs");
            System.out.println("Cause: "+e.getCause());
        } else if (e instanceof  InsufficientBalanceException){
            System.out.println("Action: Maintain sufficient balance.");
        } else if(e instanceof AccountNotFoundException){
            System.out.println("Action: Verify account number.");
        } else if(e instanceof DailyLimitExceededException){
            System.out.println("Action: try another day");
        } else if(e instanceof InvalidAmountException){
            System.out.println("Action: Enter a valid amount.");
        }
    }
}
