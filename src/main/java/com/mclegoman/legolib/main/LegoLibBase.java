package com.mclegoman.legolib.main;

import com.mclegoman.legolib.main.data.LegoLibBaseData;
import com.mclegoman.legolib.main.util.logger.LegoLibBaseLoggerHelper;
import com.mclegoman.legolib.main.util.logger.LegoLibBaseLoggerType;
import com.mclegoman.legolib.main.util.registry.LegoLibBaseRegistryHelper;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BannerPatternTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.ArrayList;

public class LegoLibBase implements ModInitializer {
	@Override
	public void onInitialize() {
		LegoLibBaseLoggerHelper.sendLog(LegoLibBaseLoggerType.INFO, ("Initializing " + LegoLibBaseData.NAME));

		//TEST
		BlockSetType BST = LegoLibBaseRegistryHelper.register("blue", BlockSoundGroup.METAL, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON);
		WoodType WT = LegoLibBaseRegistryHelper.register("blue", BST);
		ArrayList<Block> BLUE_WOODSET_BLOCKS = LegoLibBaseRegistryHelper.register("legolib", (SaplingGenerator) null, true ,WT, true);
		ArrayList<Item> BLUE_WOODSET_ITEMS = LegoLibBaseRegistryHelper.register("legolib", WT, BLUE_WOODSET_BLOCKS);
	}
}