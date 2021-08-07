package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Bread_crumbs extends Item {
    public Bread_crumbs() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(1)
                        .saturationMod(1)
                        .build())
        );
    }
}
