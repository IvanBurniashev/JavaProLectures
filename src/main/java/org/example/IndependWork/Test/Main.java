package org.example.IndependWork.Test;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person1> linkedOfPerson1s = new LinkedList<>();
        linkedOfPerson1s.add(new Person1("Anna", 42));
        linkedOfPerson1s.add(new Person1("Maximilian", 40));
        linkedOfPerson1s.add(new Person1("Maximilian", 40));
        linkedOfPerson1s.add(new Person1("Maximilian", 40));
        linkedOfPerson1s.add(new Person1("Anna", 21));
        linkedOfPerson1s.add(new Person1("Veronika", 19));
        linkedOfPerson1s.add(new Person1("Anna", 25));
        linkedOfPerson1s.add(new Person1("Veronika", 18));
        linkedOfPerson1s.add(new Person1("Veronika", 13));
        linkedOfPerson1s.add(new Person1("Anna", 17));
        linkedOfPerson1s.add(new Person1("Veronika", 18));
        linkedOfPerson1s.add(new Person1("Veronika", 45));
        linkedOfPerson1s.add(new Person1("Natalia", 17));
        linkedOfPerson1s.add(new Person1("Natalia", 45));
        linkedOfPerson1s.add(new Person1("Natalia", 15));
        linkedOfPerson1s.add(new Person1("Anton", 35));
        linkedOfPerson1s.add(new Person1("Dasha", 12));

        System.out.println(linkedOfPerson1s);
        Collections.sort(linkedOfPerson1s,new Comparator()); //прямая сортирока
//        Collections.sort(linkedOfPerson,new Comparator().reversed()); //обратная сортировка
        System.out.println(linkedOfPerson1s);

    }
}
