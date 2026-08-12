package java8code.day12August2026.modularDesign;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<String> wordList = Arrays.asList("sql","java","saga-pattern","microservie");

        WordAnalyzer analyzer = new WordAnalyzer();
        ResultPrinter printer = new ResultPrinter();

        Optional<String> longestWord = analyzer.findLongestWord(wordList);
        printer.printResult(longestWord);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
