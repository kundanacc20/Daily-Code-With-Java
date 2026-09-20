package com.kundan.day28march2026;

public class MainM028 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
    public static void main(String[] args){
        //start timer
        long startTime = System.nanoTime();
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        System.out.print("Output: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
        //end timer
        long endTime = System.nanoTime();

        //program time
        long programTime= (endTime-startTime)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
