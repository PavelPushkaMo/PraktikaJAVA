package ru.mirea.praktika10_1;

public class Student {

    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private String group;


    public Student(String firstName, String lastName, String major, int year, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Студент: " + firstName + " " + lastName + ", Специальность: " + major +
                ", Курс: " + year + ", Группа: " + group;
    }

    // Пример использования
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "Программирование", 2, "ПР-21");
        System.out.println(student);
        

        student.setYear(3);
        student.setGroup("ПР-22");
        System.out.println("Обновленная информация: " + student);
    }
}