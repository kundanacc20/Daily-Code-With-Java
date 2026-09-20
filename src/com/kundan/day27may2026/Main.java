package com.kundan.day27may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(2);
        list.insert(1);
        list.insert(9);

        System.out.println("Linked list: ");
        list.display();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
