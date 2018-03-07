package ua.lviv.iot;


import org.junit.Test;
import ua.lviv.iot.item.ShopItem;
import ua.lviv.iot.item.rod.AutumnRod;
import ua.lviv.iot.item.rod.SpringRod;
import ua.lviv.iot.item.rod.SummerRod;
import ua.lviv.iot.item.rod.WinterRod;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static ua.lviv.iot.FishingType.SUMMER;
import static ua.lviv.iot.FishingType.WINTER;

public class FishingShopTest {
    @Test
    public void testSortByPrice() throws Exception {
        List<ShopItem> testList = new ArrayList<>();
        testList.add(new SummerRod("TestRodName", "TestBrand", 32, 123));
        testList.add(new SummerRod("TestRodName", "TestBrand", 32, 163));
        testList.add(new SummerRod("TestRodName", "TestBrand", 32, 63));
        testList.add(new SummerRod("TestRodName", "TestBrand", 32, 363));
        List<ShopItem> expectedList = new ArrayList<>();
        expectedList.add(new SummerRod("TestRodName", "TestBrand", 32, 63));
        expectedList.add(new SummerRod("TestRodName", "TestBrand", 32, 123));
        expectedList.add(new SummerRod("TestRodName", "TestBrand", 32, 163));
        expectedList.add(new SummerRod("TestRodName", "TestBrand", 32, 363));
        testList = new FishingShop().sortByPrice(testList);
        assertTrue(expectedList.equals(testList));
    }

    @Test
    public void testFindByGroup() throws Exception {

        List<ShopItem> testList = new ArrayList<>();

        testList.add(new WinterRod("TestRodName", "TestBrand", 32, 123));
        testList.add(new SummerRod("TestRodName", "TestBrand", 32, 163));
        testList.add(new AutumnRod("TestRodName", "TestBrand", 32, 63));
        testList.add(new SpringRod("TestRodName", "TestBrand", 32, 363));

        FishingShop fishingShop = new FishingShop();

        fishingShop.setGoodList(testList);
        fishingShop.findByGroup(SUMMER);

        List<ShopItem> expectedList = new ArrayList<>();
        expectedList.add(new WinterRod("TestRodName", "TestBrand", 32, 123));
        expectedList.add(new SummerRod("TestRodName", "TestBrand", 32, 163));



        assertTrue(expectedList.equals(fishingShop.findByGroup(SUMMER)));









    }

    @Test
    public void testGetGoodList() throws Exception {
    }

    @Test
    public void testSetGoodList() throws Exception {
    }

    @Test
    public void testAddGoods() throws Exception {
        FishingShop fishingShop = new FishingShop();
        fishingShop.addGoods(new SummerRod("TestRodName", "TestBrand", 32, 163));
        assertEquals(new SummerRod("TestRodName", "TestBrand", 32, 163), fishingShop.getGoodList().get(0));
    }

}