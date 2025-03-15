package com.cursee.peaceful_hunger;

import com.cursee.peaceful_hunger.core.registry.RegistryFabric;
import net.fabricmc.api.ModInitializer;

public class PeacefulHungerFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        PeacefulHunger.init();
        RegistryFabric.register();
    }
}
