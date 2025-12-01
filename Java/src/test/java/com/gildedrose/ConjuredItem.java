package com.gildedrose;

public class ConjuredItem extends NormalItem {
    public ConjuredItem(String name, Integer sellIn, Integer quality) {
        super(name,sellIn,quality);
    }

    @Override
    void updateQuality() {
        decrementQuality();
        decrementQuality();
    }
    
}
