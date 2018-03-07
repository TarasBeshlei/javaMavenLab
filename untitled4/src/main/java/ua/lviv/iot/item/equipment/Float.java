package ua.lviv.iot.item.equipment;

import ua.lviv.iot.FishingType;
import ua.lviv.iot.item.ShopItem;

public class Float extends ShopItem {

    private final FishingType fishingtype = FishingType.SPRING;

    public Float(final String name, final String brand,
            final int amount, final int price){
        super(name, brand, amount, price);
//        this.name = name;
//        this.brand = brand;
//        this.price = price;
//        this.amount = amount;
    }
    public FishingType getFishingtype() {
        return fishingtype;
    }
}
