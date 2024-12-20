package ru.mirea.praktika27_1;

import java.util.LinkedList;

class HashTab {
    private class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;

    // Инициализация хеш-таблицы
    public void hashtabInit(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Хеш-функция
    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % size);
    }

    // Добавление элемента в хеш-таблицу
    public void hashtabAdd(String key, String value) {
        int hash = hashtabHash(key);
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновить значение, если ключ уже существует
                return;
            }
        }
        table[hash].add(new Entry(key, value)); // Добавить новый элемент
    }

    // Поиск элемента в хеш-таблице
    public String hashtabLookup(String key) {
        int hash = hashtabHash(key);
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                return entry.value; // Возвращаем значение, если ключ найден
            }
        }
        return null; // Если ключ не найден
    }

    // Удаление элемента из хеш-таблицы
    public void hashtabDelete(String key) {
        int hash = hashtabHash(key);
        Entry toRemove = null;
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                toRemove = entry; // Найти и удалить элемент
                break;
            }
        }
        if (toRemove != null) {
            table[hash].remove(toRemove);
        }
    }
}