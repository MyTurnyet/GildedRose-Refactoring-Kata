package com.gildedrose;

public class BackstagePasses extends ShopItem {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateSellIn() {
        this.sellIn = this.sellIn - 1;
        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }

    @Override
    public void decrementQuality() {
    }

    @Override
    public void incrementQuality() {
        incrementQualityIfNotOver50();
        if (this.sellIn < 11) {
            incrementQualityIfNotOver50();
        }

        if (this.sellIn < 6) {
            incrementQualityIfNotOver50();
        }
    }

    @Override
    public void updateQuality() {

        incrementQuality();
    }

    private void incrementQualityIfNotOver50() {
        if (this.quality >= 50) {
            return;
        }
        this.quality = this.quality + 1;
    }
}
