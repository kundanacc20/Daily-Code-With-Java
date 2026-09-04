package corejava.day4september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        /*Message message = new Message();

        Thread producer = new Thread(()->{
            for (int i = 1; i <= 5; i++){
                message.produce("Message : "+i);
            }
        });

        Thread consumer = new Thread(()->{
            for (int i = 1; i<=5; i++){
                message.consume();
            }
        });
        producer.start();
        consumer.start();
         */

        /*SharedResource resource = new SharedResource();

        Thread c1 = new Thread(()->resource.consume("Consumer-1"));
        Thread c2 = new Thread(()->resource.consume("consumer-2"));
        Thread c3 = new Thread(() ->resource.consume("consumer-3"));

        c1.start();
        c2.start();
        c3.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        Thread producer = new Thread(resource::produce);
        producer.start();

         */
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
