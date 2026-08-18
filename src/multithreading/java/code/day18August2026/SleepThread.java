package multithreading.java.code.day18August2026;

public class SleepThread extends Thread {

    @Override
    public void run(){
        try {
            sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Interruption occured !");
        }
    }
}
