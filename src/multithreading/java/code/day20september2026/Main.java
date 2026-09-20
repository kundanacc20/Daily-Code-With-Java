package multithreading.java.code.day20september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program timer
        long programTimer = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTimer+" ms");
    }
}
/*
Problem  — Print ABC Using Three Threads

Difficulty: Intermediate

Problem

Create three threads:

Thread A → A
Thread B → B
Thread C → C

Output:

ABCABCABCABCABC

Use wait() and notifyAll().
 */