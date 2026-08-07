package multithreading.java.code.day07August2026;

public class MyRunnableTask {
    public static Runnable createTask(String message) {
        return () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(message + " - iteration " + i);
                try {
                    Thread.sleep(500); // pause for half a second
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        };
    }
}
