package ru.mirea.praktika8_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("Введите натуральные числа (0 для завершения ввода):");

        while (true) {
            int number = scanner.nextInt();


            if (number == 0) {
                break;
            }


            if (number > max) {
                max = number;
                count = 1;
            }

            else if (number == max) {
                count++;
            }
        }

        if (max != Integer.MIN_VALUE) {
            System.out.println("Наибольшее число: " + max);
            System.out.println("Количество вхождений наибольшего числа: " + count);
        } else {
            System.out.println("Ничего не было введено.");
        }

        scanner.close();
    }
}