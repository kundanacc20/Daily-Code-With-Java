package com.kundan.day29april2026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many binary number to generate: ");
        int n = sc.nextInt();

        //call the generate class
        BinaryGenerator.generate(n);

        sc.close();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
