package com.kundan.day11april2026;

public class MainApr011 {
    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static void printList(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data+ "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node head = null;

        //insert element at the beginning
        head = insert(head,10);
        head = insert(head,11);
        head = insert(head,13);

        printList(head);

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
