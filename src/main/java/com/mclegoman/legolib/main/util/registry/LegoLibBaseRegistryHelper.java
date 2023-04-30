package com.mclegoman.legolib.main.util.registry;

import net.minecraft.block.Block;
import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.command.argument.serialize.ArgumentSerializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.Schedule;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.passive.CatVariant;
import net.minecraft.entity.passive.FrogVariant;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Instrument;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.entry.LootPoolEntryType;
import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.loot.provider.nbt.LootNbtProviderType;
import net.minecraft.loot.provider.number.LootNumberProviderType;
import net.minecraft.loot.provider.score.LootScoreProviderType;
import net.minecraft.particle.ParticleType;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.stat.StatType;
import net.minecraft.structure.StructurePiece;
import net.minecraft.structure.pool.StructurePoolElementType;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.structure.rule.PosRuleTestType;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.floatprovider.FloatProviderType;
import net.minecraft.util.math.intprovider.IntProviderType;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.PositionSourceType;
import net.minecraft.world.gen.blockpredicate.BlockPredicateType;
import net.minecraft.world.gen.carver.Carver;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.placement.StructurePlacement;
import net.minecraft.world.gen.densityfunction.DensityFunction;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.size.FeatureSizeType;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.heightprovider.HeightProviderType;
import net.minecraft.world.gen.placementmodifier.PlacementModifierType;
import net.minecraft.world.gen.root.RootPlacerType;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.minecraft.world.gen.structure.StructureType;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.minecraft.world.poi.PointOfInterestType;

