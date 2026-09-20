package java8code.day12August2026.modularDesign;

import java.util.Optional;

public class ResultPrinter {
    public void printResult(Optional<String> result){
        System.out.println("final result: "+result.orElse("not found"));
    }
}
