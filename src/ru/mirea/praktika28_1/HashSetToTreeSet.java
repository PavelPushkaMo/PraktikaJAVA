package ru.mirea.praktika28_1;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        // Создаем HashSet и добавляем элементы
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Grapes");
        hashSet.add("Orange");

        // Преобразуем HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // Выводим элементы TreeSet
        System.out.println("Элементы TreeSet (отсортированы): " + treeSet);
    }
}