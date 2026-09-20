package com.kundan.day26march2026;

import java.util.HashSet;
import java.util.Set;

public class MainM026 {
    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int price: prices){
            min = Math.min(min,price);
            profit= Math.max(profit,price-min);
        }
        return profit;
    }

    //contains duplicate
//    public static boolean containsDuplicate(int[] nums){
//        Set<Integer> set = new HashSet<>();
//        for(int num : nums){
//            if(!set.add(num))
//                return true;
//        }
//        return false;
//    }

    //use containsDuplicate as instance method of MainM026 class
    //in that you can avoid using static keyword
    // you can directly call the method in the main method.
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        int[] prices1 = {7,1,5,3,6,4};
//        int[] prices2 = {7,6,4,3,1};
//
//        System.out.println("Max Profit (prices1): "+maxProfit(prices1));
//        System.out.println("Max Profit (prices2): "+maxProfit(prices2));

//        int[] num1 = {1,2,3,4};
//        int[] num2 = {1,2,3,1};
//
//        System.out.println(containsDuplicate(num1));
//        System.out.println(containsDuplicate(num2));

        MainM026 object = new MainM026();
        int[]num1  = {1,2,3,4};
        int[] num2 = {1,2,3,1};

        System.out.println(object.containsDuplicate(num1));
        System.out.println(object.containsDuplicate(num2));

//        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
