package com.kundan.day30april2026;

public class Main {
   public static void main(String[] args){
       //start timer
       long startTimer = System.nanoTime();
        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: "+q.peek());
        System.out.println("Dequeued: "+q.dequeue());
        System.out.println("Dequeued: "+q.dequeue());
        System.out.println("is queue empty? "+q.isEmpty());
        System.out.println("Dequeued: "+q.dequeue());
        System.out.println("is queue empty? "+q.isEmpty());
       //end timer
       long endTimer = System.nanoTime();

       //program time
       long programTime = (endTimer-startTimer)/1_000_000;

       System.out.println("program time: "+programTime+ " ms");
   }
}
