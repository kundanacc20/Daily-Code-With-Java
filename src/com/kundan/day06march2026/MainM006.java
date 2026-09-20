package com.kundan.day06march2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainM006 {
    public static void main(String[] args){
        //start pointer
        long startTimer = System.nanoTime();
        List<Integer> list = Arrays.asList(1,7,2,9,4,2,0,1,5,11,10,9999);

        List<Integer> topThreeNo = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(topThreeNo);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program Time: "+programTime+" ms");
    }
}
