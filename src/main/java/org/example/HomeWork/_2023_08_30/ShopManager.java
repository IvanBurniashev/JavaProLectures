package org.example.HomeWork._2023_08_30;

import java.util.ArrayList;

public class ShopManager {
    private ArrayList<Product> products;

    public ShopManager() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProductsByCategory(ProductCategory category) {
        ArrayList<Product> productsByCategory = new ArrayList<>();
        for (Product goods : products) {
            if (goods.getCategory() == category) {
                productsByCategory.add(goods);
            }
        }
        return productsByCategory;
    }

    public ArrayList<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        ArrayList<Product> productsByPriceRange = new ArrayList<>();
        for (Product goods : products) {
            if (goods.getPrice() >= minPrice && goods.getPrice() <= maxPrice && goods.getCurrency() == currency) {
                productsByPriceRange.add(goods);
            }
        }
        return productsByPriceRange;
    }
}
