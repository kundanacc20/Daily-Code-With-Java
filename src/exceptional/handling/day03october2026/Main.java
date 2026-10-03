package exceptional.handling.day03october2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        BankAccount account = new BankAccount();

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
