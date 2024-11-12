package ru.mirea.praktika1_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];


        System.out.println("Введите элементы массива:");
        int i = 0;
        while (i < size) {
            numbers[i] = scanner.nextInt();
            i++;
        }


        int sum = 0;
        int j = 0;
        do {
            sum += numbers[j];
            j++;
        } while (j < size);


        int max = numbers[0];
        int min = numbers[0];

        for (int k = 1; k < size; k++) {
            if (numbers[k] > max) {
                max = numbers[k];
            }
            if (numbers[k] < min) {
                min = numbers[k];
            }
        }


        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        scanner.close();
    }
}