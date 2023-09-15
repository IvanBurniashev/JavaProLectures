package HomeWork._06_09_23.Task3;

public class Main {
    public static void main(String[] args) {
        /**
         * ТЗ 3: Интернет-магазин с различными продуктами
         * <p>
         * Абстрактный класс: Product
         * Интерфейс: Discountable
         * <p>
         * Задача:
         * Разработать интернет-магазин, в котором можно продавать различные продукты с //todo: нужно создать класс
         * возможностью применения скидок. Создать абстрактный класс Product,
         * содержащий информацию о продукте (название, цена) и методы для получения информации.
         * Создать интерфейс Discountable, который имеет метод applyDiscount(double percentage)
         * для применения скидки к продукту. Реализовать два класса, PhysicalProduct и DigitalProduct,
         * наследующихся от абстрактного класса Product. Класс PhysicalProduct может иметь наценку за доставку,
         * а класс DigitalProduct не имеет такой наценки.
         */

        PhysicalProduct physicalProduct = new PhysicalProduct("Phone", 100, 10);
        DigitalProduct digitalProduct = new DigitalProduct("Ebook", 100);
        physicalProduct.applyDiscount(10);
        digitalProduct.applyDiscount(10);
        System.out.println("Physical product price after discount: " + physicalProduct.getName() + " " + physicalProduct.getPrise());
        System.out.println("Digital product price after discount: " + digitalProduct.getName() + " " + digitalProduct.getPrise());
    }
}
