package com.kundan.day09june2026;

public class StackLinkedList {
    Node top;

    //insert data into the node
    public void push(int data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data+ " pushed");
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack empty");
            return -1;
        }
        int value = top.data;
        top = top.next;

        return value;
    }

    public int peek(){
        if(top == null){
            return -1;
        }
        return top.data;
    }

    public void display(){
        Node temp = top;

        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
