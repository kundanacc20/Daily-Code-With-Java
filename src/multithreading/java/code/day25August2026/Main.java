package multithreading.java.code.day25August2026;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Problem 1: Find duplicate elements
//
//        Input: [10, 20, 30, 20, 40, 10, 50]
//        Output: [10, 20]

//        List<Integer> arrayList = Arrays.asList(10,20,30,20,40,10,50);
//
//        List<Integer> duplicateElement = arrayList.stream().collect(Collectors.groupingBy(
//                Function.identity(),
//                Collectors.counting()
//        ))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue()>1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println(duplicateElement);


//        Concepts: ArrayList, HashSet

        List<Integer> arrayList = Arrays.asList(10,20,30,20,40,10,50,30);

        Set<Integer> nonDuplicateElementSet = new HashSet<>();
        Set<Integer> DuplicateElementSet = new HashSet<>();

        for(Integer element : arrayList){
            if(!nonDuplicateElementSet.add(element)){
                DuplicateElementSet.add(element);
            }
        }
        System.out.println(DuplicateElementSet);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");
    }
}
