package com.kundan.day04march2026;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainM004 {
    public static void main(String[] args){
        // Start timer
        long startTimer = System.nanoTime();
        List<Integer> numbers = Arrays.asList(1,8,2,11,8,15,12,10,0,17);
//        Integer secondHightestNumber = numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                //.sorted((a,b)-> b.compareTo(a))
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//        System.out.println("Second highest number is: "+secondHightestNumber);
//        //Program time: 4 ms when Comparator.reverseOrder() used
//        //Program time: 5 ms when lambda method used

//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return b.compareTo(a);
//            }
//        });
//
//        Integer secondHighestNumber = null;
//        if(numbers.size()>1){
//            secondHighestNumber = numbers.get(1);
//        }
//        System.out.println( "second highest number is: "+secondHighestNumber);

        //Single Pass Approach(without sorting)
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for(Integer num:numbers){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            } else if (num>secondLargest && num<largest) {
                secondLargest =num;
            }
        }

        System.out.println("second largest number is: "+secondLargest);
        //Program time: 0 ms

        //End timer
        long endTimer = System.nanoTime();

        //Program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program time: "+programTime+" ms");
    }
}
