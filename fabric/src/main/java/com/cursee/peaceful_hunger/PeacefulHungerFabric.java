package com.cursee.peaceful_hunger;

import com.cursee.peaceful_hunger.core.registry.RegistryFabric;
import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;

public class PeacefulHungerFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        PeacefulHunger.init();
        Sailing.register(Constants.MOD_ID, Constants.MOD_NAME, Constants.MOD_VERSION, Constants.MOD_PUBLISHER, Constants.MOD_URL);
        RegistryFabric.register();
    }
}
