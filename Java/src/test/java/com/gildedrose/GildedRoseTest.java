package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {


    @Test
    void testAllCombinations() {
        String[] names = {
                "Aged Brie",
                
        };
        Integer[] sellInValues = {-1, 0, 2, 6,5,10, 11};
        CombinationApprovals.verifyAllCombinations(
                (name, sellIn) ->
                {
                    Item item = new Item(name, sellIn, 0);
                    Item[] itemArray = new Item[]{item};
                    GildedRose app = new GildedRose(itemArray);
                    app.updateQuality();
                    return String.format("[%s, %d, %d]", item.name, item.sellIn, item.quality);
                }, names, sellInValues);
    }

}
