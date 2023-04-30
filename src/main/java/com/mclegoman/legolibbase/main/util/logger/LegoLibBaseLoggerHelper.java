package com.mclegoman.legolibbase.main.util.logger;

import com.mclegoman.legolibbase.main.data.LegoLibBaseData;

public class LegoLibBaseLoggerHelper {
    public static void sendLog(LegoLibBaseLoggerType loggerType, String log) {
        String MESSAGE = LegoLibBaseData.PREFIX + log;
        if (loggerType.equals(LegoLibBaseLoggerType.INFO)) LegoLibBaseData.LOGGER.info(MESSAGE);
        if (loggerType.equals(LegoLibBaseLoggerType.WARNING)) LegoLibBaseData.LOGGER.warn(MESSAGE);
        if (loggerType.equals(LegoLibBaseLoggerType.ERROR)) LegoLibBaseData.LOGGER.error(MESSAGE);
    }
}
