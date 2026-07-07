package Java25Code.day07july2026;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //getFirst() and getLast()

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("lichi");

        System.out.println("First : "+fruits.getFirst());
        System.out.println("Last : "+fruits.getLast());
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
/*A sequenced collection is simply a
collection whose element hava a well-defined order.
Methods of Sequenced Collection
addFirst(E e)
addLast(E e)
getFirst()
getLast()
removeFirst()
removeLast()
reversed()
 */