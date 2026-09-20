package com.kundan.day04may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        PetrolPump[] arr = {
                new PetrolPump(6,4),
                new PetrolPump(3,6),
                new PetrolPump(7,3)
        };

        int start = Tour.findStart(arr);
        if(start != -1){
            System.out.println("Start at petrol pump index: "+start);
        } else {
            System.out.println("No feasible starting point exists.");
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
