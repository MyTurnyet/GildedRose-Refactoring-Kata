package com.gildedrose;

class GildedRose {
    ShopItem[] items;

    public GildedRose(ShopItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (ShopItem item : items) {
            if (item.name.equals("Aged Brie")) {
                item.incrementQuality();
            } else {
                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;

                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                } else {
                    item.decrementQuality();
                }
            }

            item.decrementSellIn();

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    item.incrementQuality();
                } else {
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        item.quality = 0;
                    } else {
                        item.decrementQuality();
                    }
                }
            }
        }
    }
}
