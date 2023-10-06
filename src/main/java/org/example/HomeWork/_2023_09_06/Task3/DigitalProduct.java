package org.example.HomeWork._2023_09_06.Task3;

class DigitalProduct extends Product implements Discountable{
    DigitalProduct(String name, double prise) {
        super(name, prise);
    }

    void applyDiscount(double percentage) {
        this.applyDiscount(this, percentage);
    }
}
