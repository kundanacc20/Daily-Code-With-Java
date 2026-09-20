package com.kundan.day06march2026;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int k =3;

        PriorityQueue<Integer>topKElement = IntStream.rangeClosed(1, 100_000_000)
                .parallel()
                .boxed()
                .collect(
                        // Supplier: create a PQ of size k
                        () -> new PriorityQueue<>(k),
                        // Accumulator: add element, keep only k largest
                        (pq, val) -> {
                            pq.offer(val);
                            if (pq.size() > k) {
                                pq.poll();
                            }
                        },
                        // Combiner: merge two PQs
                        (pq1, pq2) -> {
                            pq2.forEach(val -> {
                                pq1.offer(val);
                                if (pq1.size() > k) {
                                    pq1.poll();
                                }
                            });
                        }
                );
        List<Integer> result = new ArrayList<>(topKElement);
    result.sort(Comparator.reverseOrder());

    System.out.println(result);
    //Program Time : 1582 ms for 100 million data set

        //end timer
        long endTimer = System.nanoTime();

       //program time
       long programTime = (endTimer-startTimer)/1_000_000;

       System.out.println("Program Time : "+programTime+" ms");
    }
}
