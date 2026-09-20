package com.kundan.day06may2026;

import java.util.HashMap;

public class FibonacciMemo {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n){
        if(n<= 1)
            return n;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fib(n-1) + fib(n-2);
        memo.put(n,result);
        return result;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println(fib(10));
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
