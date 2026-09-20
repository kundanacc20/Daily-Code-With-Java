package java8code.day04August2026;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

//        //1. Calculate Sum of All Numbers
//        List<Integer> numList = Arrays.asList(1,9,2,6,1,9,7);
//
//        long sum = numList.stream().reduce(0,Integer::sum);

//        System.out.println(sum);

        //2. finding the max element in the list
        List<Integer> numbers = Arrays.asList(1,2,6,8,3,0);

         Optional<Integer> maxElement = numbers.stream().reduce(Integer::max);
         System.out.println(maxElement.get());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");

    }
}
