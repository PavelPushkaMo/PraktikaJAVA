package ru.mirea.praktika25_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читать входную строку
        System.out.print("Введи строку: ");
        String inputString = scanner.nextLine();

        // Регулярное выражение для разбиения строки
        String regex = "\\w+"; // при необходимости измените регулярное выражение

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("Элементы строки:");

        while (matcher.find()) {
            // Вывод найденных элементов
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}