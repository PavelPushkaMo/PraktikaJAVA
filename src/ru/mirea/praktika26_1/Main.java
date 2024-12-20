package ru.mirea.praktika26_1;

public class Main {

    public static void main(String[] args) {
        // Пример использования
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.print("Исходный массив: ");
        ArrayPrinter.printArray(originalArray);

        int[] reversedArray = ArrayReverser.reverseArray(originalArray);
        System.out.print("Инвертированный массив: ");
        ArrayPrinter.printArray(reversedArray);
    }
}