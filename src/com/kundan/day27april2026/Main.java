package com.kundan.day27april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("queue elements: ");
        q.display();

        System.out.println("Dequeued: "+q.dequeue());
        System.out.println("Front element: "+q.peek());

        q.display();
        System.out.println("Is queue empty? "+q.isEmpty());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time "+programTime+" millisecond");
    }
}
