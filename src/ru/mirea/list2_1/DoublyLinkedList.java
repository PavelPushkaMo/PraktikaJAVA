package ru.mirea.list2_1;

class DoublyLinkedList {
    private Student head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void addStudent() {
        Student newStudent = new Student();
        newStudent.inputAttributes();
        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
            newStudent.prev = current;
        }
    }

    public void displayStudents() {
        Student current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }
}