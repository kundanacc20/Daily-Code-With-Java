package com.kundan.day17june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        BalancedChecker checker = new BalancedChecker();

        String str1 = "{[()]}";
        String str2 = "{[(})]";
        String str3 = "{[(]})";

        System.out.println("String: "+str1 + " -> "+checker.isBalanced(str1));
        System.out.println("String: "+str2 + " -> "+checker.isBalanced(str2));
        System.out.println("String: "+str3 + " -> "+checker.isBalanced(str3));


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time: "+ programTime+ " ms");

    }
}
