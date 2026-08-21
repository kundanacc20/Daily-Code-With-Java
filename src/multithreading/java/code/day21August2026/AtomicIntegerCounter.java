package multithreading.java.code.day21August2026;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCounter {

    AtomicInteger count = new AtomicInteger(0);

    void increment(){
        count.incrementAndGet();
    }
}
