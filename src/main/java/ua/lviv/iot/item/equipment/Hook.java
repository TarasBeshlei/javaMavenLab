package ua.lviv.iot.item.equipment;

import ua.lviv.iot.FishingType;
import ua.lviv.iot.item.ShopItem;

public class Hook extends ShopItem {

     final FishingType fishingtype = FishingType.AUTUMN;

    public Hook(final String name, final String brand,
            final int amount, final int price) {
        super(name, brand, amount, price);

    }

    public FishingType getFishingtype() {
        return fishingtype;
    }
}