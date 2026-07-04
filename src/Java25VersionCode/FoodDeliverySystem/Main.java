package Java25VersionCode.FoodDeliverySystem;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderProcessor orderProcessor = new OrderProcessor();
        DeliveryAssigner deliveryAssigner = new DeliveryAssigner();

        //Simulate multiple orders
        for(int i=1; i<=10; i++){
            String orderId = "Order:-"+i;
            orderProcessor.processOrder(orderId);
            deliveryAssigner.assignDelivery(orderId);
        }
    }
}
