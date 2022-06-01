package net.tudorcraft.tudorcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tudorcraft.tudorcraft.TudorCraft;

public class ModBlocks {

    public static final PillarBlock THATCH_BLOCK = registerPillarBlock("thatch_block", new PillarBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.5f).sounds(BlockSoundGroup.GRASS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLACK_OAK_LOG = registerBlock("black_oak_log", new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block WHITE_OAK_LOG = registerBlock("white_oak_log", new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).sounds(BlockSoundGroup.WOOD)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TudorCraft.MOD_ID, name), block);
    }

    private static PillarBlock registerPillarBlock(String name, PillarBlock block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TudorCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TudorCraft.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        TudorCraft.LOGGER.info("Loading blocks for " + TudorCraft.MOD_NAME + "!");
    }
}
