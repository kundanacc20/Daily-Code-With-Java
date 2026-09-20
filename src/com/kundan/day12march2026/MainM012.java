package com.kundan.day12march2026;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainM012 {
    public static void main(String[] args){
        //Start Timer
        long startTimer = System.nanoTime();
        //Group words that are anagrams.
/* Input: ["eat","tea","tan","ate","nat","bat"]

Output:
[[eat, tea, ate], [tan, nat], [bat]] */

        List<String> words = Arrays.asList("mat","bat","fat","chat","eat","tea","tan","ate","nat","bat");

        Map<String,List<String>> result = words.stream()
                .collect(Collectors.groupingBy(word ->{
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));
        //System.out.println(result.values());
//        result.forEach((key,value)->
//                System.out.println(key+ " "+value)
//        );
//        for(Map.Entry<String,List<String>> entry:result.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        System.out.println(result);
        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
