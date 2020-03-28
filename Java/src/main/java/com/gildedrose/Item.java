package com.gildedrose;

public class Item implements StoreItem
{

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality)
    {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString()
    {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void decrementQuality()
    {
        if (quality < 1) return;
        if (name.equals("Sulfuras, Hand of Ragnaros")) return;
        if (name.equals("Aged Brie")) return;
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) return;
        quality--;
    }

    public void decrementSellIn()
    {
        if (name.equals("Sulfuras, Hand of Ragnaros")) return;
        sellIn--;
        if (sellIn < 0)
        {
            if (name.equals("Aged Brie")) incrementQuality();
            if (name.equals("Backstage passes to a TAFKAL80ETC concert"))
            {
                quality = 0;
            }
            decrementQuality();
        }
    }

    public void incrementQuality()
    {
        if (!name.equals("Aged Brie") && !name.equals("Backstage passes to a TAFKAL80ETC concert")) return;
        if (quality >= 50) return;
        quality++;
        if (name.equals("Backstage passes to a TAFKAL80ETC concert"))
        {
            if (sellIn < 11)
            {
                quality++;
            }
            if (sellIn < 6)
            {
                quality++;
            }
        }
    }
}
