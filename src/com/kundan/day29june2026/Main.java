package com.kundan.day29june2026;

public class Main {
    public static void main(String[] args) throws Exception {
        //start timer
        long startTimer = System.nanoTime();

        ExternalService service = new ExternalService();

        CircuitBreaker breaker = new CircuitBreaker(3, 5000);

        for(int i= 1; i <= 20; i++){
            System.out.println("-------------------------------");
            System.out.println("Request: "+i);
            String result = breaker.execute(service);
            System.out.println(result);

            System.out.println("Circuit State: "+breaker.getState());
            Thread.sleep(1000);
        }

     //end timer
     long endTimer = System.nanoTime();

     //program time
     long programTime = (endTimer - startTimer)/1_000_000;

     System.out.println("Program Time: "+programTime+" ms");

    }
}
