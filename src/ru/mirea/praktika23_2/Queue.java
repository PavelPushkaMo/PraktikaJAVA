package ru.mirea.praktika23_2;

public interface Queue<T> {
    void enqueue(T item); // Добавить элемент в очередь
    T dequeue(); // Удалить и вернуть элемент из очереди
    boolean isEmpty(); // Проверить, пуста ли очередь
    int size(); // Получить количество элементов в очереди
}
