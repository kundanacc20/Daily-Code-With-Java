package com.kundan.day22april2026;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        //using java build-in Queue interface
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(1);
        pq.add(2);

        while (!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
