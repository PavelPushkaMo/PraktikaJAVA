package ru.mirea.praktika6_4;

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 1200.00);
        Priceable service = new Service("Consultation", 150.00, 3);

        System.out.println("Product: " + ((Product) product).getName() + ", Price: $" + product.getPrice());
        System.out.println("Service: " + ((Service) service).getName() + ", Price: $" + service.getPrice());
    }
}