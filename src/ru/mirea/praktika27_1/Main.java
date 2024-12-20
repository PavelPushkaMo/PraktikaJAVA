package ru.mirea.praktika27_1;

public class Main {
    public static void main(String[] args) {
        HashTab hashTable = new HashTab();

        // Инициализация хеш-таблицы с размером 10
        hashTable.hashtabInit(10);

        // Добавление элементов
        hashTable.hashtabAdd("apple", "fruit");
        hashTable.hashtabAdd("carrot", "vegetable");
        hashTable.hashtabAdd("banana", "fruit");

        // Поиск элементов
        System.out.println("Поиск 'apple': " + hashTable.hashtabLookup("apple")); // fruit
        System.out.println("Поиск 'carrot': " + hashTable.hashtabLookup("carrot")); // vegetable

        // Удаление элемента
        hashTable.hashtabDelete("apple");
        System.out.println("После удаления 'apple', поиск: " + hashTable.hashtabLookup("apple")); // null
    }
}