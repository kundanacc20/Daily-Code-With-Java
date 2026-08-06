package multithreading.java.code.day06August2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        NumberThread nt = new NumberThread();
//        nt.start();

        Thread thread = new Thread(new  HelloTask());
        thread.start();

        for(int i =1; i<= 10; i++){
            System.out.println("Main Thread: ");
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time :"+programTime+" ms");
    }
}
