package com.kundan.day08fab2026;

import java.util.HashMap;

public class Main008 {
    public static void main (String[] args){
        //Given an array and a target, find two indices whose sum equal the target
        /* Input : num =[1,2,8,3,5,5] target =3
        output : [0,1]
        approach(hashmap)
         */
        int[] nums = {2,7,11,15};
        int target =9;

        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff =target - nums[i];

            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                return;
            }
            map.put(nums[i],i);
        }
    }
}
