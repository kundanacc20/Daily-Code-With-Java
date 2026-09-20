package com.kundan.day23feb2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main023 {
    public static void main(String[] args){
        String input = "Programming in java";

//        Map<Character,Long> frequency =
//                input.chars()
//                        .mapToObj(c->(char)c)
//                        .collect(Collectors.groupingBy(
//                                Function.identity(),
//                                LinkedHashMap::new,
//                                Collectors.counting()
//                        ));
//        System.out.println(frequency);

//        // 2nd approach
//        Map<Character,Integer> frequency = new LinkedHashMap<>();
//
//        for (char c:input.toCharArray()){
//            frequency.put(c,frequency.getOrDefault(c,0)+1);
//        }
//
//        System.out.println(frequency);

//        // 3rd approach
//        Map<Character,Integer> frequency = new LinkedHashMap<>();
//
//        char[] chars = input.toCharArray();
//
//        for(int i=0;i<chars.length;i++){
//            char c = chars[i];
//
//            //checking condition if the character is already present in the given map(frequency)
//            if(frequency.containsKey(c)){
//                int count = frequency.get(c);
//                frequency.put(c,count+1);
//            } else {
//                frequency.put(c,1);
//            }
//
//        }
//            System.out.println(frequency);
    }
}
