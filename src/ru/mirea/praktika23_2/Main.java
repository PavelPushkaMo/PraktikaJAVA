package ru.mirea.praktika23_2;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        // Добавляем элементы в очередь
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Размер очереди
        System.out.println("Size of queue: " + queue.size()); // Должно быть 3

        // Удаляем элементы и печатаем их
        System.out.println("Dequeued: " + queue.dequeue()); // Должно быть 1
        System.out.println("Dequeued: " + queue.dequeue()); // Должно быть 2

        // Проверяем размер очереди
        System.out.println("Size of queue: " + queue.size()); // Должно быть 1

        // Удаляем последний элемент
        System.out.println("Dequeued: " + queue.dequeue()); // Должно быть 3

        // Проверяем, пуста ли очередь
        System.out.println("Is queue empty? " + queue.isEmpty()); // Должно быть true
    }
}
