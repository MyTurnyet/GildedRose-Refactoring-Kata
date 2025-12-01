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

                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    item.quality = 0;
                } else {
                    item.updateQuality();
                }
            }
        }
    }
}
