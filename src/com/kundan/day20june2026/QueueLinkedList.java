package com.kundan.day20june2026;

public class QueueLinkedList {
    private Node front;
    private Node rear;

    public void enqueue(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null)
            throw new RuntimeException("queue empty");

            int value = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }
            return value;
        }

        public int peek () {
            if (front == null) {
                throw new RuntimeException("Queue Empty");
            }
            return front.data;
        }

        public boolean isEmpty () {
            return front == null;
        }
}
