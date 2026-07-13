package com.kundan.day13july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        RandomService randomService = new RandomService();

        System.out.println("Random Integer(0 - 99): "+randomService.getRandomInt(100));
        System.out.println("Random Double(0 - 1): "+randomService.getRandomDouble());

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
