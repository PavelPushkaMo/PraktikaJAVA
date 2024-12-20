package ru.mirea.praktika20_2;

public class MyGenericClass<T, V, K> {
    private T firstVariable;
    private V secondVariable;
    private K thirdVariable;

    // Конструктор
    public MyGenericClass(T firstVariable, V secondVariable, K thirdVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.thirdVariable = thirdVariable;
    }

    // Методы для получения значений переменных
    public T getFirstVariable() {
        return firstVariable;
    }

    public V getSecondVariable() {
        return secondVariable;
    }

    public K getThirdVariable() {
        return thirdVariable;
    }

    // Метод для вывода на консоль имен классов переменных
    public void printClassNames() {
        System.out.println("Тип первой переменной: " + firstVariable.getClass().getName());
        System.out.println("Тип второй переменной: " + secondVariable.getClass().getName());
        System.out.println("Тип третьей переменной: " + thirdVariable.getClass().getName());
    }

    // Пример использования
    public static void main(String[] args) {
        MyGenericClass<String, Integer, Double> myObject = new MyGenericClass<>("Hello", 42, 3.14);
        myObject.printClassNames();

        // Можно также получить значения переменных
        System.out.println("Первая переменная: " + myObject.getFirstVariable());
        System.out.println("Вторая переменная: " + myObject.getSecondVariable());
        System.out.println("Третья переменная: " + myObject.getThirdVariable());
    }
}