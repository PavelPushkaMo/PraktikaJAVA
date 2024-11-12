package ru.mirea.praktika8_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите второе целое число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            System.out.println("Числа от " + A + " до " + B + " в порядке возрастания:");
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Числа от " + A + " до " + B + " в порядке убывания:");
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}