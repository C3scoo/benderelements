package com.cesco.blendmod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(BlendMod.MODID)
public class BlendMod
{
    public static final String MODID = "blendmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlendMod(IEventBus modEventBus)
    {
        modEventBus.addListener(this::clientSetup);
        NeoForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        LOGGER.info("Inizializzazione del client BlendMod");
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
    }
}