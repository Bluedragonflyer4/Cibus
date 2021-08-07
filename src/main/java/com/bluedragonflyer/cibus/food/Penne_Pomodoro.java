package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Penne_Pomodoro extends Item {
    public Penne_Pomodoro() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(4)
                        .saturationMod((float) 1.2)
                        .build())
        );
    }
}