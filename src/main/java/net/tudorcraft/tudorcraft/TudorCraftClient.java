package net.tudorcraft.tudorcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.tudorcraft.tudorcraft.entity.ModEntities;
import net.tudorcraft.tudorcraft.entity.client.Henry7Renderer;

public class TudorCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.HENRY_VII, Henry7Renderer::new);
    }
}
