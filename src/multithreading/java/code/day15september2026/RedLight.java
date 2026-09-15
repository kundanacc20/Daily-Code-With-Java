package multithreading.java.code.day15september2026;

public class RedLight implements Runnable{
    private final TrafficSignal signal;

    public RedLight(TrafficSignal signal){
        this.signal = signal;
    }

    @Override
    public void run() {
        signal.red();
    }
}
