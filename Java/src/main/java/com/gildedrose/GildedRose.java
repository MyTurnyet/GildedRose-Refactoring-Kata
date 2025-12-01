package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    ShopItem[] items;

    public GildedRose(ShopItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(ShopItem::processUpdate);
    }
}
