package HomeWork._06_09_23.Task3;

interface Discountable {
    default void applyDiscount(Product product, double percentage) {
        product.setPrise(product.getPrise() * (1 - percentage * 0.01));
    }
}
