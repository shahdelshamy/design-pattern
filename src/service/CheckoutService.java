package service;

import api.OrderRepository;
import api.PaymentMethod;
import model.Order;

/*
 * DIP
 * Depends on abstractions (OrderRepository, PaymentMethod),
 * not concrete implementations.
 *
 * OCP
 * Can support new payment methods and repositories
 * without modification.
 *
 * SRP
 * Responsible only for checkout process.
 */
public class CheckoutService {

    private OrderRepository repository;

    public CheckoutService(OrderRepository repository) {
        this.repository = repository;
    }

    public void checkout(Order order, PaymentMethod paymentMethod) {
        paymentMethod.pay();  // LSP
        repository.save(order);   // DIP
    }
}
