package HomeWork._13_09_23;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TasksOfLevel5 {
    // Уровень сложности 5 из 10:
    // Найти сумму всех элементов ArrayList<Integer>.
    int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum;
    }

    //    Найти среднее значение элементов LinkedList<Integer>.
    double getAvg(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum / arrayList.size();
    }

    //    Перебрать ArrayList<String> и вывести все элементы на экран.
    void getElements(ArrayList<Integer> arrayList) {
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }

    //    Перебрать LinkedList<String> и найти самую длинную строку.
    String getМaximumLength(List<String> str) {
        String maxLength = str.get(0);
        for (String string : str) {
            if (string.length() > maxLength.length()) {
                maxLength = string;
            }
        }
        return maxLength;
    }

//    Создать ArrayList с объектами вашего собственного класса и вывести их на экран.

}
