package com.kundan.day26may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(2);
        list.insertAtEnd(1);
        list.insertAtEnd(6);

        list.display();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = System.nanoTime();

        System.out.println("program time: "+programTime+" ms");
    }
}
