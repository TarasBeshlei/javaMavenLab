package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;




public final class FishingShop {

    private String shopName;
    private String address;
    private String workingHours;


    private List<ShopItem> goodList = new LinkedList<>();


    public FishingShop() {
    }

    public FishingShop(final String shopName, final String address,
                       final String workingHours,
                       final LinkedList<ShopItem> goodList) {

        setShopName(shopName);
        setAddress(address);
        setWorkingHours(workingHours);
        setGoodList(goodList);


    }

    public List<ShopItem> sortByPrice(final List<ShopItem> result) {
        result.sort(Comparator.comparing(ShopItem::getPrice));
        return result;
    }

    public List<ShopItem> findByGroup(final FishingType goodsType) {
        List<ShopItem> result = new LinkedList<>();
        goodList.stream().filter((goodList) ->
                ((goodList.getFishingtype() == goodsType
                ))).forEachOrdered((goodList) -> {
            result.add(goodList);
        });
        return result;
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(final String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(final String workingHours) {
        this.workingHours = workingHours;
    }

    public List<ShopItem> getGoodList() {
        return goodList;
    }

    public void setGoodList(final List<ShopItem> goodList) {
        this.goodList = goodList;
    }

    public void addGoods(final ShopItem goods) {
        this.goodList.add(goods);
    }
}


