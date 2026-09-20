package multithreading.java.code.day15september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        TrafficSignal signal = new TrafficSignal();

        Thread red = new Thread(new RedLight(signal),"RED-Thread");
        Thread green = new Thread(new GreenLight(signal),"GREEN-Thread");
        Thread yellow = new Thread(new YellowLight(signal),"YELLOW-Thread");

        red.start();
        green.start();
        yellow.start();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");

    }
}
