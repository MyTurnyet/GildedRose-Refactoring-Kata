package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTests
{
    @Test
    public void should_override_toString_Correctly()
    {
        //assign
        Item item = new Item("Foo", 22, 14);
        //act
        //assert
        assertEquals("" + item, "Foo, 22, 14");
    }

    @Test
    public void should_DecrementQuality_By_One()
    {
        //assign
        Item item = new Item("Foo", 22, 14);

        //act
        item.decrementQuality();

        //assert
        assertEquals(item.quality, 13);
    }

    @Test
    public void should_Not_DecrementQuality_If_Sulfuras()
    {
        //assign
        Item item = new Item("Sulfuras, Hand of Ragnaros", 22, 10);

        //act
        item.decrementQuality();

        //assert
        assertEquals(item.quality, 10);
    }

    @Test
    public void should_Not_DecrementQuality_If_AgedBrie()
    {
        //assign
        Item item = new Item("Aged Brie", 22, 21);

        //act
        item.decrementQuality();

        //assert
        assertEquals(item.quality, 21);
    }

    @Test
    public void should_Not_DecrementQuality_If_BackstagePasses()
    {
        //assign
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 22, 13);

        //act
        item.decrementQuality();

        //assert
        assertEquals(item.quality, 13);
    }

    @Test
    public void should_Not_DecrementQuality_Below_Zero()
    {
        //assign
        Item item = new Item("Foo", 22, 0);

        //act
        item.decrementQuality();

        //assert
        assertEquals(item.quality, 0);
    }

    @Test
    public void should_DecrementSellIn_By_One()
    {
        //assign
        Item item = new Item("Foo", 13, 0);

        //act
        item.decrementSellIn();

        //assert
        assertEquals(item.sellIn, 12);
    }

    @Test
    public void should_DecrementQuality_By_One_IfSellIn_Passed()
    {
        //assign
        Item item = new Item("Foo", 0, 12);

        //act
        item.decrementSellIn();

        //assert
        assertEquals(item.sellIn, -1);
        assertEquals(item.quality, 11);
    }

    @Test
    public void should_SetQuality_ToZero_WheSellDatePassed_ForBackstageTickets()
    {
        //assign
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 13);

        //act
        item.decrementSellIn();

        //assert
        assertEquals(item.sellIn, -1);
        assertEquals(item.quality, 0);
    }

    @Test
    public void should_IncrementQuality_By_One_ForAgedBrie()
    {
        //assign
        Item item = new Item("Aged Brie", 13, 23);

        //act
        item.incrementQuality();
        //assert
        assertEquals(item.quality, 24);
    }

    @Test
    public void should_IncrementQuality_By_Two_ForAgedBrie_WhenSellIn_Passed()
    {
        //assign
        Item item = new Item("Aged Brie", 0, 14);

        //act
        item.decrementSellIn();
        //assert
        assertEquals(15, item.quality);
    }

    @Test
    public void should_IncrementQuality_By_One_ForBackstagePasses()
    {
        //assign
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 28, 36);

        //act
        item.incrementQuality();
        //assert
        assertEquals(item.quality, 37);
    }

    @Test
    public void should_Not_IncrementQuality_ForRegularItems()
    {
        //assign
        Item item = new Item("Not special", 13, 23);

        //act
        item.incrementQuality();
        //assert
        assertEquals(item.quality, 23);
    }

    @Test
    public void should_Not_IncrementQuality_AboveFifty()
    {
        //assign
        Item item = new Item("Aged Brie", 13, 50);

        //act
        item.incrementQuality();
        //assert
        assertEquals(item.quality, 50);
    }

    @Test
    public void should_IncrementQuality_ByTwo_WhenBackStagePasses_SellIn_LessThanEleven()
    {
        //assign
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 36);

        //act
        item.incrementQuality();
        //assert
        assertEquals(38, item.quality);

    }

    @Test
    public void should_IncrementQuality_ByTwo_WhenBackStagePasses_SellIn_LessThanSix()
    {
        //assign
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 36);

        //act
        item.incrementQuality();
        //assert
        assertEquals(39, item.quality);

    }
}
