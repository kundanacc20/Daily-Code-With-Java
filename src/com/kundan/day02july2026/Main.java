package com.kundan.day02july2026;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //start timer
        long startTimer = System.nanoTime();
        // Method 1: Direct creation
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in: " + Thread.currentThread());
        });
        vThread.join();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
