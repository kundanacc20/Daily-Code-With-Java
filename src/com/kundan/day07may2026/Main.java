package com.kundan.day07may2026;

public class Main {
   public static void print(int n){
       //base condition
       if(n==0){
           return;
       }
       print(n-1);
       System.out.print(n+ " ");
   }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        print(5);
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
