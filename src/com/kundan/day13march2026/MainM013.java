package com.kundan.day13march2026;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainM013 {
    //Define record to hold character and count
    record CharCount(Character character, Long count){}
    public static void main(String[] args){
        //Start timer
        long startTimer =System.nanoTime();
//        List<Integer> numbers = Arrays.asList(1,2,2,1,4,3,6,7);
//
//        List<Integer> unique = numbers.stream()
//                .distinct()
//                .toList(); // Java 16+
//        System.out.println(unique);

        //Character Count
        String input = """
                Prgramming
                """;
        Map<Character,Long> map =
                input.chars()
                        .mapToObj(c->(char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));
        //use the record for structured output
        map.forEach((k,v)->{
            CharCount cc = new CharCount(k,v);
            System.out.println(cc);
        });

        //End Timer
        long endTimer = System.nanoTime();

        //Program Timer
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
