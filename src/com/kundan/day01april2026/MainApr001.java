package com.kundan.day01april2026;

public class MainApr001 {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];
        for (char c: s.toCharArray())
            count[c - 'a']++;
        for (char c : t.toCharArray())
            count[c-'a']--;

        for(int c:count){
            if(c != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainApr001 checker = new MainApr001();

        System.out.println(checker.isAnagram("listen","silent"));
        System.out.println(checker.isAnagram("triangle","integral"));
        System.out.println(checker.isAnagram("apple","pale"));
        System.out.println(checker.isAnagram("night","thingq"));


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+ " ms");
    }
}
