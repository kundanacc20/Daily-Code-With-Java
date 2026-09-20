package com.kundan.day12july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //Feature 1: Always-strict floating point semantics
        System.out.println(Calculator.calculate());
        System.out.println(Calculator.bankInterest());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
