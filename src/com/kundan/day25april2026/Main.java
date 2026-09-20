package com.kundan.day25april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue();

        System.out.println("Dequeued: " + q.dequeue());
        q.printQueue();

        System.out.println("Peek: " + q.peek());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // This will show "Queue is full"
        q.printQueue();

        System.out.println("Is full? " + q.isFull());
        System.out.println("Size: " + q.getSize());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
