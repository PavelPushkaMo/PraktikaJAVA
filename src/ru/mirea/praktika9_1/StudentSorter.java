package ru.mirea.praktika9_1;

public class StudentSorter {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;


            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(2, "Charlie"),
                new Student(5, "Daisy"),
                new Student(4, "Eve")
        };


        insertionSort(students);


        System.out.println("Отсортированный массив студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

