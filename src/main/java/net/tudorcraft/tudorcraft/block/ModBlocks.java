package net.tudorcraft.tudorcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.tudorcraft.tudorcraft.item.ModItemGroup;

public class ModBlocks {

    public static final PillarBlock THATCH_BLOCK = registerPillarBlock("thatch_block", new PillarBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.5f).sounds(BlockSoundGroup.GRASS)), ModItemGroup.TUDOR);
    public static final Block BLACK_OAK_LOG = registerBlock("black_oak_log", new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.TUDOR);
    public static final Block WHITE_OAK_LOG = registerBlock("white_oak_log", new Block(FabricBlockSettings.of(Material.WOOD).strength(2f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.TUDOR);
    public static final Block LEAD_BLOCK = registerBlock("lead_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).sounds(BlockSoundGroup.METAL).requiresTool()), ModItemGroup.TUDOR);
    public static final Block LEAD_ORE = registerBlock("lead_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(5f).sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.TUDOR);
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(7f).sounds(BlockSoundGroup.STONE).requiresTool()), ModItemGroup.TUDOR);
    public static final Block THATCH_SLAB = registerBlock("thatch_slab", new SlabBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.5f).sounds(BlockSoundGroup.GRASS)), ModItemGroup.TUDOR);
    public static final Block THATCH_STAIRS = registerBlock("thatch_stairs", new StairsBlock(ModBlocks.THATCH_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.5f).sounds(BlockSoundGroup.GRASS)), ModItemGroup.TUDOR);

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
