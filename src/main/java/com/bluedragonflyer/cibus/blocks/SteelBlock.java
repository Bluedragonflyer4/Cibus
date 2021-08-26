package com.bluedragonflyer.cibus.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SteelBlock extends Block {
    public SteelBlock() {
        super(Properties.of(Material.METAL)
                .harvestLevel(1)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .strength(6)
                .requiresCorrectToolForDrops());


    }



}

