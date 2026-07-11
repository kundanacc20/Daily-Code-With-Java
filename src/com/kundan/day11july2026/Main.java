package com.kundan.day11july2026;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Calculator c = (a,b) ->a+b;
//        System.out.println(c.add(10,20));
//        //Predicate<T>
//
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//        System.out.println(isEven.test(10));
//        System.out.println(isEven.test(15));

//        //Function<T,R>
//        Function<String, Integer> lengthFinder = s -> s.length();
//        System.out.println(lengthFinder.apply("java"));

//        //Consumer<T>
//        Consumer<String> printer = s -> System.out.println(s);
//        printer.accept("welcome to java 8");

//        //Supplier<T>
//        Supplier<Double> randomValue = () -> Math.random();
//        System.out.println(randomValue.get());

//        Demo d = () -> System.out.println("Abstract Method");
//        d.show();
//        d.display();

//        //calling static method directly from interface
//        TestInterface.info();
//
//        //using lambda expression to implement run()
//        TestInterface t = () -> System.out.println("Running via lambda implementation");
//        t.run();
//
//        //using anonymous class implementation
//        TestInterface t2 = new TestInterface() {
//            @Override
//            public void run() {
//                System.out.println("Running via anonymous class");
//            }
//        };
//        t2.run();

        List<Employee> list = Arrays.asList(
                new Employee("Amit",25),
                new Employee("Ravi",35),
                new Employee("Rohit",28)
        );

        Predicate<Employee> ageAbove30 = e -> e.age >30;
        for(Employee e : list){
            if(ageAbove30.test(e)){
                System.out.println(e.name);
            }
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
