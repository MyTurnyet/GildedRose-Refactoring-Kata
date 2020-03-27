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
}
