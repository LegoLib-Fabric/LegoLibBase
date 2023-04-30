package com.mclegoman.legolibbase.main;

import com.mclegoman.legolibbase.main.data.LegoLibBaseData;
import com.mclegoman.legolibbase.main.util.logger.LegoLibBaseLoggerHelper;
import com.mclegoman.legolibbase.main.util.logger.LegoLibBaseLoggerType;
import net.fabricmc.api.ModInitializer;

public class LegoLibBase implements ModInitializer {
	@Override
	public void onInitialize() {
		LegoLibBaseLoggerHelper.sendLog(LegoLibBaseLoggerType.INFO, ("Initializing " + LegoLibBaseData.NAME));
	}
}
