package org.example.HomeWork._30_08_23;

public class Clothing extends Product {
    private Size size;

    public Clothing(String name, ProductCategory productCategory, double price, Currency currency, Size size) {
        super(name, productCategory, price,currency);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Size: " + size;
    }
}
