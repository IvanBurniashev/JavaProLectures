package JavaProLectures.HomeWork._28_08_28;

public class Main {
    public static void main(String[] args) {
        /*
         1 уровень сложности: Найти среднее арифметическое положительных элементов массива.
Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.
Найти в массиве наибольшую сумму подряд идущих элементов.
         */
        int[] Array = {-3, 5, 10, 1, -4, 3, 9, 6, 12, -15, 30};
        Calc calc = new Calc(Array);
        System.out.printf(""calc.average());
    }
}
