package ru.mirea.list2_1;

import java.util.Scanner;

public class StudentRegistry {
    public static void main(String[] args) {
        DoublyLinkedList studentList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Вывести всех студентов");
            System.out.println("3. Выйти");
            System.out.print("Введите номер действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                studentList.addStudent();
            } else if (choice == 2) {
                studentList.displayStudents();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}