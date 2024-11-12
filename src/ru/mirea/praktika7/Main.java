package ru.mirea.praktika7;

public class Main {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(0, 10, 2, 2);
        MovablePoint bottomRight = new MovablePoint(10, 0, 2, 2);
        MovableRectangle rectangle = new MovableRectangle(topLeft, bottomRight);

        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println("After moving up: " + rectangle);
        rectangle.moveRight();
        System.out.println("After moving right: " + rectangle);
        rectangle.moveDown();
        System.out.println("After moving down: " + rectangle);
        rectangle.moveLeft();
        System.out.println("After moving left: " + rectangle);
    }
}