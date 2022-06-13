package net.tudorcraft.tudorcraft;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.tudorcraft.tudorcraft.block.ModBlocks;
import net.tudorcraft.tudorcraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.tudorcraft.tudorcraft.util.ModRegistries;
import net.tudorcraft.tudorcraft.world.feature.ModConfiguredFeatures;
import net.tudorcraft.tudorcraft.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class TudorCraft implements ModInitializer {
	public static final String MOD_ID = "tudorcraft";
	public static final String MOD_NAME = "Tudor Craft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item[] VANILLA_FOOD_ITEMS = {
			Items.APPLE,
			Items.BAKED_POTATO,
			Items.BEEF,
			Items.BEETROOT,
			Items.BEETROOT_SOUP,
			Items.BREAD,
			Items.CARROT,
			Items.CHICKEN,
			Items.CHORUS_FRUIT,
			Items.COD,
			Items.COOKED_BEEF,
			Items.COOKED_CHICKEN,
			Items.COOKED_COD,
			Items.COOKED_MUTTON,
			Items.COOKED_PORKCHOP,
			Items.COOKED_RABBIT,
			Items.COOKED_SALMON,
			Items.COOKIE,
			Items.DRIED_KELP,
			Items.ENCHANTED_GOLDEN_APPLE,
			Items.GOLDEN_APPLE,
			Items.GOLDEN_CARROT,
			Items.HONEY_BOTTLE,
			Items.MELON_SLICE,
			Items.MUSHROOM_STEW,
			Items.MUTTON,
			Items.POISONOUS_POTATO,
			Items.PORKCHOP,
			Items.POTATO,
			Items.PUFFERFISH,
			Items.PUMPKIN_PIE,
			Items.RABBIT,
			Items.RABBIT_STEW,
			Items.ROTTEN_FLESH,
			Items.SALMON,
			Items.SPIDER_EYE,
			Items.SUSPICIOUS_STEW,
			Items.SWEET_BERRIES,
			Items.GLOW_BERRIES,
			Items.TROPICAL_FISH
	};

	public static final Item[] MOD_FOOD_ITEMS = {
			ModItems.SUGAR_BOWL,
			ModItems.VEGETABLE_STEW
	};

	public static final Item[] ALL_FOOD_ITEMS = {
			Items.APPLE,
			Items.BAKED_POTATO,
			Items.BEEF,
			Items.BEETROOT,
			Items.BEETROOT_SOUP,
			Items.BREAD,
			Items.CARROT,
			Items.CHICKEN,
			Items.CHORUS_FRUIT,
			Items.COD,
			Items.COOKED_BEEF,
			Items.COOKED_CHICKEN,
			Items.COOKED_COD,
			Items.COOKED_MUTTON,
			Items.COOKED_PORKCHOP,
			Items.COOKED_RABBIT,
			Items.COOKED_SALMON,
			Items.COOKIE,
			Items.DRIED_KELP,
			Items.ENCHANTED_GOLDEN_APPLE,
			Items.GOLDEN_APPLE,
			Items.GOLDEN_CARROT,
			Items.HONEY_BOTTLE,
			Items.MELON_SLICE,
			Items.MUSHROOM_STEW,
			Items.MUTTON,
			Items.POISONOUS_POTATO,
			Items.PORKCHOP,
			Items.POTATO,
			Items.PUFFERFISH,
			Items.PUMPKIN_PIE,
			Items.RABBIT,
			Items.RABBIT_STEW,
			Items.ROTTEN_FLESH,
			Items.SALMON,
			Items.SPIDER_EYE,
			Items.SUSPICIOUS_STEW,
			Items.SWEET_BERRIES,
			ModItems.SUGAR_BOWL,
			Items.GLOW_BERRIES,
			Items.TROPICAL_FISH,
			ModItems.VEGETABLE_STEW
	};


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerEverything();
		ModWorldGen.generateModWorldGen();
		GeckoLib.initialize();
	}
}
