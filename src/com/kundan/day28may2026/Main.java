package com.kundan.day28may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //old way - platform thread
        Thread platformThread = new Thread(() -> {
            System.out.println("running on : "+Thread.currentThread());
        });
        platformThread.start();

        //New way - virtual thread(java 21)
        Thread virtualThread = Thread.ofVirtual().start(()->{
            System.out.println("This java java 21 thread running on: "+Thread.currentThread());
        });
        //wait for both thread to finish
        try {
            platformThread.join();
            virtualThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
