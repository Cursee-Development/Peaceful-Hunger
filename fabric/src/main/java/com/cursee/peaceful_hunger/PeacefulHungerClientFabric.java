package com.cursee.peaceful_hunger;

import net.fabricmc.api.ClientModInitializer;

public class PeacefulHungerClientFabric implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        PeacefulHungerClient.init();
    }
}
