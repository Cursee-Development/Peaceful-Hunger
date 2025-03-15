package com.cursee.peaceful_hunger;

import net.minecraft.resources.ResourceLocation;

public class PeacefulHunger {

    public static void init() {}

    public static ResourceLocation identifier(String value) {
        return new ResourceLocation(Constants.MOD_ID, value);
    }
}