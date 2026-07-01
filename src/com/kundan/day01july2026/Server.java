package com.kundan.day01july2026;

public class Server {
    private final String name;

    public Server(String name){
        this.name = name;
    }

    public void processRequest(String request){
        System.out.println(name+" is processing -> "+request);
    }

    public String getName(){
        return name;
    }
}
