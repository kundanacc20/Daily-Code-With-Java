package com.kundan.day03april2026;

import java.util.HashMap;
import java.util.Map;

public class MainApr003 {
    public String minWindow(String s, String t){
        if(s.length() < t.length())
            return "";

        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c ,0)+1);

        int left =0, count =t.length(), minLen = Integer.MAX_VALUE, start = 0;

        for(int right =0; right < s.length(); right++){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c)>0)
                    count--;
                map.put(c, map.get(c) - 1);
            }
            while(count == 0) {
                if(right - left + 1< minLen){
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left++);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar)+1);
                    if(map.get(leftChar)>0)
                        count++;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainApr003 solver = new MainApr003();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window substring: " + solver.minWindow(s, t));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime= (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
