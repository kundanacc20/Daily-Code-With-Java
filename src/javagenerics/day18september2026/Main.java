package javagenerics.day18september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ZeroEvenOdd object = new ZeroEvenOdd(5);

        Thread zero = new Thread(object::zero);
        Thread even = new Thread(object::even);
        Thread odd = new Thread(object::odd);

        zero.start();
        odd.start();
        even.start();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+ " ms");
    }
}
/*
Problem 28 — Zero-Even-Odd

Difficulty: Advanced

Problem

Create three threads:

Zero thread prints 0.
Even thread prints even numbers.
Odd thread prints odd numbers.

For N = 5, expected:

0 1 0 2 0 3 0 4 0 5
 */
