package ru.mirea.praktika3_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
        }

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
        }

        System.out.println("Массив (Math.random()): " + Arrays.toString(array1));
        System.out.println("Массив (Random): " + Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Отсортированный массив (Math.random()): " + Arrays.toString(array1));
        System.out.println("Отсортированный массив (Random): " + Arrays.toString(array2));
    }
}
