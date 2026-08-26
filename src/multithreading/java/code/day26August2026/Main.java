package multithreading.java.code.day26August2026;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
/*
Problem 3: Find the second-largest number
Input:
[10, 50, 20, 80, 30]
Output:
50
Concepts: TreeSet, sorting.
 */
        List<Integer> numberList = Arrays.asList(10,50,20,80,11,30,99);

//        List<Integer> secondLargestNumber = numberList.stream()
//                .sorted((a,b)->b -a)
//                .skip(1)
//                .collect(Collectors.toList());
//        System.out.println(secondLargestNumber);
//        System.out.println(secondLargestNumber.getFirst());

        TreeSet<Integer> treeSet = new TreeSet<>(numberList);
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);
        System.out.println(treeSet.pollLast());

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
        System.out.println("program time: "+programTime+" ms");
    }
}
