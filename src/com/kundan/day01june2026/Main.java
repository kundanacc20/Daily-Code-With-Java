package com.kundan.day01june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();

        lst.insertNode(9);
        lst.insertNode(8);
        lst.insertNode(1);
        lst.insertNode(4);
        lst.insertNode(3);
        lst.insertNode(7);
        lst.insertNode(6);

        lst.traverse();

        lst.deleteFirst();
        lst.traverse();

        lst.deleteFromEnd();
        lst.traverse();

        System.out.println(lst.search(4));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
