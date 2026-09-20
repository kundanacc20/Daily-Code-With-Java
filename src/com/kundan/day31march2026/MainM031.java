package com.kundan.day31march2026;

import java.util.random.RandomGenerator;

public class MainM031 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //get the default random generator
        RandomGenerator generator = RandomGenerator.getDefault();

        //Generate a random integer
        int number = generator.nextInt();

        //print the random number
        System.out.println("Random number: "+number);

        //you can also generate numbers within a range
        int boundedNumber = generator.nextInt(100);
        System.out.println("Random number between 0 and 99: "+boundedNumber);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
