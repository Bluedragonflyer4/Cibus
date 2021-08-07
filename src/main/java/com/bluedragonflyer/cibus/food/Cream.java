package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Cream extends Item {
    public Cream() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(2)
                        .saturationMod(4)
                        .build())
                .stacksTo(1)
        );
    }
}
