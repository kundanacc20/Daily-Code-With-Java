package java8code.day13August2026;

import java.lang.classfile.Opcode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
////      Find Common Elements Between Two Lists
//        List<Integer> firstList = Arrays.asList(1,2,5,9,44,11,3,12,51,10);
//        List<Integer> secondList = Arrays.asList(10,21,11,13,17,44,51,9999);
//
//        List<Integer> commonList = firstList.stream()
//                .filter(secondList::contains)
//                .toList();
//
//        System.out.println(commonList);

//        Merge Two Lists Without Duplicates
        List<Integer> firstList = Arrays.asList(1,2,3,4,1,8,9);
        List<Integer> secondList = Arrays.asList(1,2,7,10,11,12,16,18);

//        Set<Integer> finalListWithoutDuplicate = Stream
//                .concat(firstList.stream(),secondList.stream())
//                .collect(Collectors.toSet());
//
//
//        System.out.println(finalListWithoutDuplicate);

        Set<Integer> mergedSet = new HashSet<>(firstList);
        mergedSet.addAll(secondList);

        System.out.println(mergedSet);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
