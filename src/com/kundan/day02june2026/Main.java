package com.kundan.day02june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();

        lst.insert(9);
        lst.insert(6);
        lst.insert(1);
        lst.insert(2);
        lst.insert(8);

        System.out.println("No. of Nodes in the given linked list is: "+lst.count());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+ programTime+" ms");
    }
}
