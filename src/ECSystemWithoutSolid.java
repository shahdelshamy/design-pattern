import java.util.ArrayList;
import java.util.List;

public class ECSystemWithoutSolid {

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    static class OrderItem {
        Product product;
        int quantity;

        OrderItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }

    private List<OrderItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.product.price * item.quantity;
        }
        return total;
    }

    /*
     * OCP Violation:
     * If we want to add a new payment method,
     * we must MODIFY this method.
     */
    public void processPayment(String paymentType) {

        if (paymentType.equals("CASH")) {
            System.out.println("Paid using Cash");
        } else if (paymentType.equals("CARD")) {
            System.out.println("Paid using Credit Card");
        } else {
            System.out.println("Invalid payment method");
        }
    }

    /*
     * DIP Violation:
     * Directly depends on a specific database implementation.
     */
    public void saveOrder() {
        System.out.println("Saved to MySQL database");
    }

    public static void main(String[] args) {

        ECSystemWithoutSolid system = new ECSystemWithoutSolid();

        Product laptop = new Product("Laptop", 1000);
        Product mouse = new Product("Mouse", 50);

        system.addItem(laptop, 1);
        system.addItem(mouse, 2);

        double total = system.calculateTotal();
        System.out.println("Total Price: " + total);

        system.processPayment("CARD");
        system.saveOrder();
    }
}