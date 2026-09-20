package com.kundan.day20feb2026;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main020 {

//public static char findFirstNonReaption(String input){
//    Optional<Character> result = input.chars()
//            .mapToObj(c->(char)c)
//            .collect(Collectors.groupingBy(
//                            Function.identity(),
//                            LinkedHashMap::new,
//                            Collectors.counting()
//            ))
//            .entrySet()
//            .stream()
//            .filter(entry -> entry.getValue()==1)
//            .map(Map.Entry::getKey)
//            .findFirst();
//
//    return result.orElse('-');
//}
    public static void main(String[] args){
//        String input = "aabcbcdede";
//        System.out.println(findFirstNonReaption(input));

        int[] arr = {1,2,1,2,4,2,6};

        Set<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry ->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
