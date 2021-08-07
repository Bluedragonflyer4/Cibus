package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Chips extends Item {
    public Chips() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(3)
                        .saturationMod((float) 1.4)
                        .effect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 50, 2),1f)
                        .build())
        );
    }
}


