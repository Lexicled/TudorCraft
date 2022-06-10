/*
package net.tudorcraft.tudorcraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.tudorcraft.tudorcraft.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_LEAD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.LEAD_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LEAD_ORE =
            ConfiguredFeatures.register("tudorcraft:lead_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_LEAD_ORES, 10));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + TudorCraft.MOD_ID);
    }
}
*/