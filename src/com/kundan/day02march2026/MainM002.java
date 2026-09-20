package com.kundan.day02march2026;

import java.util.*;
import java.util.stream.Collectors;

public class MainM002 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        //Find Duplicate Elements in List.
//        List<Integer> list = Arrays.asList(1,2,3,4,5,4,5,6,7,2,9,1);

//        Set<Integer> duplicates = list.stream()
//                .filter(n -> Collections.frequency(list,n)>1)
//                .collect(Collectors.toSet());
//        System.out.println(duplicates);

//        //second approach
//        Set<Integer> duplicates = new HashSet<>();
//        Set<Integer> seen = new HashSet<>();
//
//        for(Integer n:list){
//            //if we've already seen this number,it's a duplicate
//            if(!seen.add(n)){
//                duplicates.add(n);
//            }
//        }
//        System.out.println(duplicates);

        //generate large test data
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        //1 million integers between 1 to 100_000;
        for(int i=0; i<1_000_000; i++){
            list.add(random.nextInt(100000));
        }
        //frequency map
        Map<Integer,Integer> freqencyMap = new HashMap<>();
        for (Integer n:list){
            freqencyMap.put(n, freqencyMap.getOrDefault(n,0)+1);
        }

        //collect duplicates
        Set<Integer> duplicates = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry : freqencyMap.entrySet()){
            if(entry.getValue()>1){
                duplicates.add(entry.getKey());
            }
        }
        System.out.println("Duplicates: "+duplicates.stream().toList());

        //Execution time for program: 485 for 1_000_000 data_set and range is 100k;
        //end timer
        long endTimer = System.nanoTime();

        //execution time
        long executionTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Execution time for program: "+executionTime);
    }
}
