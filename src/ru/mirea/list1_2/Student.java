package ru.mirea.list1_2;

class Student {
    private String name;
    private int age;

    // Конструктор класса Student
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для вывода информации о студенте
    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
