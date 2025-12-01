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

    @Override
    public void incrementQuality() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }
}
