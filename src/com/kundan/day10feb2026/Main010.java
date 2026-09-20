package com.kundan.day10feb2026;

import java.util.Arrays;
import java.util.List;

public class Main010 {
    public static void main(String[] args){
//        List<String> words = Arrays.asList("welcome","to ","baeldung");
//
//        if(words.contains("baeldung")) {
//            System.out.println("Baeldung is in the list");
//        } else {
//            System.out.println("baeldung is not in the list");
//        }

        // A Naive hashCode() implementation
        User u1 = new User(1,"Alice","alice@example.com");
        User u2 = new User(1, "Alice", "alice@example.com");
        User u3 = new User(2, "Bob", "bob@example.com");

        System.out.println("u1 equals u2? " + u1.equals(u2));
        System.out.println("u1 equal u3?"+u1.equals(u3));
        System.out.println("u1 hashCode: " + u1.hashCode());
        System.out.println("u2 hashCode: " + u2.hashCode());
        System.out.println("u3 hashCode: " + u3.hashCode());
    }
}
