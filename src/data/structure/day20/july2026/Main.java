package data.structure.day20.july2026;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        TwoSum obj = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time:  "+programTime+" ms");
    }
}
