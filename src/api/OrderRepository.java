package api;

import model.Order;

/*
 * DIP - Dependency Inversion Principle
 * High-level modules depend on abstraction, not implementation.
 *
 * OCP
 * We can add new repository implementations without modifying existing logic.
 */
public interface OrderRepository {
    void save(Order order);
}
