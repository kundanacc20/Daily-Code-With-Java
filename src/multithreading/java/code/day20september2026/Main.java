package multithreading.java.code.day20september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ABCPrinter printer = new ABCPrinter();

        Thread t1 = new Thread(printer::printA);
        Thread t2 = new Thread(printer::printB);
        Thread t3 = new Thread(printer::printC);

        t1.start();
        t2.start();
        t3.start();
        //end timer
        long endTimer = System.nanoTime();

        //program timer
        long programTimer = (endTimer - startTimer)/1_000_000;
        System.out.println();

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