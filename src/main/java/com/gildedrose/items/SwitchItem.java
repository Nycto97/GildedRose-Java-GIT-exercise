package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item {

    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn >= 0) {
            if (quality < 50) {
                quality++;
            }
        }
        if (sellIn < 0 && quality > 0) {
            quality--;
        }
    }
}