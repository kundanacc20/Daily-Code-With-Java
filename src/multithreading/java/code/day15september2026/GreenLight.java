package multithreading.java.code.day15september2026;

public class GreenLight implements Runnable{
    private final TrafficSignal signal;

    public GreenLight(TrafficSignal signal){
        this.signal = signal;
    }

    @Override
    public void run() {
        signal.green();
    }
}
