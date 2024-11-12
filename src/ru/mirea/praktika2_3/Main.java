package ru.mirea.praktika2_3;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}

class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.addCircle(new Circle(new Point(0, 0), 5));
        System.out.println("Количество окружностей: " + tester.getCount());
    }
}