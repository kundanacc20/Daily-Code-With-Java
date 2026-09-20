package com.kundan.day16june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println(NotificationService.send(new Email("test@gmail.com")));
        System.out.println(NotificationService.send(new SMS("12345678")));
        System.out.println(NotificationService.send(new Push("Device123")));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
        System.out.println("this line is from eclipse");
    }
}
