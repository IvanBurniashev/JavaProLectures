package org.example.ClassWork._13_09_23;

public class Circle extends Shape implements Resizable{
    public Circle(double radius) {
        this.radius = radius;
    }
    private double radius;
    @Override
    double calculateArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }
}
