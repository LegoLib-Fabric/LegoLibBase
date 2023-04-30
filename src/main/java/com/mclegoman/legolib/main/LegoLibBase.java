package com.mclegoman.legolib.main;

import com.mclegoman.legolib.main.data.LegoLibBaseData;
import com.mclegoman.legolib.main.util.logger.LegoLibBaseLoggerHelper;
import com.mclegoman.legolib.main.util.logger.LegoLibBaseLoggerType;
import com.mclegoman.legolib.main.util.registry.LegoLibBaseRegistryHelper;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BannerPatternTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class LegoLibBase implements ModInitializer {
	@Override
	public void onInitialize() {
		LegoLibBaseLoggerHelper.sendLog(LegoLibBaseLoggerType.INFO, ("Initializing " + LegoLibBaseData.NAME));

	}
}