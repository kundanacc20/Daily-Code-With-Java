package com.kundan.day29may2026;

public class LinkedList {
    Node head;

    public void insert(int data){
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

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("BULLA");
    }
}
