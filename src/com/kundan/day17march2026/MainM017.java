package com.kundan.day17march2026;

public class MainM017 {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        LRUCache cache = new LRUCache(3);
//
//        cache.put(1,10);
//        cache.put(2,20);
//        cache.put(3,11);
//        cache.get(1);
//        cache.put(4,12);
//        cache.put(5,13);
//        cache.put(6,14);

          LRUCache001<Integer,String> cache = new LRUCache001<>(3);
          cache.put(1,"hello");
          cache.put(2,"world");
          cache.put(3,"C");
          cache.get(1);
          cache.put(4,"D");
        System.out.println(cache.getSnapshot());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
