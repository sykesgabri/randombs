package com.gabrielsykes.randombs;

import com.gabrielsykes.randombs.block.ModBlocks;
import com.gabrielsykes.randombs.item.ModItemGroups;
import com.gabrielsykes.randombs.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomBS implements ModInitializer {
	public static final String MOD_ID = "randombs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Oi mate am in yer logs!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}