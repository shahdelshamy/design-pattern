package model;

/*
 * SRP - Single Responsibility Principle
 * This class is responsible ONLY for representing product data.
 * It does not calculate totals, process payments, or save data.
 */
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
