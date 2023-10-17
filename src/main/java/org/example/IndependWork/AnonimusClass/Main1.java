package org.example.IndependWork.AnonimusClass;

public class Main1 {
    public static void main(String[] args) {
        // Использование лямбда-выражения для реализации абстрактного метода
        MyAbstractClass myObject = () -> {
            System.out.println("Implementation of myAbstractMethod");
        };

        // Вызов абстрактного метода через объект myObject
        myObject.myAbstractMethod();
    }
}
