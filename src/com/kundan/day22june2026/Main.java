package com.kundan.day22june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MinHeap heap = new MinHeap(10);

        heap.insert(20);
        heap.insert(10);
        heap.insert(5);
        heap.insert(30);

        heap.print();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+ programTime+" ms");
    }
}
