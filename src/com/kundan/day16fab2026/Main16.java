package com.kundan.day16fab2026;

import java.util.HashMap;

public class Main16 {

//    public static int firstUniChar(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        //counting frequency of each type of charter in the string
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//
//        // finding first character with non frequency is one
//        for(int i=0; i<s.length(); i++){
//            if(map.get(s.charAt(i))==1){
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static int firstUniChar(String s){
//        int[] freq = new int[26];
//
//        for(char ch:s.toCharArray()){
//            freq[ch - 'a']++;
//        }
//
//        for (int i=0;i<s.length();i++){
//            if(freq[s.charAt(i)-'a']==1){
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static boolean isPalindrome(String s, int start,int end){
//        if(start >= end){
//            return true;
//        }
//        if(s.charAt(start) != s.charAt(end)){
//            return false;
//        }
//        return isPalindrome(s,start+1,end-1);
//    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return check(s,0,s.length()-1);
    }
    private static boolean check(String s,int start,int end){
        if(start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end)){
            return false;
        }

        return check(s,start+1,end-1);
    }
    public static void main(String[] args){
//        String s = "loveleetcode";
//
//        int a = firstUniChar(s);
//
//        System.out.println(s.charAt(a));

        String s="A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
