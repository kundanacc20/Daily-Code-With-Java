package com.kundan.day08june026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(11);
        stack.push(14);

        stack.display();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+ programTime+ " ms");
    }
}
