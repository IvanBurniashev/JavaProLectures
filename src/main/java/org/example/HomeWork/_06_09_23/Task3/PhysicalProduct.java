package org.example.HomeWork._06_09_23.Task3;

class PhysicalProduct extends Product implements Discountable {
    private int deliverySurcharge;

    PhysicalProduct(String name, double prise, int deliverySurcharge) {
        super(name, prise);
        this.deliverySurcharge = deliverySurcharge;
    }

    void applyDiscount(double percentage) {
        this.applyDiscount(this, percentage);
        this.setPrise(this.getPrise() * (1 + deliverySurcharge * 0.01));
    }
}
