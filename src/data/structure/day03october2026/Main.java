package data.structure.day03october2026;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        String str = "Programming";

        /*Map<Character,Long> map = str.chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        map.entrySet().stream()
                .filter(e->e.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        */

        Character result = str.chars()
                .mapToObj(c -> (char)c)
                .filter(c -> str.indexOf(c)==str.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println(result);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time : "+programTime+ " ms");
    }
}
