package ru.mirea.praktika19_1;

import java.util.Scanner;


public class OnlinePurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите номер ИНН: ");
        String inn = scanner.nextLine();

        try {
            validateINN(inn);
            System.out.println("Заказ успешно оформлен на имя: " + fullName);
        } catch (InvalidINNException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    // Метод для проверки действительности номера ИНН
    public static void validateINN(String inn) throws InvalidINNException {
        if (!inn.matches("\\d{10}") && !inn.matches("\\d{12}")) {
            throw new InvalidINNException("Недействительный номер ИНН. ИНН должен содержать 10 или 12 цифр.");
        }
    }
}