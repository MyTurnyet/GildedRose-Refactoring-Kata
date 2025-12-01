package com.gildedrose;

public class AgedBrie extends ShopItem {
    public AgedBrie(Integer sellIn, Integer quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
     void updateSellIn() {
        this.sellIn = this.sellIn - 1;
        if (this.sellIn < 0) {
            this.updateQuality();
        }
    }

    @Override
     void decrementQuality() {
    }

    @Override
     void incrementQuality() {
        if (this.quality >= 50) {
            return;
        }
        this.quality = this.quality + 1;
    }

    @Override
     void updateQuality() {
        incrementQuality();
    }
}
