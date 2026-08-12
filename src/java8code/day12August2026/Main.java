package java8code.day12August2026;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
////         Find First Repeated Character
//        String word = "Programming";
//
//        Map<Character,Long> wordFrequency = word.chars()
//                .mapToObj(i -> (char)i)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//
//        System.out.println(wordFrequency);
//
//        Optional<Character> firstRepeatedCharacter = wordFrequency.entrySet()
//                .stream()
//                .filter(e -> e.getValue() != 1)
//                .map(Map.Entry::getKey)
//                .findFirst();
//        System.out.println(firstRepeatedCharacter.orElse(null));

//        String word = "microservices";
//
//        Set<Character> seen = new HashSet<>();
//
//        Optional<Character> firstRepetedCharacter = word.chars()
//                .mapToObj(i -> (char)i)
//                .filter(i -> !seen.add(i))
//                .findFirst();
//
//        System.out.println(firstRepetedCharacter.orElse(null));

//         Find Duplicate Characters

        String word = "programming";

        Map<Character,Long> letterFrequencyMap = word.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(letterFrequencyMap);

        Set<Character> finalResult = letterFrequencyMap.entrySet()
                .stream().filter(e -> e.getValue() >1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(finalResult);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
