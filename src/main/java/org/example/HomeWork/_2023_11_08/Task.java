package org.example.HomeWork._2023_11_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        String path = "src/main/java/org/example/HomeWork/_2023_11_08/1.txt";
        System.out.println("---addMap");
        System.out.println(addMap(path));
        System.out.println("---mostCommonFirstLetter");
        System.out.println(mostCommonFirstLetter(path));
        System.out.println("---istOfPhoneNumbers");
        System.out.println(listOfPhoneNumbers(path));
        System.out.println("---groupingByNameLength");
        System.out.println(groupingByNameLength(path));
        System.out.println("---uniqueSurnames");
        System.out.println(uniqueSurnames(path));
        System.out.println("---sortNamesInReverseOrder");
        System.out.println(sortNamesInReverseOrder(path));
        System.out.println("---conversionToFormat");
        System.out.println(conversionToFormat(path));
        System.out.println("---averageNameLength");
        System.out.println(averageNameLength(path));
        System.out.println("---mapPhoneNumberName");
        System.out.println(mapPhoneNumberName(path));
        System.out.println("---minNameLength");
        System.out.println(minNameLength(path));
        System.out.println("---maxNameLength");
        System.out.println(maxNameLength(path));
    }

    /**
     * * Написать и протестировать методы которые парсят файл 1.txt и...
     */
    private static List<String> fileParsing(String path) {
        List<String> listString = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listString.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listString;
    }

    /**
     * - Метод для создания мапы, где ключ - первая буква имени, а значение - количество таких имен
     */
    private static Map<Character, Long> addMap(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1"))
                .collect(Collectors.groupingBy(el -> el.charAt(0), Collectors.counting()));
    }

    /**
     * - Метод для нахождения самой часто встречающейся первой буквы в именах
     */
    private static Character mostCommonFirstLetter(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1"))
                .collect(Collectors.groupingBy(el -> el.charAt(0), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();
    }

    /**
     * - Метод для создания списка номеров телефонов, где каждый номер преобразован в числовой формат
     */
    private static List<Long> listOfPhoneNumbers(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*^(.*?)\\s-\\s.*", "$1"))
                .map(el -> el.replaceAll("[^0-9]", ""))
                .map(Long::parseLong)
                .collect(Collectors.toList());
    }

    /**
     * - Метод для группировки имен по длине имени
     */
    private static Map<Integer, List<String>> groupingByNameLength(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1"))
                .collect(Collectors.groupingBy(String::length, Collectors.toList()));
    }

    /**
     * - Метод для поиска уникальных фамилий
     */
    private static Set<String> uniqueSurnames(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?\\w+\\s(\\w+).*", "$1"))
                .collect(Collectors.toSet());
    }

    /**
     * - Метод для создания списка имен, отсортированного в обратном алфавитном порядке
     */
    private static TreeSet<String> sortNamesInReverseOrder(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1"))
                .collect(Collectors.toCollection(() -> new TreeSet<String>((a, b) -> b.compareTo(a))));
    }

    /**
     * - Метод для преобразования данных в формат имя=номер
     */
    private static List<String> conversionToFormat(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.split("\\s-\\s"))
                .map(arr -> arr[1] + "=" + arr[0])
                .collect(Collectors.toList());
    }

    /**
     * - Метод для расчета средней длины имени
     */
    private static Double averageNameLength(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1"))
                .mapToInt(el -> el.length())
                .average().getAsDouble();
    }

    /**
     * - Метод для создания карты, где ключ - номер телефона, а значение - имя
     */
    private static Map<String, String> mapPhoneNumberName(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .map(el -> el.split("\\s-\\s"))
                .collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));
    }

    /**
     * - Метод для поиска контактов с максимальной и минимальной длиной имени
     */
    private static List<String> minNameLength(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .collect(Collectors.groupingBy((String string) -> string.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1").length(), Collectors.toList()))
                .entrySet().stream()
                .min(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue).get();
    }

    private static List<String> maxNameLength(String path) {
        List<String> listString = fileParsing(path);
        return listString.stream()
                .collect(Collectors.groupingBy((String string) -> string.replaceAll(".*-\\s(?:Mr\\.\\s|Mrs\\.\\s)?(\\w+).*", "$1").length(), Collectors.toList()))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue).get();
    }
}

