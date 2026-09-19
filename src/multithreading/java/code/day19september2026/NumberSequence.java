package multithreading.java.code.day19september2026;

public class NumberSequence {
    private int number = 1;
    private final int max = 9;

    public synchronized void print(int threadNumber){

        while (number <= max){
            while (number % 3 != threadNumber &&
                    !(threadNumber == 2 && number % 3 == 2) &&
                    !(threadNumber == 0 && number % 3 == 0)){
                waitForTurn();

                if(number > max){
                    return;
                }
            }

            if (number <= max){
                System.out.println(
                        Thread.currentThread().getName()+"-> "+
                                number
                );
                number++;
                notifyAll();
            }
        }

    }
    private void waitForTurn(){
        try {
            wait();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
