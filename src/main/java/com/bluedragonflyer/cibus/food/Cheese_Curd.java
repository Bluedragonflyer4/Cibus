package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Cheese_Curd extends Item {
    public Cheese_Curd() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(1)
                        .saturationMod(1)
                        .build( ))
        );
    }
}
