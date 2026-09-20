package com.kundan.day28april2026;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Queue<Integer> q = new LinkedList<>();

        // adding element to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue: "+q);

        //reverse the queue
        ReverseQueue.reverse(q);

        System.out.println("Reversed Queue: "+q);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
