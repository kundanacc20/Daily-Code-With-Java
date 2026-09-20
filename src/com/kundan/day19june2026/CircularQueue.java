package com.kundan.day19june2026;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data){
        if(size == arr.length){
            throw new QueueException("queue full");
        }
        rear = (rear +1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public int dequeue(){
        if(size ==0){
            throw new QueueException("Queue Empty");
        }
        int value = arr[front];
        front = (front + 1)%arr.length;
        size--;
        return value;
    }
    public int peek(){
        if(size ==0){
            throw new QueueException("Queue Empty");
        }
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
