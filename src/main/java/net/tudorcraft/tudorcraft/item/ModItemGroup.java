package net.tudorcraft.tudorcraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tudorcraft.tudorcraft.TudorCraft;

public class ModItemGroup {
    public static final ItemGroup TUDOR = FabricItemGroupBuilder.build( new Identifier(TudorCraft.MOD_ID, "tudor"),
            () -> new ItemStack(ModItems.STRAW));
}
