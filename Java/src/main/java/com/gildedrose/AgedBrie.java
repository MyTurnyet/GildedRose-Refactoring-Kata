package com.gildedrose;

public class AgedBrie extends ShopItem {
    public AgedBrie(Integer sellIn, Integer quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        this.sellIn = this.sellIn - 1;
        if (this.sellIn < 0) {
            this.updateQuality();
        }
    }

    @Override
    public void decrementQuality() {
    }

    @Override
    public void incrementQuality() {
        if (this.quality >= 50) {
            return;
        }
        this.quality = this.quality + 1;
    }

    @Override
    public void updateQuality() {
        incrementQuality();
    }
}
