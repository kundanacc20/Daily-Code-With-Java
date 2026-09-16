package javagenerics.day16september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        InMemoryRepository<String,Integer> repository = new InMemoryRepository();
        repository.save(1,"harshit");
        repository.save(2, "anurag");

        System.out.println(repository.findById(1));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+ " ms");
    }
}
