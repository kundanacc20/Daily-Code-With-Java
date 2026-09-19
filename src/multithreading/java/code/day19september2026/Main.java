package multithreading.java.code.day19september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTimer = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTimer+ " ms");
    }
}
