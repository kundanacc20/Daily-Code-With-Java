package com.kundan.day25march2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MainM025 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //creating a list of integer
//        List<Integer> list = Arrays.asList(1,12,11,13,14,15,17);
//
//        //stream the list, convert to int, calculate average
//        double avg =
//                list.stream()
//                        .mapToInt(Integer::intValue)
//                        .average()
//                        .orElse(0);
//        System.out.printf("Average: %.2f%n",avg);

        //using parallel stream for small dataset
        //List<Integer> smallList = IntStream.rangeClosed(1,1000).boxed().toList();

//        double avgSmallParallel =smallList
//                .parallelStream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .orElse(0);
//        System.out.println("Smalldataset parallelstream: "+avgSmallParallel);
        //Program Time: 34 ms for small dataset

        List<Integer> largeList = IntStream.rangeClosed(1,10_000_000).boxed().toList();

        double avgLargeParallel = largeList
                .parallelStream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("large dataset parallelstream: "+avgLargeParallel);
        //Program Time: 675 ms for large dataset 10 million
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
