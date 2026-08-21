package multithreading.java.code.day21August2026;

public class SynchronizedCounter {
    int count = 0;

    synchronized void increment(){
        count++;
    }
}
