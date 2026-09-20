package multithreading.java.code.day22August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
//        BankAccount account = new BankAccount();
//
//        Thread t1 = new Thread(()->{
//            for(int i =1; i<= 100000; i++){
//                account.deposit(100);
//            }
//        });
//
//        Thread t2 = new Thread(() ->{
//            for (int i = 1; i <= 100000; i++){
//                account.deposit(100);
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Balance: "+account.getBalance());

//        Counter counter = new Counter();
//
//        Thread thread1 = new Thread(()-> {
//            for (int i = 1; i <= 100000; i++){
//                counter.increment();
//            }
//        });
//
//        Thread thread2 = new Thread(()->{
//            for(int i = 1; i<=100000; i++){
//                counter.increment();
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//        System.out.println(counter.getCount());

//        Thread t1 = new Thread(() ->{
//            Printer.print("Thread:1");
//        });
//
//        Thread t2 = new Thread(()->{
//            Printer.print("Thread:2");
//        });
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

        Printer printer1 = new Printer();
        Printer printer2 = new Printer();

        Thread t1 = new Thread(printer1::print,"Thread-1");
        Thread t2 = new Thread(printer2::print,"Thread-2");


        t1.start();
        t2.start();

        t1.join();
        t2.join();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms.");
    }
}
