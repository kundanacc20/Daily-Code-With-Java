package java8code.day10August2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//         Frequency of Every Word

        List<String> wordList = Arrays.asList("java","Docker","java","kubernetes","spring","spring");

//        Map<String,Long> wordFrequency = wordList.stream()
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//        System.out.println(wordFrequency);

//        Map<Integer,Long> similarWordCount = wordList.stream()
//                .collect(Collectors.groupingBy(
//                        String::length,
//                        Collectors.counting()
//                ));
//        System.out.println(similarWordCount);

        Map<Integer, Set<String>> groupByWordLength = wordList.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()
                ));

        System.out.println(groupByWordLength);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
