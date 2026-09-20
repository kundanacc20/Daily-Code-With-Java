package com.kundan.day12april2026;

public class MainApr02 {
    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
        if(head == null)
            return newNode;

        Node temp =head;
        while (temp.next != null){
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        // start timer
        long startTimer = System.nanoTime();
        Node head =null;

        head = insert(head,10);
        head = insert(head, 11);
        head = insert(head, 12);
        head = insert(head, 14);

        System.out.println("Linked list: ");
        printList(head);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
