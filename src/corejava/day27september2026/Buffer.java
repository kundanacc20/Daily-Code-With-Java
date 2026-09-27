package corejava.day27september2026;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void put(int value){
        while (queue.size() == capacity){
            try {
                wait();
            } catch (InterruptedException e ){
                Thread.currentThread().interrupt();
                return;
            }
        }
        queue.add(value);
        System.out.println(Thread.currentThread().getName()+" produced "+
                value);
        notifyAll();
    }
}
