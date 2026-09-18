package javagenerics.day18september2026;

public class ZeroEvenOdd {
    private int number =1;
    private final int n;

    private int turn =0;

    public ZeroEvenOdd(int n){
        this.n =n;
    }

    public synchronized void zero(){
        for(int i = 1; i <= n; i++){
            while (turn != 0){
                waitForTurn();
            }
            System.out.println("0");

            if(number % 2 == 1){
                turn =1;
            } else{
                turn = 2;
            }
            notifyAll();
        }
    }

    public synchronized void odd(){
        for (int i = 1; i<=n; i++){
            while (turn != 1){
                waitForTurn();
            }
            System.out.println(number+" ");
            number++;
            turn = 0;
            notifyAll();
        }
    }

    public synchronized void even(){
        for(int i = 1; i<=n; i++){
            while (turn != 2){
                waitForTurn();
            }
            System.out.println(number+" ");
            number++;
            turn=0;
            notifyAll();
        }
    }
    public void waitForTurn(){
        try {
            wait();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
