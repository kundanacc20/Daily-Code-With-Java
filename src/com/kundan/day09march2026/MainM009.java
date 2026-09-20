package com.kundan.day09march2026;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainM009 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        System.out.println("hello kundan");

        String sentence = "java is java and java is powerful";

        Map<String, Long> wordCount =
                Arrays.stream(sentence.split(" "))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));

        System.out.println(wordCount);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Total program time: "+programTime+" ms");
    }
}
