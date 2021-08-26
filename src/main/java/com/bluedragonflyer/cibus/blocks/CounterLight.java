package com.bluedragonflyer.cibus.blocks;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class CounterLight extends Block {

    public CounterLight() {
        super(Properties.of(Material.STONE)
                .harvestLevel(1)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .strength(2)
                .lightLevel(State -> 15)
                .noOcclusion()
                .dynamicShape());
    }

    private static final DirectionProperty FACING = HorizontalBlock.FACING;

    private static final VoxelShape SHAPE_N = VoxelShapes.or(
            Block.box(0, 15, 0, 16, 16, 16),
            Block.box(1, 14, 1, 4, 15, 15),
            Block.box(12, 14, 1, 15, 15, 15)
    .);

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return super.getShape(p_220053_1_, p_220053_2_, p_220053_3_, p_220053_4_);
    }
}

