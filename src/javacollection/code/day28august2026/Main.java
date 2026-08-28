package javacollection.code.day28august2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        /*Problem 6: Find common elements between two lists
        Input:
        List 1 = [10, 20, 30, 40]
        List 2 = [30, 40, 50, 60]

        Output:
        [30, 40]
        Concept: HashSet
         */
        List<Integer> list1 = Arrays.asList(10,20,30,40);
        List<Integer> list2 = Arrays.asList(30,40,50,60);

        Set<Integer> commonElement = new HashSet<>();

        for(Integer e : list2)
        {
            if(list1.contains(e)){
                commonElement.add(e);
            }
        }
        System.out.println(commonElement);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
