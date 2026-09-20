package multithreading.java.code.day09August2026;

public class DaemonTask extends Thread{

    @Override
    public void run(){

        while (true){
            System.out.println("demon thread");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
