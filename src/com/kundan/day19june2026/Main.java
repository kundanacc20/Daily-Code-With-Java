package com.kundan.day19june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        CircularQueue queue = new CircularQueue(5);
        try {
            queue.enqueue(19);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            System.out.println("Front element: "+queue.peek());
            System.out.println("Dequeued: "+queue.dequeue());

            queue.enqueue(6);

            while (!queue.isEmpty()){
                System.out.println("Dequeued: "+queue.dequeue());
            }
        } catch (QueueException e){
            System.out.println("Error: "+e.getMessage());
        }

        //end timern
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ "ms");
    }
}
