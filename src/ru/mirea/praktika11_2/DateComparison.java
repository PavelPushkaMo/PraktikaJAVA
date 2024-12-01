package ru.mirea.praktika11_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        // Дата пользователем (ввод в формате ГГГГ-ММ-ДД)
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
        String userInput = scanner.nextLine();

        try {

            LocalDate enteredDate = LocalDate.parse(userInput, DateTimeFormatter.ISO_LOCAL_DATE);


            if (enteredDate.isBefore(currentDate)) {
                System.out.println("Ваша дата " + enteredDate + " раньше текущей даты.");
            } else if (enteredDate.isAfter(currentDate)) {
                System.out.println("Ваша дата " + enteredDate + " позже текущей даты.");
            } else {
                System.out.println("Ваша дата равна текущей дате!");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Введен неверный формат даты. Пожалуйста, используйте формат ГГГГ-ММ-ДД.");
        } finally {
            scanner.close();
        }
    }
}