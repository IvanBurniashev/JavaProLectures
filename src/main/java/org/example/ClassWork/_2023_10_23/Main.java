package org.example.ClassWork._2023_10_23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
        System.out.println(main.namesWithLengthInRange(stringString,5,7));
        System.out.println(main.firstNNamesAlphabetically(stringString, 10));
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
                .distinct()
                .collect(Collectors.toSet());
    }

    //    **Подсчет числа имен, содержащих заданную подстроку
    public long countNamesContainingSubstring(String fileName, String substring) {
        return Arrays.stream(fileName.split(" "))
                .filter(str -> str.contains(substring))
                .count();
    }

//    **Нахождение имен, длина которых находится в заданном диапазоне
    public List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength){
        return Arrays.stream(fileName.split(" "))
                .filter(string -> string.length() > minLength && string.length() < maxLength)
                .toList();
    }

//    **Вывод первых N имен в алфавитном порядке
    public List<String> firstNNamesAlphabetically(String fileName, int n){
        return Arrays.stream(fileName.split(" "))
                .limit(n)
                .sorted()
                .toList();
    }

}