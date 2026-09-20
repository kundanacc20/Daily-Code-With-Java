package com.kundan.day12march2026;

public class VirtualThread001 {
    public static void main(String[] args) throws InterruptedException {
        //Start Timer
        long startTime = System.nanoTime();
        for(int i=0;i<10000;i++){
            Thread.startVirtualThread(()->{
                System.out.println("Task executed by "+Thread.currentThread());
            });
//            Thread.sleep(2000);
        }
        //End Timer
        long endTime = System.nanoTime();

        //Program Time
        long programTime = (endTime-startTime)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
