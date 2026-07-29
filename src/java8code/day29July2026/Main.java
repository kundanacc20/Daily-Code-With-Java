package java8code.day29July2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //1. Print Even Numbers Using Streams
        List<Integer> list = Arrays.asList(1,11,13,15,2,16,21,9,12,8,0,9,6);

        List<Integer> finalResult = list.stream()
                .filter(x -> x%2 == 0)
                .toList();
        System.out.println(finalResult);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
