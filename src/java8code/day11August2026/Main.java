package java8code.day11August2026;

import com.kundan.day26may2026.LinkedList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        String word = "programming";

        Map<Character,Long> wordMap = word.chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(wordMap);

        Optional<Character> firstNonRepeatedCharacter = wordMap.entrySet()
                .stream().filter(e -> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(firstNonRepeatedCharacter);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = System.nanoTime();

        System.out.println("program time: "+programTime+" ms");
    }
}
