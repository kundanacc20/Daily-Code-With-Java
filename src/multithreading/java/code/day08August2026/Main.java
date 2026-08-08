package multithreading.java.code.day08August2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        Thread threadName = Thread.currentThread();

        System.out.println(threadName.getName());

        threadName.setName("Main-Thread");

        System.out.println(threadName.getName());
        //end timer
        long endTimer = System.nanoTime();

        //program timer
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
