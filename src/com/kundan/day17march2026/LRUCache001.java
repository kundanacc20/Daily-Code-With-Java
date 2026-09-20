package com.kundan.day17march2026;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache001<K,V> {
    private final int capacity;
    private final Map<K,V> cache;

    public LRUCache001(int capacity){
        this.capacity = capacity;
        //LinkedHashMap with access-order enabled
        this.cache = new LinkedHashMap<K,V>(capacity,.75f,true) {

            protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
                return size() > LRUCache001.this.capacity;
            }
        };
    }
    //thread-safe get
    public  synchronized V get(K key){
        return cache.get(key);
    }

    //thread-safe put
    public synchronized void put(K key, V value){
        cache.put(key,value);
    }

    //optional: expose current cache state
    public synchronized Map<K,V> getSnapshot(){
        return new LinkedHashMap<>(cache);
    }
}
