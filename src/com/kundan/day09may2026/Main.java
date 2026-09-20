package com.kundan.day09may2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //Merge Two Unsorted Arrays Without Duplicates
        /*
        A = [1,3,5,7]
        B = [2,3,6,7]

        output = [1,2,3,5,6,7]
         */
        int[] a = {1,3,5,7};
        int[] b = {2,3,6,7};

        List<Integer> result = IntStream
                .concat(Arrays.stream(a),Arrays.stream(b))
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
