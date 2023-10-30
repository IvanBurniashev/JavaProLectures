package org.example.HomeWork._2023_10_30;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10,20));
        System.out.println(calculator.subtract(10,20));
        System.out.println(calculator.multiply(10,20));
        System.out.println(calculator.divide(200,20));
        System.out.println(calculator.power(1,0));
        System.out.println(calculator.factorial(5));
        System.out.println(calculator.findMax(new int[] {1,0,10,5,11}));
        System.out.println(calculator.isPrime(53));
        System.out.println(calculator.sumOfDigits(123123));
        System.out.println("==========================");
        System.out.println(calculator.reverseString("abcd"));
        System.out.println(calculator.productOfArray(new int[]{1, 2, 3, 4}));
    }
}
