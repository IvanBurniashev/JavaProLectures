package org.example.HomeWork._13_09_23;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    /**
     * Список задач
     * Уровень сложности 5 из 10:
     * Найти сумму всех элементов ArrayList<Integer>.
     * Найти среднее значение элементов LinkedList<Integer>.
     * Перебрать ArrayList<String> и вывести все элементы на экран.
     * Перебрать LinkedList<String> и найти самую длинную строку.
     * Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
     * <p>
     * Уровень сложности 6 из 10:
     * Перебрать ArrayList<Integer> и найти наименьший элемент.
     * Перебрать LinkedList<Integer> и найти наибольший элемент.
     * Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
     * Перебрать LinkedList<String> и найти первое вхождение определенной строки.
     * Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
     * <p>
     * Уровень сложности 7 из 10:
     * Перебрать ArrayList<Integer> и удалить все четные числа.
     * Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.
     * Перебрать ArrayList<String> и объединить все элементы в одну строку.
     * Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.
     * Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
     * <p>
     * Уровень сложности 8 из 10:
     * Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
     * Перебрать LinkedList<Integer> и вычислить произведение всех элементов.
     * Перебрать ArrayList<String> и найти самую короткую строку.
     * Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.
     * Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.
     * <p>
     * Уровень сложности 9 из 10:
     * Перебрать ArrayList<Integer> и найти второй по величине элемент.
     * Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.
     * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы,без цифр
     * Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
     * Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
     * <p>
     * Уровень сложности 10 из 10:
     * Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
     * Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
     * Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.
     * <p>
     * Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя (пробела).
     * Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        arrayOfNumbers.add(20);
        arrayOfNumbers.add(21);
        arrayOfNumbers.add(22);
        arrayOfNumbers.add(23);
        arrayOfNumbers.add(17);
        arrayOfNumbers.add(10);
        arrayOfNumbers.add(11);
        arrayOfNumbers.add(12);
        arrayOfNumbers.add(7);
        arrayOfNumbers.add(14);
        arrayOfNumbers.add(15);

        LinkedList<Integer> linkedOfNumbers = new LinkedList<>();
        linkedOfNumbers.add(11);
        linkedOfNumbers.add(25);
        linkedOfNumbers.add(60);
        linkedOfNumbers.add(38);
        linkedOfNumbers.add(60);
        linkedOfNumbers.add(25);
        linkedOfNumbers.add(10);
        linkedOfNumbers.add(10);
        linkedOfNumbers.add(10);
        linkedOfNumbers.add(60);

        ArrayList<String> arrayOfStrings = new ArrayList<>();
        arrayOfStrings.add("aaaa1aaa");
        arrayOfStrings.add("ab0c");
        arrayOfStrings.add("ab");
        arrayOfStrings.add("bcd9e");
        arrayOfStrings.add("bc");
        arrayOfStrings.add("abc");
        arrayOfStrings.add("fjklmn");
        arrayOfStrings.add("xyzdw");
        arrayOfStrings.add("abc");
        arrayOfStrings.add("bc delldk");
        arrayOfStrings.add("xyzdw");
        arrayOfStrings.add("xyzdw");
        arrayOfStrings.add("byungnl rebc");
        arrayOfStrings.add("xyzdw");


        LinkedList<String> linkedOfStrings = new LinkedList<>();
        linkedOfStrings.add("fjklmn");
        linkedOfStrings.add("abc");
        linkedOfStrings.add("xyzdw");
        linkedOfStrings.add("abc");
        linkedOfStrings.add("bc delldk");
        linkedOfStrings.add("xyzdw");
        linkedOfStrings.add("xyzdw");
        linkedOfStrings.add("byungnl rebc");
        linkedOfStrings.add("xyzdw");


        Tasks tasks = new Tasks();

        ArrayList<Person> arrayPerson = new ArrayList<>();
        arrayPerson.add(new Person("Anna", 25));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Maximilian", 40));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Maximilian", 41));
        arrayPerson.add(new Person("Veronika", 18));
        arrayPerson.add(new Person("Veronika", 18));
        arrayPerson.add(new Person("Veronika", 18));
        arrayPerson.add(new Person("Anton", 36));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Veronika", 18));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Dasha", 12));

        LinkedList<Person> linkedOfPerson = new LinkedList<>();
        linkedOfPerson.add(new Person("Anna", 25));
        linkedOfPerson.add(new Person("Maximilian", 40));
        linkedOfPerson.add(new Person("Veronika", 18));
        linkedOfPerson.add(new Person("Natalia", 17));
        linkedOfPerson.add(new Person("Anton", 35));
        linkedOfPerson.add(new Person("Dasha", 12));

//         Уровень сложности 5 из 10:
        System.out.println("======================================================\n" + "Найти сумму всех элементов ArrayList<Integer>.");
        System.out.println(tasks.getSum(arrayOfNumbers));

        System.out.println("======================================================\n" + "Найти среднее значение элементов LinkedList<Integer>.");
        System.out.println(tasks.getAvg(linkedOfNumbers));

        System.out.println("======================================================\n" + "Перебрать ArrayList<String> и вывести все элементы на экран.");
        tasks.getElements(arrayOfStrings);

        System.out.println("======================================================\n" + "Перебрать LinkedList<String> и найти самую длинную строку.");
        System.out.println(tasks.getМaximumLength(linkedOfStrings));

        System.out.println("======================================================\n" + "Создать ArrayList с объектами вашего собственного класса и вывести их на экран.");
        tasks.printOutPerson(arrayPerson);

//        Уровень сложности 6 из 10:
        System.out.println("======================================================\n" + "     * Перебрать ArrayList<Integer> и найти наименьший элемент.");
        System.out.println(tasks.minElementArray(arrayOfNumbers));

        System.out.println("======================================================\n" + "     * Перебрать LinkedList<Integer> и найти наибольший элемент.");
        System.out.println(tasks.maxElementLinked(linkedOfNumbers));

        System.out.println("======================================================\n" + "     * Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.");
        System.out.println(tasks.amountOfElements(arrayOfStrings, 'b'));

        System.out.println("======================================================\n" + "     * Перебрать LinkedList<String> и найти первое вхождение определенной строки.");
        tasks.firstOccurrenceOfTheSubstring(linkedOfStrings, "bc");

        System.out.println("======================================================\n" + "     * Создать LinkedList с объектами вашего собственного класса и удалить все элементы,\n" + " удовлетворяющие определенному условию.  Удаляем элементы у которых возраст меньше указанного.");
        System.out.println("Result: " + tasks.deletingElementsToAge(linkedOfPerson, 18));

//             * Уровень сложности 7 из 10:
        System.out.println("======================================================\n" + "     * Перебрать ArrayList<Integer> и удалить все четные числа.\n");
        System.out.println(arrayOfNumbers);
        System.out.println(tasks.removesEvenNumbers(arrayOfNumbers));

        System.out.println("======================================================\n" + "* Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.\n");
        System.out.println(linkedOfNumbers);
        System.out.println(tasks.replaceElements(linkedOfNumbers));

        System.out.println("======================================================\n" + "* Перебрать ArrayList<String> и объединить все элементы в одну строку.\n");
        System.out.println(arrayOfStrings);
        System.out.println(tasks.concatenateString(arrayOfStrings));

        System.out.println("======================================================\n" + "* Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.\n\n\n");
        System.out.println(linkedOfStrings);
        System.out.println(tasks.removesElementsWithASubstring(linkedOfStrings, "cd"));

        System.out.println("======================================================\n" + "Создать ArrayList с объектами вашего собственного класса и вывести только те,\n" + " которые удовлетворяют определенному условию. Выводим тех, возраст которых меньше 18 лет.");
        System.out.println(linkedOfPerson);
        System.out.println("Result: " + tasks.outPrintElementsToAge(linkedOfPerson, 18));

        //     * Уровень сложности 8 из 10:
        System.out.println("======================================================\n" + " * Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.");
        System.out.println(tasks.getSumSquare(arrayOfNumbers));

        System.out.println("======================================================\n" + " * Перебрать LinkedList<Integer> и вычислить произведение всех элементов.");
        System.out.println(linkedOfNumbers);
        System.out.println(tasks.multiplicationOfElements(linkedOfNumbers));

        System.out.println("======================================================\n" + " * Перебрать ArrayList<String> и найти самую короткую строку.");
        System.out.println(arrayOfStrings);
        System.out.println(tasks.minStringLength(arrayOfStrings));

        System.out.println("======================================================\n" + "* Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.");
        System.out.println(linkedOfStrings);
        System.out.println(tasks.replacingVowels(linkedOfStrings));

        System.out.println("======================================================\n" + "* Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.");
        tasks.sortPerson(linkedOfPerson);
        System.out.println(linkedOfPerson);

//     * Уровень сложности 9 из 10:
        System.out.println("======================================================\n" + " * Перебрать ArrayList<Integer> и найти второй по величине элемент.");
        System.out.println(arrayOfNumbers);
        System.out.println(tasks.secondMaximum(arrayOfNumbers));


        System.out.println("======================================================\n" + "* Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.");
        System.out.println(linkedOfNumbers);
        tasks.iteratesInReverseOrder(linkedOfNumbers);

        // TODO: 22.09.2023  * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
        System.out.println("======================================================\n" + " * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.");
        System.out.println(arrayOfStrings);
        tasks.outOnlyLetters(arrayOfStrings);

        // TODO: 22.09.2023  * Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.
        System.out.println("======================================================\n" + "* Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.");
        System.out.println(linkedOfStrings);
        System.out.println(tasks.longestString(linkedOfStrings));

        // TODO: 22.09.2023  * Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
        System.out.println("======================================================\n" +
                "* Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.");
        System.out.println(arrayPerson);
        System.out.println(tasks.returnsUniqueElements(arrayPerson));

//     * Уровень сложности 10 из 10:
        // TODO: 22.09.2023  * Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
        System.out.println("======================================================\n" + "* Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.");
        System.out.println(arrayOfNumbers);
        System.out.println(tasks.maximumIncreasingSequence(arrayOfNumbers));

        // TODO: 23.09.2023  * Перебрать LinkedList<Integer> и удалить все дубликаты элементов.
        System.out.println("======================================================\n" +
                "* Перебрать LinkedList<Integer> и удалить все дубликаты элементов.");
        System.out.println(linkedOfNumbers);
        System.out.println(tasks.removesDuplicates(linkedOfNumbers));

        // TODO: 23.09.2023  * Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки
        System.out.println("======================================================\n" +
                "* Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки");
        System.out.println(arrayOfStrings);
        System.out.println(tasks.uniqueNewList(arrayOfStrings));

        // TODO: 23.09.2023  * Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя (пробела).
        System.out.println("======================================================\n" +
                "* Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя (пробела)");
        System.out.println(linkedOfStrings);
        System.out.println(tasks.glueElements(linkedOfStrings));


    }
//
}


