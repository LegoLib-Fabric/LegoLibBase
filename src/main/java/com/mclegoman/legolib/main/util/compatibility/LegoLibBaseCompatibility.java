package com.mclegoman.legolib.main.util.compatibility;

import net.fabricmc.loader.api.FabricLoader;

public class LegoLibBaseCompatibility {
    public static final boolean CORE_PROJECT;

    static {
        CORE_PROJECT = FabricLoader.getInstance().getModContainer("thecoreproject").isPresent();
    }
}
