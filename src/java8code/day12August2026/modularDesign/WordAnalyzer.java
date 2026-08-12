package java8code.day12August2026.modularDesign;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class WordAnalyzer {
    public Optional<String> findLongestWord(List<String> words){
        return words.stream().max(Comparator.comparing(String::length));
    }
}
