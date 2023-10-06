package org.example.HomeWork._2023_09_06.Task3;

interface Discountable {
    default void applyDiscount(Product product, double percentage) {
        product.setPrise(product.getPrise() * (1 - percentage * 0.01));
    }
}
