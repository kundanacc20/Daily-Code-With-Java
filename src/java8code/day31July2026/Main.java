package java8code.day31July2026;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        1. Calculate Sum of All Numbers
        List<Integer> numbers = Arrays.asList(1,2,5,4,7,9,10);

//        long finalSum = numbers.stream()
//                .reduce((a,b) ->a+b)
//                .get();
//        System.out.println(finalSum);

        long sum = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
