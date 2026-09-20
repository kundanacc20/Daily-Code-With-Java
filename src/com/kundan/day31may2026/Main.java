package com.kundan.day31may2026;

public class Main {
    public static void main(String[] args){
        //start time
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();
        LinkedListInsertAtPosition lstp = new LinkedListInsertAtPosition();

        lst.insert(5);
        lst.insert(3);
        lst.insert(8);
        lst.insert(7);
        lst.insert(9);

        lst.traverse();

        lst.insertAtBeginning(4);
        lst.traverse();

        lstp.insertAtPosition(lst,11, 3);
        lst.traverse();
        //end time
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+ programTime+" ms");
    }
}
