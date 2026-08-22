package multithreading.java.code.day22August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(()->{
            for(int i =1; i<= 1000; i++){
                account.deposit(100);
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 1; i <= 1000; i++){
                account.deposit(100);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Balance: "+account.getBalance());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms.");
    }
}
