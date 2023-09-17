package HomeWork._13_09_23;

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
     * Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
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
        arrayOfNumbers.add(5);
        arrayOfNumbers.add(-6);
        arrayOfNumbers.add(44);
        arrayOfNumbers.add(12);

        LinkedList<Integer> linkedOfNumbers = new LinkedList<>();
        linkedOfNumbers.add(10);
        linkedOfNumbers.add(-25);
        linkedOfNumbers.add(60);
        linkedOfNumbers.add(78);

        ArrayList<String> arrayOfStrings = new ArrayList<>();
        arrayOfStrings.add("aaaaaaa");
        arrayOfStrings.add("abc");
        arrayOfStrings.add("ab");
        arrayOfStrings.add("bcde");
        arrayOfStrings.add("bc");

        LinkedList<String> linkedOfStrings = new LinkedList<>();
        linkedOfStrings.add("fjklmn");
        linkedOfStrings.add("abc");
        linkedOfStrings.add("xyzd");
        linkedOfStrings.add("bcde");
        linkedOfStrings.add("byungnlrebc");

        Tasks tasks = new Tasks();

        ArrayList<Person> arrayPerson = new ArrayList<Person>();
        arrayPerson.add(new Person("Anna", 25));
        arrayPerson.add(new Person("Maximilian", 40));
        arrayPerson.add(new Person("Veronika", 18));
        arrayPerson.add(new Person("Anton", 35));
        arrayPerson.add(new Person("Dasha", 12));

        LinkedList<Person> linkedOfPerson = new LinkedList<Person>();
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
        System.out.println("======================================================\n" +
                " * Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.");
        System.out.println(tasks.getSumSquare(arrayOfNumbers));

        System.out.println("======================================================\n" +
                " * Перебрать LinkedList<Integer> и вычислить произведение всех элементов.");
        System.out.println(linkedOfNumbers);
        System.out.println(tasks.multiplicationOfElements(linkedOfNumbers));

        System.out.println("======================================================\n" +
                " * Перебрать ArrayList<String> и найти самую короткую строку.");
        System.out.println(arrayOfStrings);
        System.out.println(tasks.minStringLength(arrayOfStrings));

        System.out.println("======================================================\n" +
                "* Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.");
        System.out.println(linkedOfStrings);
        System.out.println(tasks.replacingVowels(linkedOfStrings));

    }

}
