package com.kundan.day04april2026;

import java.util.ArrayList;
import java.util.List;

public class MainApr001 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, List<String> temp,
                           String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                temp.add(s.substring(start, i + 1));
                backtrack(result, temp, s, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainApr001 pp = new MainApr001();
        String input = "aab";
        List<List<String>> result = pp.partition(input);

        System.out.println("Palindrome partitions of \"" + input + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