public class LegoLibBaseRegistryHelper {
    public static Object register(Registry REGISTRY, Identifier ID, Object ENTRY) {
        return Registry.register(REGISTRY, ID, ENTRY);
    }
    public static void register(String NAMESPACE, String ID, GameEvent GAME_EVENT) {
        register(Registries.GAME_EVENT, new Identifier(NAMESPACE, ID), GAME_EVENT);
    }
    public static void register(String NAMESPACE, String ID, SoundEvent SOUND_EVENT) {
        register(Registries.GAME_EVENT, new Identifier(NAMESPACE, ID), SOUND_EVENT);
    }
    public static void register(String NAMESPACE, String ID, Fluid FLUID) {
        register(Registries.FLUID, new Identifier(NAMESPACE, ID), FLUID);
    }
    public static void register(String NAMESPACE, String ID, StatusEffect STATUS_EFFECT) {
        register(Registries.STATUS_EFFECT, new Identifier(NAMESPACE, ID), STATUS_EFFECT);
    }
    public static Block register(String NAMESPACE, String ID, Block BLOCK) {
        return (Block)register(Registries.BLOCK, new Identifier(NAMESPACE, ID), BLOCK);
    }
    public static Enchantment register(String NAMESPACE, String ID, Enchantment ENCHANTMENT) {
        return (Enchantment)register(Registries.ENCHANTMENT, new Identifier(NAMESPACE, ID), ENCHANTMENT);
    }
    public static EntityType register(String NAMESPACE, String ID, EntityType ENTITY_TYPE) {
        return (EntityType)register(Registries.ENTITY_TYPE, new Identifier(NAMESPACE, ID), ENTITY_TYPE);
    }
    public static Item register(String NAMESPACE, String ID, Item ITEM) {
        return (Item)register(Registries.ITEM, new Identifier(NAMESPACE, ID), ITEM);
    }
    public static Potion register(String NAMESPACE, String ID, Potion POTION) {
        return (Potion)register(Registries.POTION, new Identifier(NAMESPACE, ID), POTION);
    }
    public static ParticleType register(String NAMESPACE, String ID, ParticleType PARTICLE_TYPE) {
        return (ParticleType)register(Registries.PARTICLE_TYPE, new Identifier(NAMESPACE, ID), PARTICLE_TYPE);
    }
    public static BlockEntityType register(String NAMESPACE, String ID, BlockEntityType BLOCK_ENTITY_TYPE) {
        return (BlockEntityType)register(Registries.BLOCK_ENTITY_TYPE, new Identifier(NAMESPACE, ID), BLOCK_ENTITY_TYPE);
    }
    public static PaintingVariant register(String NAMESPACE, String ID, PaintingVariant PAINTING_VARIANT) {
        return (PaintingVariant)register(Registries.PAINTING_VARIANT, new Identifier(NAMESPACE, ID), PAINTING_VARIANT);
    }
    public static Identifier register(String NAMESPACE, String ID, Identifier CUSTOM_STAT) {
        return (Identifier)register(Registries.CUSTOM_STAT, new Identifier(NAMESPACE, ID), CUSTOM_STAT);
    }
    public static ChunkStatus register(String NAMESPACE, String ID, ChunkStatus CHUNK_STATUS) {
        return (ChunkStatus)register(Registries.CHUNK_STATUS, new Identifier(NAMESPACE, ID), CHUNK_STATUS);
    }
    public static RuleTest register(String NAMESPACE, String ID, RuleTest RULE_TEST) {
        return (RuleTest)register(Registries.RULE_TEST, new Identifier(NAMESPACE, ID), RULE_TEST);
    }
    public static PosRuleTestType register(String NAMESPACE, String ID, PosRuleTestType POS_RULE_TEST) {
        return (PosRuleTestType)register(Registries.POS_RULE_TEST, new Identifier(NAMESPACE, ID), POS_RULE_TEST);
    }
    public static ScreenHandlerType register(String NAMESPACE, String ID, ScreenHandlerType SCREEN_HANDLER) {
        return (ScreenHandlerType)register(Registries.SCREEN_HANDLER, new Identifier(NAMESPACE, ID), SCREEN_HANDLER);
    }
    public static RecipeType register(String NAMESPACE, String ID, RecipeType RECIPE_TYPE) {
        return (RecipeType)register(Registries.RECIPE_TYPE, new Identifier(NAMESPACE, ID), RECIPE_TYPE);
    }
    public static RecipeSerializer register(String NAMESPACE, String ID, RecipeSerializer RECIPE_SERIALIZER) {
        return (RecipeSerializer)register(Registries.RECIPE_SERIALIZER, new Identifier(NAMESPACE, ID), RECIPE_SERIALIZER);
    }
    public static EntityAttribute register(String NAMESPACE, String ID, EntityAttribute ATTRIBUTE) {
        return (EntityAttribute)register(Registries.ATTRIBUTE, new Identifier(NAMESPACE, ID), ATTRIBUTE);
    }
    public static PositionSourceType register(String NAMESPACE, String ID, PositionSourceType POSITION_SOURCE_TYPE) {
        return (PositionSourceType)register(Registries.POSITION_SOURCE_TYPE, new Identifier(NAMESPACE, ID), POSITION_SOURCE_TYPE);
    }
    public static ArgumentSerializer register(String NAMESPACE, String ID, ArgumentSerializer COMMAND_ARGUMENT_TYPE) {
        return (ArgumentSerializer)register(Registries.COMMAND_ARGUMENT_TYPE, new Identifier(NAMESPACE, ID), COMMAND_ARGUMENT_TYPE);
    }
    public static StatType register(String NAMESPACE, String ID, StatType STAT_TYPE) {
        return (StatType)register(Registries.STAT_TYPE, new Identifier(NAMESPACE, ID), STAT_TYPE);
    }
    public static VillagerType register(String NAMESPACE, String ID, VillagerType VILLAGER_TYPE) {
        return (VillagerType)register(Registries.VILLAGER_TYPE, new Identifier(NAMESPACE, ID), VILLAGER_TYPE);
    }
    public static VillagerProfession register(String NAMESPACE, String ID, VillagerProfession VILLAGER_PROFESSION) {
        return (VillagerProfession)register(Registries.VILLAGER_PROFESSION, new Identifier(NAMESPACE, ID), VILLAGER_PROFESSION);
    }
    public static PointOfInterestType register(String NAMESPACE, String ID, PointOfInterestType POINT_OF_INTEREST_TYPE) {
        return (PointOfInterestType)register(Registries.POINT_OF_INTEREST_TYPE, new Identifier(NAMESPACE, ID), POINT_OF_INTEREST_TYPE);
    }
    public static MemoryModuleType register(String NAMESPACE, String ID, MemoryModuleType MEMORY_MODULE_TYPE) {
        return (MemoryModuleType)register(Registries.MEMORY_MODULE_TYPE, new Identifier(NAMESPACE, ID), MEMORY_MODULE_TYPE);
    }
    public static SensorType register(String NAMESPACE, String ID, SensorType SENSOR_TYPE) {
        return (SensorType)register(Registries.SENSOR_TYPE, new Identifier(NAMESPACE, ID), SENSOR_TYPE);
    }
    public static Schedule register(String NAMESPACE, String ID, Schedule SCHEDULE) {
        return (Schedule)register(Registries.SCHEDULE, new Identifier(NAMESPACE, ID), SCHEDULE);
    }
    public static Activity register(String NAMESPACE, String ID, Activity ACTIVITY) {
        return (Activity)register(Registries.ACTIVITY, new Identifier(NAMESPACE, ID), ACTIVITY);
    }
    public static LootPoolEntryType register(String NAMESPACE, String ID, LootPoolEntryType LOOT_POOL_ENTRY_TYPE) {
        return (LootPoolEntryType)register(Registries.LOOT_POOL_ENTRY_TYPE, new Identifier(NAMESPACE, ID), LOOT_POOL_ENTRY_TYPE);
    }
    public static LootFunctionType register(String NAMESPACE, String ID, LootFunctionType LOOT_FUNCTION_TYPE) {
        return (LootFunctionType)register(Registries.LOOT_POOL_ENTRY_TYPE, new Identifier(NAMESPACE, ID), LOOT_FUNCTION_TYPE);
    }
    public static LootConditionType register(String NAMESPACE, String ID, LootConditionType LOOT_CONDITION_TYPE) {
        return (LootConditionType)register(Registries.LOOT_CONDITION_TYPE, new Identifier(NAMESPACE, ID), LOOT_CONDITION_TYPE);
    }
    public static LootNumberProviderType register(String NAMESPACE, String ID, LootNumberProviderType LOOT_NUMBER_PROVIDER_TYPE) {
        return (LootNumberProviderType)register(Registries.LOOT_NUMBER_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), LOOT_NUMBER_PROVIDER_TYPE);
    }
    public static LootNbtProviderType register(String NAMESPACE, String ID, LootNbtProviderType LOOT_NBT_PROVIDER_TYPE) {
        return (LootNbtProviderType)register(Registries.LOOT_NBT_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), LOOT_NBT_PROVIDER_TYPE);
    }
    public static LootScoreProviderType register(String NAMESPACE, String ID, LootScoreProviderType LOOT_SCORE_PROVIDER_TYPE) {
        return (LootScoreProviderType)register(Registries.LOOT_SCORE_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), LOOT_SCORE_PROVIDER_TYPE);
    }
    public static FloatProviderType register(String NAMESPACE, String ID, FloatProviderType FLOAT_PROVIDER_TYPE) {
        return (FloatProviderType)register(Registries.FLOAT_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), FLOAT_PROVIDER_TYPE);
    }
    public static IntProviderType register(String NAMESPACE, String ID, IntProviderType INT_PROVIDER_TYPE) {
        return (IntProviderType)register(Registries.INT_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), INT_PROVIDER_TYPE);
    }
    public static HeightProviderType register(String NAMESPACE, String ID, HeightProviderType HEIGHT_PROVIDER_TYPE) {
        return (HeightProviderType)register(Registries.HEIGHT_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), HEIGHT_PROVIDER_TYPE);
    }
    public static BlockPredicateType register(String NAMESPACE, String ID, BlockPredicateType BLOCK_PREDICATE_TYPE) {
        return (BlockPredicateType)register(Registries.BLOCK_PREDICATE_TYPE, new Identifier(NAMESPACE, ID), BLOCK_PREDICATE_TYPE);
    }
    public static Carver register(String NAMESPACE, String ID, Carver CARVER) {
        return (Carver)register(Registries.CARVER, new Identifier(NAMESPACE, ID), CARVER);
    }
    public static Feature register(String NAMESPACE, String ID, Feature FEATURE) {
        return (Feature)register(Registries.FEATURE, new Identifier(NAMESPACE, ID), FEATURE);
    }
    public static StructurePlacement register(String NAMESPACE, String ID, StructurePlacement STRUCTURE_PLACEMENT) {
        return (StructurePlacement)register(Registries.STRUCTURE_PLACEMENT, new Identifier(NAMESPACE, ID), STRUCTURE_PLACEMENT);
    }
    public static StructurePiece register(String NAMESPACE, String ID, StructurePiece STRUCTURE_PIECE) {
        return (StructurePiece)register(Registries.STRUCTURE_PIECE, new Identifier(NAMESPACE, ID), STRUCTURE_PIECE);
    }
    public static StructureType register(String NAMESPACE, String ID, StructureType STRUCTURE_TYPE) {
        return (StructureType)register(Registries.STRUCTURE_TYPE, new Identifier(NAMESPACE, ID), STRUCTURE_TYPE);
    }
    public static PlacementModifierType register(String NAMESPACE, String ID, PlacementModifierType PLACEMENT_MODIFIER_TYPE) {
        return (PlacementModifierType)register(Registries.PLACEMENT_MODIFIER_TYPE, new Identifier(NAMESPACE, ID), PLACEMENT_MODIFIER_TYPE);
    }
    public static BlockStateProviderType register(String NAMESPACE, String ID, BlockStateProviderType BLOCK_STATE_PROVIDER_TYPE) {
        return (BlockStateProviderType)register(Registries.BLOCK_STATE_PROVIDER_TYPE, new Identifier(NAMESPACE, ID), BLOCK_STATE_PROVIDER_TYPE);
    }
    public static FoliagePlacerType register(String NAMESPACE, String ID, FoliagePlacerType FOLIAGE_PLACER_TYPE) {
        return (FoliagePlacerType)register(Registries.FOLIAGE_PLACER_TYPE, new Identifier(NAMESPACE, ID), FOLIAGE_PLACER_TYPE);
    }
    public static TrunkPlacerType register(String NAMESPACE, String ID, TrunkPlacerType TRUNK_PLACER_TYPE) {
        return (TrunkPlacerType)register(Registries.TRUNK_PLACER_TYPE, new Identifier(NAMESPACE, ID), TRUNK_PLACER_TYPE);
    }
    public static RootPlacerType register(String NAMESPACE, String ID, RootPlacerType ROOT_PLACER_TYPE) {
        return (RootPlacerType)register(Registries.ROOT_PLACER_TYPE, new Identifier(NAMESPACE, ID), ROOT_PLACER_TYPE);
    }
    public static TreeDecoratorType register(String NAMESPACE, String ID, TreeDecoratorType TREE_DECORATOR_TYPE) {
        return (TreeDecoratorType)register(Registries.TREE_DECORATOR_TYPE, new Identifier(NAMESPACE, ID), TREE_DECORATOR_TYPE);
    }
    public static FeatureSizeType register(String NAMESPACE, String ID, FeatureSizeType FEATURE_SIZE_TYPE) {
        return (FeatureSizeType)register(Registries.FEATURE_SIZE_TYPE, new Identifier(NAMESPACE, ID), FEATURE_SIZE_TYPE);
    }
    public static BiomeSource register(String NAMESPACE, String ID, BiomeSource BIOME_SOURCE) {
        return (BiomeSource)register(Registries.BIOME_SOURCE, new Identifier(NAMESPACE, ID), BIOME_SOURCE);
    }
    public static ChunkGenerator register(String NAMESPACE, String ID, ChunkGenerator CHUNK_GENERATOR) {
        return (ChunkGenerator)register(Registries.CHUNK_GENERATOR, new Identifier(NAMESPACE, ID), CHUNK_GENERATOR);
    }
    public static MaterialRules.MaterialCondition register(String NAMESPACE, String ID, MaterialRules.MaterialCondition MATERIAL_CONDITION) {
        return (MaterialRules.MaterialCondition)register(Registries.MATERIAL_CONDITION, new Identifier(NAMESPACE, ID), MATERIAL_CONDITION);
    }
    public static MaterialRules.MaterialRule register(String NAMESPACE, String ID, MaterialRules.MaterialRule MATERIAL_RULE) {
        return (MaterialRules.MaterialRule)register(Registries.MATERIAL_RULE, new Identifier(NAMESPACE, ID), MATERIAL_RULE);
    }
    public static DensityFunction register(String NAMESPACE, String ID, DensityFunction DENSITY_FUNCTION_TYPE) {
        return (DensityFunction)register(Registries.DENSITY_FUNCTION_TYPE, new Identifier(NAMESPACE, ID), DENSITY_FUNCTION_TYPE);
    }
    public static StructureProcessorType register(String NAMESPACE, String ID, StructureProcessorType STRUCTURE_PROCESSOR) {
        return (StructureProcessorType)register(Registries.STRUCTURE_PROCESSOR, new Identifier(NAMESPACE, ID), STRUCTURE_PROCESSOR);
    }
    public static StructurePoolElementType register(String NAMESPACE, String ID, StructurePoolElementType STRUCTURE_POOL_ELEMENT) {
        return (StructurePoolElementType)register(Registries.STRUCTURE_POOL_ELEMENT, new Identifier(NAMESPACE, ID), STRUCTURE_POOL_ELEMENT);
    }
    public static CatVariant register(String NAMESPACE, String ID, CatVariant CAT_VARIANT) {
        return (CatVariant)register(Registries.CAT_VARIANT, new Identifier(NAMESPACE, ID), CAT_VARIANT);
    }
    public static FrogVariant register(String NAMESPACE, String ID, FrogVariant FROG_VARIANT) {
        return (FrogVariant)register(Registries.FROG_VARIANT, new Identifier(NAMESPACE, ID), FROG_VARIANT);
    }
    public static BannerPattern register(String NAMESPACE, String ID, BannerPattern BANNER_PATTERN) {
        return (BannerPattern)register(Registries.BANNER_PATTERN, new Identifier(NAMESPACE, ID), BANNER_PATTERN);
    }
    public static Instrument register(String NAMESPACE, String ID, Instrument INSTRUMENT) {
        return (Instrument)register(Registries.INSTRUMENT, new Identifier(NAMESPACE, ID), INSTRUMENT);
    }
    public static DecoratedPotPatterns register(String NAMESPACE, String ID, DecoratedPotPatterns DECORATED_POT_PATTERNS) {
        return (DecoratedPotPatterns)register(Registries.DECORATED_POT_PATTERNS, new Identifier(NAMESPACE, ID), DECORATED_POT_PATTERNS);
    }
    public static Registry register(String NAMESPACE, String ID, Registry REGISTRIES) {
        return (Registry)register(Registries.REGISTRIES, new Identifier(NAMESPACE, ID), REGISTRIES);
    }
}
