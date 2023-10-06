package org.example.HomeWork._2023_09_06.Task3;

abstract class Product {
    private String name;

    private double prise;

    public Product(String name, double prise) {
        this.name = name;
        this.prise = prise;
    }

    String getName() {
        return name;
    }

    double getPrise() {
        return prise;
    }

    void setPrise(double prise) {
        this.prise = prise;
    }
}
