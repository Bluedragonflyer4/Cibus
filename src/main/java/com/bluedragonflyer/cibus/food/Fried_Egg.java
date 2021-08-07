package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Fried_Egg extends Item {
    public Fried_Egg() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(5)
                        .saturationMod((float)1)
                        .build())
        );
    }
}
