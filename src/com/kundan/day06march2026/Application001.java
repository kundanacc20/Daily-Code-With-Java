package com.kundan.day06march2026;

import java.util.Arrays;
import java.util.List;

public class Application001 {
    public static void main(String[] args){
        // start timer
        long startTimer = System.nanoTime();

        List<Integer> list = Arrays.asList(1,7,2,9,4,2,0,1,5,11,10,9999);
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;
        Integer thirdLargest = Integer.MIN_VALUE;

        for(int num:list){
            if (num>largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest) {
                thirdLargest=secondLargest;
                secondLargest=num;
            } else if(num>thirdLargest){
                thirdLargest=num;
            }
        }
        List<Integer> topThree = Arrays.asList(largest,secondLargest,thirdLargest);
        System.out.println(topThree);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms.");
    }
}
