package ru.mirea.list1_1;

import java.util.Scanner;
class Student {
    private String name;
    private int age;
    private int course;

    // Конструктор
    public Student() {
        this.name = "";
        this.age = 0;
        this.course = 0;
    }

    public void readAttr() { // Считывание данных
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        this.name = scanner.nextLine();
        System.out.print("Введите курс студента: ");
        this.course = scanner.nextInt();
        System.out.print("Введите возраст студента: ");
        this.age = scanner.nextInt();
    }

    public void displayAttr() { // Вывод данных
        System.out.println("Имя студента: " + this.name);
        System.out.println("Курс студента: " + this.course);
        System.out.println("Возраст студента: " + this.age);
    }
}