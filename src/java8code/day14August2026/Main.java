package java8code.day14August2026;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Integer> intList = Arrays.asList(1,3,8,11,7,5);

        int sum = intList.stream().reduce(0,Integer::sum);

        System.out.println(sum);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
