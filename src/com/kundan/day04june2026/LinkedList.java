package com.kundan.day04june2026;

public class LinkedList {
    Node head;

    //insert in the Node
    public void insertNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //find the middle Node
    public int middleNode(){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    //print the LinkedList
    public void printLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
