package org.example.ClassWork._2023_10_02;

import org.example.ClassWork._2023_10_02.Cat.Cat;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("__________________________________________________________________");
        System.out.println(stack.empty());

        stack.push(17);

        System.out.println("__________________________________________________________________");
        System.out.println(stack.empty());

        int elementFromStack = stack.pop();

        System.out.println("__________________________________________________________________");
        System.out.println(elementFromStack);
        System.out.println("__________________________________________________________________");


        System.out.println("__________________________________________________________________");
        System.out.println(stack.empty());
        System.out.println("__________________________________________________________________");

        Stack<Cat> stackCat = new Stack<>();
        Cat murka = new Cat(4, "Murka");
        stackCat.push(murka);

        System.out.println("__________________________________________________________________");
        System.out.println(stackCat.empty());
        System.out.println("__________________________________________________________________");

        Cat catFromStack = stackCat.peek();
        murka.setAge(15);

        System.out.println("__________________________________________________________________");
        System.out.println("Работа метода peek(): " + catFromStack);
        System.out.println("__________________________________________________________________");
        System.out.println("Проверяем пустой ли стек: " + stackCat.empty());
        System.out.println("__________________________________________________________________");

        System.out.println("__________________________________________________________________");
        System.out.println("Работа метода pop(): " + stackCat.pop());
        System.out.println("__________________________________________________________________");

        System.out.println("__________________________________________________________________");
        System.out.println("Проверяем пустой ли стек: " + stackCat.empty());
        System.out.println("__________________________________________________________________");


    }
}
