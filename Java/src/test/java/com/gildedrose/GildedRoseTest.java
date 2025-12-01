package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {


    @Test
    void testAllCombinations() {
        String[] names = {
                "Aged Brie",
                "Backstage passes to a TAFKAL80ETC concert",
                "Sulfuras, Hand of Ragnaros",
                "Normal Item"
        };
        Integer[] sellInValues = {-1, 0, 2, 6, 5, 10, 11};
        Integer[] qualityValues = {0, 1, 49, 50};
        CombinationApprovals.verifyAllCombinations(
                (name, sellIn, quality) ->
                {
                    ShopItem item = createItem(name, sellIn, quality);
                    ShopItem[] itemArray = new ShopItem[]{item};
                    GildedRose app = new GildedRose(itemArray);
                    app.updateQuality();
                    return item.toString();
                }, names, sellInValues, qualityValues);
    }

    private static ShopItem createItem(String name, Integer sellIn, Integer quality) {
        if(name.equals("Sulfuras, Hand of Ragnaros")){
            return new Sulfuras( sellIn, quality);
        }
        if(name.equals("Aged Brie")){
            return new AgedBrie( sellIn, quality);
        }
        if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            return new BackstagePasses(sellIn, quality);
        }
        return new NormalItem(name, sellIn, quality);
    }

}
