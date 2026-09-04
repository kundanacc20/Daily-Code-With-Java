package corejava.day4september2026;

public class Message {
    private String message;
    private boolean available = false;

    public synchronized void produce(String msg){
        while (available){
            try {
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        available = true;

        System.out.println("Produced: "+message);
        notify();
    }

    public synchronized void consume(){
        while (!available){
            try {
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("consumed "+message);
        available = false;

        notify();
    }
}
/*
Problem:
Create two threads:

Producer adds a message to a shared object.
Consumer waits until the message is available.
Producer should use notify() after adding the message.
Consumer should use wait() when no message is available.
 */