package com.cursee.peaceful_hunger;

import com.cursee.peaceful_hunger.core.registry.RegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class PeacefulHungerForge {

    public static IEventBus EVENT_BUS = null;
    
    public PeacefulHungerForge(FMLJavaModLoadingContext context) {
        PeacefulHunger.init();
        PeacefulHungerForge.EVENT_BUS = context.getModEventBus();
        RegistryForge.register(PeacefulHungerForge.EVENT_BUS);
    }
}