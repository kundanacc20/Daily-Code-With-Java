package com.kundan.day18march2026;

import java.util.HashSet;
import java.util.Set;

public class MainM018 {
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int left =0, max =0;

        for (int right =0; right<s.length(); right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }
    public static void main(String[] args){
        //Strat Timer
        long startTimer = System.nanoTime();

        //End Timer
        long endTimer = System.nanoTime();
//        System.out.println(lengthOfLongestSubstring("abcdababcdeaaa"));
        String result = longestSubstring("abcabcbb");
        System.out.println("Longest substring: "+result);
        System.out.println("Length: "+result.length());

        //Program Time
        long programTime =(endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }

    public static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left =0,max =0, start=0;
        for(int right =0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            if (right - left + 1 > max) {
                max = right - left + 1;
                start = left;
            }
        }
        return s.substring(start, start + max);
    }
}
