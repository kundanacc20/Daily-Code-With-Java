package com.kundan.day02march2026;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelBitSetDuplicates {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Start timer
        long startTime = System.nanoTime();
        int dataSize =100_000_000;
        int range  = 1_000_000;

        int numThreads = Runtime.getRuntime().availableProcessors();

        //Generate large dataset
        Random random = new Random();
        int[] data = new int[dataSize];
        for(int i=0;i<dataSize;i++){
            data[i] =random.nextInt(range);
        }

        //shared Bitsets
        BitSet seen = new BitSet(range+1);
        BitSet duplicates = new BitSet(range+1);

        //Parallel processing
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<?>> futures = new ArrayList<>();

        int chunckSize = dataSize/numThreads;
        for(int t=0;t<numThreads; t++){
            final  int start = t*chunckSize;
            final int end =(t==numThreads-1) ? dataSize:start +chunckSize;

            futures.add(executor.submit(()->{
               BitSet localSeen = new BitSet(range+1);
               BitSet localDuplicates = new BitSet(range+1);

               for(int i = start;i<end;i++){
                   int n =data[i];
                   if(localSeen.get(n)){
                      localDuplicates.set(n);
                   } else {
                       localSeen.set(n);
                   }
               }
                synchronized (seen) {
                    BitSet intersection = (BitSet) localSeen.clone();
                    intersection.and(seen); // values already seen globally
                    duplicates.or(intersection); // mark as duplicates
                    seen.or(localSeen); // update global seen
                }

            }));
        }
        //Wait for all threads
        for(Future<?> f :futures){
            f.get();
        }
        executor.shutdown();

//        System.out.println("Number of duplicates: " + duplicates.cardinality());
        System.out.println("Some duplicates: " + java.util.Arrays.toString(duplicates.stream().toArray()));

        //time taken: 1737 for 100 million data set and 1 million duplicate data


        //End timer
        long endTimer = System.nanoTime();

        //Calculate time taken
        long timeTaken = (endTimer-startTime)/1_000_000;

        System.out.println("time taken: "+timeTaken);
    }
}
