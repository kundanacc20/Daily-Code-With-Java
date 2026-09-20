package java8code.day15August2026.flatmapusecase;

import java.util.List;

public class Customer {
    List<Order> orders;
    public Customer(List<Order> orders){
        this.orders = orders;
    }
    List<Order> getOrders(){
        return orders;
    }
}
