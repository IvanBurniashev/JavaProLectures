package org.example.HomeWork._2023_09_06.Task1;

public class Rectangle extends Shape implements Resizable {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        double area = a * b;
        return area;
    }

    @Override
    public void resize(double factor) {
        a *= factor;
        b *= factor;
    }
}
