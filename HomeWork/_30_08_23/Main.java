package HomeWork._30_08_23;

import static HomeWork._30_08_23.Currency.*;
import static HomeWork._30_08_23.ProductCategory.CLOTHING;
import static HomeWork._30_08_23.ProductCategory.ELECTRONICS;
import static HomeWork._30_08_23.Size.*;


public class Main {
    public static void main(String[] args) {
        /**
         * Задание
         1 уровень сложности: - Задание лежит в нашем гит. В папке 202308_30.taski.txt


         Цель: Создать программу для управления списком товаров в интернет-магазине

         1. Enums:
         1.1. ProductCategory - Перечисление для представления категорий товаров в магазине:
         ?????? = придумайте сами какие

         1.2. Size - Перечисление для представления размеров одежды:
         ??????

         1.3. Currency - Перечисление для представления валют для цен товаров:
         ??????

         2. Классы:
         2.1. Product - Класс для представления товара:
         Поля:

         id (уникальный идентификатор товара)
         name (имя товара)
         category (категория товара из ProductCategory)
         price (цена товара)
         currency (валюта цены из Currency)
         Конструктор для инициализации полей.

         2.2. Clothing - Подкласс класса Product для представления одежды:
         Дополнительное поле size (размер одежды из Size).
         Конструктор для инициализации полей.

         2.3. ShopManager - Класс для управления списком товаров:

         Поле products (массив товаров).
         Метод addProduct(Product product) для добавления товара в список.
         Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
         Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
         заданном диапазоне цен и в указанной валюте.

         методы надо написать....естественно))
         */
        ShopManager manager = new ShopManager();
        Clothing cloth1 = new Clothing("Shirt", CLOTHING, 100.5, USD, SMALL);
        manager.addProduct(cloth1);
        Clothing cloth2 = new Clothing("Jacket", CLOTHING, 150.6, EUR, LARGE);
        manager.addProduct(cloth2);
        Clothing cloth3 = new Clothing("Trousers", CLOTHING, 1000.0, UAH, XLARGE);
        manager.addProduct(cloth3);
        Clothing cloth4 = new Clothing("Shirt", CLOTHING, 300, USD, Size.LARGE);
        manager.addProduct(cloth4);
        Electronics electro1 = new Electronics("ЕlectricStove", ELECTRONICS, 450, EUR, PowerSupplyType.TYPE_380V);
        manager.addProduct(electro1);
        Electronics electro2 = new Electronics("Refrigerator", ELECTRONICS, 1500, USD, PowerSupplyType.TYPE_380V);
        manager.addProduct(electro2);
        Electronics electro3 = new Electronics("Washer", ELECTRONICS, 780, EUR, PowerSupplyType.TYPE_220V);
        manager.addProduct(electro3);
        Electronics electro4 = new Electronics("Dishwasher", ELECTRONICS, 600, USD, PowerSupplyType.TYPE_220V);
        manager.addProduct(electro4);

        for (Product goods : manager.getProducts()) {
            System.out.println(goods);
        }

        System.out.println();
        System.out.println("===============================================================================");
        System.out.println();

        for (Product goods : manager.getProductsByCategory(ELECTRONICS)) {
            System.out.println(goods);
        }

        System.out.println();
        System.out.println("===============================================================================");
        System.out.println();

        for (Product goods : manager.getProductsByPriceRange(100, 800, EUR)) {
            System.out.println(goods);
        }
    }
}
