package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest
{

    @Test
    public void should_decrement_SellIn_and_Qualtiy_byOne()
    {
        //assign
        Item[] items = new Item[]{new Item("foo", 13, 32)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(12, items[0].sellIn);
        assertEquals(31, items[0].quality);
    }

    @Test
    public void should_decrement_Quality_twice_whenSellIn_passed()
    {
        //assign
        Item[] items = new Item[]{new Item("foo", 0, 32)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(30, items[0].quality);
    }

    @Test
    public void should_never_decrement_Quality_past_zero()
    {
        //assign
        Item[] items = new Item[]{new Item("foo", 3, 0)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_decrement_SellIn_and_Increment_Qualtiy__ForAgedBrie_byOne()
    {
        //assign
        Item[] items = new Item[]{new Item("Aged Brie", 13, 32)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(12, items[0].sellIn);
        assertEquals(33, items[0].quality);
    }

    @Test
    public void should_never_increment_Quality_aboveFifty()
    {
        //assign
        Item[] items = new Item[]{new Item("Aged Brie", 3, 50)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(50, items[0].quality);
    }

    @Test
    public void should_never_change_sellInOrQuality_forSulfuras()
    {
        //assign
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 55, 66)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(55, items[0].sellIn);
        assertEquals(66, items[0].quality);
    }

    @Test
    public void should_incrementQuality_forBackstagePasses()
    {
        //assign
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert",
                        11, 4)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(10, items[0].sellIn);
        assertEquals(5, items[0].quality);
    }

    @Test
    public void should_incrementQuality_byTwo_forBackstagePasses_WhenLessThan10DaysSellIn()
    {
        //assign
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert",
                        10, 4)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(9, items[0].sellIn);
        assertEquals(6, items[0].quality);
    }

    @Test
    public void should_incrementQuality_byTwo_forBackstagePasses_WhenLessThan10Days_andGreaterThan6()
    {
        //assign
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert",
                        6, 4)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(5, items[0].sellIn);
        assertEquals(6, items[0].quality);
    }

    @Test
    public void should_incrementQuality_byThree_forBackstagePasses_WhenLessThan6DaysSellIn()
    {
        //assign
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert",
                        5, 4)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(4, items[0].sellIn);
        assertEquals(7, items[0].quality);
    }

    @Test
    public void should_incrementQuality_byThree_forBackstagePasses_WhenLessThan6Days_andGreaterThan0()
    {
        //assign
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert",
                        1, 4)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(0, items[0].sellIn);
        assertEquals(7, items[0].quality);
    }

    @Test
    public void should_setQuality_toZero_forBackstagePasses_WhenSellIn_LessThanOne()
    {
        //assign
        Item[] items = new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert",
                        0, 7)};
        GildedRose app = new GildedRose(items);

        //act
        app.updateQuality();

        //assert
        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }
}
