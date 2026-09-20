package selfpracticejavacode.day20september2026;

import static selfpracticejavacode.day20september2026.SlidingWindowUtil.slidingWindow;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int[] myArray = {1,2,3,4,5,1,6,7,8,7,10,15};

        int k = 3;

        System.out.println(slidingWindow(myArray,k));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
