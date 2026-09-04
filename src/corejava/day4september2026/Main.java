package corejava.day4september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Message message = new Message();

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
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
