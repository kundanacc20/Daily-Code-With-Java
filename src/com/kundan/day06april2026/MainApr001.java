package com.kundan.day06april2026;

public class MainApr001 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println("hello jave 17 ");
        //end timer
        long endtimer = System.nanoTime();

        //program time
        long programTime = (endtimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
