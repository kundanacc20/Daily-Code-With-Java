package java8code.day07August2026;

public class Main{
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        FunctionalInterfaceCode s =  (int x) -> x*x;

        System.out.println(s.square(8));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
