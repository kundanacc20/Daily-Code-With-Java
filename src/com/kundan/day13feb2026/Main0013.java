package com.kundan.day13feb2026;

import java.util.*;

public class Main0013 {
    public static void main(String[] args) {
//    String[] words = {"eat", "teat","tan","ate","nat","bat","hat"};
//
//        Map<String, List<String>>  map = new HashMap<>();
//
//        for(String word:words){
//            char[] chars = word.toCharArray();
//            Arrays.sort(chars);
//            String key = new String(chars);
//
//            map.computeIfAbsent(key, k->new ArrayList<>()).add(word);
//        }
//        System.out.println(map.values());

//        // sort hashmap by value
//
//        Map<String,Integer> map = new HashMap<>();
//        map.put("A",90);
//        map.put("B",1);
//        map.put("C",20);
//        map.put("D",4);
//
//        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
//
//        list.sort(Map.Entry.comparingByValue());
//
//        for(Map.Entry<String,Integer> entry:list){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

//        //two sum problem(using map)
//
//        int[] nums ={2,7,11,15};
//        int target =9;
//
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int i =0;i<nums.length;i++){
//            int diff = target - nums[i];
//
//            if(map.containsKey(diff)){
//                System.out.println("Indexes: "+map.get(diff)+", "+i);
//                return;
//            }
//            map.put(nums[i],i);
//        }
       //find maximum occurring character

        String s ="programming";

        Map<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        char maxChar =' ';
        int maxCount =0;

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount =entry.getValue();
                maxChar=entry.getKey();
            }
        }
        System.out.println("max occuring character: "+maxChar);
    }
}
