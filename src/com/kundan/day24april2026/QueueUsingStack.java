package com.kundan.day24april2026;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x){
        s1.push(x);
    }
    int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
