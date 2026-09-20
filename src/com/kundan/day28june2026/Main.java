package com.kundan.day28june2026;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(20);
        pq.offer(5);
        pq.offer(10);
        pq.offer(30);

        while (!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+ programTime+" ms");
    }
}
