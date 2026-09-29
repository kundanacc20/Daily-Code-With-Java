package corejava.day29september2026;

public class ExceptionHandling {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        try {
            System.out.println("this is try block");
        } finally {
            System.out.println("this is finally block");
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println(programTime);
    }
}
