package corejava.day28september2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer,Integer> {
    private final int capacity;

    public LRUCache(int capacity){
        super(capacity,.75f,true);
        this.capacity = capacity;
    }

    public int getValue(int key){
        return getOrDefault(key, -1);
    }

    public void putValue(int key, int value){
        put(key,value);
    }

    public boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size() > capacity;
    }
}
