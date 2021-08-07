package com.bluedragonflyer.cibus;


import com.bluedragonflyer.cibus.events.ClientEventBusSubscriber;
import com.bluedragonflyer.cibus.util.RegistryHandler;
import com.bluedragonflyer.cibus.world.gen.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("cibus")
public class Cibus
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cibus";

    public Cibus() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

       RegistryHandler.init();

       MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
       MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){

    }
    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("cibusTab"){



        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.APPLE_SLICE.get());
        }

};




}
