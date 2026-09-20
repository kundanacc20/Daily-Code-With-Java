package com.kundan.day14april2026;

public class MainApr014 {
    public static Node reverse(Node head){
        Node prev = null, curr = head, next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void printList(Node head){
        Node temp =head;
        while (temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List: ");
        printList(head);

        //reverse the linked list
        head = reverse(head);
        System.out.println("Reversed Linked List: ");
        printList(head);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
