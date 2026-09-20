package java8code.day11August2026;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileProcessor {
    public static void main(String[] args) throws IOException {
        //start timer
        long startTimer = System.nanoTime();
        Path path = Paths.get("input.txt");

        Files.lines(path).forEach(line ->{
            Optional<Character> firstUniqueLetter = line.chars()
                    .mapToObj(i -> (char)i)
                    .collect(Collectors.groupingBy(
                            Function.identity(),
                            LinkedHashMap::new,
                            Collectors.counting()
                    ))
                    .entrySet().stream()
                    .filter(i ->i.getValue()==1)
                    .map(Map.Entry::getKey)
                    .findFirst();

            System.out.println(line+" "+firstUniqueLetter.orElse(null));
        });
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");
    }
}
