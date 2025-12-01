package com.gildedrose;

public class NormalItem extends ShopItem {
    public NormalItem(String name, Integer sellIn, Integer quality) {
        super(name, sellIn, quality);
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
        if (this.quality <= 0) {
            return;
        }
        this.quality = this.quality - 1;
    }

    @Override
     void incrementQuality() {
    }

    @Override
     void updateQuality() {
        decrementQuality();
    }
}
