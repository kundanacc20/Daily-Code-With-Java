package com.kundan.day13july2026;

import java.util.random.RandomGenerator;

public class RandomService {
    private final RandomGenerator random;

    public RandomService(){
        this.random = RandomGenerator.getDefault();
    }

    public int getRandomInt(int bound){
        return random.nextInt(bound);
    }

    public double getRandomDouble(){
        return random.nextDouble();
    }

    public int getRandomQuestionId(){
        return random.nextInt(1000);
    }
}
