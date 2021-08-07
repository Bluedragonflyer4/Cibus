package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Apple_crumble extends Item {
    public Apple_crumble() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(8)
                        .saturationMod(4)
                        .build())
                .stacksTo(16)
        );
    }
}
