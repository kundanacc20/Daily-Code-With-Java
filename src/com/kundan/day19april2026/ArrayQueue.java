package com.kundan.day19april2026;

public class ArrayQueue {
    int[] arr;
    int front, rear, size, capacity;

    public ArrayQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = size = 0;
        rear = -1;
    }
        void enqueue(int data){
            if(size == capacity){
                System.out.println("Queue is Full");
                return;
            }
            rear = (rear +1)%capacity;
            arr[rear] = data;
            size++;
        }

        int dequeue(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int item = arr[front];
            front = (front +1)%capacity;
            size--;
            return item;
        }
        int peek(){
            if (size==0) return -1;
            return arr[front];
    }

    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size==capacity;
    }
}
