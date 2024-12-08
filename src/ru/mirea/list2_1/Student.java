package ru.mirea.list2_1;

import java.util.Scanner;

class Student {
    String name;
    int age;
    String group;
    Student prev;
    Student next;

    public Student() {
        this.name = null;
        this.age = 0;
        this.group = null;
        this.prev = null;
        this.next = null;
    }

    public void inputAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст студента: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите группу студента: ");
        this.group = scanner.nextLine();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + this.name + ", Возраст: " + this.age + ", Группа: " + this.group);
    }
}