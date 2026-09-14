package javagenerics.day14september2026;

import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8);
        System.out.println(WildcardSum.sum(integerList));

        List<Double> doubleList = List.of(1.1,2.1,3.1,9.9);
        System.out.println(String.format("%.2f",WildcardSum.sum(doubleList)));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");
    }
}
