package com.kundan.day30may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();
        lst.insert(9);
        lst.insert(1900);
        lst.traverse();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("program time: "+ programTime+" ms");
    }
}
