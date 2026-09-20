package com.kundan.day05may2026;

public class Main {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int result = factorial(5);
        System.out.println("Factorial: "+result);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
