package multithreading.java.code.day17september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}

/*
Problem 29 — Thread-Safe Blocking Queue

Difficulty: Advanced

Problem

Implement your own simplified BlockingQueue using:

wait()
notifyAll()
Queue

Requirements:

put()
take()

put() waits when the queue is full.

take() waits when the queue is empty
 */
