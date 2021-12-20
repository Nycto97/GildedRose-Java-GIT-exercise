package com.gildedrose.core;

import com.gildedrose.items.*;

public class ItemFactory {

    private static ItemFactory instance = null;
    private ItemFactory() {}

    public static ItemFactory getInstance() {
        if (instance == null) instance =  new ItemFactory();
        return instance;
    }

    public Item createItem(String name, int sellIn, int quality) throws Exception {
        switch(name) {
            case "+5 Dexterity Vest": return new NormalItem(name, sellIn, quality);
            case "Aged Brie": return new AgingItem(name, sellIn, quality);
            case "Elixir of the Mongoose": return new NormalItem(name, sellIn, quality);
            case "Sulfuras, Hand of Ragnaros": return new LegendaryItem(name, sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert": return new TicketItem(name, sellIn, quality);
            case "Conjured Mana Cake": return new ConjuredItem(name, sellIn, quality);
        }
        throw new Exception("My apologies, but we are not selling this type of item with the name: " + name);
    }
}