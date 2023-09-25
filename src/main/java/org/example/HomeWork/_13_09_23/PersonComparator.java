package org.example.HomeWork._13_09_23;

import org.example.IndependWork.Test.Person1;

import java.util.*;

public class PersonComparator implements Comparator<Person> {
    // Вариант простого сравнения по возрасту
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
//// Вариант последовательного сравнения сначала по имени, а потом по возрасту
//    @Override
//    public int compare(Person o1, Person o2) {
//        if (o1.getName().compareTo(o2.getName()) != 0) {
//            return o1.getName().compareTo(o2.getName());
//        }
//        return Integer.compare(o1.getAge(), o2.getAge());
//    }

    public PersonComparator thenComparingName() {
        // Добавляем сравнение по имени
        return (PersonComparator) thenComparing(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });
    }
}
