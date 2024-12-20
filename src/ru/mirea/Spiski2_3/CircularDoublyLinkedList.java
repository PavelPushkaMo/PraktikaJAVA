package ru.mirea.Spiski2_3;

class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    // Метод для добавления узла
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Метод для сортировки списка
    public void bubbleSort() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;

            do {
                if (current.data > current.next.data) {
                    // Перестановка соседних элементов
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            } while (current != head);
        } while (swapped);
    }

    // Метод для печати списка
    public void printList() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
