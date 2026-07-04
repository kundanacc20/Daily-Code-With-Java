package Java25VersionCode.FoodDeliverySystem;

public class OrderProcessor {
    public void processOrder(String orderId) throws InterruptedException {
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Processing order: "+ orderId + " in "+Thread.currentThread());
        });
        vThread.join();
    }
}
