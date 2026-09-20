package com.kundan.day08march2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainM008 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<String> words = Arrays.asList("kundan","kumar","abishek","sharma");

        List<String> upperCase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upper case words:"+upperCase);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime =(endTimer-startTimer)/1_000_000;
        System.out.println("Program time: "+programTime+" ms");
    }
}
