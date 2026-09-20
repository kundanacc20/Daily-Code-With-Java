package com.kundan.day01july2026;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LoadBalancer {
    private final List<Server> servers;
    private final AtomicInteger counter;

    public LoadBalancer(List<Server> servers){
        if(servers == null || servers.isEmpty()){
            throw new IllegalArgumentException("server list cannot be empty");
        }
        this.servers = servers;
        this.counter = new AtomicInteger(0);
    }

    public Server getServer(){
        int index = Math.abs(counter.getAndIncrement()%servers.size());
        return servers.get(index);
    }

    public void handleRequest(String request){
        Server server = getServer();
        server.processRequest(request);
    }
}
