package ru.mirea.praktika24_1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("Default Complex: " + defaultComplex);

        Complex customComplex = factory.createComplex(5, 10);
        System.out.println("Custom Complex: " + customComplex);
    }
}