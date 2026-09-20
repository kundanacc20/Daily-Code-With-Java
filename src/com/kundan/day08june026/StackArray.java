package com.kundan.day08june026;

public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int size){
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    //push operation
    public void push(int data){
        if(top == capacity -1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
        System.out.println(data+ " pushed");
    }

    //pop operation
    public int pop(){
        if (top == -1){
            System.out.println("Stack UnderFlow");
            return  -1;
        }
        return stack[top--];
    }

    //peek operation
    public int peek(){
        if(top == -1){
            return -1;
        }
        return stack[top];
    }

    //isEmpty
    public boolean isEmpty(){
        return top == -1;
    }
    //Display Stack
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Elements: ");

        for(int i= top; i >= 0; i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
