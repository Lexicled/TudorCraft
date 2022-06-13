package net.tudorcraft.tudorcraft.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.SpawnEggItem;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tudorcraft.tudorcraft.entity.ModEntities;
import net.tudorcraft.tudorcraft.item.custom.ModArmorItem;

public class ModItems {
    public static final Item STRAW = registerItem("straw", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR)));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR)));
    public static final Item VEGETABLE_STEW = registerItem("vegetable_stew", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR).food(ModFoodComponents.VEGETABLE_STEW)));
    public static final Item SUGAR_BOWL = registerItem("sugar_bowl", new Item(new FabricItemSettings().group(ModItemGroup.TUDOR).food(ModFoodComponents.SUGAR_BOWL)));
    public static final Item LEAD_MAKEUP = registerItem("lead_makeup", new ModArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TUDOR)));

     public static final Item HENRY_VII_SPAWN_EGG = registerItem("henry_vii_spawn_egg",
           new SpawnEggItem(ModEntities.HENRY_VII,0xE89B44, 0x7A2D1B,
                    new FabricItemSettings().group(ModItemGroup.TUDOR)));
    public static final Item HENRY_VIII_SPAWN_EGG = registerItem("henry_viii_spawn_egg",
            new SpawnEggItem(ModEntities.HENRY_VIII,0xe8e4dc, 0xd14949,
                    new FabricItemSettings().group(ModItemGroup.TUDOR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TudorCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TudorCraft.LOGGER.info("Loading items for " + TudorCraft.MOD_NAME + "!");
    }


}
