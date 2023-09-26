package org.example.IndependWork.Test;

import com.github.javafaker.Faker;

public class FakeEx {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            System.out.println(faker.superhero().name());
        }
    }
}
