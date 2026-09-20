package com.kundan.day16march2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainM016 {
    public static List<Integer> topK(int[] nums,int k){
        Map<Integer,Long> freq =
                Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                n->n,
                                Collectors.counting()
                        ));
        return freq.entrySet()
                .stream()
                .sorted((a,b)->Long.compare(b.getValue(),a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int[] nums = {1,1,1,2,2,3,3,3,3,3,4,4,2};
        int k =2;

        System.out.println(topK(nums,k));
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
