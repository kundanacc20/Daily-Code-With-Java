package multithreading.java.code.day09August2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
//        for(int i =1; i <= 5; i++){
//            System.out.println(i);
//            Thread.sleep(2000);
//        }

        Worker worker = new Worker();

        worker.start();
        worker.join();
        System.out.println("worker finished");
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
