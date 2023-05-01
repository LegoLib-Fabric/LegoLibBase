package com.mclegoman.legolib.main.data;

import com.mclegoman.legolib.main.util.code_type.LegoLibBaseCodeType;
import com.mclegoman.legolib.main.util.development_type.LegoLibBaseDevelopmentType;
import com.mclegoman.legolib.main.util.development_type.LegoLibBaseDevelopmentTypeHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegoLibBaseData {
    public static final String LEGOLIB;
    public static final Text LEGOLIB_TEXT;
    public static final String NAME;
    public static final Text NAME_TEXT;
    public static final String ID;
    public static final String VERSION;
    public static final LegoLibBaseDevelopmentType DEVELOPMENT_TYPE;
    public static final int BUILD;
    public static final String VERSION_ID;
    public static final String PREFIX;
    public static final Logger LOGGER;
    public static final ModContainer CONTAINER;

    static {
        LEGOLIB = "LegoLib";
        LEGOLIB_TEXT = Text.translatable("legolib.name");
        NAME = LEGOLIB + ": Base";
        NAME_TEXT = Text.translatable("legolib.base.name", LEGOLIB_TEXT);
        ID = "legolibbase";
        VERSION = "1.0.0";
        DEVELOPMENT_TYPE = LegoLibBaseDevelopmentType.ALPHA;
        BUILD = 4;
        VERSION_ID = VERSION + "-" + LegoLibBaseDevelopmentTypeHelper.getDevelopmentTypeString(DEVELOPMENT_TYPE, LegoLibBaseCodeType.SHORT_CODE) + "." + BUILD;
        PREFIX = "[" + NAME + " " + VERSION_ID + "] ";
        LOGGER = LoggerFactory.getLogger(ID);
        CONTAINER = FabricLoader.getInstance().getModContainer(ID).get();
    }
}