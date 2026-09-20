package com.kundan.day03june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LInkedList lst = new LInkedList();

        lst.insertNode(5);
        lst.insertNode(6);
        lst.insertNode(1);
        lst.insertNode(9);
        lst.insertNode(8);

        System.out.println("original linked list:");
        lst.printLinkedList();

        lst.reverse();
        System.out.println("reversed linked list:");
        lst.printLinkedList();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
