package com.kundan.day20may2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        LRUCache<Integer,String> cache = new LRUCache<>(3);

        cache.put(1,"A");
        cache.put(2,"B");
        cache.put(3,"C");

        cache.get(1);

        cache.put(4,"D");

        System.out.println(cache);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
