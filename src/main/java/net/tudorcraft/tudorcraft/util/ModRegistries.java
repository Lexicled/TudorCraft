package net.tudorcraft.tudorcraft.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.tudorcraft.tudorcraft.entity.ModEntities;
import net.tudorcraft.tudorcraft.entity.custom.Henry7Entity;
import net.tudorcraft.tudorcraft.entity.custom.Henry8Entity;

public class ModRegistries {
    public static void registerEverything() {
        registerAttributes();

    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.HENRY_VII, Henry7Entity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.HENRY_VIII, Henry8Entity.setAttributes());
    }
}
