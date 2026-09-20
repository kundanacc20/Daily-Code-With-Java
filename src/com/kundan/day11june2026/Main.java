package com.kundan.day11june2026;

public class Main {
    public static void main(String[] args){
      //start timer
      long startTimer = System.nanoTime();
       StackArray stack = new StackArray(5);

       stack.push(3);
       stack.push(10);
       stack.push(11);
       stack.push(12);
       stack.push(14);

       stack.display();

       System.out.println("top element: "+stack.peek());
       System.out.println("stack size: "+ stack.size());

       System.out.println("Popped: "+stack.pop());
       stack.display();
       System.out.println("now top element is: "+stack.peek());
       stack.display();

        //end timer
      long endTimer = System.nanoTime();

      //program time
       long programTime = (endTimer-startTimer)/1_000_000;

       System.out.println("program time: "+programTime+" ms.");

    }
}
