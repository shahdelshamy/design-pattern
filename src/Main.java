import api.OrderRepository;
import api.PaymentMethod;
import model.Order;
import model.OrderItem;
import model.Product;
import repository.MySqlOrderRepository;
import service.CheckoutService;
import service.CreditCardPayment;
import service.PricingService;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 1000);
        Product mouse = new Product("Mouse", 50);

        // Create order
        Order order = new Order();
        order.addItem(new OrderItem(laptop, 1));
        order.addItem(new OrderItem(mouse, 2));

        // Calculate total
        PricingService pricingService = new PricingService();
        double total = pricingService.calculateTotal(order);
        System.out.println("Total Price: " + total);

        // Checkout
        OrderRepository repository = new MySqlOrderRepository();
        CheckoutService checkoutService = new CheckoutService(repository);

        PaymentMethod paymentMethod = new CreditCardPayment();
        checkoutService.checkout(order, paymentMethod);
    }
}