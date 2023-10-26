package org.example.ClassWork._2023_10_25;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Student implements Serializable {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    /**
     * ****Задание 1. Сериализация списка студентов
     * Описание: Создайте класс Student с полями name
     * (имя студента), age (возраст) и grade (оценка).
     * Реализуйте сериализацию и десериализацию списка студентов.
     * <p>
     * Требования:
     * Используйте потоки для обработки данных.
     * Реализуйте метод saveStudentsToFile(List<Student> students, String filename), который будет сохранять список студентов в файл.
     * Реализуйте метод List<Student> loadStudentsFromFile(String filename), который будет читать студентов из файла.
     */

    public static void saveStudentsToFile(List<Student> students, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(students);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> loadStudentsFromFile(String filename) {
        List<Student> studentList;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    /**
     * ****Задание 2. Фильтрация студентов по оценке
     * Описание: Добавьте функционал, который позволит фильтровать студентов с оценкой выше определенного значения и сохранять их в отдельный файл.
     * <p>
     * Требования:
     * Реализуйте метод filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename), который будет сохранять студентов с оценкой выше gradeThreshold в файл.
     */
    private static void filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename) {
        List<Student> studentList = students.stream()
                .filter(el -> el.getGrade() > gradeThreshold)
                .toList();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * ****Задание 3. Средний балл студентов
     * Описание: Напишите метод, который вычисляет средний балл всех студентов из файла.
     * <p>
     * Требования:
     * Реализуйте метод double calculateAverageGrade(String filename), который возвращает средний балл студентов.
     */
    private static double calculateAverageGrade(String filename) {
        List<Student> studentList;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("//решение через .reduce()");
        double avg = studentList.stream()
                .map(el -> el.getGrade())
                .reduce(0.0, Double::sum)/studentList.size();
        System.out.println(avg);

        System.out.println("//решение через DoubleStream");
        OptionalDouble average = studentList.stream()
                .mapToDouble(el -> el.getGrade())
                .average();
        return average.getAsDouble();
    }


    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Igor", 25, 7.5),
                new Student("Alex", 24, 8.5),
                new Student("Anna", 23, 7.0),
                new Student("Eva", 20, 6.0)
        );

        saveStudentsToFile(studentList, "src/main/java/org/example/ClassWork/_2023_10_25/students_out.obj");
        System.out.println(loadStudentsFromFile("src/main/java/org/example/ClassWork/_2023_10_25/students_out.obj"));
        filterAndSaveStudentsByGrade(studentList, 7.0, "src/main/java/org/example/ClassWork/_2023_10_25/students_out_more.obj");
        System.out.println(loadStudentsFromFile("src/main/java/org/example/ClassWork/_2023_10_25/students_out_more.obj"));
        System.out.println(calculateAverageGrade("src/main/java/org/example/ClassWork/_2023_10_25/students_out_more.obj"));
    }
}
