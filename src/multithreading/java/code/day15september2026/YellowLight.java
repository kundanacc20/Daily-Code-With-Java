package multithreading.java.code.day15september2026;

public class YellowLight implements Runnable{
    private final TrafficSignal signal;

    public YellowLight(TrafficSignal signal){
        this.signal = signal;
    }

    @Override
    public void run() {
        signal.yellow();
    }
}
