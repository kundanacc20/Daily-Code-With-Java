package corejava.day27september2026;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBlockingQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public BoundedBlockingQueue(int capacity){
        this.capacity = capacity;
    }

    public synchronized void put(int value){
        while (queue.size() == capacity){
            try {
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
        }
        queue.add(value);
        System.out.println("Produced : "+value);
        notifyAll();
    }

    public synchronized int take(){
        while (queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return -1;
            }
        }
        int value = queue.poll();
        System.out.println("consumend : "+value);
        notifyAll();

        return value;
    }
}
