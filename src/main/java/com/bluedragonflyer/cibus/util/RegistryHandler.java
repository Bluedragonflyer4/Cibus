package com.bluedragonflyer.cibus.util;

import com.bluedragonflyer.cibus.Cibus;
import com.bluedragonflyer.cibus.blocks.*;
import com.bluedragonflyer.cibus.food.*;
import com.bluedragonflyer.cibus.items.*;
import com.bluedragonflyer.cibus.tools.ModItemTier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cibus.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cibus.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> SQUID_INK = ITEMS.register("squid_ink", ItemBase::new);
    public static final RegistryObject<Item> LARGE_BOTTLE = ITEMS.register("large_bottle", ItemBase::new);
    public static final RegistryObject<Item> SUNFLOWER_OIL = ITEMS.register("sunflower_oil", ItemBase::new);
    public static final RegistryObject<Item> BLEACH = ITEMS.register("bleach", ItemBase::new);
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", ItemBase::new);
    public static final RegistryObject<Item> STAINLESS_STEEL = ITEMS.register("stainless_steel", ItemBase::new);
    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon", ItemBase::new);
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", ItemBase::new);
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", ItemBase::new);
    public static final RegistryObject<Item> BAKING_POWDER = ITEMS.register("baking_powder", ItemBase::new);
    public static final RegistryObject<Item> RAW_CHIPS = ITEMS.register("raw_chips", ItemBase::new);
    public static final RegistryObject<Item> RENNET = ITEMS.register("rennet", ItemBase::new);
    public static final RegistryObject<Item> PENNE = ITEMS.register("penne", ItemBase::new);
    public static final RegistryObject<Item> SPAGHETTI = ITEMS.register("spaghetti", ItemBase::new);
    public static final RegistryObject<Item> CARBONARA = ITEMS.register("carbonara", ItemBase::new);
    public static final RegistryObject<Item> POMODORO = ITEMS.register("pomodoro", ItemBase::new);
    public static final RegistryObject<Item> PESTO = ITEMS.register("pesto", ItemBase::new);
    public static final RegistryObject<Item> PENNE_SHAPE = ITEMS.register("penne_shape", ItemBase::new);
    public static final RegistryObject<Item> SPAGHETTI_SHAPE = ITEMS.register("spaghetti_shape", ItemBase::new);
    public static final RegistryObject<Item> BASIL = ITEMS.register("basil", ItemBase::new);


    //Tools
    public static final RegistryObject<SwordItem> KNIFE = ITEMS.register("knife", () ->
            new SwordItem(ModItemTier.STEEL, 2, -2.5F, new Item.Properties().tab(Cibus.TAB).stacksTo(1)));

    //Edibles
    public static final RegistryObject<Chocolate> CHOCOLATE = ITEMS.register("chocolate", Chocolate::new);
    public static final RegistryObject<Apple_Slice> APPLE_SLICE = ITEMS.register("apple_slice", Apple_Slice::new);
    public static final RegistryObject<Item> CHIPS = ITEMS.register("chips", Chips::new);
    public static final RegistryObject<Item> BATTERED_FISH = ITEMS.register("battered_fish", Battered_Fish::new);
    public static final RegistryObject<Item> CHEESE_CURD = ITEMS.register("cheese_curd", Cheese_Curd::new);
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", Cheese::new);
    public static final RegistryObject<Item> CREAM = ITEMS.register("cream", Cream::new);
    public static final RegistryObject<Item> PASTRY = ITEMS.register("pastry", Pastry::new);
    public static final RegistryObject<Item> BREAD_CRUMBS = ITEMS.register("bread_crumbs", Bread_crumbs::new);
    public static final RegistryObject<Item> APPLE_CRUMBLE = ITEMS.register("apple_crumble", Apple_crumble::new);
    public static final RegistryObject<Item> PASTA_DOUGH = ITEMS.register("pasta_dough", Pasta_Dough::new);
    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg", Fried_Egg::new);
    public static final RegistryObject<Item> PENNE_PESTO = ITEMS.register("penne_pesto", Penne_Pesto::new);
    public static final RegistryObject<Item> PENNE_POMODORO = ITEMS.register("penne_pomodoro", Penne_Pomodoro::new);
    public static final RegistryObject<Item> PENNE_CARBONARA = ITEMS.register("penne_carbonara", Penne_Carbonara::new);
    public static final RegistryObject<Item> SPAGHETTI_PESTO = ITEMS.register("spaghetti_pesto", Spaghetti_Pesto::new);
    public static final RegistryObject<Item> SPAGHETTI_POMODORO = ITEMS.register("spaghetti_pomodoro", Spaghetti_Pomodoro::new);
    public static final RegistryObject<Item> SPAGHETTI_CARBONARA = ITEMS.register("spaghetti_carbonara", Spaghetti_Carbonara::new);
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", Tomato::new);

    //Blocks
    public static final RegistryObject<Block> CARBON_ORE_BLOCK = BLOCKS.register("carbon_ore", CarbonOreBlock::new);
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant",TomatoPlant::new);
    public static final RegistryObject<Block> BASIL_PLANT = BLOCKS.register("basil_plant", BasilPlant::new);
    public static final RegistryObject<Block> KITCHEN_TILE = BLOCKS.register("kitchen_tile", KitchenTile::new);
    public static final RegistryObject<Block> FANCY_FLOOR = BLOCKS.register("fancy_floor", FancyFloor::new);
    public static final RegistryObject<Block> COUNTER_LIGHT = BLOCKS.register("counter_light", CounterLight::new);



    //Block Items
    public static final RegistryObject<Item> CARBON_ORE_ITEM = ITEMS.register("carbon_ore", () -> new BlockItemBase(CARBON_ORE_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> TOMATO_SEED = ITEMS.register("tomato_seed", () -> new BlockItemBase(TOMATO_PLANT.get()));
    public static final RegistryObject<Item> BASIL_SEED = ITEMS.register("basil_seed", () -> new BlockItemBase(BASIL_PLANT.get()));
    public static final RegistryObject<Item> KITCHEN_TILE_ITEM = ITEMS.register("kitchen_tile", () -> new BlockItemBase(KITCHEN_TILE.get()));
    public static final RegistryObject<Item> FANCY_FLOOR_ITEM = ITEMS.register("fancy_floor", () -> new BlockItemBase(FANCY_FLOOR.get()));
    public static final RegistryObject<Item> COUNTER_LIGHT_ITEM = ITEMS.register("counter_light", () -> new BlockItemBase(COUNTER_LIGHT.get()));


    
}
