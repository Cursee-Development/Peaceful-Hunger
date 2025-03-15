package com.cursee.peaceful_hunger;

import com.cursee.peaceful_hunger.core.registry.RegistryForge;
import com.cursee.monolib.core.sailing.Sailing;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class PeacefulHungerForge {

    public static IEventBus EVENT_BUS = null;
    
    public PeacefulHungerForge() {
        PeacefulHunger.init();
        Sailing.register(Constants.MOD_ID, Constants.MOD_NAME, Constants.MOD_VERSION, Constants.MOD_PUBLISHER, Constants.MOD_URL);
        PeacefulHungerForge.EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryForge.register(PeacefulHungerForge.EVENT_BUS);
    }
}