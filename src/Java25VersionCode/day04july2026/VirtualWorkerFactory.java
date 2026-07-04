package Java25VersionCode.day04july2026;

public class VirtualWorkerFactory {
    public void runWithFactory() throws InterruptedException{
        Thread.Builder builder = Thread.ofVirtual().name("worker:- ",0);
        Thread t = builder.start(() -> {
            System.out.println("Hi from virtual thread: "+Thread.currentThread());
        });
        t.join();
    }
}
