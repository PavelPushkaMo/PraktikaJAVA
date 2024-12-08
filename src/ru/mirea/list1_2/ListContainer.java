package ru.mirea.list1_2;

import java.util.ArrayList;
class ListContainer {
    public ArrayList<Student> students;

    // Конструктор для создания пустого списка
    public ListContainer() {
        students = new ArrayList<>();
    }

    // Функция добавления элемента
    public void addStudent(Student student) {
        students.add(student);
    }

    // Функция удаления элемента
    public void removeStudent(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        } else {
            System.out.println("Недопустимый индекс. Попробуйте еще раз.");
        }
    }

    // Функция вывода элементов списка
    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.print("Студент " + (i + 1) + ": ");
                students.get(i).display();
            }
        }
    }

    // Функция очистки списка
    public void clearList() {
        students.clear();
    }

    // Функция проверки на пустоту
    public boolean isEmpty() {
        return students.isEmpty();
    }
}
