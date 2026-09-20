package com.kundan.day14june2026;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTime = System.nanoTime();

//        SequencedCollection<String> tickets = new LinkedList<>();
//
//        tickets.addLast("T101");
//        tickets.addLast("T102");
//        tickets.addLast("T103");
//        tickets.addLast("T104");

//        //urgent ticket
//        tickets.addFirst("T100");
//
//        //new ticket
//        tickets.addLast("T105");
//
//        System.out.println("All Tickets: ");
//        System.out.println(tickets);
//
//        String oldest = tickets.removeFirst();
//        System.out.println("\nProcessed oldest: "+oldest);
//
//        String newest = tickets.removeLast();
//        System.out.println("Processed Newest: "+newest);
//
//        System.out.println("\nRemaining Tickets: ");
//        System.out.println(tickets);
//
//        System.out.println("\nReverse Order: ");
//        System.out.println(tickets.reversed());

        //before java 21 getting first/last elements from a LinkedHashSet
        //was not straightforward.

//        SequencedSet<String> set = new LinkedHashSet<>();
//
//        set.add("java");
//        set.add("spring");
//        set.add("aws");
//        set.add("docker");
//        set.add("Ansible");
//        set.add("terraform");
//
//        System.out.println(set.getFirst());
//        System.out.println(set.getLast());
//
//        System.out.println(set.reversed());

        //SequencedMap Example

        SequencedMap<Integer, String> employees = new LinkedHashMap<>();

        employees.put(101, "John");
        employees.put(102,"Narayan sir");
        employees.put(103, "David");
        employees.put(104, "arun bhai");
        employees.put(105, "aditya bhai");
        employees.put(106,"harshit bhai");

        System.out.println(employees.firstEntry());
        System.out.println(employees.lastEntry());
        System.out.println(employees.reversed());


        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTime)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
