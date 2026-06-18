package com.kundan.day18june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        QueueArray queue = new QueueArray(5);

        //enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("front element: "+queue.peek());
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
        System.out.println("Program Time: "+programTime+" ms");
    }
}
