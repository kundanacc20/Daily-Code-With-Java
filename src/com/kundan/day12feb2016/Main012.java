package com.kundan.day12feb2016;

import java.util.*;
import java.util.stream.Collectors;

public class Main012 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Set<Integer> duplicates = list.stream()
                .filter(e ->Collections.frequency(list,e)>1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
