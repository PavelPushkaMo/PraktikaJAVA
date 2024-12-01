package ru.mirea.praktika11_1;

import java.util.Date;

public class AssignmentTracker {
    public static void main(String[] args) {

        String developerLastName = "Могирев";


        Date dateReceived = new Date();

        // Имитация времени, необходимого для выполнения задания
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Date dateSubmitted = new Date();


        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}