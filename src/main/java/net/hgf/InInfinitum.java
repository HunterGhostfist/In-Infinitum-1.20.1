package net.hgf;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InInfinitum implements ModInitializer {
	public static final String MOD_ID = "in_infinitum";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}