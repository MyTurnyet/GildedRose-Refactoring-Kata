package com.gildedrose;

public class AgedBrie extends ShopItem{
    public AgedBrie(Integer sellIn, Integer quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void decrementSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    @Override
    public void decrementQuality() {
    }
}
