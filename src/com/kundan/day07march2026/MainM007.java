package com.kundan.day07march2026;

import java.util.stream.IntStream;

public class MainM007 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        String word = "qwertyuiopasdfghjklzxcvbnmmnbvcxzlkjhgfdsapoiuytrewq";
//
//        boolean isPalindrome = IntStream.range(0,word.length()/2)
//                .noneMatch(i ->word.charAt(i) !=word.charAt(word.length()-1-i));
//
//        System.out.println(isPalindrome);

//        boolean finalResult = isPalindrome(word);
//        System.out.println(finalResult);

        boolean isPalindrom = word.equals(new StringBuilder(word).reverse().toString());
        System.out.println(isPalindrom);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }

//    public static boolean isPalindrome(String arg){
//        int n = arg.length();
//        for(int i=0; i<n/2;i++){
//            if(arg.charAt(i) != arg.charAt(n-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }
}
