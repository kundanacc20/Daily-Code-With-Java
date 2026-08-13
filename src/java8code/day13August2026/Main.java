package java8code.day13August2026;

import java.lang.classfile.Opcode;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//      Find Common Elements Between Two Lists
        List<Integer> firstList = Arrays.asList(1,2,5,9,44,11,3,12,51,10);
        List<Integer> secondList = Arrays.asList(10,21,11,13,17,44,51,9999);

        List<Integer> commonList = firstList.stream()
                .filter(secondList::contains)
                .toList();

        System.out.println(commonList);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
