package com.kundan.day29june2026;

import java.util.Random;

public class ExternalService {
    private final Random random = new Random();

    public String callService(){
        if(random.nextInt(10)<7){
            throw new RuntimeException("External Service Failed");
        }
        return "External service responser";
    }
}
