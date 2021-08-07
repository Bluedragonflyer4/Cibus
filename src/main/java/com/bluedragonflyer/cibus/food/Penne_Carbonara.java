package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Penne_Carbonara extends Item {
    public Penne_Carbonara() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(6)
                        .saturationMod((float) 0.4)
                        .build())
        );
    }
}