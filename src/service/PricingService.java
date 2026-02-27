package service;

import model.Order;
import model.OrderItem;

/*
 * SRP
 * Responsible only for calculating the total price of an order.
 */
public class PricingService {

    public double calculateTotal(Order order) {
        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
