package HomeWork._06_09_23.Task1;

public class Main {
    public static void main(String[] args) {
        /**
         *ТЗ 1: Система управления фигурами
         *
         * Абстрактный класс: Shape
         * Интерфейс: Resizable
         *
         * Задача:
         * Разработать систему управления фигурами, позволяющую изменять размер фигур.
         * Создать абстрактный класс Shape, представляющий общие свойства и методы для различных фигур.
         * Реализовать интерфейс Resizable, который имеет метод resize(double factor) для изменения размера фигуры.
         * Создать два класса, JavaProLectures.ClassWork.Circle и Rectangle, наследующихся от абстрактного класса Shape.
         * Класс JavaProLectures.ClassWork.Circle должен реализовать интерфейс Resizable и обрабатывать изменение радиуса.
         * Класс Rectangle также должен реализовать интерфейс Resizable и обрабатывать изменение ширины и высоты прямоугольника.
         *
         * public class Main {
         *     public static void main(String[] args) {
         *         JavaProLectures.ClassWork.Circle circle = new JavaProLectures.ClassWork.Circle(5);
         *         circle.resize(1.5);
         *         System.out.println("JavaProLectures.ClassWork.Circle area after resizing: " + circle.calculateArea());
         *
         *         Rectangle rectangle = new Rectangle(4, 6);
         *         rectangle.resize(2);
         *         System.out.println("Rectangle area after resizing: " + rectangle.calculateArea());
         *     }
         */
        Circle circle = new Circle(5);
        System.out.println("Circle area before resizing: " + circle.calculateArea());
        circle.resize(1.5);
        System.out.println("Circle area after resizing: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area before resizing: " + rectangle.calculateArea());
        rectangle.resize(1.5);
        System.out.println("Rectangle area after resizing: " + rectangle.calculateArea());
    }
}
