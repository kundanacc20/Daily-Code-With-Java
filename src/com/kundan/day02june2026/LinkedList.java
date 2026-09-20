package com.kundan.day02june2026;

public class LinkedList {
    Node head;

    public void insert(int data){
    Node newNode = new Node(data);

    if(head == null){
        head =newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
    }

    public int count(){
        int count=0;

        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

}
