package corejava.day4september2026;

public class SharedResource {
    private boolean available = false;

    public synchronized void consume(String name){
        while (!available){
            try {
                System.out.println(name+": is waiting...");
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name+" consumed resource: ");
        available=false;
    }
    public synchronized void produce(){
        available = true;
        System.out.println("producer produce resource ");
        notifyAll();
    }
}
/*
Problem
Create multiple consumer threads that wait for a shared resource.
Demonstrate why notifyAll() is useful when multiple threads may be waiting.
 */