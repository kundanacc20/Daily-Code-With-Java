package com.kundan.day11march2026;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainM011 {
    public static void main(String[] args){
        //Start Timer
        long startTimer = System.nanoTime();
        int[] nums = {1,1,1,1,1,9,9,9,9,1,2,2,2,2,2,2,3,3,8,6};
        int k=4;

        //List<Integer> result =
        Map<Integer,Long> result=
        Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                        .limit(k)
                        //.map(Map.Entry::getKey)
//                        .collect(Collectors.toList());
                        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1,e2)->e1,
                LinkedHashMap::new));
        System.out.println(result);

        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Timer: "+programTime+" ms");
    }
}
