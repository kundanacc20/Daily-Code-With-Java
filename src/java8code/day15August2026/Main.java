package java8code.day15August2026;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Integer> numList = Arrays.asList(1,4,2,9,41,98,19);

        int sum = numList.stream().reduce(0, Integer::sum);

        System.out.println(sum);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}
