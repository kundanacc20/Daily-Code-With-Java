package com.kundan.day20april2026;

public class LinearQueue {
    int[] arr;
    int front, rear, capacity;

    //constructor
    public LinearQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }
        //Enqueue(insert)
        void enqueue(int data){
            if(rear == capacity -1){
                System.out.println("Queue is full");
            return;
        }
        arr[++rear] =data;
        System.out.println(data+ "enqueued to queue");
    }
    //dequeue(remove)
    int dequeue(){
        if(front>rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = arr[front++];
        System.out.println(item + "dequeued from queue");
        return item;
    }

    //peek (fron element)
    int peek(){
        if(front>rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    //display queue
    void display(){
        if(front> rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue element: ");
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
