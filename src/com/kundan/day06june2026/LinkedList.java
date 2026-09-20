package com.kundan.day06june2026;

public class LinkedList {
    Node head;

    //add data to nodes
    public void insert(int data){
        Node newNode = new Node(data);

        if(head== null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //view data
    public void traverse(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
