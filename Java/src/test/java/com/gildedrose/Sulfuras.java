package com.gildedrose;

public class Sulfuras extends ShopItem {
    public Sulfuras(Integer sellIn, Integer quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void decrementSellIn() {
    }

    @Override
    public void decrementQuality() {
    }

    @Override
    public void incrementQuality() {
    }

    @Override
    public void updateQuality() {
    }
}
