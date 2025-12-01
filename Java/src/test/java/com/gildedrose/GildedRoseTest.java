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
                    Item item = createItem(name, sellIn, quality);
                    Item[] itemArray = new Item[]{item};
                    GildedRose app = new GildedRose(itemArray);
                    app.updateQuality();
                    return item.toString();
                }, names, sellInValues, qualityValues);
    }

    private static Item createItem(String name, Integer sellIn, Integer quality) {
        if(name.equals("Aged Brie")){
            return new AgedBrie( sellIn, quality);
        }
        if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            BackstagePasses backstagePasses = new BackstagePasses(sellIn, quality);
            return backstagePasses;
        }
        return new Item(name, sellIn, quality);
    }

}
