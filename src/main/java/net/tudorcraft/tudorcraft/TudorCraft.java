package net.tudorcraft.tudorcraft;

import net.tudorcraft.tudorcraft.block.ModBlocks;
import net.tudorcraft.tudorcraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.tudorcraft.tudorcraft.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class TudorCraft implements ModInitializer {
	public static final String MOD_ID = "tudorcraft";
	public static final String MOD_NAME = "Tudor Craft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerEverything();
		GeckoLib.initialize();
	}
}
