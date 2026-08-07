package multithreading.java.code.day07August2026;

public class MyRunnableTask implements Runnable {

    @Override
    public void run(){
        for(int i =1; i <= 5; i++){
            System.out.println("in the MyRunnable Task: ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                System.out.println("thread Interrupted: ");
            }
        }
    }
}
