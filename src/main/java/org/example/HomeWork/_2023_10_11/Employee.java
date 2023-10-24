package org.example.HomeWork._2023_10_11;

import org.example.HomeWork._2023_09_13.Person;

public class Employee extends Person {
    private int salary;
    private String position;
    private Company company;

    public Employee(String name, int age, int salary, String position, Company company) {
        super(name, age);
        this.salary = salary;
        this.position = position;
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", company=" + company +
                '}';
    }
}
