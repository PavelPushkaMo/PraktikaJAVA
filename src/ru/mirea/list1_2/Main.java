package ru.mirea.list1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListContainer listContainer = new ListContainer();

        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Вывести студентов");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить, пуст ли список");
            System.out.println("0. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очищаем буфер

            switch (choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите возраст студента: ");
                    int age = scanner.nextInt();
                    listContainer.addStudent(new Student(name, age));
                    break;

                case 2:
                    System.out.print("Введите номер студента для удаления (1 - " + listContainer.students.size() + "): ");
                    int index = scanner.nextInt() - 1; // Пользователь вводит 1, а мы работаем с индексами
                    listContainer.removeStudent(index);
                    break;

                case 3:
                    listContainer.displayStudents();
                    break;

                case 4:
                    listContainer.clearList();
                    System.out.println("Список очищен.");
                    break;

                case 5:
                    if (listContainer.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список не пуст.");
                    }
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    return;

                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }
}
