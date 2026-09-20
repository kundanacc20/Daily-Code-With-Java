package com.kundan.day05march2026;

import java.util.*;
import java.util.stream.Collectors;

public class MainM004 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();

        Map<String,Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("B",1);
        map.put("C",2);
        map.put("H",5);
        map.put("G",9);

//        Map<String,Integer> sorted = map.entrySet()
//                        .stream()
//                        .sorted(Map.Entry.comparingByValue())
//                        .collect(Collectors.toMap(
//                                Map.Entry::getKey,
//                                Map.Entry::getValue,
//                                (e1,e2)->e1,
//                                LinkedHashMap::new
//                        ));
//        System.out.println(sorted);
//        //Program Time: 18 millisecond for small data set

//        //second approach by using loop
//
//        //convert map to list
//        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());
//        //sort
//        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
//                return e1.getValue().compareTo(e2.getValue());
//            }
//        });
//
//        //insert sorted entries to linked hashmap
//        Map<String,Integer> sortedMap = new LinkedHashMap<>();
//        for(Map.Entry<String,Integer> entry:entryList){
//            sortedMap.put(entry.getKey(),entry.getValue());
//        }
//        System.out.println(sortedMap);
//        //Program Time: 2 millisecond for small data set

        // using parallel stream features of java 8
        Map<String,Integer> sortedMap = map.entrySet()
                .parallelStream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap);
        //Program Time: 57 millisecond for small data set

        //end timer
        long endTimer =System.nanoTime();
        //Program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
