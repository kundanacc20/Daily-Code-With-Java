package com.kundan.day01march2026;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainM001 {
    public static void main(String[] args){
        //Start timer
        long startTimer = System.nanoTime();
//        String input = "java8";
        int length =1_000_000_000;
        Random random = new Random();
        StringBuilder sb= new StringBuilder(length);

        //Generating random characters
        for(int i=0;i<length;i++){
            int choice = random.nextInt(3);
            char c;
            if(choice ==0){
                c=(char) ('A'+ random.nextInt(26));
            } else if (choice ==1) {
                c =(char) ('a'+random.nextInt(26));
            } else {
                c =(char)('0'+ random.nextInt(10));
            }
            sb.append(c);
        }
//        String input = sb.toString();
//        String reversed = IntStream.rangeClosed(1,input.length())
//                .mapToObj(i->input.charAt(input.length()-i))
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//        System.out.println(reversed);
//        //total time for program execution: 283 for 1_000_000 character
        //total time for program execution: 732 for 10_000_000 character
        //total time for program execution: 5486 for 100_000_000 character

        //for one billion i am using StringBuilder reverse method

        sb.reverse();
        String reversed= sb.toString();
        System.out.println(reversed);

        //total time for program execution: 40420 for one billion character

        //end timer
        long endTimer = System.nanoTime();

        //program execution time
        long programExectionTime = (endTimer-startTimer)/1_000_000;

        System.out.println("total time for program execution: "+programExectionTime);
    }
}
