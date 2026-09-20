package com.kundan.day11june2026;

public class StackArray {
    private int[] arr;
    private int top;

    public StackArray(int size){
        arr = new int[size];
        top = -1;
    }

    public void push(int data){
        if(top == arr.length -1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack undarflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return  -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top +1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("stack elements: ");
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
