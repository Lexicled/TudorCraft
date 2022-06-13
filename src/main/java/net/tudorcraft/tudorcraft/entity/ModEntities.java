package net.tudorcraft.tudorcraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.tudorcraft.tudorcraft.entity.custom.Henry7Entity;
import net.tudorcraft.tudorcraft.entity.custom.Henry8Entity;

public class ModEntities {
    public static final EntityType<Henry7Entity> HENRY_VII = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TudorCraft.MOD_ID, "henryvii"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Henry7Entity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2.5f)).build());
    public static final EntityType<Henry8Entity> HENRY_VIII = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TudorCraft.MOD_ID, "henryviii"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Henry8Entity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2.5f)).build());
}
