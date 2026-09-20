package com.kundan.day23april2026;

import java.util.ArrayDeque;
import java.util.*;

public class Deque001 {
    private Deque<Integer> dq;

    public Deque001(){
        dq = new ArrayDeque<>();
    }

    public void addFirst(int value){
        dq.addFirst(value);
    }

    public void addLast(int value){
        dq.addLast(value);
    }

    public int removeFirst() {
        return dq.removeFirst();
    }

    public int removeLast(){
        return dq.removeLast();
    }

    public void printDeque(){
        System.out.println("Current Deque: "+dq);
    }
}
