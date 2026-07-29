package java8code.day29July2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //1. Print Even Numbers Using Streams
//        List<Integer> list = Arrays.asList(1,11,13,15,2,16,21,9,12,8,0,9,6);

//        List<Integer> finalResult = list.stream()
//                .filter(x -> x%2 == 0)
//                .toList();
//        System.out.println(finalResult);

//        list.stream().filter(n -> n%2 == 0).forEach(System.out::println);

        //use IntStream
//        IntStream.range(1,20).filter(n -> n%2 == 0)
//                .forEach(System.out::println);


 //       2. Square Every Number

//        List<Integer> numbers = Arrays.asList(2,11,9,4);
//
////        numbers.stream().map(n -> n*n).forEach(System.out::println);
//        List<Integer> finalResult = numbers.stream().map(n -> n*n)
//                .collect(Collectors.toList());
//        System.out.println(finalResult);

        //use IntStream
//        IntStream.range(1,10).map(n -> n*n).forEach(System.out::println);

////        3. Convert String to Uppercase
//        List<String> words = Arrays.asList("java","microservice","saga","kafka");
//
//        words.stream().map(String::toUpperCase).forEach(System.out::println);

//        4. Count Strings Starting With "A"

        List<String> words = Arrays.asList("Angular","typescript","almond","acute","mit");

        long finalResult = words.stream().filter(s -> s.startsWith("A")||s.startsWith("a")).count();
        System.out.println(finalResult);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
