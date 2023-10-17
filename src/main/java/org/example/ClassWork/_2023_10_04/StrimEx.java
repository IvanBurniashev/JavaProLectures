package org.example.ClassWork._2023_10_04;

import java.util.Arrays;
import java.util.List;

public class StrimEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] arr = {67, 37, 45, 44, 92, 100};

        List<Integer> list1 = list.stream()
                .filter(digit -> digit % 2 != 0)
                .toList();
        System.out.println(list1);

        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");


    }
}
