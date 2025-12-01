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
        CombinationApprovals.verifyAllCombinations(
                (name) ->
                {
                    Item item = new Item(name, 0, 0);
                    Item[] itemArray = new Item[]{item};
                    GildedRose app = new GildedRose(itemArray);
                    app.updateQuality();
                    return String.format("[%s, %d, %d]", item.name, item.sellIn, item.quality);
                }, names);
    }

}
