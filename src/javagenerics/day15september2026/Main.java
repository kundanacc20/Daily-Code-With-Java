package javagenerics.day15september2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        List<Integer> src = Arrays.asList(1,2,3,4);
//        List<Number> dest = new ArrayList<>();
//
//        CopyUtil.copy(src,dest);
//        ResultPrinter.print(dest);

        /*List<Double> src = Arrays.asList(1.1,1.2,1.4);
        List<Number> dest = new ArrayList<>();

        CopyUtil.copy(src, dest);
        ResultPrinter.print(dest);
         */
        List<String> src = Arrays.asList("apple","orange","banana","kiwi","grapes");
        List<Object> dest = new ArrayList<>();

        CopyUtil.copy(src,dest);
        ResultPrinter.print(dest);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");
    }
}
/*
Write a generic copy method that copies elements from a source
list into a destination list, where the destination can hold
the source type or any supertype.
 */