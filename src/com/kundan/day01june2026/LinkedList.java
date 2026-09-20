package com.kundan.day01june2026;

public class LinkedList {
    Node head;

    //insert data
    public void insertNode(int element){
        Node newNode = new Node(element);

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

    //traverse
    public void traverse(){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("EndOfLinkedList");
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    //delete from the end
    public void deleteFromEnd(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    //search
    public boolean search(int key){
        Node temp = head;

        while (temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
