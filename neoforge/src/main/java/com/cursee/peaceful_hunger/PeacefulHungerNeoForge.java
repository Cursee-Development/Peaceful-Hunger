package com.cursee.peaceful_hunger;

import com.cursee.peaceful_hunger.core.registry.RegistryNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class PeacefulHungerNeoForge {

    public static IEventBus EVENT_BUS = null;

    public PeacefulHungerNeoForge(IEventBus modEventBus) {
        PeacefulHunger.init();
        PeacefulHungerNeoForge.EVENT_BUS = modEventBus;
        RegistryNeoForge.register(PeacefulHungerNeoForge.EVENT_BUS);
    }
}