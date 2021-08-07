package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Apple_Slice extends Item {
    public Apple_Slice() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(2)
                        .saturationMod((float) 1.2)
                        .build())
        );
    }
}


