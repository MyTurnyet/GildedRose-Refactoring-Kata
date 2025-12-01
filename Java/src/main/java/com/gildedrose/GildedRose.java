package com.gildedrose;

class GildedRose {
    ShopItem[] items;

    public GildedRose(ShopItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (ShopItem item : items) {
            item.updateQuality();

            item.decrementSellIn();

            if (item.sellIn < 0) {
                    item.updateQuality();
            }
        }
    }
}
