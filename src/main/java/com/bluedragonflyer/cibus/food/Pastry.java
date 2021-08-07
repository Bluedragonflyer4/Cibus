package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pastry extends Item {
    public Pastry() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(2)
                        .saturationMod(1)
                        .build())
        );
    }
}
