package com.kundan.day30may2026;

public class LinkedList {
    Node head ;


    public void insert(int value){
        Node newNode = new Node(value);
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

    public void traverse(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("hello->world");
    }
}
