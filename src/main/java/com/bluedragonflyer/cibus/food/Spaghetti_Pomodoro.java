package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Spaghetti_Pomodoro extends Item {
    public Spaghetti_Pomodoro() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(4)
                        .saturationMod((float) 0.8)
                        .build())
        );
    }
}