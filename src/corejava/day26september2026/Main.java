package corejava.day26september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println("Welcome back kundan kumar");
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer);

        System.out.println("Program time: "+programTime+ " ms");
    }
}
