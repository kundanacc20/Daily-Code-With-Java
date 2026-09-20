package com.kundan.day2may2026;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        SequencedCollection<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("bob");
        names.add("charlie");

        System.out.println("First: "+names.getFirst());
        System.out.println("Last: "+names.getLast());

        names.addFirst("zara");
        names.addLast("david");

        System.out.println("After adding at ends: "+names);

        names.removeFirst();
        names.removeLast();

        System.out.println("after removing end: "+names);

        SequencedCollection<String> reversedNames = names.reversed();
        System.out.println("Reversed view: "+reversedNames);
        //end timer
        long endTimer = System.nanoTime();

        //program time

        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+ " ms");
    }
}
