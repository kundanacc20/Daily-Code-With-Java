package multithreading.java.code.day23August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
//        Task task1 = new Task();
//        Task task2 = new Task();
//
//        Thread t1 = new Thread(Task::execute,"Thread-1");
//        Thread t2 = new Thread(Task::execute,"Thread-2");
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

        Counter counter = new Counter();

        Thread[] threads = new Thread[10];

        for (int i = 0; i< 10; i++){
            threads[i] = new Thread(() ->{
                for (int j = 0; j < 10000; j++){
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for(Thread thread: threads){
            thread.join();
        }
        System.out.println("final count : "+counter.getCount());

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
