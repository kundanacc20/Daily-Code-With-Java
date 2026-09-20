package com.kundan.day04march2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;

public class ParallelStreamCode001 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
//
//        Integer secondHighestNumber =list.parallelStream()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//        System.out.println("Second Highest Number: "+secondHighestNumber);

        long secondHighest = LongStream.range(1,100_000_000)
                .parallel()
                .sorted()
                .skip(100_000_000-2)
                .findFirst()
                .orElse(-1);
        System.out.println("second highest: "+secondHighest);

        //Total Program Time: 866 millisecond for 100 million data set

        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Total Program Time: "+programTime+" millisecond");
    }
}
