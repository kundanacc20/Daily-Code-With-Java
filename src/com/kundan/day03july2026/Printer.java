package com.kundan.day03july2026;

import java.util.List;

public class Printer {
    public static void printLength(Object obj){
        if(obj instanceof String s){
            System.out.println("String of length: "+s.length());
        } else if(obj instanceof Integer i){
            System.out.println("Integer value: "+i);
        } else if(obj instanceof List<?> list){
            System.out.println("List of size: "+list.size());
        } else {
            System.out.println("Unknown type");
        }
    }
}
