package com.kundan.day12march2026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application001 {
    public static void main(String[] args) throws InterruptedException {
        //Start Timer
        long startTimer = System.nanoTime();
//        //Creating virtual thread using Thread.startVirtualThread()
//        Thread virtualThread =Thread.startVirtualThread(()->{
//            System.out.println("Running in virtual thread: "+Thread.currentThread());
//        });
//        try {
//            virtualThread.join();
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        //Creating Virtual Thread using Thread.ofVirtual()
//        Thread thread = Thread.ofVirtual()
//                .name("My-Virtual-Thread")
//                .start(()->{
//                    System.out.println(Thread.currentThread());
//                });
//        thread.join();

        //Virtual Thread Executor(Recommended)
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
            for(int i=1;i<=10;i++){
                int task =i;

                executor.submit(()->{
                    System.out.println(
                            "Task "+task+
                                    " executed by "+
                                    Thread.currentThread()
                    );
                });
            }
        }

        //End Timer
        long endTimer = System.nanoTime();

        //Program Time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
