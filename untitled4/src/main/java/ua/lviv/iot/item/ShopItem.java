package ua.lviv.iot.item;

import ua.lviv.iot.FishingType;

public abstract class ShopItem {

    private String name;
    private String brand;
    private int amount;
    private double price;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopItem shopItem = (ShopItem) o;

        if (amount != shopItem.amount) return false;
        if (Double.compare(shopItem.price, price) != 0) return false;
        if (name != null ? !name.equals(shopItem.name) : shopItem.name != null) return false;
        return brand != null ? brand.equals(shopItem.brand) : shopItem.brand == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + amount;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
