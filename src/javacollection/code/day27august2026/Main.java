package javacollection.code.day27august2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
/*
Problem 5: Find the first non-repeated character
Input:
"swiss"
Output:
w
*/
        String inputString = "swiss";

        Optional<Character> firstNonRepeatedChar = inputString.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(firstNonRepeatedChar.orElse(null));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
