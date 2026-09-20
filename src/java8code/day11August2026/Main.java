package java8code.day11August2026;

import com.kundan.day26may2026.LinkedList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

////         Find First Non-Repeated Character
//
//        String word = "programming";
//
//        Map<Character,Long> wordMap = word.chars()
//                .mapToObj(c ->(char)c)
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//
//        System.out.println(wordMap);
//
//        Optional<Character> firstNonRepeatedCharacter = wordMap.entrySet()
//                .stream().filter(e -> e.getValue()==1)
//                .map(Map.Entry::getKey)
//                .findFirst();
//        System.out.println(firstNonRepeatedCharacter);

//        First Non-Repeated Character in Usernames

        List<String> wordList = Arrays.asList("bob","marly","narayan","kundan","arun","harshit","aaditya");

        wordList.forEach(word ->{
            Optional<Character> firstUnique = word.chars()
                    .mapToObj(i -> (char)i)
                    .collect(Collectors.groupingBy(
                            Function.identity(),
                            LinkedHashMap::new,
                            Collectors.counting()
                    ))
                    .entrySet().stream()
                    .filter(e ->e.getValue()==1)
                    .map(Map.Entry::getKey)
                    .findFirst();
            System.out.println(word+ " first unique character: "+firstUnique.orElse(null));
        });
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
