package com.mclegoman.legolib.main;

import com.mclegoman.legolib.main.data.LegoLibBaseData;
import com.mclegoman.legolib.main.util.logger.LegoLibBaseLoggerHelper;
import com.mclegoman.legolib.main.util.logger.LegoLibBaseLoggerType;
import net.fabricmc.api.ModInitializer;

public class LegoLibBase implements ModInitializer {
	@Override
	public void onInitialize() {
		LegoLibBaseLoggerHelper.sendLog(LegoLibBaseLoggerType.INFO, ("Initializing " + LegoLibBaseData.NAME));
	}
}
