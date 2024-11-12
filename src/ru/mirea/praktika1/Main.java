package ru.mirea.praktika1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];


        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;


        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }


        double average = (double) sum / size;


        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);

        scanner.close();
    }
}