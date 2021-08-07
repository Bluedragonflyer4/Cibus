package com.bluedragonflyer.cibus.events;


import com.bluedragonflyer.cibus.Cibus;
import com.bluedragonflyer.cibus.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Cibus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber{

    @SubscribeEvent
    public <FMLClientSetup> void clientsetup(FMLClientSetup event){
        RenderTypeLookup.setRenderLayer(RegistryHandler.TOMATO_PLANT.get(), RenderType.cutout());
    }
}



