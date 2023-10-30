package org.example.ClassWork._2023_10_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    static List<String> listString = new ArrayList<>();
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/org/example/ClassWork/_2023_10_23/names.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                listString.add(line);
                stringBuilder.append(line).append(" ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(listString);
        String stringString = stringBuilder.toString();
        System.out.println(stringString);
        Main main = new Main();
        System.out.println(main.countTotalNames(stringString));
        System.out.println(main.countTotalNames(listString));
        System.out.println(main.uniqueNames(stringString));
        System.out.println(main.countNamesContainingSubstring(stringString, "tt"));
        System.out.println(main.namesWithLengthInRange(stringString, 5, 7));
        System.out.println(main.firstNNamesAlphabetically(stringString, 10));
        main.topFiveCommonNames(stringString);
//        main.namesStartingWithAndOccurMoreThanTwice(stringString, 'A');
    }

    //**Подсчет общего числа имен в файле
    public long countTotalNames(String fileName) {
        return Arrays.stream(fileName.split(" ")).count();
    }

    public long countTotalNames(List<String> listString) {
        return listString.stream().count();
    }

    //    **Нахождение уникальных имен в файле
    public Set<String> uniqueNames(String fileName) {
        return Arrays.stream(fileName.split(" "))
//                .distinct()
                .collect(Collectors.toSet());
    }

    //    **Подсчет числа имен, содержащих заданную подстроку
    public long countNamesContainingSubstring(String fileName, String substring) {
        return Arrays.stream(fileName.split(" "))
                .filter(str -> str.contains(substring))
                .count();
    }

    //    **Нахождение имен, длина которых находится в заданном диапазоне
    public List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength) {
        return Arrays.stream(fileName.split(" "))
                .filter(string -> string.length() > minLength && string.length() < maxLength)
                .toList();
    }

    //    **Вывод первых N имен в алфавитном порядке
    public List<String> firstNNamesAlphabetically(String fileName, int n) {
        return Arrays.stream(fileName.split(" "))
                .limit(n)
                .sorted()
                .toList();
    }

    //    **Нахождение пяти самых часто встречающихся имен в файле
    public void topFiveCommonNames(String fileName) {
        System.out.println("//решение методом .groupingBy()");
        Arrays.stream(fileName.split(" "))
                .collect(Collectors.groupingBy(key -> key, Collectors.counting()))
                .entrySet().stream()
                .sorted((key, value) -> Long.compare(value.getValue(), key.getValue()))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("//решение методом .toMap()");
        Arrays.stream(fileName.split(" "))
                .collect(Collectors.toMap(key -> key, key -> 1L, (count, el) -> count + el))
                .entrySet().stream()
                .sorted((key, value) -> Long.compare(value.getValue(), key.getValue()))
                .limit(5)
                .map(entry -> "'" + entry.getKey() + "'," + " count = " + entry.getValue())
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .forEach(System.out::println);
    }

//    **Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз
//    public void namesStartingWithAndOccurMoreThanTwice(String fileName, char c){
//        System.out.println("//    **Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз\n");
//        Set<String,Long> set = Arrays.stream(fileName.split(" "))
//                .collect(Collectors.groupingBy(key -> key,Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() > 1 && entry.getKey().startsWith(Character.toString(c)))
//                .collect(Collectors.toSet());
//        return set;
//    }

}