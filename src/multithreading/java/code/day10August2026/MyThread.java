package multithreading.java.code.day10August2026;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName()+ " running with priority "+getPriority());
    }
}
