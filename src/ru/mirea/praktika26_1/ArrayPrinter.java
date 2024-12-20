package ru.mirea.praktika26_1;

public class ArrayPrinter {

    // Метод для печати массива
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}