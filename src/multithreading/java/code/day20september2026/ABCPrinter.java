package multithreading.java.code.day20september2026;

public class ABCPrinter {
    private int state = 0;

    public synchronized void printA(){
        for(int i = 0; i < 5; i++){
            while (state != 0){
                waitForTurn();
            }
            System.out.print(" A ");

            state = 1;
            notifyAll();
        }
    }

    public synchronized void printB(){
        for (int i = 0; i < 5; i++){
            while (state != 1){
                waitForTurn();
            }
            System.out.print(" B ");
            state = 2;
            notifyAll();
        }
    }

    public synchronized void printC(){
        for (int i =0; i<5;i++){
            while (state != 2){
                waitForTurn();
            }
            System.out.print(" C ");
            state = 0;
            notifyAll();
        }
    }

    private void waitForTurn(){
        try {
            wait();
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

}
