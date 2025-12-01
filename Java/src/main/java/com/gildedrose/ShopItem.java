package com.gildedrose;

public abstract class ShopItem extends Item {
    public ShopItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    abstract void updateSellIn();

    abstract void decrementQuality();

    abstract void incrementQuality();

    abstract void updateQuality();

    public void processUpdate() {
        this.updateQuality();
        this.updateSellIn();
    }
}
