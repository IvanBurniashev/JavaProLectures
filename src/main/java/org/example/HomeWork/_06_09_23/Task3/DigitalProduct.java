package org.example.HomeWork._06_09_23.Task3;

class DigitalProduct extends Product implements Discountable{
    DigitalProduct(String name, double prise) {
        super(name, prise);
    }

    void applyDiscount(double percentage) {
        this.applyDiscount(this, percentage);
    }
}
