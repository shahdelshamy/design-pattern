package api;

/*
 * OCP - Open/Closed Principle
 * We can add new payment methods without modifying existing code.
 *
 * LSP - Liskov Substitution Principle
 * Any class implementing PaymentMethod can replace another.
 *
 * ISP - Interface Segregation Principle
 */
public interface PaymentMethod {
    void pay();
}