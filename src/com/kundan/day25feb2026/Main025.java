package com.kundan.day25feb2026;

import java.util.*;
import java.util.stream.Collectors;

public class Main025 {
    enum Category{
        EVEN,ODD,DIVISIBLE_BY_3
    }
    public static void main(String[] args){
        //Start Time
        long startTime = System.nanoTime();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        Map<Boolean,List<Integer>> result = list.stream()
//                .collect(Collectors.partitioningBy(n -> n%2==0));

//        // 2nd approach
//        Map<Boolean,List<Integer>> result = new HashMap<Boolean,List<Integer>>();
//        result.put(true,new ArrayList<Integer>());
//        result.put(false,new ArrayList<Integer>());
//
//        for(Integer n:list){
//            if(n%2==0){
//                result.get(true).add(n);
//            } else {
//                result.get(false).add(n);
//            }
//        }

//        //3rd approach
//        //pre-size list to avoid resizing overhead
//        List<Integer> evens = new ArrayList<>(list.size()/2);
//        List<Integer> odds = new ArrayList<>(list.size()/2);
//
//        //bitwise check in loop
//        for(int n:list){
//            if((n&1)==0){
//                {
//                    evens.add(n);
//                }
//            } else {
//                odds.add(n);
//            }
//        }
//
//        Map<Boolean,List<Integer>> result=new HashMap<>(2);
//        result.put(Boolean.TRUE,evens);
//        result.put(Boolean.FALSE,odds);

//        //4th approach
//        Map<String,List<Integer>> result =list.stream()
//                .collect(Collectors.groupingBy(n->{
//                    if(n%2 ==0) return "EvenList: ";
//                    else if(n%3==0) return " Divisible by 3: ";
//                    else return " OddList: ";
//                }));
//        // Time taken in millisecond: 10ms

//        //5th approach
//        Map<String,List<Integer>> result = new HashMap<>();
//        result.put("Even:",new ArrayList<>());
//        result.put("Odd:",new ArrayList<>());
//        result.put("Divisible by 3:",new ArrayList<>());
//
//        for(Integer n:list){
//            if(n%2==0){
//                result.get("Even:").add(n);
//            }
//            if(n%2 !=0){
//                result.get("Odd:").add(n);
//            }
//            if(n%3==0){
//                result.get("Divisible by 3:").add(n);
//            }
//        }
//        //Time taken in millisecond: 0ms

        //Optimized approach
        //Pre-initialize map with empty lists
        Map<Category,List<Integer>> result = new EnumMap<>(Category.class);
        for(Category c : Category.values()){
            result.put(c,new ArrayList<>());
        }

        //Classify numbers int all applicable categories
        for(Integer n:list){
//            if(n%2==0){
//                result.get(Category.EVEN).add(n);
//            } else {
//                result.get(Category.ODD).add(n);
//            }
            //check even/odd using bitwise AND
            if((n & 1)==0){
                result.get(Category.EVEN).add(n);
            } else {
                result.get(Category.ODD).add(n);
            }
            if(n%3==0){
                result.get(Category.DIVISIBLE_BY_3).add(n);
            }
        }

        //End time
        long endTime = System.nanoTime();

        //calculate time duration in millisecond
        long durationInMilliSecond = (endTime-startTime)/1_000_000;

        System.out.println("Result::"+result);
        System.out.println("Time taken in millisecond: "+durationInMilliSecond+"ms");
    }
}
