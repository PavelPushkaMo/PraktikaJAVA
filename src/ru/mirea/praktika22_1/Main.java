package ru.mirea.praktika22_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RPNCalculator calculator = new RPNCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в RPN калькулятор!");
        System.out.println("Введите выражение в формате RPN (например, 2 3 +), или введите 'exit' для выхода.");

        while (true) {
            System.out.print("Введите выражение: ");
            String input = scanner.nextLine();

            // Проверка на выход
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Спасибо за использование калькулятора! Пока!");
                break;
            }

            // Разделяем ввод на токены
            String[] tokens = input.split(" ");

            try {
                int result = calculator.evaluateRPN(tokens);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}