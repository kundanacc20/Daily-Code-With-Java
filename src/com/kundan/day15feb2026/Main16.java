package com.kundan.day15feb2026;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main16 {
    public static void main(String[] args){
//        List<Integer> list = Arrays.asList(10,11,12,15);
//
//        list.forEach(n ->System.out.println(n));
// even numbers using lambda
//        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        list.stream()
//                .filter(n -> n%2 ==0)
//                .forEach(System.out::println);

        // sot list of strings a
//        List<String> names = Arrays.asList("rohit","amit","vishnu");
//
//        names.sort((a,b) -> a.compareTo(b));
//        System.out.println(names);

//        List<String> list =Arrays.asList("Amit","vishnu","ankit","raju");
//
//        long count = list.stream()
//                .filter(s -> s.startsWith("A"))
//                .count();
//        System.out.println(count);

//        List<Integer> list = Arrays.asList(1,1,2,2,2,2,5,4,3,7,8,9);
//
//        list.stream()
//                .distinct()
//                .forEach(System.out::println);

//        List<Integer> list = Arrays.asList(10,2,1);
//
//        int sum = list.stream()
//                .reduce(0,(a,b)->a+b);
//        System.out.println(sum);

//        List<Integer> list = Arrays.asList(1,9,2,8,4,3,6,5,10,11);
//
//        int secondHighest = list.stream()
//                .distinct()
//                .sorted((a,b) -> b-a)
//                .skip(1)
//                .findFirst()
//                .get();
//        System.out.println(secondHighest);

//        List<String> list = Arrays.asList("java","spring","api","code","restapi");
//
//        Map<Integer,List<String>> result =
//                list.stream()
//                        .collect(Collectors.groupingBy(s->s.length()));
//        System.out.println(result);

//        List<Integer> list = Arrays.asList(1,9,1,2,9,2,8,4,3,6,5,10,11);
//
//        list.stream()
//                .filter(n->Collections.frequency(list,n)>1)
//                .distinct()
//                .forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,2,3,4,5,1,9,7,10);

        int max = list.stream()
                .max((a,b)-> a.compareTo(b))
                .get();
        System.out.println("Max: "+max);


    }
}
