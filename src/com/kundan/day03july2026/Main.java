package com.kundan.day03july2026;


public class Main {

    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Printer.printLength("hello");
        Printer.printLength(42);
        Printer.printLength(java.util.List.of(1,2,3));
        Printer.printLength(3.14);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
