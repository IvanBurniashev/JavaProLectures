package org.example.ClassWork._13_09_23;

public class Rectangle extends Shape implements Resizable{
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double length;
    private double width;



    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public void resize(double factor) {
        length = length * factor;
        width = width * factor;
    }
}