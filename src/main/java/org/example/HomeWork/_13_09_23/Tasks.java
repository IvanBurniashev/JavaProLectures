package org.example.HomeWork._13_09_23;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Tasks {
    /**
     * Уровень сложности 5 из 10:
     * Найти сумму всех элементов ArrayList<Integer>.
     * Найти среднее значение элементов LinkedList<Integer>.
     * Перебрать ArrayList<String> и вывести все элементы на экран.
     * Перебрать LinkedList<String> и найти самую длинную строку.
     * Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
     */

    // TODO: 17.09.2023   Найти сумму всех элементов ArrayList<Integer>.
    int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum;
    }

    // TODO: 17.09.2023      Найти среднее значение элементов LinkedList<Integer>.
    double getAvg(LinkedList<Integer> linkList) {
        int sum = 0;
        for (Integer integer : linkList) {
            sum += integer;
        }
        return (double) sum / linkList.size();
    }

    // TODO: 17.09.2023      Перебрать ArrayList<String> и вывести все элементы на экран.
    void getElements(ArrayList<String> arrayList) {
        for (String string : arrayList) {
            System.out.println(string);
        }
    }

    // TODO: 17.09.2023      Перебрать LinkedList<String> и найти самую длинную строку.
    String getМaximumLength(LinkedList<String> str) {
        String maxLength = str.get(0);
        for (String string : str) {
            if (string.length() > maxLength.length()) {
                maxLength = string;
            }
        }
        return maxLength;
    }

    // TODO: 17.09.2023      Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    void printOutPerson(ArrayList<Person> arrayList) {
        for (Person person : arrayList) {
            System.out.println(person);
        }
    }

    /**
     * Уровень сложности 6 из 10:
     * Перебрать ArrayList<Integer> и найти наименьший элемент.
     * Перебрать LinkedList<Integer> и найти наибольший элемент.
     * Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
     * Перебрать LinkedList<String> и найти первое вхождение определенной строки.
     * Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
     */

    // TODO: 17.09.2023 Перебрать ArrayList<Integer> и найти наименьший элемент.
    int minElementArray(ArrayList<Integer> arrayList) {
        int minInt = arrayList.get(0);
        for (Integer integ : arrayList) {
            if (integ < minInt) {
                minInt = integ;
            }
        }
        return minInt;
    }

    // TODO: 17.09.2023 Перебрать LinkedList<Integer> и найти наибольший элемент.
    int maxElementLinked(LinkedList<Integer> linkedList) {
        int maxInt = linkedList.get(0);
        for (Integer index : linkedList) {
            if (index > maxInt) {
                maxInt = index;
            }
        }
        return maxInt;
    }

    // TODO: 17.09.2023  * Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
    int amountOfElements(ArrayList<String> stringArrayList, Character letter) {
        int amountElements = 0;
        for (String str : stringArrayList) {
            if (str.charAt(0) == letter) {
                amountElements += 1;
            }
        }
        return amountElements;
    }

    // TODO: 17.09.2023  * Перебрать LinkedList<String> и найти первое вхождение определенной строки.
    void firstOccurrenceOfTheSubstring(LinkedList<String> linkedList, String substring) {
        for (String string : linkedList) {
            if (string.indexOf(substring) > -1) {
                System.out.println("Строка " + string + " первое вхождение подстроки " + substring + " найдено!\n" + " индекс вхождения " + string.indexOf(substring));
            }
        }
    }

    // TODO: 17.09.2023  * Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
    //  удовлетворяющие определенному условию. Удаляем элементы у которых возраст меньше указанного.
    LinkedList<Person> deletingElementsToAge(LinkedList<Person> linkedList, int age) {
        LinkedList<Person> newLinkedList = new LinkedList<>();
        for (Person person : linkedList) {
            if (person.getAge() >= age) {
                newLinkedList.add(person);
            } else {
                System.out.println("Remove " + person);
            }
        }
        return newLinkedList;
    }

    /**
     * Уровень сложности 7 из 10:
     * Перебрать ArrayList<Integer> и удалить все четные числа.
     * Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
     * Перебрать ArrayList<String> и объединить все элементы в одну строку.
     * Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
     * Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
     */

    // TODO: 17.09.2023  * Перебрать ArrayList<Integer> и удалить все четные числа.
    ArrayList<Integer> removesEvenNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 != 0) {
                newArrayList.add(integer);
            }
        }
        return newArrayList;
    }

    // TODO: 17.09.2023  * Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
    LinkedList<Integer> replaceElements(LinkedList<Integer> linkedList) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        for (Integer integer : linkedList) {
            newLinkedList.add(integer % 3 == 0 ? 0 : integer);
        }
        return newLinkedList;
    }

    // TODO: 17.09.2023  * Перебрать ArrayList<String> и объединить все элементы в одну строку.
    String concatenateString(ArrayList<String> arrayString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arrayString) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    // TODO: 17.09.2023  * Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
    LinkedList<String> removesElementsWithASubstring(LinkedList<String> linkedString, String substring) {
        LinkedList<String> newLinkedString = new LinkedList<>();
        for (String str : linkedString) {
            if (str.indexOf(substring) == -1) {
                newLinkedString.add(str);
            }
        }
        return newLinkedString;
    }

    // TODO: 17.09.2023  * Создать ArrayList с объектами вашего собственного класса и вывести только те,
    //  которые удовлетворяют определенному условию. Выводим обьекты с возрастом меньше 18 лет.
    LinkedList<Person> outPrintElementsToAge(LinkedList<Person> linkedList, int age) {
        LinkedList<Person> newLinkedList = new LinkedList<>();
        for (Person person : linkedList) {
            if (person.getAge() < age) {
                newLinkedList.add(person);
            }
        }
        return newLinkedList;
    }

    /**
     * Уровень сложности 8 из 10:
     * Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
     * Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
     * Перебрать ArrayList<String> и найти самую короткую строку.
     * Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
     * Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
     */
    // TODO: 17.09.2023  * Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
    int getSumSquare(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += Math.pow(integer, 2);
        }
        return sum;
    }

    // TODO: 17.09.2023  * Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
    int multiplicationOfElements(LinkedList<Integer> linkedList) {
        int multiplication = 1;
        for (Integer integer : linkedList) {
            multiplication *= integer;
        }
        return multiplication;
    }

    // TODO: 17.09.2023  * Перебрать ArrayList<String> и найти самую короткую строку.
    String minStringLength(ArrayList<String> arrayList) {
        String minString = arrayList.get(0);
        for (String str : arrayList) {
            if (str.length() < minString.length()) {
                minString = str;
            }
        }
        return minString;
    }

    // TODO: 17.09.2023  * Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
    LinkedList<String> replacingVowels(LinkedList<String> linkedList) {
        char[] charVowels = {'a', 'e', 'i', 'o', 'u'};
        LinkedList<String> newLinkedList = new LinkedList<>();
        for (String str : linkedList) {
            for (Character chr : charVowels) {
                str = str.replace(chr, '*');
            }
            newLinkedList.add(str);
        }
        return newLinkedList;
    }

    // TODO: 17.09.2023  * Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
    void sortPerson(LinkedList<Person> linkedList) {
        Collections.sort(linkedList);
    }

    /**
     * Уровень сложности 9 из 10:
     * Перебрать ArrayList<Integer> и найти второй по величине элемент.
     * Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
     * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
     * Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
     * Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
     */
    // TODO: 20.09.2023  * Перебрать ArrayList<Integer> и найти второй по величине элемент.
    Integer secondMaximum(ArrayList<Integer> arrayList) {
        Integer maxInteger = Integer.MIN_VALUE;
        Integer secondMaxInteger = Integer.MIN_VALUE;
        for (Integer index : arrayList) {
            if (index > maxInteger) {
                secondMaxInteger = maxInteger;
                maxInteger = index;
            } else if (index > secondMaxInteger && index != maxInteger) {
                secondMaxInteger = index;
            }
        }
        return secondMaxInteger;
    }

    // TODO: 22.09.2023  * Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
    void iteratesInReverseOrder(LinkedList<Integer> linkedList) {
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }
    }

    // TODO: 22.09.2023  * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
    void outOnlyLetters(ArrayList<String> arrayList) {
        for (String str : arrayList) {
            boolean flag = true;
            for (int i = 0; i <= 9; i++) {
                if (str.indexOf('0' + i) > -1) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(str);
            }
        }
    }

    // TODO: 22.09.2023  * Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
    String longestString(LinkedList<String> linkedList) {
        String maxString = "";
        for (String str : linkedList) {
            if (!str.contains(" ") && str.length() > maxString.length()) {
                maxString = str;
            }
        }
        return maxString;
    }

    // TODO: 22.09.2023  * Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
    ArrayList<Person> returnsUniqueElements(ArrayList<Person> personArrayList) {
        for (int i = 0; i < personArrayList.size(); i++) {
            for (int j = i + 1; j < personArrayList.size(); j++) {
                if (personArrayList.get(j).equals(personArrayList.get(i))) {
                    personArrayList.remove(j);
                    j--;
                }
            }
        }
        return personArrayList;
    }

    /**
     * Уровень сложности 10 из 10:
     * Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
     * Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
     * Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.
     * <p>
     * Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя (пробела).
     * Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.
     */
    // TODO: 22.09.2023  * Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
    ArrayList<Integer> maximumIncreasingSequence(ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> maxIncreas = new ArrayList<>();
        ArrayList<Integer> tempMaxIncreas = new ArrayList<>();
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (i == 0 || integerArrayList.get(i) <= integerArrayList.get(i - 1)) {
                tempMaxIncreas.clear();
            }
            tempMaxIncreas.add(integerArrayList.get(i));
            if (tempMaxIncreas.size() > maxIncreas.size()) {
                maxIncreas.clear();
                maxIncreas.addAll(tempMaxIncreas);
            }
        }
        return maxIncreas;
    }

    // TODO: 23.09.2023  * Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
    LinkedList<Integer> removesDuplicates(LinkedList<Integer> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = i + 1; j < linkedList.size(); j++) {
                if (linkedList.get(i) == linkedList.get(j)) {
                    linkedList.remove(j);
                    j--;
                }
            }
        }
        return linkedList;
    }

    // TODO: 23.09.2023  * Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки
    ArrayList<String> uniqueNewList(ArrayList<String> arrayList) {
        ArrayList<String> uniqueNewList = new ArrayList<>();
        for (String str : arrayList) {
            if (!uniqueNewList.contains(str)) {
                uniqueNewList.add(str);
            }
        }
        return uniqueNewList;
    }

    // TODO: 23.09.2023  * Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя (пробела).
    String glueElements(LinkedList<String> linkedList) {
        StringBuilder result = new StringBuilder();
        for (String str : linkedList) {
            result.append(" ").append(str);
        }
        return result.toString();
    }

    // TODO: 23.09.2023  * Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.
    LinkedList<Person> sortingByMultipleCriteria(LinkedList<Person> linkedList){

        return null;
    }

}
