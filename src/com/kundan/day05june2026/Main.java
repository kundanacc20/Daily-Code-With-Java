package com.kundan.day05june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LinkedList lst = new LinkedList();

        lst.insertData(9);
        lst.insertData(8);
        lst.insertData(6);
        lst.insertData(4);
        lst.insertData(1);
        lst.insertData(5);
        lst.insertData(7);
        lst.insertData(4);


        Node temp = lst.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = lst.head.next;
        if(lst.loopDetection()){
            System.out.println("Loop Detected: ");
        } else
            System.out.println("there is no loop exist in the Linked List");
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
