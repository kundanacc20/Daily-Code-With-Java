package com.kundan.day27march2026;

import java.util.Arrays;

public class MainM027 {
    public static int[] maxSubArray(int[] nums){
        int max = nums[0], current =nums[0];
        int start =0, end =0, tempStart =0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]> current+nums[i]){
                current=nums[i];
                tempStart=i;
            } else {
                current += nums[i];
            }
            //update max if we found a better sum
            if(current > max){
                max =current;
                start = tempStart;
                end=i;
            }
        }
        return Arrays.copyOfRange(nums,start,end+1);
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        // Maximum subarray(Kadane's)
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] result = maxSubArray(nums);

        System.out.println("Maximum Subarray: "+ Arrays.toString(result));
        System.out.println("Maximum Sum: "+Arrays.stream(result).sum());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
