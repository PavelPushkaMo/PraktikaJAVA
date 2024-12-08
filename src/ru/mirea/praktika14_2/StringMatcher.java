package ru.mirea.praktika14_2;

import java.util.regex.Pattern;

public class StringMatcher {
    public static void main(String[] args) {
        String validString = "abcdefghijklmnopqrstuv18340";
        String invalidString1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String invalidString2 = "abcdefghijklmnopqrstuv18340extra";

        String regex = "^abcdefghijklmnopqrstuv18340$";

        System.out.println("Тестируем правильную строку: " + validString);
        System.out.println("Результат: " + isMatch(validString, regex)); // должно вернуть true

        System.out.println("Тестируем неправильную строку 1: " + invalidString1);
        System.out.println("Результат: " + isMatch(invalidString1, regex)); // должно вернуть false

        System.out.println("Тестируем неправильную строку 2: " + invalidString2);
        System.out.println("Результат: " + isMatch(invalidString2, regex)); // должно вернуть false
    }

    public static boolean isMatch(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
}