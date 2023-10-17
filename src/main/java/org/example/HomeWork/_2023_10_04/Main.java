package org.example.HomeWork._2023_10_04;

import org.example.ClassWork._2023_10_11.Person;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


//*****************************************************************************************************
        List<Integer> listNumbers = Arrays.asList(1, 2, 30, 4, 5, 60, 7, 8, 9, 10);
        List<String> listStrings = Arrays.asList("arob", "jkldd", "sa", "jkeor", "libhrk", "asdfjkl", "libhrk", "libhrk", "jkldd");
        List<Person> listPeople = Arrays.asList(
                new Person("Doll", 36),
                new Person("Jane", 25),
                new Person("Mikel", 15),
                new Person("James", 35),
                new Person("Jill", 18)
        );

        m1(listNumbers);
        m2(listStrings);
        m3(listNumbers);
        m4(listNumbers);
        m5(listStrings, "j");
        m6(listStrings, 4);
        m7(listPeople);
        m8(listNumbers);
        m9(listNumbers);
        m10(listStrings);
        m11(listNumbers);
        m12(listStrings, "a");
        m13(listNumbers);
        m14(listNumbers);
        m15(listStrings);
        m16(listNumbers);
        m17(listNumbers);
        m18(listStrings);
        m19(listNumbers);
        m20(listStrings);
        m21(listStrings);
        System.out.println("------------------");
        m22(listStrings);
        System.out.println("------------------");
        m23(listPeople);
        System.out.println("------------------");
        m24(listStrings);
    }

    //Задание 1: Фильтрация списка целых чисел на нечетные числа
    private static void m1(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println(list1);
    }

    //Задание 2: Преобразование списка строк в список чисел
    private static void m2(List<String> list) {
        int[] array = list.stream()
                .mapToInt(el -> el.hashCode())
                .toArray();
        System.out.println(Arrays.toString(array));
    }

    //Задание 3: Суммирование списка чисел
    private static void m3(List<Integer> list) {
        //решение через преобразование в поток int
        int sum1 = list.stream()
                .mapToInt(el -> el.intValue())
                .sum();
        System.out.println(sum1);

        //решение через метод reduce()
        Integer sum2 = list.stream()
                .reduce(0, (sum, el) -> sum + el);
        System.out.println(sum2);
    }

    //Задание 4: Определение максимального значения в списке
    private static void m4(List<Integer> list) {
        //решение через .max()
        Optional<Integer> max1 = list.stream()
                .max((a, b) -> a.compareTo(b));
        System.out.println(max1.get());

        //решение через .reduce()
        Integer max2 = list.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));
        System.out.println(max2);

    }

    //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
    private static void m5(List<String> list, String string) {
        List<String> list1 = list.stream()
                .filter(el -> el.startsWith(string))
                .map(el -> el.toUpperCase(Locale.ROOT))
                .toList();
        System.out.println(list1);
    }

    //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
    private static void m6(List<String> list, Integer lenght) {
        List<String> list1 = list.stream()
                .filter(el -> el.length() > 4)
                .distinct()
                .toList();
        System.out.println(list1);
    }

    //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
    private static void m7(List<Person> list) {
        List<String> list1 = list.stream()
                .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()))
                .map(el -> el.getName())
                .toList();
        System.out.println(list1);
    }

    //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
    private static void m8(List<Integer> list) {
        Integer sum1 = list.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .reduce(0, (sum, el) -> sum + el);
        System.out.println(sum1);
    }

    // Задача 1: Фильтрация четных чисел и умножение на 2.
    private static void m9(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 == 0)
                .map(el -> el * 2)
                .toList();
        System.out.println(list1);
    }

    // Задача 2: Удаление дубликатов из списка строк.
    private static void m10(List<String> list) {
        List<String> list1 = list.stream()
                .distinct()
                .toList();
        System.out.println(list1);
    }

    // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
    private static void m11(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .toList();
        System.out.println(list1);

    }

    // Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
    private static void m12(List<String> list, String string) {
        List<String> list1 = list.stream()
                .filter(el -> el.startsWith(string))
                .map(el -> el.toUpperCase())
                .toList();
        System.out.println(list1);
    }

    // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
    private static void m13(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .skip(2)
                .toList();
        System.out.println(list1);
    }

    // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
    private static void m14(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el > 50)
                .map(el -> (int) Math.pow(el, 2))
                .toList();
        System.out.println(list1);
    }

    // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
    private static void m15(List<String> list) {
        List<String> list1 = list.stream()
                .filter(el -> el.contains("o"))
                .sorted((a, b) -> b.compareTo(a))
                .toList();
        System.out.println(list1);
    }

    // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
    private static void m16(List<Integer> list) {
        List<Integer> list1 = list.stream()
                .filter(el -> el % 2 != 0)
                .sorted()
                .toList();
        System.out.println(list1);
    }

    // Задача 9: Получить среднее значение чисел в списке.
    private static void m17(List<Integer> list) {
        //решение через DoubleStream
        OptionalDouble avg = list.stream()
                .mapToDouble(el -> el.intValue())
                .average();
        System.out.println(avg.getAsDouble());

        //решение через .reduce()
        double avg1 = (double) list.stream()
                .reduce(0, Integer::sum) / list.size();
        System.out.println(avg1);
    }

    // Задача 10: Получить строку, объединяющую элементы списка через запятую.
    private static void m18(List<String> list) {
        String combination = list.stream()
                .reduce("", (a, b) -> a + "," + b);
        System.out.println(combination);
    }

    // Задача 11: Получить список квадратов чисел из другого списка.
    private static void m19(List<Integer> list) {
        List<Double> list1 = list.stream()
                .map(el -> Math.pow(el, 2))
                .toList();
        System.out.println(list1);
    }

    // Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
    private static void m20(List<String> list) {
//        list.stream()
//                //запускаем нижний поток из char. Решение через flatMapToInt
//                .flatMapToInt(s -> s.chars())
//                .mapToObj(Character::toString)
//                .forEach(System.out::println);
//
//        System.out.println("**************************************");
        //решение через flatMap и boxed()
        list.stream()
                .flatMap(s -> s.chars().boxed())
                .map(Character::toString)
                .sorted()
                .forEach(System.out::println);
    }

    // Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
    private static void m21(List<String> list) {
        list.stream()
                .limit(3)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
    }

    // Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
    private static void m22(List<String> list) {
        list.stream()
                .skip(2)
                .distinct()
                .forEach(System.out::println);
    }

    // Задача 15: Фильтрация и сортировка пользователей по возрасту.
    private static void m23(List<Person> list) {
            list.stream()
                    .map(el -> el.getAge())
                    .filter(el->el > 18)
                    .sorted()
                    .forEach(System.out::println);
    }

//Задание 9(1):Получение списка слов, содержащих только уникальные символы, из списка строк
    private static void m24(List<String> list){
         list.stream()
                 .filter(el->el.chars().distinct().count() == el.length())
                 .forEach(System.out::println);
    }


}














