package ru.mirea.praktika23_2;

class Node<T> {
    T item;
    Node<T> next;

    public Node(T item) {
        this.item = item;
    }
}

public class LinkedQueue<T> extends AbstractQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        incrementSize();
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = head.item;
        head = head.next;
        decrementSize();
        if (head == null) {
            tail = null; // Если очередь стала пустой
        }
        return item;
    }
}