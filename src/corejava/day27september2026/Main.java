package corejava.day27september2026;

public class Main {
    public static void main() {
        //start timer
        long startTimer = System.nanoTime();
       /* Buffer buffer = new Buffer();

        for(int i =1; i<=2; i++){
            int producerId = i;

            new Thread(() ->{
                for(int j =1; j<=10; j++){
                    buffer.put(producerId*100+j);
                }
            },"producer"+i).start();
        }
        for(int i =1; i<=3; i++){
            new Thread(()->{
                for(int j =1; j<=6; j++){
                    buffer.take();
                }
            },"consumer"+i).start();
        }
        */

        BoundedBlockingQueue boundedBlockingQueue = new BoundedBlockingQueue(3);

        Thread producerThread = new Thread(()->{
            for(int i = 1; i<= 5; i++){
                boundedBlockingQueue.put(i);
            }
        });

        Thread consumerThread = new Thread(()->{
            for (int i = 1; i<= 5; i++){
                boundedBlockingQueue.take();
            }
        });
        producerThread.start();
        consumerThread.start();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
/*
Problem — Producer-Consumer with Multiple Producers and Consumers

Problem
Create:

2 producers
3 consumers
Shared buffer
Maximum capacity = 5

All threads should safely access the buffer.
 */