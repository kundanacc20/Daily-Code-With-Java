package multithreading.java.code.day17september2026;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyBlockingQueue<T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;

    public MyBlockingQueue(int capacity){
        this.capacity = capacity;
    }

    public synchronized void put(T value){
        while (queue.size() == capacity){
            try {
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
        }
        queue.add(value);
        System.out.println("Put: "+value);
        notifyAll();
    }

    public synchronized T take(){
        while (queue.isEmpty()){
            try{
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return null;
            }
        }
        T value = queue.poll();
        System.out.println("Take : "+value);
        notifyAll();
        return value;
    }
}
