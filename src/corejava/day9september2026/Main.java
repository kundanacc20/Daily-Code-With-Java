package corejava.day9september2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //List<Integer> numList = Arrays.asList(1,2,3,4,5);
//        //by using lambda
//        numList.forEach(n->System.out.print(Math.sqrt(n)+" "));

//        //by using method reference
//        List<Double> rooList = numList.stream()
//                .map(Math::sqrt)
//                .collect(Collectors.toList());
//
//        System.out.println(rooList);

//        List<String> names = Arrays.asList("kundan","kumar");
//
//        names.forEach(System.out::println);

//        Function<String,Integer> func = String::length;
//
//        System.out.println(func.apply("kundan"));

        Function<String,Integer> func = String::length;
        List<String> nameList = Arrays.asList("kundan","kumar","aditya","rajak");

        List<Integer> nameLengthList = nameList.stream()
                .map(func)
                .collect(Collectors.toList());

        System.out.println(nameLengthList);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("progra time: "+programTime+" ms");
    }
}
