package exceptional.handling.day03october2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        Bank bank = new Bank();
        BankAccount account1 = new BankAccount(101,"kundan",50000);
        BankAccount account2 = new BankAccount(102,"harshit",60000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        try {
            bank.transfer(101,102,5000);
        } catch (InsufficientBalanceException | InvalidAmountException
                | AccountNotFoundException | DailyLimitExceededException e){
            System.out.println("transer failed: "+ e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Invalid Operation: "+e.getMessage());
        } finally {
            System.out.println("Transfer operation completed ");
        }
        System.out.println("\nFinal account Details: ");
        account1.displayDetails();
        account2.displayDetails();

        account1.showTransactions();
        account2.showTransactions();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
