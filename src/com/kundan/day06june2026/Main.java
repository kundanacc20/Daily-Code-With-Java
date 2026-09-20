package com.kundan.day06june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();

        lst.insert(9);
        lst.insert(8);
        lst.insert(1);
        lst.insert(7);
        lst.insert(5);
        lst.insert(2);

        lst.traverse();
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
