package ua.lviv.iot.item;

import ua.lviv.iot.FishingType;

public abstract class ShopItem {

    public String name;
    public String brand;
    public int amount;
    public double price;

    public abstract FishingType getFishingtype();

    public ShopItem(String name, String brand, int amount, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
    }

    final public String getName() {
        return name;
    }

    final public String getBrand() {
        return brand;
    }

    final public int getAmount() {
        return amount;
    }

    final  public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n Name " + this.getName() + " Brand "
                + this.getBrand() + " Amount " + this.getAmount() + " Price "
                + getPrice();
    }
}
