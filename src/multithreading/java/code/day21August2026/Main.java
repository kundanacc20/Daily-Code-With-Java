package multithreading.java.code.day21August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //start timer
        long startTimer = System.nanoTime();

//        Counter counter = new Counter();
//
//        Thread t1 = new Thread(()->{
//            for (int i = 1; i < 100000; i++)
//                counter.increment();
//        });
//
//        Thread t2 = new Thread(() ->{
//            for (int i = 1; i<100000; i++){
//                counter.increment();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(counter.count);
/*
here the expected output is the 200000 but generally it does not
touches that because of race condition.

Concept:
A race condition happens when multiple threads access and modify
shared data concurrently without proper synchronization.
Because the increment operation (counter++) is not atomic,
updates can be lost.
 */

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        Thread thread1 = new Thread(()->{
            for (int i =0; i<10000000; i++)
                synchronizedCounter.increment();
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 1; i <= 10000000; i++){
                synchronizedCounter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(synchronizedCounter.count);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");
    }
}
