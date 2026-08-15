package java8code.day15August2026;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        List<Integer> numList = Arrays.asList(1,4,2,9,41,98,19);
//
//        int sum = numList.stream().reduce(0, Integer::sum);
//
//        System.out.println(sum);

//         Flatten Nested Lists
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7),
                Arrays.asList(8,9,10));

        listOfList.stream().flatMap(Collection::stream)
//                .forEach(System.out::print);
                .forEach(n -> System.out.print(n+ " "));
        //end timer
        long endTimer = System.nanoTime();
        System.out.println();
        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}
