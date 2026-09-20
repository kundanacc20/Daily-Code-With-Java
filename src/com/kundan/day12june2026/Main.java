package com.kundan.day12june2026;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.SequencedSet;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        SequencedCollection<String> broserHistory = new LinkedHashSet<>();

        broserHistory.addLast("google.com");
        broserHistory.addLast("amazon.com");
        broserHistory.addLast("fipkart.com");
        broserHistory.addLast("github.com");
        broserHistory.addLast("chatgpt.com");
        broserHistory.addLast("microsoft.com");
        broserHistory.addLast("tsmc.com");

        System.out.println("History: "+broserHistory);

        System.out.println("First Visited: "+broserHistory.getFirst());
        System.out.println("Last Visited: "+broserHistory.getLast());

        broserHistory.removeFirst();
        System.out.println("After Removing Oldest: "+broserHistory);
        System.out.println("Reverse History : "+broserHistory.reversed());


        SequencedSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("AWS");
        set.add("Docker");

        System.out.println(set.getFirst());
        System.out.println(set.getLast());

        System.out.println(set.reversed());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+ programTime+" ms");
    }
}
