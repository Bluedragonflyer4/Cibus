package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Penne_Pesto extends Item {
    public Penne_Pesto() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(5)
                        .saturationMod((float) 0.9)
                        .build())
        );
    }
}