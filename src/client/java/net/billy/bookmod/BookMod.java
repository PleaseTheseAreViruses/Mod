package net.billy.bookmod;

import net.billy.bookmod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BookMod implements ModInitializer {
	public static final String MOD_ID = "bookmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}