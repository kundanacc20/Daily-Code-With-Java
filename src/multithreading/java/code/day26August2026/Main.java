package multithreading.java.code.day26August2026;

import java.util.*;
import java.util.function.Function;
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
//        List<Integer> numberList = Arrays.asList(10,50,20,80,11,30,99);

//        List<Integer> secondLargestNumber = numberList.stream()
//                .sorted((a,b)->b -a)
//                .skip(1)
//                .collect(Collectors.toList());
//        System.out.println(secondLargestNumber);
//        System.out.println(secondLargestNumber.getFirst());

//        TreeSet<Integer> treeSet = new TreeSet<>(numberList);
//        System.out.println(treeSet.pollLast());
//        System.out.println(treeSet);
//        System.out.println(treeSet.pollLast());

/*Problem 4: Find frequency of each element
Input:
[10, 20, 10, 30, 20, 10]

Output:
10 -> 3
20 -> 2
30 -> 1
*/
        List<Integer> numberList = Arrays.asList(10,20,10,30,20,10,1,1,5,3,2,1,8,2);

//        Map<Integer,Long> frequencyOfEachElement = numberList.stream()
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));
//        System.out.println(frequencyOfEachElement);
//        //extract unique element
//        List<Integer> uniqueElemnt = frequencyOfEachElement.entrySet().stream()
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println(uniqueElemnt);

////Concept: HashMap
//
//        Map<Integer,Integer> frequencyOfEachNumber = new HashMap<>();
//
//        for (Integer number: numberList){
//            frequencyOfEachNumber.put(number,frequencyOfEachNumber.getOrDefault(number,0)+1);
//        }
//        System.out.println(frequencyOfEachNumber);

        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
        System.out.println("program time: "+programTime+" ms");
    }
}
