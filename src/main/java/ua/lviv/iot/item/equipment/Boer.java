package ua.lviv.iot.item.equipment;

import ua.lviv.iot.FishingType;
import ua.lviv.iot.item.ShopItem;

public class Boer extends ShopItem {


    private String size;
    private final FishingType fishingtype = FishingType.WINTER;


    public Boer(final String name, final String brand,
            final int amount, final int price) {
        super(name, brand, amount, price);

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amount = amount;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public FishingType getFishingtype() {
        return fishingtype;
    }


}
