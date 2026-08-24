package multithreading.java.code.day24August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
        Account account1 = new Account(1000);
        Account account2 = new Account(1000);

        Bank bank = new Bank();

        Thread t1 = new Thread(() ->
                bank.transfer(account1,account2,100));

        Thread t2 = new Thread(() ->
                bank.transfer(account1,account2,300));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Account 1: "+account1.getBalance());
        System.out.println("Account 2: "+account2.getBalance());

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
