package com.bluedragonflyer.cibus.food;

import com.bluedragonflyer.cibus.Cibus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Battered_Fish extends Item {
    public Battered_Fish() {
        super(new Properties()
                .tab(Cibus.TAB)
                .food(new Food.Builder()
                        .nutrition(6)
                        .saturationMod((float) 2)
                        .effect(new EffectInstance(Effects.CONFUSION, 150, 1),1f)
                        .build())
        );
    }
}


