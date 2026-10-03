package exceptional.handling.day03october2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        BankAccount account =
                new BankAccount(101,"kundan",50000);

        account.displayDetails();
        try {
            account.withdraw(1000);
            account.deposit(2000);
            account.withdraw(8000);
        } catch (InsufficientBalanceException | InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        account.displayDetails();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
