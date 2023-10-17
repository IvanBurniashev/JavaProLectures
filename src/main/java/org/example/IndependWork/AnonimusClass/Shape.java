package org.example.IndependWork.AnonimusClass;
@FunctionalInterface
public abstract interface Shape {
    private static void drow2() {
        System.out.println("It is drow with lambda!");
    }

    abstract void drow();
//    abstract void large();

    public static void main(String[] args) {
//        Shape shape = new Shape() {
//            @Override
//            void drow() {
//                System.out.println("Hello! It is drow!");
//            }
//        };
//        shape.drow();

//        new Shape() {
//            @Override
//            void drow() {
//                System.out.println("Hello! It is drow!");
//            }
//
//            @Override
//            void large() {
//
//
//            }
//        }.drow();

        // реализация через лямбда-функцию
        Shape shape = () -> System.out.println("It is drow with lambda!");
        shape.drow();

        //реализация через метод reference()
        Shape shape1 = Shape::drow2;
//        shape1.drow();

    }
}
