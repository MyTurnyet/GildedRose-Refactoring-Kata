package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.windows.BeyondCompare4Reporter;
import org.junit.jupiter.api.Test;


@UseReporter(BeyondCompare4Reporter.class)
public class GildedRoseApprovalTest {

    @Test
    public void foo() {

        Item[] items = new Item[]{new Item("foo", 0, 0), new Item("gaz", 1, 2)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("Items", items);
    }
}
