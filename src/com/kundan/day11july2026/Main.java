package com.kundan.day11july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Calculator c = (a,b) ->a+b;
//        System.out.println(c.add(10,20));
//        //Predicate<T>
//
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//        System.out.println(isEven.test(10));
//        System.out.println(isEven.test(15));

        //Function<T,R>
        Function<String, Integer> lengthFinder = s -> s.length();
        System.out.println(lengthFinder.apply("java"));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
