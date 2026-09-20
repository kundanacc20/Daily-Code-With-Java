package java8code.day15August2026.flatmapusecase;

import java.util.List;

public class Order {
    List<Item> items;

    public Order(List<Item> items){
        this.items = items;
    }

    List<Item> getItems() {
        return items;
    }
}
