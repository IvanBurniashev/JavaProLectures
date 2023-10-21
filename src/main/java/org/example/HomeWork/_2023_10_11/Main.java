package org.example.HomeWork._2023_10_11;

import org.example.ClassWork._2023_10_11.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();
        m6();
    }

    /**
     * Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
     */
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        long cnt = list.stream()
                .filter(el -> el.contains(""))
                .count();
        System.out.println(cnt);
    }

    /**
     * Дан список целых чисел. Необходимо найти максимальный
     * элемент списка, который делится на заданное число без остатка.
     */
    private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        Optional<Integer> max = list.stream()
                .filter(el -> el % 4 == 0)
                .max(Integer::compare);
        System.out.println(max.get());
    }

    /**
     * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
     * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
     */
    private static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("Jamen", 35),
                new Person("Jill", 40)
        );
        Double avg = people.stream()
                .filter(el -> el.getName().endsWith("n"))
                .collect(Collectors.averagingDouble(el -> el.getAge()));
        System.out.println(avg);
    }

    /**
     * Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
     * этой коллекции строк, и вернуть их в виде списка.
     */
    private static void m4() {
        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language."
        );
        List<String> subList = lines.stream()
                .flatMap(el -> Arrays.stream(el.split("[\\s.]")))
                .distinct()
                .toList();
        System.out.println(subList);
    }

    /**
     * Подсчитать буквы в нижнем и верхнем регистре
     */
    private static void m5() {
        String ss = "KikJhYggfTxgf";
        //решение через .filter()
        long cntUP = ss.chars()
                .filter(Character::isUpperCase)
                .count();
        long cntLOW = ss.chars()
                .filter(Character::isLowerCase)
                .count();
        System.out.println("Is UP: " + cntUP);
        System.out.println("Is LOW: " + cntLOW);

        //решение через .colllect()
        Map<Boolean, Long> booleanUpAndLow = ss.chars()
                .mapToObj(el -> (char) el)
                .collect(Collectors.partitioningBy(Character::isUpperCase, Collectors.counting()));
        System.out.println(booleanUpAndLow);
    }

    /**
     * Определите все символьные строки максимальной длины в заданном конечном
     * потоке символьных строк. через Optional
     */
    private static void m6() {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
//        Optional<Map.Entry<Integer, List<String>>> max = stream.collect(Collectors.maxBy((a,b) ->   ))
        Stream<String> stringStream = Stream.of("abc", "abcdef", "xy", "xyz", "pqrst");

        Map<Integer, List<String>> result = stringStream
                .collect(Collectors.groupingBy(String::length,Collectors.toList()));
//                .entrySet();
        System.out.println(result);
//        Set<Map.Entry<Integer, List<String>>> result1 = stringStream
//                .collect(Collectors.groupingBy(String::length,Collectors.toList()))
//                .entrySet();
//        System.out.println(result1);
//                .stream()
//                .max(Map.Entry.comparingByKey());
//        System.out.println(result);
    }
}
