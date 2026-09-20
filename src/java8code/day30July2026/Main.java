package java8code.day30July2026;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        //1. Count Strings Starting With "A"
//        List<String> words = Arrays.asList("Apple","Among","Anil","Orange","banana");
//
//        long finalCount = words.stream().filter(n ->n.startsWith("A") || n.startsWith("b"))
//                .count();
//        words.stream().filter(n ->n.startsWith("A") || n.startsWith("b"))
//                .forEach(System.out::println);
//
//        System.out.println(finalCount);

        //2. Find Maximum Number
//
//        List<Integer> numbers = Arrays.asList(1,2,99,189,333,999);
//
////        Optional<Integer> maxNumber= numbers.stream().max(Integer::compareTo);
////        System.out.println(maxNumber);
////
////        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
////        System.out.println(minNumber);
//
//        long maxNumber = numbers.stream()
//                .mapToInt(Integer::intValue).max().orElse(-1);
//
//        System.out.println(maxNumber);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
