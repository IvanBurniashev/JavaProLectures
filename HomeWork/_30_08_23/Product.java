package HomeWork._30_08_23;

public abstract class Product {
    private static int globalId = 1;
    private int id;
    private String name;
    private ProductCategory category;
    private double price;
    private Currency currency;

    public Product(String name, ProductCategory category, double price, Currency currency) {
        this.id = globalId++;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}
