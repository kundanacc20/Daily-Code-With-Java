package com.kundan.day31may2026;

public class LinkedListInsertAtPosition {

    public void insertAtPosition(LinkedList list, int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = list.head;
            list.head = newNode;
            return;
        }

        Node temp = list.head;

        for (int i = 1; i < position - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
}