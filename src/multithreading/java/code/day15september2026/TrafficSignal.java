package multithreading.java.code.day15september2026;

public class TrafficSignal {
    private Signal signal = Signal.RED;

    public synchronized void red(){
        for (int i = 0; i < 5; i++){
            while (signal != Signal.RED){
                waitForSignal();
            }
            System.out.println("RED");
            signal =Signal.GREEN;
            notifyAll();
        }
    }

    public synchronized void green(){
        for(int i = 0; i < 5; i++){
            while (signal != Signal.GREEN){
                waitForSignal();
            }
            System.out.println("GREEN");
            signal = Signal.YELLOW;
            notifyAll();
        }
    }

    public synchronized void yellow(){
        for(int i = 0; i < 5; i++){
            while (signal != Signal.YELLOW){
                waitForSignal();
            }
            System.out.println("YELLOW");
            signal = Signal.RED;
            notifyAll();
        }
    }

    private void waitForSignal() {
        try {
            wait();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
