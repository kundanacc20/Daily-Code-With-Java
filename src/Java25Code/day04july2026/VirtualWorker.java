package Java25Code.day04july2026;

public class VirtualWorker {
    public void runDirect() throws InterruptedException{
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in : "+ Thread.currentThread());
        });
        vThread.join();
    }
}
