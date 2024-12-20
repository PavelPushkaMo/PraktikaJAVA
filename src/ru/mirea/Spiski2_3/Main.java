package ru.mirea.Spiski2_3;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println("Исходный список:");
        list.printList();

        list.bubbleSort();

        System.out.println("Отсортированный список:");
        list.printList();
    }
}