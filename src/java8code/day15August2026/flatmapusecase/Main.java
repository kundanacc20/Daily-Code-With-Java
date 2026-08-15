package java8code.day15August2026.flatmapusecase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        //sample data
        Customer c1 = new Customer(Arrays.asList(
                new Order(Arrays.asList(new Item("Laptop"),new Item("Mouse"))),
                new Order(Arrays.asList(new Item("keyboard")))
        ));

        Customer c2 = new Customer(Arrays.asList(
                new Order(Arrays.asList(new Item("Phone"), new Item("charger")))
        ));
        List<Customer> customers = Arrays.asList(c1, c2);

        List<Item> allItems = customers.stream()
                .flatMap(c->c.getOrders().stream())
                .flatMap(o -> o.getItems().stream())
                .collect(Collectors.toList());

        System.out.println(allItems);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program Time: "+programTime+" ms");
    }
}
