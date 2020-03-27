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
        sellIn--;
    }
}
