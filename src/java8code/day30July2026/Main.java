package java8code.day30July2026;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //1. Count Strings Starting With "A"
        List<String> words = Arrays.asList("Apple","Among","Anil","Orange","banana");

        long finalCount = words.stream().filter(n ->n.startsWith("A") || n.startsWith("b"))
                .count();

        System.out.println(finalCount);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
