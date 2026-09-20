package com.kundan.day01may2026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExecutorCode001 {
    public static void main(String[] args) throws Exception{
        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
            for(int i=0; i<5; i++){
                int id =i;
                executor.submit(()->{
                    System.out.println("Running task "+id+" in "+Thread.currentThread());
                    Thread.sleep(1000);
                    return id;
                });
            }
        }
    }
}
