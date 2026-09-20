package Java25Code.day07july2026;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //getFirst() and getLast()

//        List<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("kiwi");
//        fruits.add("lichi");
//
//        System.out.println("First : "+fruits.getFirst());
//        System.out.println("Last : "+fruits.getLast());

//        //addFirst() and addLast()
//        LinkedList<Integer> numbers = new LinkedList<>();
//
//        numbers.addLast(20);
//        numbers.addLast(30);
//        numbers.addFirst(10);
//        numbers.addLast(40);
//
//        System.out.println(numbers);

//        List<String> cities = new LinkedList<>();
//
//        cities.add("Chennai");
//        cities.add("Manglore");
//        cities.add("Delhi");
//        cities.add("Mumbai");
//        cities.add("Pune");
//        cities.add("Champaran");
//        cities.add("Nalanda");
//
//        System.out.println(cities);
//        System.out.println(cities.removeFirst());
//        System.out.println(cities);

//        LinkedList<String> queue = new LinkedList<>();
//
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//
//        queue.removeLast();
//        System.out.println(queue);

//        List<Integer> lst = new ArrayList<>(List.of(1,2,3,
//                4,5,6,7,8,11,17,9));
//        System.out.println(lst);
//        System.out.println(lst.reversed());
//        LinkedHashSet<String> set = new LinkedHashSet<>();
//        set.add("A");
//        set.add("b");
//        set.add("d");
//        set.add("e");
//        set.add("c");
//
//        System.out.println(set.getFirst());
//        System.out.println(set.getLast());

        List<String> lst =  List.of("a","b","f","k","i","j");

        for(String s : lst.reversed()){
            System.out.print(s+" ");
        }
        System.out.println();

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