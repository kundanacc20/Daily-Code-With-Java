package com.kundan.day10april2026;

public class MainApr010 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);

        traverse(head);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
    public static void traverse(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ->");
            current = current.next;
        }
        System.out.println("null");
    }
}
