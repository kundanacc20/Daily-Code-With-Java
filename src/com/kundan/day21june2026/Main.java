package com.kundan.day21june2026;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.offer(11);
//        queue.offer(120);
//        queue.offer(12);
//
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue);

        Queue<Integer>  queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
