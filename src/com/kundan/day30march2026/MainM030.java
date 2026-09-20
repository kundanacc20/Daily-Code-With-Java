package com.kundan.day30march2026;

public class MainM030 {
    public static String formatter(Object o){
        return switch (o){
            case Integer i ->"Integer: "+i;
            case String s ->"String: " +s;
            case Double d -> "Double: "+d;
            case null -> "Null value";
            default -> "unknown type: "+o.getClass().getSimpleName();
        };
    }
    public static void main(String[] args){
        //Strat Timer
        long startTimer = System.nanoTime();
        System.out.println(formatter(42));
        System.out.println(formatter("hello"));
        System.out.println(formatter(3.14));
        System.out.println(formatter(null));
        System.out.println(formatter(true));
        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
