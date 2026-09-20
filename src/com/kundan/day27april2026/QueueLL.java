package com.kundan.day27april2026;

public class QueueLL {
    Node front, rear;

    void enqueue(int x){
        Node temp = new Node(x);
        if(rear == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    int dequeue(){
        if(front == null)
            return -1;
        int val = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        return val;
    }

    int peek() {
        if(front == null)
            return -1;
        return front.data;
    }

    boolean isEmpty(){
        return front == null;
    }

    void display(){
        Node temp = front;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
