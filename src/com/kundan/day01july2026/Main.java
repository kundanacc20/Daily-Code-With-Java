package com.kundan.day01july2026;

import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        List<Server> servers = List.of(
                new Server("server-1"),
                new Server("Server-2"),
                new Server("Server-3")
        );

        LoadBalancer loadBalancer = new LoadBalancer(servers);

        for(int i =1; i<=10; i++){
            loadBalancer.handleRequest("Request-"+i);
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
