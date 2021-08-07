package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pasta_Dough extends Item {
    public Pasta_Dough() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(1)
                        .saturationMod((float)0.2)
                        .build())
        );
    }
}



