package com.kundan.day21april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedListQueue queue = new  LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.print("queue after enqueues: ");
        queue.display();

        System.out.println("Dequeue: "+queue.dequeue());
        System.out.println("Dequeue: "+queue.dequeue());

        System.out.print("queue after dequeue: ");
        queue.display();
        queue.enqueue(6);
        System.out.print("Queue after enqueue 6: ");
        queue.display();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programtime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programtime+ " ms");
    }
}
