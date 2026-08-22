package multithreading.java.code.day22August2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms.");
    }
}
