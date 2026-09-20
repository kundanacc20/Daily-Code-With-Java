package com.kundan.day06may2026;

import java.util.Scanner;

public class Main {
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci number to display: ");
        int count = scanner.nextInt();
        //start timer
        long startTimer = System.nanoTime();
        System.out.println("Fibonacci sequence up to "+count+" term: ");
        for(int i =0; i<count; i++){
            System.out.print(fibonacci(i)+ " ");
        }
        scanner.close();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
