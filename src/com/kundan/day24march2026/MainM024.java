package com.kundan.day24march2026;

import java.util.HashMap;
import java.util.Map;

public class MainM024 {
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainM024 solution = new MainM024();
        int[] nums ={2,7,11,15};
        int target =9;

        int[] result = solution.twoSum(nums,target);
        if (result.length >0) {
            System.out.println("Indices: " + result[0] + " ," + result[1]);
        } else {
            System.out.println("No solution found.");
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime =(endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
