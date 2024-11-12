package ru.mirea.praktika8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("Пожалуйста, введите натуральное число больше нуля.");
        } else {
            System.out.println("Числа от 1 до " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}