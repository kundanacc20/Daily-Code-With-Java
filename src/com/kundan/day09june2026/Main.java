package com.kundan.day09june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        StackLinkedList stack = new StackLinkedList();

        stack.push(1);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.display();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
