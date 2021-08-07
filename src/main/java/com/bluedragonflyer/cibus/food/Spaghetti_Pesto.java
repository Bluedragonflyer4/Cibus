package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Spaghetti_Pesto extends Item {
    public Spaghetti_Pesto() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(5)
                        .saturationMod((float) 1)
                        .build())
        );
    }
}