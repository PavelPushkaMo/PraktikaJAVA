package ru.mirea.praktika22_1;

import java.util.Stack;

public class RPNCalculator {

    // Метод для вычисления выражения в обратной польской нотации
    public int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                // Если токен оператор, извлекаем два верхних элемента стека
                int b = stack.pop();
                int a = stack.pop();
                int result = performOperation(a, b, token);
                stack.push(result);
            } else {
                // Если токен - число, помещаем его в стек
                stack.push(Integer.parseInt(token));
            }
        }
        // Последний элемент в стеке - это результат
        return stack.pop();
    }

    // Проверка, является ли токен оператором
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // Выполнение операции
    private int performOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b; // Предполагаем, что деление всегда корректное
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }
}