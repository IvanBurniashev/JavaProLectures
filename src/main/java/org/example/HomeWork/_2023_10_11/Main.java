package org.example.HomeWork._2023_10_11;

import com.github.javafaker.Faker;

import org.example.ClassWork._2023_10_11.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();
        m6();
        m7();
        m8();
        m9();
        m10();
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
        Optional<Map.Entry<Integer, List<String>>> result = stream
                .collect(Collectors.groupingBy(String::length, Collectors.toList()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey());
        System.out.println(result);
    }

    /**
     * Дан список сотрудников, у каждого из которых есть поле "salary".
     * Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
     * в компаниях, которые находятся в городах, начинающихся на букву "M".
     */
    private static void m7() {
        List<Employee> list = Arrays.asList(
                new Employee(FAKER.name().name(), 25, 1500, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 26, 1300, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 22, 2000, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 28, 1800, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 35, 1200, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 30, 1100, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 20, 1000, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 40, 2100, "manager", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 45, 2200, "developer", new Company(FAKER.company().name(), FAKER.address().cityName())),
                new Employee(FAKER.name().name(), 38, 1500, "manager", new Company(FAKER.company().name(), FAKER.address().cityName()))
        );
        OptionalDouble result = list.stream()
                .filter(employee -> employee.getPosition() == "developer" && employee.getCompany().getCity().startsWith("M"))
                .peek(System.out::println)
                .flatMapToInt(el -> IntStream.of(el.getSalary()))
                .average();
        System.out.println(result);
    }

    /**
     * У нас есть список списков numbers,
     * и мы хотим получить все четные числа из этих списков.
     * Мы используем flatMap, чтобы преобразовать каждый внутренний
     * список в поток чисел, а затем фильтруем только четные числа.
     * Результат: Even numbers: [2, 4, 6].
     */
    private static void m8() {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> list = numbers.stream()
                .flatMap(el -> el.stream())
                .filter(el -> el % 2 == 0)
                .toList();
        System.out.println(list);
    }

    /**
     * Есть два списка list1 и list2, и мы
     * хотим получить все возможные комбинации сумм чисел из обоих списков.
     * Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
     * затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
     * и наконец, собираем все значения в combinedList.
     * Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
     */
    private static void m9() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list = list1.stream()
                .flatMap(number1 -> list2.stream().map(number2 -> number1 + number2))
                .toList();
        System.out.println(list);
    }

    private static void m10() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream()
                .flatMap(el -> list.stream())
                .map(el1 -> List.of(el1))
                .forEach(System.out::println);

    }


}