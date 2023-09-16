package HomeWork._13_09_23;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    /**
     * Уровень сложности 5 из 10:
     * Найти сумму всех элементов ArrayList<Integer>.
     * Найти среднее значение элементов LinkedList<Integer>.
     * Перебрать ArrayList<String> и вывести все элементы на экран.
     * Перебрать LinkedList<String> и найти самую длинную строку.
     * Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
     * <p>
     * Уровень сложности 6 из 10:
     * Перебрать ArrayList<Integer> и найти наименьший элемент.
     * Перебрать LinkedList<Integer> и найти наибольший элемент.
     * Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
     * Перебрать LinkedList<String> и найти первое вхождение определенной строки.
     * Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
     * <p>
     * Уровень сложности 7 из 10:
     * Перебрать ArrayList<Integer> и удалить все четные числа.
     * Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
     * Перебрать ArrayList<String> и объединить все элементы в одну строку.
     * Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
     * Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
     * <p>
     * Уровень сложности 8 из 10:
     * Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
     * Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
     * Перебрать ArrayList<String> и найти самую короткую строку.
     * Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
     * Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
     * <p>
     * Уровень сложности 9 из 10:
     * Перебрать ArrayList<Integer> и найти второй по величине элемент.
     * Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
     * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
     * Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
     * Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
     * <p>
     * Уровень сложности 10 из 10:
     * Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
     * Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
     * Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.
     * <p>
     * Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя (пробела).
     * Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.
     */

    public static void main(String[] args) {
        /** Уровень сложности 5 из 10:
         Найти сумму всех элементов ArrayList<Integer>.
         Найти среднее значение элементов LinkedList<Integer>.
         Перебрать ArrayList<String> и вывести все элементы на экран.
         Перебрать LinkedList<String> и найти самую длинную строку.
         Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
         */
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        arrayOfNumbers.add(5);
        arrayOfNumbers.add(-5);
        arrayOfNumbers.add(44);
        arrayOfNumbers.add(12);

        LinkedList<String> arrayOfStrings = new LinkedList<>();
        arrayOfStrings.add("a");
        arrayOfStrings.add("abc");
        arrayOfStrings.add("ab");
        arrayOfStrings.add("bcde");
        arrayOfStrings.add("bc");

        TasksOfLevel5 tasks5 = new TasksOfLevel5();

//       Найти сумму всех элементов ArrayList<Integer>.
        System.out.println(tasks5.getSum(arrayOfNumbers));

//        Найти среднее значение элементов LinkedList<Integer>.
        System.out.println(tasks5.getAvg(arrayOfNumbers));

    }
}
