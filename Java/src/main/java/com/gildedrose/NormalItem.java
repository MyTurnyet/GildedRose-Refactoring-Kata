package com.gildedrose;

public class NormalItem extends ShopItem {
    public NormalItem(String name, Integer sellIn, Integer quality) {
        super(name, sellIn, quality);
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
        if (this.quality <= 0) {
            return;
        }
        this.quality = this.quality - 1;
    }

    @Override
    public void incrementQuality() {
    }

    @Override
    public void updateQuality() {
        decrementQuality();
    }
}
