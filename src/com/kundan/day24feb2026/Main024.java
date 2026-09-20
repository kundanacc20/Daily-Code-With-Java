package com.kundan.day24feb2026;

import java.util.*;
import java.util.stream.Collectors;

public class Main024 {
    public static void main(String[] args){
        //Start time
        long startTime = System.nanoTime();

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,1,2,7,8,6,9,0,10,11,22,12,13,14,15,16,17,18,19);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,0,16,17,12,13,20,21,22);

//        List<Integer> common = list1.stream()
//                .filter(list2::contains)
//                .collect(Collectors.toList());
//        System.out.println(common);

//        //optimized way
//        Set<Integer> set = new HashSet<>(list2);
//
//        List<Integer> common = list1.stream()
//                .filter(set::contains)
//                .collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(list2);

        List<Integer> common = new ArrayList<>();
        for(Integer num : list1){
            if(set.contains(num)){
                common.add(num);
            }
        }
        //End time
        long endTime = System.nanoTime();

        //calculate elapsed time in milliseconds
        long durationInMillis = (endTime- startTime)/1_000_000;

        System.out.println(common);
        System.out.println("Time taken: "+durationInMillis+" ms");
    }
}
