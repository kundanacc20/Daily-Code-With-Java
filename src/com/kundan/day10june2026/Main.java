package com.kundan.day10june2026;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      //start timer
      long startTimer = System.nanoTime();

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(11);
        stack.push(12);

        System.out.println(stack);

        System.out.println("Peek: "+stack.peek());
        System.out.println("Pop: "+ stack.pop());

        System.out.println(stack);

      //end timer
        long endTimer = System.nanoTime();
      //program time

        long programTime = (endTimer - startTimer)/1_000_000;

      System.out.println("program time: "+programTime+ " ms");
    }
}
