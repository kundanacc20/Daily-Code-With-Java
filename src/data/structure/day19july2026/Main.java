package data.structure.day19july2026;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //Max Heap Using PriorityQueue

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                Collections.reverseOrder());

        maxHeap.offer(20);
        maxHeap.offer(4);
        maxHeap.offer(50);
        maxHeap.offer(10);

        while (!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
        System.out.println("Program time :"+programTime+" ms");
    }
}
