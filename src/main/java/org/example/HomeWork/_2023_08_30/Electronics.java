package org.example.HomeWork._2023_08_30;

public class Electronics extends Product {
    private PowerSupplyType powerSupplyType;

    public Electronics(String name, ProductCategory category, double price, Currency currency, PowerSupplyType powerSupplyType) {
        super(name, category, price, currency);
        this.powerSupplyType = powerSupplyType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Power supply type: " + powerSupplyType;
    }

}
