package com.gildedrose;

public abstract class ShopItem extends Item {
    public ShopItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void updateSellIn();

    public abstract void decrementQuality();

    public abstract void incrementQuality();

    public abstract void updateQuality();
}
