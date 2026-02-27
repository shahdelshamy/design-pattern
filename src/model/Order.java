package model;
import java.util.ArrayList;
import java.util.List;

/*
 * SRP
 * This class is responsible only for holding order items.
 */
public class Order {
    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }
}


