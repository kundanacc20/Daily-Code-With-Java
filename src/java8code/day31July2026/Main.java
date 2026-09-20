package java8code.day31July2026;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        1. Calculate Sum of All Numbers
//        List<Integer> numbers = Arrays.asList(1,2,5,4,7,9,10);

//        long finalSum = numbers.stream()
//                .reduce((a,b) ->a+b)
//                .get();
//        System.out.println(finalSum);

//        long sum = numbers.stream()
//                //using lambda
////                .reduce(0,(a,b)->a+b);
//        .reduce(0, Integer::sum);
//        System.out.println(sum);
//        System.out.println(((Object) sum).getClass().getName());

//        long finalSum = numbers.stream()
//                .mapToLong(Integer::longValue)
//                .sum();
//
//        System.out.println(finalSum);
//        System.out.println(((Object) finalSum).getClass().getName());

//        2. Find Average

//        List<Integer> numberList = Arrays.asList(1,5,2,9,3);
//
//        OptionalDouble averageValue = numberList.stream()
//                .mapToInt(Integer::intValue)
//                .average();
//
//        System.out.println(averageValue);

//        List<Double> avgDouble = Arrays.asList(3.0,2.0,5.0,9.0);
//        double avgFinalDouble = avgDouble.stream()
//                .mapToDouble(Double::doubleValue)
//                .average()
//                .orElse(0.0);
//
//        System.out.println(avgFinalDouble);

//        3. Remove Duplicate Numbers, use distinct()

        List<Integer> numberListWithDuplicate = Arrays.asList(1,9,2,2,9,5,21,8,9);

        List<Integer> finalListWithoutDuplicate = numberListWithDuplicate.stream().distinct()
                .toList();
        System.out.println(finalListWithoutDuplicate);


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
