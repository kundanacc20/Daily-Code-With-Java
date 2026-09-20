package com.kundan.day3march2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class FrequencyFilter {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        int length = 100_000_000;
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
        String input = sb.toString();
        int targetFrequency = 2;

        //count frequencies
        Map<Character,Integer> frequency = new HashMap<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }

        //collect characters with target frequency
        Map<Character,Integer> filtered = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry:frequency.entrySet()){
            if(entry.getValue()==targetFrequency){
                filtered.put(entry.getKey(),entry.getValue());
            }
        }
        System.out.println(filtered);
        //Total time taken for program execution: 27 millisecond for small test data
        //Total time taken in program execution: 5572 millisecond for 100 million test data


        //end timer
        long endTimer = System.nanoTime();

        //total program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Total time taken in program execution: "+programTime+" millisecond");
    }
}
