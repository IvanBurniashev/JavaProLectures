package org.example.IndependWork.Test;



public class Comparator implements java.util.Comparator<Person1> {

/**
// 1. Вариант простой сортировки по одному из полей
     @Override
     public int compare(Person o1, Person o2) {
     return Integer.compare(o1.getAge(), o2.getAge());
     //        return o1.getName().compareTo(o2.getName()); //сортировка по имени, используя встроенный метод String.compareTo()
     //        return o1.compareTo(o2); //сортировка c помощью метода самого класса Person.compareTo(), который он имплементировал из интерфейса Comparable<>
     //        return Integer.compare(o1.getAge(),o2.getAge()); //сортировка по возрасту, используя встроенный метод Integer.compare()
     }
*/

// 2. Вариант последовательной сортировки по двум полям: сначала по имени, потом по возрасту
    @Override
    public int compare(Person1 o1, Person1 o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
