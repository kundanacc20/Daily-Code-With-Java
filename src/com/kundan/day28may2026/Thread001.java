package com.kundan.day28may2026;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

public class Thread001 {
    // BEFORE: Platform thread pool — will struggle with blocking I/O
    static void withPlatformThreads(int requests) throws InterruptedException {
        var pool = Executors.newFixedThreadPool(200); // max ~200 OS threads
        var latch = new CountDownLatch(requests);

        long start = System.currentTimeMillis();
        for (int i = 0; i < requests; i++) {
            pool.submit(() -> {
                try {
                    Thread.sleep(100); // simulate blocking DB/HTTP call
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();
                }
            });
        }
        latch.await();
        System.out.println("Platform threads: " + (System.currentTimeMillis() - start) + "ms");
        pool.shutdown();
    }
    // AFTER: Virtual thread executor — handles all 10,000 concurrently
    static void withVirtualThreads(int requests) throws InterruptedException {
        // newVirtualThreadPerTaskExecutor() is the key API!
        var executor = Executors.newVirtualThreadPerTaskExecutor();
        var latch = new CountDownLatch(requests);

        long start = System.currentTimeMillis();
        for (int i = 0; i < requests; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(100); // VT is parked, carrier thread is freed!
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();
                }
            });
        }
        latch.await();
        System.out.println("Virtual threads:  " + (System.currentTimeMillis() - start) + "ms");
        executor.shutdown();
    }
    public static void main(String[] args) throws InterruptedException {
        withPlatformThreads(10_000); // ~5000ms (bottlenecked by 200-thread pool)
        withVirtualThreads(10_000);  // ~110ms  (all 10k run concurrently!)
    }
}
