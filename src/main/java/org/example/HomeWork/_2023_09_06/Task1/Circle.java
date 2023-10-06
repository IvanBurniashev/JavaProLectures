package org.example.HomeWork._2023_09_06.Task1;

public class Circle extends Shape implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
