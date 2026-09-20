package com.kundan.day30april2026;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    //add an element to the queue
    void enqueue(int x){
        s1.push(x);
    }

    int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            throw new NoSuchElementException("queue is empty");
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
            throw new NoSuchElementException("Queue is empty");
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}
