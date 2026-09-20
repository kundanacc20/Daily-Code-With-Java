package com.kundan.day19april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("front element: "+queue.peek());

        System.out.println("Dequeued: "+ queue.dequeue());
        System.out.println("Dequeued: "+ queue.dequeue());

        queue.enqueue(6);

        System.out.println("front element after operations: "+queue.peek());

        while (!queue.isEmpty()){
            System.out.println("Dequeued: "+queue.dequeue());
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");

    }
}
