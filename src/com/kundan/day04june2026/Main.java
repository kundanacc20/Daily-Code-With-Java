package com.kundan.day04june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();

        //add values in the LinkedList
        lst.insertNode(3);
        lst.insertNode(1);
        lst.insertNode(6);
        lst.insertNode(9);
        lst.insertNode(8);
        lst.insertNode(5);
        lst.insertNode(7);
        lst.insertNode(4);

        //print values of Node in the LinkedList
        lst.printLinkedList();
        //print the middle value
        System.out.println("middle node of the given LinkedList: "+lst.middleNode());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
