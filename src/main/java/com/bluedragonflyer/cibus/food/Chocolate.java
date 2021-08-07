package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Chocolate extends Item {
    public Chocolate() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                .nutrition(3)
                .saturationMod(1)
                .build())
                );
    }
}
