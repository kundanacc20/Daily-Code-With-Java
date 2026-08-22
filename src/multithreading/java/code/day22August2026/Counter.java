package multithreading.java.code.day22August2026;

public class Counter {
    private int count = 0;

    void increment(){
        synchronized (this){
            count++;
        }
    }

    int getCount(){
        return count;
    }
}
