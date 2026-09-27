package corejava.day27september2026;

public class Main {
    public static void main() {
        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
/*
Problem — Producer-Consumer with Multiple Producers and Consumers

Problem
Create:

2 producers
3 consumers
Shared buffer
Maximum capacity = 5

All threads should safely access the buffer.
 */