package com.kundan.day18april2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        StackADT<Integer> stack = new StackADT<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();
        System.out.println("Top element: "+stack.peek());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Is Empty? "+ stack.isEmpty());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
