package ru.mirea.praktika26_1;

import java.util.Stack;

public class ArrayReverser {

    // Метод для инвертирования массива с использованием Stack
    public static int[] reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Помещаем все элементы массива в стек
        for (int element : array) {
            stack.push(element);
        }

        // Извлекаем элементы из стека и помещаем в новый массив
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = stack.pop();
        }

        return reversedArray; // Возвращаем инвертированный массив
    }
}