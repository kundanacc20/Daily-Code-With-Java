package multithreading.java.code.day19september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTimer = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTimer+ " ms");
    }
}
/*
Problem  — Print 1 to N Using Three Threads

Difficulty: Intermediate+

Problem

Three threads should print numbers in sequence:

Thread-1 → 1
Thread-2 → 2
Thread-3 → 3
Thread-1 → 4
...

For N = 9:

1 2 3 4 5 6 7 8 9
 */