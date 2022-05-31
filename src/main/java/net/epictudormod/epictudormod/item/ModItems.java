package net.epictudormod.epictudormod.item;

import net.epictudormod.epictudormod.EpicTudorMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item STRAW = registerItem("straw", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EpicTudorMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EpicTudorMod.LOGGER.info("Loading items for " + EpicTudorMod.MOD_NAME + "!");
    }
}
