package javagenerics.day17september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println(MultiBound.max(4,7));
        System.out.println(MultiBound.max("kundan","kumar"));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time : "+programTime+" ms");
    }
}
