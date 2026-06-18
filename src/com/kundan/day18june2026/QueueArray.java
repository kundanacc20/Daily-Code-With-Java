package com.kundan.day18june2026;

public class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public QueueArray(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data){
        if(size == arr.length){
            System.out.println("Queue overflow");
            return;
        }
        rear++;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        if (size == 0){
            throw new RuntimeException("Queue underflow");
        }
        int value = arr[front];
        front++;
        size--;

        return value;
    }

    public int peek(){
        if(size == 0)
            throw new RuntimeException("queue empty");

        return arr[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public int getSize(){
        return size;
    }
}
