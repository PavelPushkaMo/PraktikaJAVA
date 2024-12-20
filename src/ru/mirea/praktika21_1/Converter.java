package ru.mirea.praktika21_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    // Метод для конвертации массива строк в список
    public static List<String> convertStringArrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // Метод для конвертации массива чисел в список
    public static List<Number> convertNumberArrayToList(Number[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        // Пример использования для строк
        String[] stringArray = {"apple", "banana", "orange"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Пример использования для чисел
        Number[] numberArray = {1, 2.5, 3, 4.8};
        List<Number> numberList = convertNumberArrayToList(numberArray);
        System.out.println("Список чисел: " + numberList);
    }
}