package javagenerics.day12september2026;

import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Pair<String,Integer> stringIntegerPair = new Pair<>("kundan",27);
//
//        System.out.println(stringIntegerPair);
//        // string , string
//        Pair<String,String> stringStringPair = new Pair<>("kundan","kumar");
//        System.out.println(stringStringPair);

//        //find max between two generic data types
//        System.out.println(MaxFinder.findMax(11,16));

//        System.out.println(MaxFinder.findMax("Kundan","kumar"));

        //generic sum
        System.out.println(SumCalculator.sum(List.of(1,2,3,4,5,6)));
        System.out.println(SumCalculator.sum(List.of(1,2,3,4)));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
