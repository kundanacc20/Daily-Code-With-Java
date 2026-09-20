package com.kundan.day26may2026;

public class LinkedList {
    Node head;

    //insert at the end
    void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next =newNode;
    }

    //Display list
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
