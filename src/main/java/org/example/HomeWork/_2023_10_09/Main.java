package org.example.HomeWork._2023_10_09;

import java.util.Arrays;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /**

         //     * <p>
         //     * <p>
         //     * <p>

         //Задание 1: Фильтрация списка целых чисел на нечетные числа
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

         //Задание 2: Преобразование списка строк в список чисел
         List<String> strings = Arrays.asList("1", "2", "3", "4", "5");

         //Задание 3: Суммирование списка чисел
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

         //Задание 4: Определение максимального значения в списке
         //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре

         //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
         List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");

         //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
         List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));

         //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
         //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
         */

        List<Integer> numbers = Arrays.asList(1, 2, 30, 4, 5, 60, 7, 8, 9, 10);
        //     * -- Отфильтровать нв четные и не четные
        m1(numbers);
        //     * -- Просуммировать все числа
        m2(numbers);
        //     * -- Получить средdнее значение
        m3(numbers);
        //     * -- Найти суммы чисел кратных 3 и 5
        m4(numbers);
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        //     * -- Преобразовать список строк в список чисел
        m5(strings);
        //     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        m6(words);
        //     * -- Получить список слов которые содержат только уникальные символы
        m7(words);


    }

    //     * -- Отфильтровать нв четные и не четные
    private static void m1(List<Integer> list) {
        //первое решение через два стрима
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println(list1);

        List<Integer> list2 = list.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println(list2);

        //решение через Collectors
        Map<Boolean, List<Integer>> evenAndOdd = list.stream()
                .collect(Collectors.partitioningBy(el -> el % 2 == 0));
        System.out.println(evenAndOdd);
        List<Integer> even = evenAndOdd.get(true);
        List<Integer> odd = evenAndOdd.get(false);

        System.out.println(even);
        System.out.println(odd);
    }

    //     * -- Просуммировать все числа
    private static void m2(List<Integer> list) {
        int sum = list.stream()
                .collect(Collectors.summingInt(el -> el.intValue()));
        System.out.println(sum);
    }

    //     * -- Получить средdнее значение
    private static void m3(List<Integer> list) {
        double avg = list.stream()
                .collect(Collectors.averagingInt(el -> el.intValue()));
        System.out.println(avg);
    }

    //     * -- Найти суммы чисел кратных 3 и 5
    private static void m4(List<Integer> list) {
        int sum = list.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .collect(Collectors.summingInt(el -> el.intValue()));
        System.out.println(sum);
    }

    //     * -- Преобразовать список строк в список чисел
    private static void m5(List<String> list) {
        List<Integer> list1 = list.stream()
                .map(el -> Integer.parseInt(el))
                .toList();
        System.out.println(list1);
    }

    //     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
    private static void m6(List<String> list) {
        list.stream()
                .filter(el -> el.startsWith("a"))
                .map(el -> el.toUpperCase())
                .forEach(System.out::println);
    }

    //     * -- Получить список слов которые содержат только уникальные символы
    private static void m7(List<String> list) {
        list.stream()
                .filter(el -> el.chars().distinct().count() == el.length())
                .forEach(System.out::println);
    }


}