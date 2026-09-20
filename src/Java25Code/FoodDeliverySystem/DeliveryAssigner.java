package Java25Code.FoodDeliverySystem;

public class DeliveryAssigner {
    public void assignDelivery(String orderId) throws InterruptedException{
        Thread.Builder builder = Thread.ofVirtual().name("delivery:-",0);
        Thread t = builder.start(() ->{
            System.out.println("Assigning delivery for order: "+orderId+ " in "+Thread.currentThread());
        });
        t.join();
    }
}
