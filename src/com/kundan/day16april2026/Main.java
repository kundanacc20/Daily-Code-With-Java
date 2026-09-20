package com.kundan.day16april2026;

public class Main {
    public static Node middle(Node head){
        Node slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void printLinkedList(Node head){
        Node newNode = head;
        while (newNode != null){
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        // start timer
        long startTimer = System.nanoTime();
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        Node head = new Node(numbers[0]);
        Node currentNode = head;

        for (int i=1; i<numbers.length; i++){
            currentNode.next = new Node(numbers[i]);
            currentNode =currentNode.next;
        }

        System.out.println("Linked List: ");
        printLinkedList(head);

        Node mid = middle(head);
        System.out.println("Middle Node: "+ mid.data);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
