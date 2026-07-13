package com.kundan.day13july2026;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        RandomService randomService = new RandomService();

        RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();


        System.out.println("Random Integer(0 - 99): "+randomService.getRandomInt(100));
        System.out.println("Random Double(0 - 1): "+randomService.getRandomDouble());

        System.out.println("--------------Specific Generator-------------------");
        System.out.println(generator.nextInt(100));


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
