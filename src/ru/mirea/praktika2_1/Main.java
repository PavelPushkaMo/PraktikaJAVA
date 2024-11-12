package ru.mirea.praktika2_1;

public class Main {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.72");

        String strValue = "5.67";
        double d3 = Double.parseDouble(strValue);

        double primitiveDouble = d1.doubleValue();
        float primitiveFloat = d1.floatValue();
        long primitiveLong = d1.longValue();
        int primitiveInt = d1.intValue();
        short primitiveShort = d1.shortValue();
        byte primitiveByte = d1.byteValue();

        System.out.println("Значение объекта d1: " + d1);
        System.out.println("Значение объекта d2: " + d2);
        System.out.println("Преобразованное значение из строки: " + d3);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive float: " + primitiveFloat);
        System.out.println("Primitive long: " + primitiveLong);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive short: " + primitiveShort);
        System.out.println("Primitive byte: " + primitiveByte);

        String dString = Double.toString(3.14);
        System.out.println("Строковое представление числа 3.14: " + dString);
    }
}
