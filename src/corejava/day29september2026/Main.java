package corejava.day29september2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static Character findFirst(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println(findFirst("swiss"));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time : "+programTime+" ms");
    }
}
/*
Find the First Non-Repeating Character
Java Collections

Interview question: Given a string, return the first character that appears exactly once. If no such character exists, return null.

Example: swiss → w.
 */