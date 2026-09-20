package com.kundan.day03june2026;

public class LInkedList {
    Node head;

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

    public void printLinkedList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("EndOfLinked:");
    }

    //reversed Linked List
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
