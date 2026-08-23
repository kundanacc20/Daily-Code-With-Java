package multithreading.java.code.day23August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
        Task task1 = new Task();
        Task task2 = new Task();

        Thread t1 = new Thread(Task::execute,"Thread-1");
        Thread t2 = new Thread(Task::execute,"Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
