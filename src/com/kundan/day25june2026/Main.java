package com.kundan.day25june2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //without record pattern
        Order order = new Order(
                101,
                new Customer(1,"kundan"),
                50000
        );

        Customer c = order.customer();

        System.out.println(order.orderId());
        System.out.println(c.id());
        System.out.println(c.name());
        System.out.println(order.amount());

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
