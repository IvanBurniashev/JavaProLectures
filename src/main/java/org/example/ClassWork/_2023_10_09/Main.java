package org.example.ClassWork._2023_10_09;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {
        /**
         //     * List<Integer> numbers = Arrays.asList(1.txt, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         //     * -- Отфильтровать нв четные и не четные
         //     * -- Просуммировать все числа
         //     * -- Получить среднее значение
         //     * -- Найти суммы чисел кратных 3 и 5
         //     * <p>
         //     * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
         //     * -- Преобразовать список строк в список чисел
         //     * <p>
         //     * <p>
         //     * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
         //     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
         //     * -- Получить список слов которые содержат только уникальные символы

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
        //Задание 1: Фильтрация списка целых чисел на нечетные числа

         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = numbers.stream()
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println("Отфильтровать на четные" + list);

        List<Integer> list1 = numbers.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println("Отфильтровать на нечетные" + list1);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Проссумировать все числа: " + sum);

//        OptionalDouble average = numbers.stream()
//                .mapToDouble()



    }
}
