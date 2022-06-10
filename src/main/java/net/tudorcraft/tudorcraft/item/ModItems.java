package net.tudorcraft.tudorcraft.item;

import net.minecraft.item.SpawnEggItem;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tudorcraft.tudorcraft.entity.ModEntities;

public class ModItems {
    public static final Item STRAW = registerItem("straw", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR)));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR)));

    // public static final Item HENRY_VII_SPAWN_EGG = registerItem("henry_vii_spawn_egg",
    //        new SpawnEggItem(ModEntities.HENRY_VII,0xE89B44, 0x7A2D1B,
    //                new FabricItemSettings().group(ModItemGroup.TUDOR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TudorCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TudorCraft.LOGGER.info("Loading items for " + TudorCraft.MOD_NAME + "!");
    }


}
