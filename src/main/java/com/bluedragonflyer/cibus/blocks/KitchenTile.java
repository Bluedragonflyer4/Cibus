package com.bluedragonflyer.cibus.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class KitchenTile extends Block {
    public KitchenTile() {
        super(Properties.of(Material.STONE)
                .harvestLevel(1)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .strength(6)
                .requiresCorrectToolForDrops());


    }



}

