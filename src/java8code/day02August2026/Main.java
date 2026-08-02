package java8code.day02August2026;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int nums[] = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(nums,9)));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time :"+programTime+" ms");
    }
}
