package ru.mirea.praktika18_2_2;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}