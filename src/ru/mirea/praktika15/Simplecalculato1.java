package ru.mirea.praktika15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simplecalculato1 extends JFrame {
    private JTextField display; // Поле текста
    private double firstNumber = 0; // Первое число
    private String operator = ""; // Оператор
    private boolean isOperatorPressed = false; // Проверка нажатия на оператор

    public Simplecalculato1() { // Настройка окна
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Поле ввода/вывода
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 36));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setPreferredSize(new Dimension(300, 50));
        add(display, BorderLayout.NORTH);

        // Панель с кнопками
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Кнопки цифр и операций
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "^"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPanel.add(btn);
            btn.addActionListener(new ButtonClickListener());
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Отображение окна
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            if (command.matches("\\d") || command.equals(".")) {
                if (isOperatorPressed) {
                    display.setText("");
                    isOperatorPressed = false;
                }
                display.setText(display.getText() + command);
            }
            else if (command.matches("[+\\-*/^]")) { //
                firstNumber = Double.parseDouble(display.getText());
                operator = command;
                isOperatorPressed = true;
            }
            else if (command.equals("=")) {
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculate(firstNumber, secondNumber, operator);
                display.setText(Double.toString(result));
                isOperatorPressed = true;
            }
            else if (command.equals("C")) {
                display.setText(""); // Очищаем дисплей
                firstNumber = 0;
                operator = "";
                isOperatorPressed = false;
            }
        }

        // Метод для выполнения операций
        private double calculate(double num1, double num2, String operator) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        // Обработка деления на ноль
                        JOptionPane.showMessageDialog(null, "Ошибка: деление на ноль!");
                        return 0;
                    }
                case "^":
                    return Math.pow(num1, num2);
                default:
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Simplecalculato1::new);
    }
}