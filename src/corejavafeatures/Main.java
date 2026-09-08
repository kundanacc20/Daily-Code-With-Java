package corejavafeatures;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Square s = (int x) ->x*x;
//
//        System.out.println(s.calculateArea(5));

//        //abstract class and abstract method
//        Shape s = new Triangle();
//        s.draw();
        //static method reference
        Arrays.asList(2,3,4,5,6,7,8)
                .forEach(n->System.out.print(Math.sqrt(n)+" "));

        Arrays.asList(1,2,3,4,5,6,9)
                .stream()
                .map(Math::sqrt)
                .forEach(System.out::println);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time : "+programTime+" ms");
    }
}
