package repository;

import api.OrderRepository;
import model.Order;

/*
 * LSP
 * This can replace any other OrderRepository implementation.
 *
 * DIP
 * Works through abstraction.
 */
public class MySqlOrderRepository implements OrderRepository {

    @Override
    public void save(Order order) {
        System.out.println("Order saved in database");
    }
}
