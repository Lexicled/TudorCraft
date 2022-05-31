package net.epictudormod.epictudormod;

import net.epictudormod.epictudormod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpicTudorMod implements ModInitializer {
	public static final String MOD_ID = "epictudormod";
	public static final String MOD_NAME = "Epic Tudor Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
