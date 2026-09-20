package Java25Code.day08july2026;

public class Main {
    public static void main(String[] args) throws Exception {
        //start timer
        long startTimer = System.nanoTime();
        PermanentEmployeeManager manager = new PermanentEmployeeManager();
        manager.loadEmployees(1000);

        TemporaryObjectGenerator generator = new TemporaryObjectGenerator();
        generator.generateTemporaryObjects(1_000_000);

        System.out.println("Permanent employees loaded: "+manager.getEmployees().size());
        Thread.sleep(10000);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
