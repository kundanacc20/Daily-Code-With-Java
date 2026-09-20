package com.kundan.day21april2026;

public class LinkedListQueue {
    Node front, rear;

    void enqueue(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = front.data;
        front = front.next;

        if(front == null)
            rear = null;
        return value;
    }
    boolean isEmpty(){
        return front==null;
    }

    void display(){
        if(front == null){
            System.out.println("queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
