package com.kundan.day3march2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainM003 {
    public static void main(String[] args){

        //start timer
        long startTimer = System.nanoTime();
        String input = "aabccdeff";

//        Character result = input.chars()
//                        .mapToObj(c->(char)c)
//                                .collect(Collectors.groupingBy(
//                                        Function.identity(),
//                                        LinkedHashMap::new,
//                                        Collectors.counting()))
//                                .entrySet()
//                                .stream()
//                                .filter(e ->e.getValue()==1)
//                                .map(Map.Entry::getKey)
//                                .findFirst()
//                                .orElse('_');
//        System.out.println(result);
        //Total time taken for program execution: 31 millisecond

       //printing all char in string with frequency is one
        Map<Character,Long> result = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==2)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->a,
                        LinkedHashMap::new));
        System.out.println(result);
        //Total time taken for program execution: 40 millisecond for small data set;

        //end timer
        long endTimer = System.nanoTime();

        //time taken
        long totalTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Total time taken for program execution: "+totalTime+" millisecond");
    }
}
