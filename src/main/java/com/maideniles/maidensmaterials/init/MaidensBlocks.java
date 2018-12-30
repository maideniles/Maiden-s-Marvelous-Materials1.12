package com.maideniles.maidensmaterials.init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.blocks.BlockCobbleVines;
import com.maideniles.maidensmaterials.init.blocks.BlockEssenceStorage;
import com.maideniles.maidensmaterials.init.blocks.BlockFlowerGrass;
import com.maideniles.maidensmaterials.init.blocks.BlockGemStorage;
import com.maideniles.maidensmaterials.init.blocks.BlockGemTile;
import com.maideniles.maidensmaterials.init.blocks.BlockPrettyPath;
import com.maideniles.maidensmaterials.init.blocks.CustomBlockGrass;
import com.maideniles.maidensmaterials.init.blocks.CustomBrickBlock;
import com.maideniles.maidensmaterials.init.blocks.CustomOre;
import com.maideniles.maidensmaterials.init.blocks.CustomWoodPlanks;
import com.maideniles.maidensmaterials.init.blocks.stained.BlockCustomButton;
import com.maideniles.maidensmaterials.init.blocks.stained.BlockCustomPressurePlate;
import com.maideniles.maidensmaterials.init.blocks.stained.BlockStainedBookshelf;
import com.maideniles.maidensmaterials.init.blocks.stained.CustomBlockDoubleSlab;
import com.maideniles.maidensmaterials.init.blocks.stained.CustomBlockFence;
import com.maideniles.maidensmaterials.init.blocks.stained.CustomBlockFenceGate;
import com.maideniles.maidensmaterials.init.blocks.stained.CustomBlockHalfSlab;
import com.maideniles.maidensmaterials.init.blocks.stained.CustomBlockStairs;
import com.maideniles.maidensmaterials.init.blocks.stained.door.CustomBlockDoor;
import com.maideniles.maidensmaterials.init.blocks.stained.door.CustomBlockTrapDoor;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockCedarLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockCrabappleLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockDogwoodLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockJacarandaLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockLaburnumLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockPaulowniaLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockSilverBellLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.leaf.BlockWisteriaLeaves;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockCedarLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockCrabappleLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockDogwoodLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockJacarandaLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockLaburnumLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockPaulowniaLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockSilverBellLog;
import com.maideniles.maidensmaterials.init.blocks.trees.log.BlockWisteriaLog;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockCedarSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockCrabappleSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockCrabappleSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockDogwoodSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockDogwoodSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockJacarandaSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockJacarandaSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockLaburnumSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockLaburnumSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockPaulowniaSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockPaulowniaSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockSilverBellSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockSilverBellSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockWisteriaSapling;
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockWisteriaSaplingVines;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockCrabappleVine;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockDogwoodVine;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockJacarandaVine;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockLaburnumVine;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockPaulowniaVine;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockSilverBellVine;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockVineTie;
import com.maideniles.maidensmaterials.init.blocks.trees.vine.BlockWisteriaVine;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVase;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseBlack;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseBlue;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseBrown;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseCyan;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseGray;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseGreen;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseLightBlue;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseLightGray;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseLime;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseMagenta;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseOrange;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVasePink;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVasePurple;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseRed;
import com.maideniles.maidensmaterials.init.blocks.vase.BlockFlowerVaseYellow;
import com.maideniles.maidensmaterials.world.feature.flower.FairyGlowCup;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class MaidensBlocks
{
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final List<Block> BLOCKS_NO_TAB = new ArrayList<Block>();
	public static final Block vine_tie = new BlockVineTie("vine_tie", Material.CLOTH);

	public static final Block ORNAMENTAL_PATH = new BlockPrettyPath("ornamental_path", Material.GROUND).setCreativeTab(null);
	public static final Block WALK_FLOWERS = new BlockFlowerGrass("flower_grass", Material.PLANTS).setCreativeTab(null);
	public static final Block earthen_block = new BlockEssenceStorage("earthen_block", Material.ROCK);
	public static final Block floral_block = new BlockEssenceStorage("floral_block", Material.ROCK);
	public static final Block crabapple_cobblestone = new BlockCobbleVines("crabapple_cobblestone", 2.0f, 4.5F);
	public static final Block dogwood_cobblestone = new BlockCobbleVines("dogwood_cobblestone", 2.0f, 4.5F);
	public static final Block jacaranda_cobblestone = new BlockCobbleVines("jacaranda_cobblestone", 2.0f, 4.5F);
	public static final Block laburnum_cobblestone = new BlockCobbleVines("laburnum_cobblestone", 2.0f, 4.5F);
	public static final Block paulownia_cobblestone = new BlockCobbleVines("paulownia_cobblestone", 2.0f, 4.5F);
	public static final Block silverbell_cobblestone = new BlockCobbleVines("silverbell_cobblestone", 2.0f, 4.5F);
	public static final Block wisteria_cobblestone = new BlockCobbleVines("wisteria_cobblestone", 2.0f, 4.5F);

	public static final Block amethyst_block = new BlockGemStorage("amethyst_block", Material.ROCK);
	public static final Block aventurine_block = new BlockGemStorage("aventurine_block", Material.ROCK);
	public static final Block chalcopyrite_block = new BlockGemStorage("chalcopyrite_block", Material.ROCK);
	public static final Block carnelian_block = new BlockGemStorage("carnelian_block", Material.ROCK);
	public static final Block citrine_block = new BlockGemStorage("citrine_block", Material.ROCK);
	public static final Block jade_block = new BlockGemStorage("jade_block", Material.ROCK);
	public static final Block jasper_block = new BlockGemStorage("jasper_block", Material.ROCK);
	public static final Block labradorite_block = new BlockGemStorage("labradorite_block", Material.ROCK);
	public static final Block mica_block = new BlockGemStorage("mica_block", Material.ROCK);
	public static final Block moonstone_block = new BlockGemStorage("moonstone_block", Material.ROCK);
	public static final Block rose_quartz_block = new BlockGemStorage("rose_quartz_block", Material.ROCK);
	public static final Block sodalite_block = new BlockGemStorage("sodalite_block", Material.ROCK);

	public static final Block amethyst_tile_1 = new BlockGemTile("amethyst_tile_1", Material.CLAY);
	public static final Block amethyst_tile_2 = new BlockGemTile("amethyst_tile_2", Material.CLAY);
	public static final Block amethyst_tile_3 = new BlockGemTile("amethyst_tile_3", Material.CLAY);
	public static final Block amethyst_tile_4 = new BlockGemTile("amethyst_tile_4", Material.CLAY);
	public static final Block amethyst_tile_5 = new BlockGemTile("amethyst_tile_5", Material.CLAY);
	public static final Block amethyst_tile_6 = new BlockGemTile("amethyst_tile_6", Material.CLAY);

	public static final Block aventurine_tile_1 = new BlockGemTile("aventurine_tile_1", Material.CLAY);
	public static final Block aventurine_tile_2 = new BlockGemTile("aventurine_tile_2", Material.CLAY);
	public static final Block aventurine_tile_3 = new BlockGemTile("aventurine_tile_3", Material.CLAY);
	public static final Block aventurine_tile_4 = new BlockGemTile("aventurine_tile_4", Material.CLAY);
	public static final Block aventurine_tile_5 = new BlockGemTile("aventurine_tile_5", Material.CLAY);
	public static final Block aventurine_tile_6 = new BlockGemTile("aventurine_tile_6", Material.CLAY);

	public static final Block carnelian_tile_1 = new BlockGemTile("carnelian_tile_1", Material.CLAY);
	public static final Block carnelian_tile_2 = new BlockGemTile("carnelian_tile_2", Material.CLAY);
	public static final Block carnelian_tile_3 = new BlockGemTile("carnelian_tile_3", Material.CLAY);
	public static final Block carnelian_tile_4 = new BlockGemTile("carnelian_tile_4", Material.CLAY);
	public static final Block carnelian_tile_5 = new BlockGemTile("carnelian_tile_5", Material.CLAY);
	public static final Block carnelian_tile_6 = new BlockGemTile("carnelian_tile_6", Material.CLAY);

	public static final Block chalcopyrite_tile_1 = new BlockGemTile("chalcopyrite_tile_1", Material.CLAY);
	public static final Block chalcopyrite_tile_2 = new BlockGemTile("chalcopyrite_tile_2", Material.CLAY);
	public static final Block chalcopyrite_tile_3 = new BlockGemTile("chalcopyrite_tile_3", Material.CLAY);
	public static final Block chalcopyrite_tile_4 = new BlockGemTile("chalcopyrite_tile_4", Material.CLAY);
	public static final Block chalcopyrite_tile_5 = new BlockGemTile("chalcopyrite_tile_5", Material.CLAY);
	public static final Block chalcopyrite_tile_6 = new BlockGemTile("chalcopyrite_tile_6", Material.CLAY);

	public static final Block citrine_tile_1 = new BlockGemTile("citrine_tile_1", Material.CLAY);
	public static final Block citrine_tile_2 = new BlockGemTile("citrine_tile_2", Material.CLAY);
	public static final Block citrine_tile_3 = new BlockGemTile("citrine_tile_3", Material.CLAY);
	public static final Block citrine_tile_4 = new BlockGemTile("citrine_tile_4", Material.CLAY);
	public static final Block citrine_tile_5 = new BlockGemTile("citrine_tile_5", Material.CLAY);
	public static final Block citrine_tile_6 = new BlockGemTile("citrine_tile_6", Material.CLAY);

	public static final Block jade_tile_1 = new BlockGemTile("jade_tile_1", Material.CLAY);
	public static final Block jade_tile_2 = new BlockGemTile("jade_tile_2", Material.CLAY);
	public static final Block jade_tile_3 = new BlockGemTile("jade_tile_3", Material.CLAY);
	public static final Block jade_tile_4 = new BlockGemTile("jade_tile_4", Material.CLAY);
	public static final Block jade_tile_5 = new BlockGemTile("jade_tile_5", Material.CLAY);
	public static final Block jade_tile_6 = new BlockGemTile("jade_tile_6", Material.CLAY);

	public static final Block jasper_tile_1 = new BlockGemTile("jasper_tile_1", Material.CLAY);
	public static final Block jasper_tile_2 = new BlockGemTile("jasper_tile_2", Material.CLAY);
	public static final Block jasper_tile_3 = new BlockGemTile("jasper_tile_3", Material.CLAY);
	public static final Block jasper_tile_4 = new BlockGemTile("jasper_tile_4", Material.CLAY);
	public static final Block jasper_tile_5 = new BlockGemTile("jasper_tile_5", Material.CLAY);
	public static final Block jasper_tile_6 = new BlockGemTile("jasper_tile_6", Material.CLAY);

	public static final Block labradorite_tile_1 = new BlockGemTile("labradorite_tile_1", Material.CLAY);
	public static final Block labradorite_tile_2 = new BlockGemTile("labradorite_tile_2", Material.CLAY);
	public static final Block labradorite_tile_3 = new BlockGemTile("labradorite_tile_3", Material.CLAY);
	public static final Block labradorite_tile_4 = new BlockGemTile("labradorite_tile_4", Material.CLAY);
	public static final Block labradorite_tile_5 = new BlockGemTile("labradorite_tile_5", Material.CLAY);
	public static final Block labradorite_tile_6 = new BlockGemTile("labradorite_tile_6", Material.CLAY);

	public static final Block mica_tile_1 = new BlockGemTile("mica_tile_1", Material.CLAY);
	public static final Block mica_tile_2 = new BlockGemTile("mica_tile_2", Material.CLAY);
	public static final Block mica_tile_3 = new BlockGemTile("mica_tile_3", Material.CLAY);
	public static final Block mica_tile_4 = new BlockGemTile("mica_tile_4", Material.CLAY);
	public static final Block mica_tile_5 = new BlockGemTile("mica_tile_5", Material.CLAY);
	public static final Block mica_tile_6 = new BlockGemTile("mica_tile_6", Material.CLAY);

	public static final Block moonstone_tile_1 = new BlockGemTile("moonstone_tile_1", Material.CLAY);
	public static final Block moonstone_tile_2 = new BlockGemTile("moonstone_tile_2", Material.CLAY);
	public static final Block moonstone_tile_3 = new BlockGemTile("moonstone_tile_3", Material.CLAY);
	public static final Block moonstone_tile_4 = new BlockGemTile("moonstone_tile_4", Material.CLAY);
	public static final Block moonstone_tile_5 = new BlockGemTile("moonstone_tile_5", Material.CLAY);
	public static final Block moonstone_tile_6 = new BlockGemTile("moonstone_tile_6", Material.CLAY);

	public static final Block rose_quartz_tile_1 = new BlockGemTile("rose_quartz_tile_1", Material.CLAY);
	public static final Block rose_quartz_tile_2 = new BlockGemTile("rose_quartz_tile_2", Material.CLAY);
	public static final Block rose_quartz_tile_3 = new BlockGemTile("rose_quartz_tile_3", Material.CLAY);
	public static final Block rose_quartz_tile_4 = new BlockGemTile("rose_quartz_tile_4", Material.CLAY);
	public static final Block rose_quartz_tile_5 = new BlockGemTile("rose_quartz_tile_5", Material.CLAY);
	public static final Block rose_quartz_tile_6 = new BlockGemTile("rose_quartz_tile_6", Material.CLAY);

	public static final Block sodalite_tile_1 = new BlockGemTile("sodalite_tile_1", Material.CLAY);
	public static final Block sodalite_tile_2 = new BlockGemTile("sodalite_tile_2", Material.CLAY);
	public static final Block sodalite_tile_3 = new BlockGemTile("sodalite_tile_3", Material.CLAY);
	public static final Block sodalite_tile_4 = new BlockGemTile("sodalite_tile_4", Material.CLAY);
	public static final Block sodalite_tile_5 = new BlockGemTile("sodalite_tile_5", Material.CLAY);
	public static final Block sodalite_tile_6 = new BlockGemTile("sodalite_tile_6", Material.CLAY);

	public static final Block red_clay_block = new CustomBrickBlock("red_clay_block", Material.CLAY);
	public static final Block orange_clay_block = new CustomBrickBlock("orange_clay_block", Material.CLAY);
	public static final Block yellow_clay_block = new CustomBrickBlock("yellow_clay_block", Material.CLAY);
	public static final Block lime_clay_block = new CustomBrickBlock("lime_clay_block", Material.CLAY);
	public static final Block green_clay_block = new CustomBrickBlock("green_clay_block", Material.CLAY);
	public static final Block light_blue_clay_block = new CustomBrickBlock("light_blue_clay_block", Material.CLAY);
	public static final Block cyan_clay_block = new CustomBrickBlock("cyan_clay_block", Material.CLAY);
	public static final Block blue_clay_block = new CustomBrickBlock("blue_clay_block", Material.CLAY);
	public static final Block purple_clay_block = new CustomBrickBlock("purple_clay_block", Material.CLAY);
	public static final Block magenta_clay_block = new CustomBrickBlock("magenta_clay_block", Material.CLAY);
	public static final Block pink_clay_block = new CustomBrickBlock("pink_clay_block", Material.CLAY);
	public static final Block white_clay_block = new CustomBrickBlock("white_clay_block", Material.CLAY);
	public static final Block light_gray_clay_block = new CustomBrickBlock("light_gray_clay_block", Material.CLAY);
	public static final Block gray_clay_block = new CustomBrickBlock("gray_clay_block", Material.CLAY);
	public static final Block black_clay_block = new CustomBrickBlock("black_clay_block", Material.CLAY);
	public static final Block brown_clay_block = new CustomBrickBlock("brown_clay_block", Material.CLAY);

	public static final Block red_brick_block = new CustomBrickBlock("red_brick_block", Material.CLAY);
	public static final Block orange_brick_block = new CustomBrickBlock("orange_brick_block", Material.CLAY);
	public static final Block yellow_brick_block = new CustomBrickBlock("yellow_brick_block", Material.CLAY);
	public static final Block lime_brick_block = new CustomBrickBlock("lime_brick_block", Material.CLAY);
	public static final Block green_brick_block = new CustomBrickBlock("green_brick_block", Material.CLAY);
	public static final Block light_blue_brick_block = new CustomBrickBlock("light_blue_brick_block", Material.CLAY);
	public static final Block cyan_brick_block = new CustomBrickBlock("cyan_brick_block", Material.CLAY);
	public static final Block blue_brick_block = new CustomBrickBlock("blue_brick_block", Material.CLAY);
	public static final Block purple_brick_block = new CustomBrickBlock("purple_brick_block", Material.CLAY);
	public static final Block magenta_brick_block = new CustomBrickBlock("magenta_brick_block", Material.CLAY);
	public static final Block pink_brick_block = new CustomBrickBlock("pink_brick_block", Material.CLAY);
	public static final Block white_brick_block = new CustomBrickBlock("white_brick_block", Material.CLAY);
	public static final Block light_gray_brick_block = new CustomBrickBlock("light_gray_brick_block", Material.CLAY);
	public static final Block gray_brick_block = new CustomBrickBlock("gray_brick_block", Material.CLAY);
	public static final Block black_brick_block = new CustomBrickBlock("black_brick_block", Material.CLAY);
	public static final Block brown_brick_block = new CustomBrickBlock("brown_brick_block", Material.CLAY);

	public static final Block red_brick_stairs = new CustomBlockStairs("red_brick_stairs", white_brick_block.getDefaultState());
	public static final Block orange_brick_stairs = new CustomBlockStairs("orange_brick_stairs", white_brick_block.getDefaultState());
	public static final Block yellow_brick_stairs = new CustomBlockStairs("yellow_brick_stairs", white_brick_block.getDefaultState());
	public static final Block lime_brick_stairs = new CustomBlockStairs("lime_brick_stairs", white_brick_block.getDefaultState());
	public static final Block green_brick_stairs = new CustomBlockStairs("green_brick_stairs", white_brick_block.getDefaultState());
	public static final Block cyan_brick_stairs = new CustomBlockStairs("cyan_brick_stairs", white_brick_block.getDefaultState());
	public static final Block light_blue_brick_stairs = new CustomBlockStairs("light_blue_brick_stairs", white_brick_block.getDefaultState());
	public static final Block blue_brick_stairs = new CustomBlockStairs("blue_brick_stairs", white_brick_block.getDefaultState());
	public static final Block purple_brick_stairs = new CustomBlockStairs("purple_brick_stairs", white_brick_block.getDefaultState());
	public static final Block magenta_brick_stairs = new CustomBlockStairs("magenta_brick_stairs", white_brick_block.getDefaultState());
	public static final Block pink_brick_stairs = new CustomBlockStairs("pink_brick_stairs", white_brick_block.getDefaultState());
	public static final Block white_brick_stairs = new CustomBlockStairs("white_brick_stairs", white_brick_block.getDefaultState());
	public static final Block light_gray_brick_stairs = new CustomBlockStairs("light_gray_brick_stairs", white_brick_block.getDefaultState());
	public static final Block gray_brick_stairs = new CustomBlockStairs("gray_brick_stairs", white_brick_block.getDefaultState());
	public static final Block black_brick_stairs = new CustomBlockStairs("black_brick_stairs", white_brick_block.getDefaultState());
	public static final Block brown_brick_stairs = new CustomBlockStairs("brown_brick_stairs", white_brick_block.getDefaultState());

	public static final BlockSlab red_brick_slab_half = new CustomBlockHalfSlab("red_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab orange_brick_slab_half = new CustomBlockHalfSlab("orange_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab yellow_brick_slab_half = new CustomBlockHalfSlab("yellow_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab lime_brick_slab_half = new CustomBlockHalfSlab("lime_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab green_brick_slab_half = new CustomBlockHalfSlab("green_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab cyan_brick_slab_half = new CustomBlockHalfSlab("cyan_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab light_blue_brick_slab_half = new CustomBlockHalfSlab("light_blue_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab blue_brick_slab_half = new CustomBlockHalfSlab("blue_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab purple_brick_slab_half = new CustomBlockHalfSlab("purple_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab magenta_brick_slab_half = new CustomBlockHalfSlab("magenta_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab pink_brick_slab_half = new CustomBlockHalfSlab("pink_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab white_brick_slab_half = new CustomBlockHalfSlab("white_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab light_gray_brick_slab_half = new CustomBlockHalfSlab("light_gray_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab gray_brick_slab_half = new CustomBlockHalfSlab("gray_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab black_brick_slab_half = new CustomBlockHalfSlab("black_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab brown_brick_slab_half = new CustomBlockHalfSlab("brown_brick_slab_half", 2.5F, 4.5F);

	public static final BlockSlab red_brick_slab_double = new CustomBlockDoubleSlab("red_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab orange_brick_slab_double = new CustomBlockDoubleSlab("orange_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab yellow_brick_slab_double = new CustomBlockDoubleSlab("yellow_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab lime_brick_slab_double = new CustomBlockDoubleSlab("lime_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab green_brick_slab_double = new CustomBlockDoubleSlab("green_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab cyan_brick_slab_double = new CustomBlockDoubleSlab("cyan_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab light_blue_brick_slab_double = new CustomBlockDoubleSlab("light_blue_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab blue_brick_slab_double = new CustomBlockDoubleSlab("blue_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab purple_brick_slab_double = new CustomBlockDoubleSlab("purple_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab magenta_brick_slab_double = new CustomBlockDoubleSlab("magenta_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab pink_brick_slab_double = new CustomBlockDoubleSlab("pink_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab white_brick_slab_double = new CustomBlockDoubleSlab("white_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab light_gray_brick_slab_double = new CustomBlockDoubleSlab("light_gray_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab gray_brick_slab_double = new CustomBlockDoubleSlab("gray_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab black_brick_slab_double = new CustomBlockDoubleSlab("black_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab brown_brick_slab_double = new CustomBlockDoubleSlab("brown_brick_slab_double", 2.5F, 4.5F);

	public static final Block red_large_brick_block = new CustomBrickBlock("red_large_brick_block", Material.CLAY);
	public static final Block orange_large_brick_block = new CustomBrickBlock("orange_large_brick_block", Material.CLAY);
	public static final Block yellow_large_brick_block = new CustomBrickBlock("yellow_large_brick_block", Material.CLAY);
	public static final Block lime_large_brick_block = new CustomBrickBlock("lime_large_brick_block", Material.CLAY);
	public static final Block green_large_brick_block = new CustomBrickBlock("green_large_brick_block", Material.CLAY);
	public static final Block light_blue_large_brick_block = new CustomBrickBlock("light_blue_large_brick_block", Material.CLAY);
	public static final Block cyan_large_brick_block = new CustomBrickBlock("cyan_large_brick_block", Material.CLAY);
	public static final Block blue_large_brick_block = new CustomBrickBlock("blue_large_brick_block", Material.CLAY);
	public static final Block purple_large_brick_block = new CustomBrickBlock("purple_large_brick_block", Material.CLAY);
	public static final Block magenta_large_brick_block = new CustomBrickBlock("magenta_large_brick_block", Material.CLAY);
	public static final Block pink_large_brick_block = new CustomBrickBlock("pink_large_brick_block", Material.CLAY);
	public static final Block white_large_brick_block = new CustomBrickBlock("white_large_brick_block", Material.CLAY);
	public static final Block light_gray_large_brick_block = new CustomBrickBlock("light_gray_large_brick_block", Material.CLAY);
	public static final Block gray_large_brick_block = new CustomBrickBlock("gray_large_brick_block", Material.CLAY);
	public static final Block black_large_brick_block = new CustomBrickBlock("black_large_brick_block", Material.CLAY);
	public static final Block brown_large_brick_block = new CustomBrickBlock("brown_large_brick_block", Material.CLAY);

	public static final Block red_large_brick_stairs = new CustomBlockStairs("red_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block orange_large_brick_stairs = new CustomBlockStairs("orange_large_brick_stairs",white_large_brick_block.getDefaultState());
	public static final Block yellow_large_brick_stairs = new CustomBlockStairs("yellow_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block lime_large_brick_stairs = new CustomBlockStairs("lime_large_brick_stairs",white_large_brick_block.getDefaultState());
	public static final Block green_large_brick_stairs = new CustomBlockStairs("green_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block cyan_large_brick_stairs = new CustomBlockStairs("cyan_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block light_blue_large_brick_stairs = new CustomBlockStairs("light_blue_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block blue_large_brick_stairs = new CustomBlockStairs("blue_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block purple_large_brick_stairs = new CustomBlockStairs("purple_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block magenta_large_brick_stairs = new CustomBlockStairs("magenta_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block pink_large_brick_stairs = new CustomBlockStairs("pink_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block white_large_brick_stairs = new CustomBlockStairs("white_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block light_gray_large_brick_stairs = new CustomBlockStairs("light_gray_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block gray_large_brick_stairs = new CustomBlockStairs("gray_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block black_large_brick_stairs = new CustomBlockStairs("black_large_brick_stairs", white_large_brick_block.getDefaultState());
	public static final Block brown_large_brick_stairs = new CustomBlockStairs("brown_large_brick_stairs", white_large_brick_block.getDefaultState());

	public static final BlockSlab red_large_brick_slab_half = new CustomBlockHalfSlab("red_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab orange_large_brick_slab_half = new CustomBlockHalfSlab("orange_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab yellow_large_brick_slab_half = new CustomBlockHalfSlab("yellow_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab lime_large_brick_slab_half = new CustomBlockHalfSlab("lime_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab green_large_brick_slab_half = new CustomBlockHalfSlab("green_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab cyan_large_brick_slab_half = new CustomBlockHalfSlab("cyan_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab light_blue_large_brick_slab_half = new CustomBlockHalfSlab("light_blue_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab blue_large_brick_slab_half = new CustomBlockHalfSlab("blue_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab purple_large_brick_slab_half = new CustomBlockHalfSlab("purple_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab magenta_large_brick_slab_half = new CustomBlockHalfSlab("magenta_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab pink_large_brick_slab_half = new CustomBlockHalfSlab("pink_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab white_large_brick_slab_half = new CustomBlockHalfSlab("white_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab light_gray_large_brick_slab_half = new CustomBlockHalfSlab("light_gray_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab gray_large_brick_slab_half = new CustomBlockHalfSlab("gray_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab black_large_brick_slab_half = new CustomBlockHalfSlab("black_large_brick_slab_half", 2.5F, 4.5F);
	public static final BlockSlab brown_large_brick_slab_half = new CustomBlockHalfSlab("brown_large_brick_slab_half", 2.5F, 4.5F);

	public static final BlockSlab red_large_brick_slab_double = new CustomBlockDoubleSlab("red_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab orange_large_brick_slab_double = new CustomBlockDoubleSlab("orange_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab yellow_large_brick_slab_double = new CustomBlockDoubleSlab("yellow_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab lime_large_brick_slab_double = new CustomBlockDoubleSlab("lime_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab green_large_brick_slab_double = new CustomBlockDoubleSlab("green_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab cyan_large_brick_slab_double = new CustomBlockDoubleSlab("cyan_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab light_blue_large_brick_slab_double = new CustomBlockDoubleSlab("light_blue_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab blue_large_brick_slab_double = new CustomBlockDoubleSlab("blue_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab purple_large_brick_slab_double = new CustomBlockDoubleSlab("purple_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab magenta_large_brick_slab_double = new CustomBlockDoubleSlab("magenta_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab pink_large_brick_slab_double = new CustomBlockDoubleSlab("pink_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab white_large_brick_slab_double = new CustomBlockDoubleSlab("white_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab light_gray_large_brick_slab_double = new CustomBlockDoubleSlab("light_gray_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab gray_large_brick_slab_double = new CustomBlockDoubleSlab("gray_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab black_large_brick_slab_double = new CustomBlockDoubleSlab("black_large_brick_slab_double", 2.5F, 4.5F);
	public static final BlockSlab brown_large_brick_slab_double = new CustomBlockDoubleSlab("brown_large_brick_slab_double", 2.5F, 4.5F);

	public static final Block vase = new BlockFlowerVase("vase", Material.CLAY);
	public static final Block vase_red = new BlockFlowerVaseRed("vase_red", Material.CLAY);
	public static final Block vase_orange = new BlockFlowerVaseOrange("vase_orange", Material.CLAY);
	public static final Block vase_yellow = new BlockFlowerVaseYellow("vase_yellow", Material.CLAY);
	public static final Block vase_lime = new BlockFlowerVaseLime("vase_lime", Material.CLAY);
	public static final Block vase_green = new BlockFlowerVaseGreen("vase_green", Material.CLAY);
	public static final Block vase_cyan = new BlockFlowerVaseCyan("vase_cyan", Material.CLAY);
	public static final Block vase_light_blue = new BlockFlowerVaseLightBlue("vase_light_blue", Material.CLAY);
	public static final Block vase_blue = new BlockFlowerVaseBlue("vase_blue", Material.CLAY);
	public static final Block vase_purple = new BlockFlowerVasePurple("vase_purple", Material.CLAY);
	public static final Block vase_magenta = new BlockFlowerVaseMagenta("vase_magenta", Material.CLAY);
	public static final Block vase_pink = new BlockFlowerVasePink("vase_pink", Material.CLAY);
	public static final Block vase_light_gray = new BlockFlowerVaseLightGray("vase_light_gray", Material.CLAY);
	public static final Block vase_gray = new BlockFlowerVaseGray("vase_gray", Material.CLAY);
	public static final Block vase_black = new BlockFlowerVaseBlack("vase_black", Material.CLAY);
	public static final Block vase_brown = new BlockFlowerVaseBrown("vase_brown", Material.CLAY);

	public static final Block ornamental_grass = new CustomBlockGrass("ornamental_grass", Material.GRASS);
	
	public static final Block cedar_log = new BlockCedarLog("cedar_log");
	public static final Block cedar_leaves = new BlockCedarLeaves("cedar_leaves");
	public static final Block cedar_sapling = new BlockCedarSapling("cedar_sapling");
	public static final Block cedar_planks = new CustomWoodPlanks("cedar_planks", Material.WOOD);

	public static final Block fairy_glow_cup = new FairyGlowCup("fairy_glow_cup");
	public static final Block mica_ore = new CustomOre("mica_ore");
//	public static final Block mica_ore_end = new CustomOre("mica_ore_end");
//	public static final Block mica_ore_nether = new CustomOre("mica_ore_nether");

//	public static final Block amethyst_ore_end = new CustomOre("amethyst_ore_end");
//	public static final Block amethyst_ore_nether = new CustomOre("amethyst_ore_nether");
	public static final Block amethyst_ore = new CustomOre("amethyst_ore");

//	public static final Block aventurine_ore_end = new CustomOre("aventurine_ore_end");
//	public static final Block aventurine_ore_nether = new CustomOre("aventurine_ore_nether");
	public static final Block aventurine_ore = new CustomOre("aventurine_ore");

//	public static final Block citrine_ore_end = new CustomOre("citrine_ore_end");
//	public static final Block citrine_ore_nether = new CustomOre("citrine_ore_nether");
	public static final Block citrine_ore = new CustomOre("citrine_ore");

//	public static final Block carnelian_ore_end = new CustomOre("carnelian_ore_end");
//	public static final Block carnelian_ore_nether = new CustomOre("carnelian_ore_nether");
	public static final Block carnelian_ore = new CustomOre("carnelian_ore");

//	public static final Block chalcopyrite_ore_end = new CustomOre("chalcopyrite_ore_end");
//	public static final Block chalcopyrite_ore_nether = new CustomOre("chalcopyrite_ore_nether");
	public static final Block chalcopyrite_ore = new CustomOre("chalcopyrite_ore");

//	public static final Block jade_ore_end = new CustomOre("jade_ore_end");
//	public static final Block jade_ore_nether = new CustomOre("jade_ore_nether");
	public static final Block jade_ore = new CustomOre("jade_ore");

//	public static final Block jasper_ore_end = new CustomOre("jasper_ore_end");
//	public static final Block jasper_ore_nether = new CustomOre("jasper_ore_nether");
	public static final Block jasper_ore = new CustomOre("jasper_ore");

//	public static final Block labradorite_ore_end = new CustomOre("labradorite_ore_end");
//	public static final Block labradorite_ore_nether = new CustomOre("labradorite_ore_nether");
	public static final Block labradorite_ore = new CustomOre("labradorite_ore");

//	public static final Block moonstone_ore_end = new CustomOre("moonstone_ore_end");
//	public static final Block moonstone_ore_nether = new CustomOre("moonstone_ore_nether");
	public static final Block moonstone_ore = new CustomOre("moonstone_ore");

//	public static final Block rose_quartz_ore_end = new CustomOre("rose_quartz_ore_end");
//	public static final Block rose_quartz_ore_nether = new CustomOre("rose_quartz_ore_nether");
	public static final Block rose_quartz_ore = new CustomOre("rose_quartz_ore");

//	public static final Block sodalite_ore_end = new CustomOre("sodalite_ore_end");
//	public static final Block sodalite_ore_nether = new CustomOre("sodalite_ore_nether");
	public static final Block sodalite_ore = new CustomOre("sodalite_ore");

	public static final Block whitewashed_planks = new CustomWoodPlanks("whitewashed_planks", Material.WOOD);
	public static final BlockSlab whitewashed_slab_half = new CustomBlockHalfSlab("whitewashed_slab_half", 2.5F, 4.5F);
	public static final BlockSlab whitewashed_slab_double = new CustomBlockDoubleSlab("whitewashed_slab_double", 2.5F, 4.5F);

	public static final Block silverbell_planks = new CustomWoodPlanks("silverbell_planks", Material.WOOD);
	public static final Block crabapple_planks = new CustomWoodPlanks("crabapple_planks", Material.WOOD);
	public static final Block dogwood_planks = new CustomWoodPlanks("dogwood_planks", Material.WOOD);
	public static final Block jacaranda_planks = new CustomWoodPlanks("jacaranda_planks", Material.WOOD);
	public static final Block laburnum_planks = new CustomWoodPlanks("laburnum_planks", Material.WOOD);
	public static final Block paulownia_planks = new CustomWoodPlanks("paulownia_planks", Material.WOOD);

	public static final Block wisteria_planks = new CustomWoodPlanks("wisteria_planks", Material.WOOD);

	public static final BlockSlab cedar_slab_half = new CustomBlockHalfSlab("cedar_slab_half", 2.5F, 4.5F);
	public static final BlockSlab silverbell_slab_half = new CustomBlockHalfSlab("silverbell_slab_half", 2.5F, 4.5F);
	public static final BlockSlab crabapple_slab_half = new CustomBlockHalfSlab("crabapple_slab_half", 2.5F, 4.5F);
	public static final BlockSlab dogwood_slab_half = new CustomBlockHalfSlab("dogwood_slab_half", 2.5F, 4.5F);
	public static final BlockSlab jacaranda_slab_half = new CustomBlockHalfSlab("jacaranda_slab_half", 2.5F, 4.5F);
	public static final BlockSlab wisteria_slab_half = new CustomBlockHalfSlab("wisteria_slab_half", 2.5F, 4.5F);
	public static final BlockSlab laburnum_slab_half = new CustomBlockHalfSlab("laburnum_slab_half", 2.5F, 4.5F);
	public static final BlockSlab paulownia_slab_half = new CustomBlockHalfSlab("paulownia_slab_half", 2.5F, 4.5F);

	public static final BlockSlab cedar_slab_double = new CustomBlockDoubleSlab("cedar_slab_double", 2.5F, 4.5F);
	public static final BlockSlab silverbell_slab_double = new CustomBlockDoubleSlab("silverbell_slab_double", 2.5F, 4.5F);
	public static final BlockSlab crabapple_slab_double = new CustomBlockDoubleSlab("crabapple_slab_double", 2.5F, 4.5F);
	public static final BlockSlab dogwood_slab_double = new CustomBlockDoubleSlab("dogwood_slab_double", 2.5F, 4.5F);
	public static final BlockSlab jacaranda_slab_double = new CustomBlockDoubleSlab("jacaranda_slab_double", 2.5F, 4.5F);
	public static final BlockSlab wisteria_slab_double = new CustomBlockDoubleSlab("wisteria_slab_double", 2.5F, 4.5F);
	public static final BlockSlab laburnum_slab_double = new CustomBlockDoubleSlab("laburnum_slab_double", 2.5F, 4.5F);
	public static final BlockSlab paulownia_slab_double = new CustomBlockDoubleSlab("paulownia_slab_double", 2.5F, 4.5F);

	public static final Block silverbell_stairs = new CustomBlockStairs("silverbell_stairs", whitewashed_planks.getDefaultState());
	public static final Block crabapple_stairs = new CustomBlockStairs("crabapple_stairs", whitewashed_planks.getDefaultState());
	public static final Block dogwood_stairs = new CustomBlockStairs("dogwood_stairs", whitewashed_planks.getDefaultState());
	public static final Block jacaranda_stairs = new CustomBlockStairs("jacaranda_stairs", whitewashed_planks.getDefaultState());
	public static final Block wisteria_stairs = new CustomBlockStairs("wisteria_stairs", whitewashed_planks.getDefaultState());
	public static final Block laburnum_stairs = new CustomBlockStairs("laburnum_stairs", whitewashed_planks.getDefaultState());
	public static final Block paulownia_stairs = new CustomBlockStairs("paulownia_stairs", whitewashed_planks.getDefaultState());
	public static final Block whitewashed_stairs = new CustomBlockStairs("whitewashed_stairs", whitewashed_planks.getDefaultState());
	public static final Block cedar_stairs = new CustomBlockStairs("cedar_stairs", whitewashed_planks.getDefaultState());

	public static final Block cedar_fence = new CustomBlockFence("cedar_fence", 2.5F, 4.5F);
	public static final Block silverbell_fence = new CustomBlockFence("silverbell_fence", 2.5F, 4.5F);
	public static final Block crabapple_fence = new CustomBlockFence("crabapple_fence", 2.5F, 4.5F);
	public static final Block dogwood_fence = new CustomBlockFence("dogwood_fence", 2.5F, 4.5F);
	public static final Block jacaranda_fence = new CustomBlockFence("jacaranda_fence", 2.5F, 4.5F);
	public static final Block laburnum_fence = new CustomBlockFence("laburnum_fence", 2.5F, 4.5F);
	public static final Block paulownia_fence = new CustomBlockFence("paulownia_fence", 2.5F, 4.5F);
	public static final Block wisteria_fence = new CustomBlockFence("wisteria_fence", 2.5F, 4.5F);
	public static final Block whitewashed_fence = new CustomBlockFence("whitewashed_fence", 2.5F, 4.5F);

	public static final Block silverbell_fence_gate = new CustomBlockFenceGate("silverbell_fence_gate", 2.5F, 4.5F);
	public static final Block crabapple_fence_gate = new CustomBlockFenceGate("crabapple_fence_gate", 2.5F, 4.5F);
	public static final Block dogwood_fence_gate = new CustomBlockFenceGate("dogwood_fence_gate", 2.5F, 4.5F);
	public static final Block jacaranda_fence_gate = new CustomBlockFenceGate("jacaranda_fence_gate", 2.5F, 4.5F);
	public static final Block wisteria_fence_gate = new CustomBlockFenceGate("wisteria_fence_gate", 2.5F, 4.5F);
	public static final Block laburnum_fence_gate = new CustomBlockFenceGate("laburnum_fence_gate", 2.5F, 4.5F);
	public static final Block paulownia_fence_gate = new CustomBlockFenceGate("paulownia_fence_gate", 2.5F, 4.5F);
	public static final Block whitewashed_fence_gate = new CustomBlockFenceGate("whitewashed_fence_gate", 2.5F, 4.5F);
	public static final Block cedar_fence_gate = new CustomBlockFenceGate("cedar_fence_gate", 2.5F, 4.5F);

	public static final Block cedar_pressure_plate = new BlockCustomPressurePlate("cedar_pressure_plate", 10);
	public static final Block crabapple_pressure_plate = new BlockCustomPressurePlate("crabapple_pressure_plate", 10);
	public static final Block dogwood_pressure_plate = new BlockCustomPressurePlate("dogwood_pressure_plate", 10);
	public static final Block jacaranda_pressure_plate = new BlockCustomPressurePlate("jacaranda_pressure_plate", 10);
	public static final Block laburnum_pressure_plate = new BlockCustomPressurePlate("laburnum_pressure_plate", 10);
	public static final Block paulownia_pressure_plate = new BlockCustomPressurePlate("paulownia_pressure_plate", 10);
	public static final Block silverbell_pressure_plate = new BlockCustomPressurePlate("silverbell_pressure_plate", 10);
	public static final Block wisteria_pressure_plate = new BlockCustomPressurePlate("wisteria_pressure_plate", 10);

	public static final Block acacia_pressure_plate = new BlockCustomPressurePlate("acacia_pressure_plate", 10);
	public static final Block birch_pressure_plate = new BlockCustomPressurePlate("birch_pressure_plate", 10);
	public static final Block oak_pressure_plate = new BlockCustomPressurePlate("oak_pressure_plate", 10);
	public static final Block dark_oak_pressure_plate = new BlockCustomPressurePlate("dark_oak_pressure_plate", 10);
	public static final Block spruce_pressure_plate = new BlockCustomPressurePlate("spruce_pressure_plate", 10);
	public static final Block jungle_pressure_plate = new BlockCustomPressurePlate("jungle_pressure_plate", 10);

	public static final Block cedar_button = new BlockCustomButton("cedar_button");
	public static final Block crabapple_button = new BlockCustomButton("crabapple_button");
	public static final Block dogwood_button = new BlockCustomButton("dogwood_button");
	public static final Block jacaranda_button = new BlockCustomButton("jacaranda_button");
	public static final Block laburnum_button = new BlockCustomButton("laburnum_button");
	public static final Block paulownia_button = new BlockCustomButton("paulownia_button");
	public static final Block silverbell_button = new BlockCustomButton("silverbell_button");
	public static final Block wisteria_button = new BlockCustomButton("wisteria_button");

	public static final Block acacia_button = new BlockCustomButton("acacia_button");
	public static final Block birch_button = new BlockCustomButton("birch_button");
	public static final Block oak_button = new BlockCustomButton("oak_button");
	public static final Block dark_oak_button = new BlockCustomButton("dark_oak_button");
	public static final Block spruce_button = new BlockCustomButton("spruce_button");
	public static final Block jungle_button = new BlockCustomButton("jungle_button");

	public static final Block cedar_trapdoor_1 = new CustomBlockTrapDoor("cedar_trapdoor_1");
	public static final Block crabapple_trapdoor_1 = new CustomBlockTrapDoor("crabapple_trapdoor_1");
	public static final Block dogwood_trapdoor_1 = new CustomBlockTrapDoor("dogwood_trapdoor_1");
	public static final Block jacaranda_trapdoor_1 = new CustomBlockTrapDoor("jacaranda_trapdoor_1");
	public static final Block laburnum_trapdoor_1 = new CustomBlockTrapDoor("laburnum_trapdoor_1");
	public static final Block paulownia_trapdoor_1 = new CustomBlockTrapDoor("paulownia_trapdoor_1");
	public static final Block silverbell_trapdoor_1 = new CustomBlockTrapDoor("silverbell_trapdoor_1");
	public static final Block wisteria_trapdoor_1 = new CustomBlockTrapDoor("wisteria_trapdoor_1");

	public static final Block acacia_trapdoor_1 = new CustomBlockTrapDoor("acacia_trapdoor_1");
	public static final Block birch_trapdoor_1 = new CustomBlockTrapDoor("birch_trapdoor_1");
	public static final Block oak_trapdoor_1 = new CustomBlockTrapDoor("oak_trapdoor_1");
	public static final Block dark_oak_trapdoor_1 = new CustomBlockTrapDoor("dark_oak_trapdoor_1");
	public static final Block spruce_trapdoor_1 = new CustomBlockTrapDoor("spruce_trapdoor_1");
	public static final Block jungle_trapdoor_1 = new CustomBlockTrapDoor("jungle_trapdoor_1");

	public static final Block red_stained_trapdoor_1 = new CustomBlockTrapDoor("red_stained_trapdoor_1");
	public static final Block orange_stained_trapdoor_1 = new CustomBlockTrapDoor("orange_stained_trapdoor_1");
	public static final Block yellow_stained_trapdoor_1 = new CustomBlockTrapDoor("yellow_stained_trapdoor_1");
	public static final Block lime_stained_trapdoor_1 = new CustomBlockTrapDoor("lime_stained_trapdoor_1");
	public static final Block green_stained_trapdoor_1 = new CustomBlockTrapDoor("green_stained_trapdoor_1");
	public static final Block cyan_stained_trapdoor_1 = new CustomBlockTrapDoor("cyan_stained_trapdoor_1");
	public static final Block light_blue_stained_trapdoor_1 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_1");
	public static final Block blue_stained_trapdoor_1 = new CustomBlockTrapDoor("blue_stained_trapdoor_1");
	public static final Block purple_stained_trapdoor_1 = new CustomBlockTrapDoor("purple_stained_trapdoor_1");
	public static final Block magenta_stained_trapdoor_1 = new CustomBlockTrapDoor("magenta_stained_trapdoor_1");
	public static final Block pink_stained_trapdoor_1 = new CustomBlockTrapDoor("pink_stained_trapdoor_1");
	public static final Block white_stained_trapdoor_1 = new CustomBlockTrapDoor("white_stained_trapdoor_1");
	public static final Block light_gray_stained_trapdoor_1 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_1");
	public static final Block gray_stained_trapdoor_1 = new CustomBlockTrapDoor("gray_stained_trapdoor_1");
	public static final Block black_stained_trapdoor_1 = new CustomBlockTrapDoor("black_stained_trapdoor_1");
	public static final Block brown_stained_trapdoor_1 = new CustomBlockTrapDoor("brown_stained_trapdoor_1");

	public static final Block cedar_trapdoor_2 = new CustomBlockTrapDoor("cedar_trapdoor_2");
	public static final Block crabapple_trapdoor_2 = new CustomBlockTrapDoor("crabapple_trapdoor_2");
	public static final Block dogwood_trapdoor_2 = new CustomBlockTrapDoor("dogwood_trapdoor_2");
	public static final Block jacaranda_trapdoor_2 = new CustomBlockTrapDoor("jacaranda_trapdoor_2");
	public static final Block laburnum_trapdoor_2 = new CustomBlockTrapDoor("laburnum_trapdoor_2");
	public static final Block paulownia_trapdoor_2 = new CustomBlockTrapDoor("paulownia_trapdoor_2");
	public static final Block silverbell_trapdoor_2 = new CustomBlockTrapDoor("silverbell_trapdoor_2");
	public static final Block wisteria_trapdoor_2 = new CustomBlockTrapDoor("wisteria_trapdoor_2");

	public static final Block acacia_trapdoor_2 = new CustomBlockTrapDoor("acacia_trapdoor_2");
	public static final Block birch_trapdoor_2 = new CustomBlockTrapDoor("birch_trapdoor_2");
	public static final Block oak_trapdoor_2 = new CustomBlockTrapDoor("oak_trapdoor_2");
	public static final Block dark_oak_trapdoor_2 = new CustomBlockTrapDoor("dark_oak_trapdoor_2");
	public static final Block spruce_trapdoor_2 = new CustomBlockTrapDoor("spruce_trapdoor_2");
	public static final Block jungle_trapdoor_2 = new CustomBlockTrapDoor("jungle_trapdoor_2");

	public static final Block red_stained_trapdoor_2 = new CustomBlockTrapDoor("red_stained_trapdoor_2");
	public static final Block orange_stained_trapdoor_2 = new CustomBlockTrapDoor("orange_stained_trapdoor_2");
	public static final Block yellow_stained_trapdoor_2 = new CustomBlockTrapDoor("yellow_stained_trapdoor_2");
	public static final Block lime_stained_trapdoor_2 = new CustomBlockTrapDoor("lime_stained_trapdoor_2");
	public static final Block green_stained_trapdoor_2 = new CustomBlockTrapDoor("green_stained_trapdoor_2");
	public static final Block cyan_stained_trapdoor_2 = new CustomBlockTrapDoor("cyan_stained_trapdoor_2");
	public static final Block light_blue_stained_trapdoor_2 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_2");
	public static final Block blue_stained_trapdoor_2 = new CustomBlockTrapDoor("blue_stained_trapdoor_2");
	public static final Block purple_stained_trapdoor_2 = new CustomBlockTrapDoor("purple_stained_trapdoor_2");
	public static final Block magenta_stained_trapdoor_2 = new CustomBlockTrapDoor("magenta_stained_trapdoor_2");
	public static final Block pink_stained_trapdoor_2 = new CustomBlockTrapDoor("pink_stained_trapdoor_2");
	public static final Block white_stained_trapdoor_2 = new CustomBlockTrapDoor("white_stained_trapdoor_2");
	public static final Block light_gray_stained_trapdoor_2 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_2");
	public static final Block gray_stained_trapdoor_2 = new CustomBlockTrapDoor("gray_stained_trapdoor_2");
	public static final Block black_stained_trapdoor_2 = new CustomBlockTrapDoor("black_stained_trapdoor_2");
	public static final Block brown_stained_trapdoor_2 = new CustomBlockTrapDoor("brown_stained_trapdoor_2");

	public static final Block cedar_trapdoor_3 = new CustomBlockTrapDoor("cedar_trapdoor_3");
	public static final Block crabapple_trapdoor_3 = new CustomBlockTrapDoor("crabapple_trapdoor_3");
	public static final Block dogwood_trapdoor_3 = new CustomBlockTrapDoor("dogwood_trapdoor_3");
	public static final Block jacaranda_trapdoor_3 = new CustomBlockTrapDoor("jacaranda_trapdoor_3");
	public static final Block laburnum_trapdoor_3 = new CustomBlockTrapDoor("laburnum_trapdoor_3");
	public static final Block paulownia_trapdoor_3 = new CustomBlockTrapDoor("paulownia_trapdoor_3");
	public static final Block silverbell_trapdoor_3 = new CustomBlockTrapDoor("silverbell_trapdoor_3");
	public static final Block wisteria_trapdoor_3 = new CustomBlockTrapDoor("wisteria_trapdoor_3");

	public static final Block acacia_trapdoor_3 = new CustomBlockTrapDoor("acacia_trapdoor_3");
	public static final Block birch_trapdoor_3 = new CustomBlockTrapDoor("birch_trapdoor_3");
	public static final Block oak_trapdoor_3 = new CustomBlockTrapDoor("oak_trapdoor_3");
	public static final Block dark_oak_trapdoor_3 = new CustomBlockTrapDoor("dark_oak_trapdoor_3");
	public static final Block spruce_trapdoor_3 = new CustomBlockTrapDoor("spruce_trapdoor_3");
	public static final Block jungle_trapdoor_3 = new CustomBlockTrapDoor("jungle_trapdoor_3");

	public static final Block red_stained_trapdoor_3 = new CustomBlockTrapDoor("red_stained_trapdoor_3");
	public static final Block orange_stained_trapdoor_3 = new CustomBlockTrapDoor("orange_stained_trapdoor_3");
	public static final Block yellow_stained_trapdoor_3 = new CustomBlockTrapDoor("yellow_stained_trapdoor_3");
	public static final Block lime_stained_trapdoor_3 = new CustomBlockTrapDoor("lime_stained_trapdoor_3");
	public static final Block green_stained_trapdoor_3 = new CustomBlockTrapDoor("green_stained_trapdoor_3");
	public static final Block cyan_stained_trapdoor_3 = new CustomBlockTrapDoor("cyan_stained_trapdoor_3");
	public static final Block light_blue_stained_trapdoor_3 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_3");
	public static final Block blue_stained_trapdoor_3 = new CustomBlockTrapDoor("blue_stained_trapdoor_3");
	public static final Block purple_stained_trapdoor_3 = new CustomBlockTrapDoor("purple_stained_trapdoor_3");
	public static final Block magenta_stained_trapdoor_3 = new CustomBlockTrapDoor("magenta_stained_trapdoor_3");
	public static final Block pink_stained_trapdoor_3 = new CustomBlockTrapDoor("pink_stained_trapdoor_3");
	public static final Block white_stained_trapdoor_3 = new CustomBlockTrapDoor("white_stained_trapdoor_3");
	public static final Block light_gray_stained_trapdoor_3 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_3");
	public static final Block gray_stained_trapdoor_3 = new CustomBlockTrapDoor("gray_stained_trapdoor_3");
	public static final Block black_stained_trapdoor_3 = new CustomBlockTrapDoor("black_stained_trapdoor_3");
	public static final Block brown_stained_trapdoor_3 = new CustomBlockTrapDoor("brown_stained_trapdoor_3");

	public static final Block cedar_trapdoor_4 = new CustomBlockTrapDoor("cedar_trapdoor_4");
	public static final Block crabapple_trapdoor_4 = new CustomBlockTrapDoor("crabapple_trapdoor_4");
	public static final Block dogwood_trapdoor_4 = new CustomBlockTrapDoor("dogwood_trapdoor_4");
	public static final Block jacaranda_trapdoor_4 = new CustomBlockTrapDoor("jacaranda_trapdoor_4");
	public static final Block laburnum_trapdoor_4 = new CustomBlockTrapDoor("laburnum_trapdoor_4");
	public static final Block paulownia_trapdoor_4 = new CustomBlockTrapDoor("paulownia_trapdoor_4");
	public static final Block silverbell_trapdoor_4 = new CustomBlockTrapDoor("silverbell_trapdoor_4");
	public static final Block wisteria_trapdoor_4 = new CustomBlockTrapDoor("wisteria_trapdoor_4");

	public static final Block acacia_trapdoor_4 = new CustomBlockTrapDoor("acacia_trapdoor_4");
	public static final Block birch_trapdoor_4 = new CustomBlockTrapDoor("birch_trapdoor_4");
	public static final Block oak_trapdoor_4 = new CustomBlockTrapDoor("oak_trapdoor_4");
	public static final Block dark_oak_trapdoor_4 = new CustomBlockTrapDoor("dark_oak_trapdoor_4");
	public static final Block spruce_trapdoor_4 = new CustomBlockTrapDoor("spruce_trapdoor_4");
	public static final Block jungle_trapdoor_4 = new CustomBlockTrapDoor("jungle_trapdoor_4");

	public static final Block red_stained_trapdoor_4 = new CustomBlockTrapDoor("red_stained_trapdoor_4");
	public static final Block orange_stained_trapdoor_4 = new CustomBlockTrapDoor("orange_stained_trapdoor_4");
	public static final Block yellow_stained_trapdoor_4 = new CustomBlockTrapDoor("yellow_stained_trapdoor_4");
	public static final Block lime_stained_trapdoor_4 = new CustomBlockTrapDoor("lime_stained_trapdoor_4");
	public static final Block green_stained_trapdoor_4 = new CustomBlockTrapDoor("green_stained_trapdoor_4");
	public static final Block cyan_stained_trapdoor_4 = new CustomBlockTrapDoor("cyan_stained_trapdoor_4");
	public static final Block light_blue_stained_trapdoor_4 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_4");
	public static final Block blue_stained_trapdoor_4 = new CustomBlockTrapDoor("blue_stained_trapdoor_4");
	public static final Block purple_stained_trapdoor_4 = new CustomBlockTrapDoor("purple_stained_trapdoor_4");
	public static final Block magenta_stained_trapdoor_4 = new CustomBlockTrapDoor("magenta_stained_trapdoor_4");
	public static final Block pink_stained_trapdoor_4 = new CustomBlockTrapDoor("pink_stained_trapdoor_4");
	public static final Block white_stained_trapdoor_4 = new CustomBlockTrapDoor("white_stained_trapdoor_4");
	public static final Block light_gray_stained_trapdoor_4 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_4");
	public static final Block gray_stained_trapdoor_4 = new CustomBlockTrapDoor("gray_stained_trapdoor_4");
	public static final Block black_stained_trapdoor_4 = new CustomBlockTrapDoor("black_stained_trapdoor_4");
	public static final Block brown_stained_trapdoor_4 = new CustomBlockTrapDoor("brown_stained_trapdoor_4");

	public static final Block red_stained_door_1 = new CustomBlockDoor("red_stained_door_1");
	public static final Block orange_stained_door_1 = new CustomBlockDoor("orange_stained_door_1");
	public static final Block yellow_stained_door_1 = new CustomBlockDoor("yellow_stained_door_1");
	public static final Block lime_stained_door_1 = new CustomBlockDoor("lime_stained_door_1");
	public static final Block green_stained_door_1 = new CustomBlockDoor("green_stained_door_1");
	public static final Block cyan_stained_door_1 = new CustomBlockDoor("cyan_stained_door_1");
	public static final Block light_blue_stained_door_1 = new CustomBlockDoor("light_blue_stained_door_1");
	public static final Block blue_stained_door_1 = new CustomBlockDoor("blue_stained_door_1");
	public static final Block purple_stained_door_1 = new CustomBlockDoor("purple_stained_door_1");
	public static final Block magenta_stained_door_1 = new CustomBlockDoor("magenta_stained_door_1");
	public static final Block pink_stained_door_1 = new CustomBlockDoor("pink_stained_door_1");
	public static final Block white_stained_door_1 = new CustomBlockDoor("white_stained_door_1");
	public static final Block light_gray_stained_door_1 = new CustomBlockDoor("light_gray_stained_door_1");
	public static final Block gray_stained_door_1 = new CustomBlockDoor("gray_stained_door_1");
	public static final Block black_stained_door_1 = new CustomBlockDoor("black_stained_door_1");
	public static final Block brown_stained_door_1 = new CustomBlockDoor("brown_stained_door_1");

	public static final Block red_stained_door_2 = new CustomBlockDoor("red_stained_door_2");
	public static final Block orange_stained_door_2 = new CustomBlockDoor("orange_stained_door_2");
	public static final Block yellow_stained_door_2 = new CustomBlockDoor("yellow_stained_door_2");
	public static final Block lime_stained_door_2 = new CustomBlockDoor("lime_stained_door_2");
	public static final Block green_stained_door_2 = new CustomBlockDoor("green_stained_door_2");
	public static final Block cyan_stained_door_2 = new CustomBlockDoor("cyan_stained_door_2");
	public static final Block light_blue_stained_door_2 = new CustomBlockDoor("light_blue_stained_door_2");
	public static final Block blue_stained_door_2 = new CustomBlockDoor("blue_stained_door_2");
	public static final Block purple_stained_door_2 = new CustomBlockDoor("purple_stained_door_2");
	public static final Block magenta_stained_door_2 = new CustomBlockDoor("magenta_stained_door_2");
	public static final Block pink_stained_door_2 = new CustomBlockDoor("pink_stained_door_2");
	public static final Block white_stained_door_2 = new CustomBlockDoor("white_stained_door_2");
	public static final Block light_gray_stained_door_2 = new CustomBlockDoor("light_gray_stained_door_2");
	public static final Block gray_stained_door_2 = new CustomBlockDoor("gray_stained_door_2");
	public static final Block black_stained_door_2 = new CustomBlockDoor("black_stained_door_2");
	public static final Block brown_stained_door_2 = new CustomBlockDoor("brown_stained_door_2");

	public static final Block red_stained_door_3 = new CustomBlockDoor("red_stained_door_3");
	public static final Block orange_stained_door_3 = new CustomBlockDoor("orange_stained_door_3");
	public static final Block yellow_stained_door_3 = new CustomBlockDoor("yellow_stained_door_3");
	public static final Block lime_stained_door_3 = new CustomBlockDoor("lime_stained_door_3");
	public static final Block green_stained_door_3 = new CustomBlockDoor("green_stained_door_3");
	public static final Block cyan_stained_door_3 = new CustomBlockDoor("cyan_stained_door_3");
	public static final Block light_blue_stained_door_3 = new CustomBlockDoor("light_blue_stained_door_3");
	public static final Block blue_stained_door_3 = new CustomBlockDoor("blue_stained_door_3");
	public static final Block purple_stained_door_3 = new CustomBlockDoor("purple_stained_door_3");
	public static final Block magenta_stained_door_3 = new CustomBlockDoor("magenta_stained_door_3");
	public static final Block pink_stained_door_3 = new CustomBlockDoor("pink_stained_door_3");
	public static final Block white_stained_door_3 = new CustomBlockDoor("white_stained_door_3");
	public static final Block light_gray_stained_door_3 = new CustomBlockDoor("light_gray_stained_door_3");
	public static final Block gray_stained_door_3 = new CustomBlockDoor("gray_stained_door_3");
	public static final Block black_stained_door_3 = new CustomBlockDoor("black_stained_door_3");
	public static final Block brown_stained_door_3 = new CustomBlockDoor("brown_stained_door_3");

	public static final Block red_stained_door_4 = new CustomBlockDoor("red_stained_door_4");
	public static final Block orange_stained_door_4 = new CustomBlockDoor("orange_stained_door_4");
	public static final Block yellow_stained_door_4 = new CustomBlockDoor("yellow_stained_door_4");
	public static final Block lime_stained_door_4 = new CustomBlockDoor("lime_stained_door_4");
	public static final Block green_stained_door_4 = new CustomBlockDoor("green_stained_door_4");
	public static final Block cyan_stained_door_4 = new CustomBlockDoor("cyan_stained_door_4");
	public static final Block light_blue_stained_door_4 = new CustomBlockDoor("light_blue_stained_door_4");
	public static final Block blue_stained_door_4 = new CustomBlockDoor("blue_stained_door_4");
	public static final Block purple_stained_door_4 = new CustomBlockDoor("purple_stained_door_4");
	public static final Block magenta_stained_door_4 = new CustomBlockDoor("magenta_stained_door_4");
	public static final Block pink_stained_door_4 = new CustomBlockDoor("pink_stained_door_4");
	public static final Block white_stained_door_4 = new CustomBlockDoor("white_stained_door_4");
	public static final Block light_gray_stained_door_4 = new CustomBlockDoor("light_gray_stained_door_4");
	public static final Block gray_stained_door_4 = new CustomBlockDoor("gray_stained_door_4");
	public static final Block black_stained_door_4 = new CustomBlockDoor("black_stained_door_4");
	public static final Block brown_stained_door_4 = new CustomBlockDoor("brown_stained_door_4");

	public static final Block red_stained_door_5 = new CustomBlockDoor("red_stained_door_5");
	public static final Block orange_stained_door_5 = new CustomBlockDoor("orange_stained_door_5");
	public static final Block yellow_stained_door_5 = new CustomBlockDoor("yellow_stained_door_5");
	public static final Block lime_stained_door_5 = new CustomBlockDoor("lime_stained_door_5");
	public static final Block green_stained_door_5 = new CustomBlockDoor("green_stained_door_5");
	public static final Block cyan_stained_door_5 = new CustomBlockDoor("cyan_stained_door_5");
	public static final Block light_blue_stained_door_5 = new CustomBlockDoor("light_blue_stained_door_5");
	public static final Block blue_stained_door_5 = new CustomBlockDoor("blue_stained_door_5");
	public static final Block purple_stained_door_5 = new CustomBlockDoor("purple_stained_door_5");
	public static final Block magenta_stained_door_5 = new CustomBlockDoor("magenta_stained_door_5");
	public static final Block pink_stained_door_5 = new CustomBlockDoor("pink_stained_door_5");
	public static final Block white_stained_door_5 = new CustomBlockDoor("white_stained_door_5");
	public static final Block light_gray_stained_door_5 = new CustomBlockDoor("light_gray_stained_door_5");
	public static final Block gray_stained_door_5 = new CustomBlockDoor("gray_stained_door_5");
	public static final Block black_stained_door_5 = new CustomBlockDoor("black_stained_door_5");
	public static final Block brown_stained_door_5 = new CustomBlockDoor("brown_stained_door_5");

	public static final Block red_stained_door_6 = new CustomBlockDoor("red_stained_door_6");
	public static final Block orange_stained_door_6 = new CustomBlockDoor("orange_stained_door_6");
	public static final Block yellow_stained_door_6 = new CustomBlockDoor("yellow_stained_door_6");
	public static final Block lime_stained_door_6 = new CustomBlockDoor("lime_stained_door_6");
	public static final Block green_stained_door_6 = new CustomBlockDoor("green_stained_door_6");
	public static final Block cyan_stained_door_6 = new CustomBlockDoor("cyan_stained_door_6");
	public static final Block light_blue_stained_door_6 = new CustomBlockDoor("light_blue_stained_door_6");
	public static final Block blue_stained_door_6 = new CustomBlockDoor("blue_stained_door_6");
	public static final Block purple_stained_door_6 = new CustomBlockDoor("purple_stained_door_6");
	public static final Block magenta_stained_door_6 = new CustomBlockDoor("magenta_stained_door_6");
	public static final Block pink_stained_door_6 = new CustomBlockDoor("pink_stained_door_6");
	public static final Block white_stained_door_6 = new CustomBlockDoor("white_stained_door_6");
	public static final Block light_gray_stained_door_6 = new CustomBlockDoor("light_gray_stained_door_6");
	public static final Block gray_stained_door_6 = new CustomBlockDoor("gray_stained_door_6");
	public static final Block black_stained_door_6 = new CustomBlockDoor("black_stained_door_6");
	public static final Block brown_stained_door_6 = new CustomBlockDoor("brown_stained_door_6");

	public static final Block acacia_door_1 = new CustomBlockDoor("acacia_door_1");
	public static final Block acacia_door_2 = new CustomBlockDoor("acacia_door_2");
	public static final Block acacia_door_3 = new CustomBlockDoor("acacia_door_3");
	public static final Block acacia_door_4 = new CustomBlockDoor("acacia_door_4");
	public static final Block acacia_door_5 = new CustomBlockDoor("acacia_door_5");
	public static final Block acacia_door_6 = new CustomBlockDoor("acacia_door_6");

	public static final Block birch_door_1 = new CustomBlockDoor("birch_door_1");
	public static final Block birch_door_2 = new CustomBlockDoor("birch_door_2");
	public static final Block birch_door_3 = new CustomBlockDoor("birch_door_3");
	public static final Block birch_door_4 = new CustomBlockDoor("birch_door_4");
	public static final Block birch_door_5 = new CustomBlockDoor("birch_door_5");
	public static final Block birch_door_6 = new CustomBlockDoor("birch_door_6");

	public static final Block oak_door_1 = new CustomBlockDoor("oak_door_1");
	public static final Block oak_door_2 = new CustomBlockDoor("oak_door_2");
	public static final Block oak_door_3 = new CustomBlockDoor("oak_door_3");
	public static final Block oak_door_4 = new CustomBlockDoor("oak_door_4");
	public static final Block oak_door_5 = new CustomBlockDoor("oak_door_5");
	public static final Block oak_door_6 = new CustomBlockDoor("oak_door_6");

	public static final Block spruce_door_1 = new CustomBlockDoor("spruce_door_1");
	public static final Block spruce_door_2 = new CustomBlockDoor("spruce_door_2");
	public static final Block spruce_door_3 = new CustomBlockDoor("spruce_door_3");
	public static final Block spruce_door_4 = new CustomBlockDoor("spruce_door_4");
	public static final Block spruce_door_5 = new CustomBlockDoor("spruce_door_5");
	public static final Block spruce_door_6 = new CustomBlockDoor("spruce_door_6");

	public static final Block dark_oak_door_1 = new CustomBlockDoor("dark_oak_door_1");
	public static final Block dark_oak_door_2 = new CustomBlockDoor("dark_oak_door_2");
	public static final Block dark_oak_door_3 = new CustomBlockDoor("dark_oak_door_3");
	public static final Block dark_oak_door_4 = new CustomBlockDoor("dark_oak_door_4");
	public static final Block dark_oak_door_5 = new CustomBlockDoor("dark_oak_door_5");
	public static final Block dark_oak_door_6 = new CustomBlockDoor("dark_oak_door_6");

	public static final Block jungle_door_1 = new CustomBlockDoor("jungle_door_1");
	public static final Block jungle_door_2 = new CustomBlockDoor("jungle_door_2");
	public static final Block jungle_door_3 = new CustomBlockDoor("jungle_door_3");
	public static final Block jungle_door_4 = new CustomBlockDoor("jungle_door_4");
	public static final Block jungle_door_5 = new CustomBlockDoor("jungle_door_5");
	public static final Block jungle_door_6 = new CustomBlockDoor("jungle_door_6");

	public static final Block silverbell_door_1 = new CustomBlockDoor("silverbell_door_1");
	public static final Block silverbell_door_2 = new CustomBlockDoor("silverbell_door_2");
	public static final Block silverbell_door_3 = new CustomBlockDoor("silverbell_door_3");
	public static final Block silverbell_door_4 = new CustomBlockDoor("silverbell_door_4");
	public static final Block silverbell_door_5 = new CustomBlockDoor("silverbell_door_5");
	public static final Block silverbell_door_6 = new CustomBlockDoor("silverbell_door_6");

	public static final Block cedar_door_1 = new CustomBlockDoor("cedar_door_1");
	public static final Block cedar_door_2 = new CustomBlockDoor("cedar_door_2");
	public static final Block cedar_door_3 = new CustomBlockDoor("cedar_door_3");
	public static final Block cedar_door_4 = new CustomBlockDoor("cedar_door_4");
	public static final Block cedar_door_5 = new CustomBlockDoor("cedar_door_5");
	public static final Block cedar_door_6 = new CustomBlockDoor("cedar_door_6");

	public static final Block crabapple_door_1 = new CustomBlockDoor("crabapple_door_1");
	public static final Block crabapple_door_2 = new CustomBlockDoor("crabapple_door_2");
	public static final Block crabapple_door_3 = new CustomBlockDoor("crabapple_door_3");
	public static final Block crabapple_door_4 = new CustomBlockDoor("crabapple_door_4");
	public static final Block crabapple_door_5 = new CustomBlockDoor("crabapple_door_5");
	public static final Block crabapple_door_6 = new CustomBlockDoor("crabapple_door_6");

	public static final Block dogwood_door_1 = new CustomBlockDoor("dogwood_door_1");
	public static final Block dogwood_door_2 = new CustomBlockDoor("dogwood_door_2");
	public static final Block dogwood_door_3 = new CustomBlockDoor("dogwood_door_3");
	public static final Block dogwood_door_4 = new CustomBlockDoor("dogwood_door_4");
	public static final Block dogwood_door_5 = new CustomBlockDoor("dogwood_door_5");
	public static final Block dogwood_door_6 = new CustomBlockDoor("dogwood_door_6");

	public static final Block jacaranda_door_1 = new CustomBlockDoor("jacaranda_door_1");
	public static final Block jacaranda_door_2 = new CustomBlockDoor("jacaranda_door_2");
	public static final Block jacaranda_door_3 = new CustomBlockDoor("jacaranda_door_3");
	public static final Block jacaranda_door_4 = new CustomBlockDoor("jacaranda_door_4");
	public static final Block jacaranda_door_5 = new CustomBlockDoor("jacaranda_door_5");
	public static final Block jacaranda_door_6 = new CustomBlockDoor("jacaranda_door_6");

	public static final Block laburnum_door_1 = new CustomBlockDoor("laburnum_door_1");
	public static final Block laburnum_door_2 = new CustomBlockDoor("laburnum_door_2");
	public static final Block laburnum_door_3 = new CustomBlockDoor("laburnum_door_3");
	public static final Block laburnum_door_4 = new CustomBlockDoor("laburnum_door_4");
	public static final Block laburnum_door_5 = new CustomBlockDoor("laburnum_door_5");
	public static final Block laburnum_door_6 = new CustomBlockDoor("laburnum_door_6");

	public static final Block paulownia_door_1 = new CustomBlockDoor("paulownia_door_1");
	public static final Block paulownia_door_2 = new CustomBlockDoor("paulownia_door_2");
	public static final Block paulownia_door_3 = new CustomBlockDoor("paulownia_door_3");
	public static final Block paulownia_door_4 = new CustomBlockDoor("paulownia_door_4");
	public static final Block paulownia_door_5 = new CustomBlockDoor("paulownia_door_5");
	public static final Block paulownia_door_6 = new CustomBlockDoor("paulownia_door_6");

	public static final Block wisteria_door_1 = new CustomBlockDoor("wisteria_door_1");
	public static final Block wisteria_door_2 = new CustomBlockDoor("wisteria_door_2");
	public static final Block wisteria_door_3 = new CustomBlockDoor("wisteria_door_3");
	public static final Block wisteria_door_4 = new CustomBlockDoor("wisteria_door_4");
	public static final Block wisteria_door_5 = new CustomBlockDoor("wisteria_door_5");
	public static final Block wisteria_door_6 = new CustomBlockDoor("wisteria_door_6");

	public static final Block red_stained_planks = new CustomWoodPlanks("red_stained_planks", Material.WOOD);
	public static final Block orange_stained_planks = new CustomWoodPlanks("orange_stained_planks", Material.WOOD);
	public static final Block yellow_stained_planks = new CustomWoodPlanks("yellow_stained_planks", Material.WOOD);
	public static final Block lime_stained_planks = new CustomWoodPlanks("lime_stained_planks", Material.WOOD);
	public static final Block green_stained_planks = new CustomWoodPlanks("green_stained_planks", Material.WOOD);
	public static final Block cyan_stained_planks = new CustomWoodPlanks("cyan_stained_planks", Material.WOOD);
	public static final Block light_blue_stained_planks = new CustomWoodPlanks("light_blue_stained_planks", Material.WOOD);
	public static final Block blue_stained_planks = new CustomWoodPlanks("blue_stained_planks", Material.WOOD);
	public static final Block purple_stained_planks = new CustomWoodPlanks("purple_stained_planks", Material.WOOD);
	public static final Block magenta_stained_planks = new CustomWoodPlanks("magenta_stained_planks", Material.WOOD);
	public static final Block pink_stained_planks = new CustomWoodPlanks("pink_stained_planks", Material.WOOD);
	public static final Block white_stained_planks = new CustomWoodPlanks("white_stained_planks", Material.WOOD);
	public static final Block light_gray_stained_planks = new CustomWoodPlanks("light_gray_stained_planks", Material.WOOD);
	public static final Block gray_stained_planks = new CustomWoodPlanks("gray_stained_planks", Material.WOOD);
	public static final Block black_stained_planks = new CustomWoodPlanks("black_stained_planks", Material.WOOD);
	public static final Block brown_stained_planks = new CustomWoodPlanks("brown_stained_planks", Material.WOOD);

	public static final Block red_stained_bookshelf = new BlockStainedBookshelf("red_stained_bookshelf", Material.WOOD);
	public static final Block orange_stained_bookshelf = new BlockStainedBookshelf("orange_stained_bookshelf", Material.WOOD);
	public static final Block yellow_stained_bookshelf = new BlockStainedBookshelf("yellow_stained_bookshelf", Material.WOOD);
	public static final Block lime_stained_bookshelf = new BlockStainedBookshelf("lime_stained_bookshelf", Material.WOOD);
	public static final Block green_stained_bookshelf = new BlockStainedBookshelf("green_stained_bookshelf", Material.WOOD);
	public static final Block cyan_stained_bookshelf = new BlockStainedBookshelf("cyan_stained_bookshelf", Material.WOOD);
	public static final Block light_blue_stained_bookshelf = new BlockStainedBookshelf("light_blue_stained_bookshelf", Material.WOOD);
	public static final Block blue_stained_bookshelf = new BlockStainedBookshelf("blue_stained_bookshelf", Material.WOOD);
	public static final Block purple_stained_bookshelf = new BlockStainedBookshelf("purple_stained_bookshelf", Material.WOOD);
	public static final Block magenta_stained_bookshelf = new BlockStainedBookshelf("magenta_stained_bookshelf", Material.WOOD);
	public static final Block pink_stained_bookshelf = new BlockStainedBookshelf("pink_stained_bookshelf", Material.WOOD);
	public static final Block white_stained_bookshelf = new BlockStainedBookshelf("white_stained_bookshelf", Material.WOOD);
	public static final Block light_gray_stained_bookshelf = new BlockStainedBookshelf("light_gray_stained_bookshelf", Material.WOOD);
	public static final Block gray_stained_bookshelf = new BlockStainedBookshelf("gray_stained_bookshelf", Material.WOOD);
	public static final Block black_stained_bookshelf = new BlockStainedBookshelf("black_stained_bookshelf", Material.WOOD);
	public static final Block brown_stained_bookshelf = new BlockStainedBookshelf("brown_stained_bookshelf", Material.WOOD);

	public static final Block cedar_bookshelf = new BlockStainedBookshelf("cedar_bookshelf", Material.WOOD);
	public static final Block crabapple_bookshelf = new BlockStainedBookshelf("crabapple_bookshelf", Material.WOOD);
	public static final Block dogwood_bookshelf = new BlockStainedBookshelf("dogwood_bookshelf", Material.WOOD);
	public static final Block jacaranda_bookshelf = new BlockStainedBookshelf("jacaranda_bookshelf", Material.WOOD);
	public static final Block laburnum_bookshelf = new BlockStainedBookshelf("laburnum_bookshelf", Material.WOOD);
	public static final Block paulownia_bookshelf = new BlockStainedBookshelf("paulownia_bookshelf", Material.WOOD);
	public static final Block silverbell_bookshelf = new BlockStainedBookshelf("silverbell_bookshelf", Material.WOOD);
	public static final Block wisteria_bookshelf = new BlockStainedBookshelf("wisteria_bookshelf", Material.WOOD);

	public static final Block acacia_bookshelf = new BlockStainedBookshelf("acacia_bookshelf", Material.WOOD);
	public static final Block birch_bookshelf = new BlockStainedBookshelf("birch_bookshelf", Material.WOOD);
	public static final Block oak_bookshelf = new BlockStainedBookshelf("oak_bookshelf", Material.WOOD);
	public static final Block dark_oak_bookshelf = new BlockStainedBookshelf("dark_oak_bookshelf", Material.WOOD);
	public static final Block spruce_bookshelf = new BlockStainedBookshelf("spruce_bookshelf", Material.WOOD);
	public static final Block jungle_bookshelf = new BlockStainedBookshelf("jungle_bookshelf", Material.WOOD);

	public static final Block red_stained_stairs = new CustomBlockStairs("red_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block orange_stained_stairs = new CustomBlockStairs("orange_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block yellow_stained_stairs = new CustomBlockStairs("yellow_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block lime_stained_stairs = new CustomBlockStairs("lime_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block green_stained_stairs = new CustomBlockStairs("green_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block cyan_stained_stairs = new CustomBlockStairs("cyan_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block light_blue_stained_stairs = new CustomBlockStairs("light_blue_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block blue_stained_stairs = new CustomBlockStairs("blue_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block purple_stained_stairs = new CustomBlockStairs("purple_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block magenta_stained_stairs = new CustomBlockStairs("magenta_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block brown_stained_stairs = new CustomBlockStairs("brown_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block black_stained_stairs = new CustomBlockStairs("black_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block gray_stained_stairs = new CustomBlockStairs("gray_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block light_gray_stained_stairs = new CustomBlockStairs("light_gray_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block white_stained_stairs = new CustomBlockStairs("white_stained_stairs", whitewashed_planks.getDefaultState());
	public static final Block pink_stained_stairs = new CustomBlockStairs("pink_stained_stairs", whitewashed_planks.getDefaultState());

	public static final BlockSlab red_stained_slab_half = new CustomBlockHalfSlab("red_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab orange_stained_slab_half = new CustomBlockHalfSlab("orange_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab yellow_stained_slab_half = new CustomBlockHalfSlab("yellow_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab lime_stained_slab_half = new CustomBlockHalfSlab("lime_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab green_stained_slab_half = new CustomBlockHalfSlab("green_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab cyan_stained_slab_half = new CustomBlockHalfSlab("cyan_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab light_blue_stained_slab_half = new CustomBlockHalfSlab("light_blue_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab blue_stained_slab_half = new CustomBlockHalfSlab("blue_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab purple_stained_slab_half = new CustomBlockHalfSlab("purple_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab magenta_stained_slab_half = new CustomBlockHalfSlab("magenta_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab pink_stained_slab_half = new CustomBlockHalfSlab("pink_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab white_stained_slab_half = new CustomBlockHalfSlab("white_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab light_gray_stained_slab_half = new CustomBlockHalfSlab("light_gray_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab gray_stained_slab_half = new CustomBlockHalfSlab("gray_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab black_stained_slab_half = new CustomBlockHalfSlab("black_stained_slab_half", 2.5F, 4.5F);
	public static final BlockSlab brown_stained_slab_half = new CustomBlockHalfSlab("brown_stained_slab_half", 2.5F, 4.5F);

	public static final BlockSlab red_stained_slab_double = new CustomBlockDoubleSlab("red_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab orange_stained_slab_double = new CustomBlockDoubleSlab("orange_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab yellow_stained_slab_double = new CustomBlockDoubleSlab("yellow_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab lime_stained_slab_double = new CustomBlockDoubleSlab("lime_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab green_stained_slab_double = new CustomBlockDoubleSlab("green_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab cyan_stained_slab_double = new CustomBlockDoubleSlab("cyan_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab light_blue_stained_slab_double = new CustomBlockDoubleSlab("light_blue_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab blue_stained_slab_double = new CustomBlockDoubleSlab("blue_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab purple_stained_slab_double = new CustomBlockDoubleSlab("purple_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab magenta_stained_slab_double = new CustomBlockDoubleSlab("magenta_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab pink_stained_slab_double = new CustomBlockDoubleSlab("pink_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab white_stained_slab_double = new CustomBlockDoubleSlab("white_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab light_gray_stained_slab_double = new CustomBlockDoubleSlab("light_gray_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab gray_stained_slab_double = new CustomBlockDoubleSlab("gray_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab black_stained_slab_double = new CustomBlockDoubleSlab("black_stained_slab_double", 2.5F, 4.5F);
	public static final BlockSlab brown_stained_slab_double = new CustomBlockDoubleSlab("brown_stained_slab_double", 2.5F, 4.5F);

	public static final Block red_stained_fence = new CustomBlockFence("red_stained_fence", 2.5F, 4.5F);
	public static final Block orange_stained_fence = new CustomBlockFence("orange_stained_fence", 2.5F, 4.5F);
	public static final Block yellow_stained_fence = new CustomBlockFence("yellow_stained_fence", 2.5F, 4.5F);
	public static final Block lime_stained_fence = new CustomBlockFence("lime_stained_fence", 2.5F, 4.5F);
	public static final Block green_stained_fence = new CustomBlockFence("green_stained_fence", 2.5F, 4.5F);
	public static final Block cyan_stained_fence = new CustomBlockFence("cyan_stained_fence", 2.5F, 4.5F);
	public static final Block light_blue_stained_fence = new CustomBlockFence("light_blue_stained_fence", 2.5F, 4.5F);
	public static final Block blue_stained_fence = new CustomBlockFence("blue_stained_fence", 2.5F, 4.5F);
	public static final Block purple_stained_fence = new CustomBlockFence("purple_stained_fence", 2.5F, 4.5F);
	public static final Block magenta_stained_fence = new CustomBlockFence("magenta_stained_fence", 2.5F, 4.5F);
	public static final Block pink_stained_fence = new CustomBlockFence("pink_stained_fence", 2.5F, 4.5F);
	public static final Block white_stained_fence = new CustomBlockFence("white_stained_fence", 2.5F, 4.5F);
	public static final Block light_gray_stained_fence = new CustomBlockFence("light_gray_stained_fence", 2.5F, 4.5F);
	public static final Block gray_stained_fence = new CustomBlockFence("gray_stained_fence", 2.5F, 4.5F);
	public static final Block black_stained_fence = new CustomBlockFence("black_stained_fence", 2.5F, 4.5F);
	public static final Block brown_stained_fence = new CustomBlockFence("brown_stained_fence", 2.5F, 4.5F);

	public static final Block red_stained_fence_gate = new CustomBlockFenceGate("red_stained_fence_gate", 2.5F, 4.5F);
	public static final Block orange_stained_fence_gate = new CustomBlockFenceGate("orange_stained_fence_gate", 2.5F, 4.5F);
	public static final Block yellow_stained_fence_gate = new CustomBlockFenceGate("yellow_stained_fence_gate", 2.5F, 4.5F);
	public static final Block lime_stained_fence_gate = new CustomBlockFenceGate("lime_stained_fence_gate", 2.5F, 4.5F);
	public static final Block green_stained_fence_gate = new CustomBlockFenceGate("green_stained_fence_gate", 2.5F, 4.5F);
	public static final Block cyan_stained_fence_gate = new CustomBlockFenceGate("cyan_stained_fence_gate", 2.5F, 4.5F);
	public static final Block light_blue_stained_fence_gate = new CustomBlockFenceGate("light_blue_stained_fence_gate", 2.5F, 4.5F);
	public static final Block blue_stained_fence_gate = new CustomBlockFenceGate("blue_stained_fence_gate", 2.5F, 4.5F);
	public static final Block purple_stained_fence_gate = new CustomBlockFenceGate("purple_stained_fence_gate", 2.5F, 4.5F);
	public static final Block magenta_stained_fence_gate = new CustomBlockFenceGate("magenta_stained_fence_gate", 2.5F, 4.5F);
	public static final Block pink_stained_fence_gate = new CustomBlockFenceGate("pink_stained_fence_gate", 2.5F, 4.5F);
	public static final Block white_stained_fence_gate = new CustomBlockFenceGate("white_stained_fence_gate", 2.5F, 4.5F);
	public static final Block light_gray_stained_fence_gate = new CustomBlockFenceGate("light_gray_stained_fence_gate", 2.5F, 4.5F);
	public static final Block gray_stained_fence_gate = new CustomBlockFenceGate("gray_stained_fence_gate", 2.5F, 4.5F);
	public static final Block black_stained_fence_gate = new CustomBlockFenceGate("black_stained_fence_gate", 2.5F, 4.5F);
	public static final Block brown_stained_fence_gate = new CustomBlockFenceGate("brown_stained_fence_gate", 2.5F, 4.5F);

	public static final Block red_stained_pressure_plate = new BlockCustomPressurePlate("red_stained_pressure_plate", 10);
	public static final Block orange_stained_pressure_plate = new BlockCustomPressurePlate("orange_stained_pressure_plate", 10);
	public static final Block yellow_stained_pressure_plate = new BlockCustomPressurePlate("yellow_stained_pressure_plate", 10);
	public static final Block lime_stained_pressure_plate = new BlockCustomPressurePlate("lime_stained_pressure_plate", 10);
	public static final Block green_stained_pressure_plate = new BlockCustomPressurePlate("green_stained_pressure_plate", 10);
	public static final Block cyan_stained_pressure_plate = new BlockCustomPressurePlate("cyan_stained_pressure_plate", 10);
	public static final Block light_blue_stained_pressure_plate = new BlockCustomPressurePlate("light_blue_stained_pressure_plate", 10);
	public static final Block blue_stained_pressure_plate = new BlockCustomPressurePlate("blue_stained_pressure_plate", 10);
	public static final Block purple_stained_pressure_plate = new BlockCustomPressurePlate("purple_stained_pressure_plate", 10);
	public static final Block magenta_stained_pressure_plate = new BlockCustomPressurePlate("magenta_stained_pressure_plate", 10);
	public static final Block pink_stained_pressure_plate = new BlockCustomPressurePlate("pink_stained_pressure_plate", 10);
	public static final Block white_stained_pressure_plate = new BlockCustomPressurePlate("white_stained_pressure_plate", 10);
	public static final Block light_gray_stained_pressure_plate = new BlockCustomPressurePlate("light_gray_stained_pressure_plate", 10);
	public static final Block gray_stained_pressure_plate = new BlockCustomPressurePlate("gray_stained_pressure_plate", 10);
	public static final Block black_stained_pressure_plate = new BlockCustomPressurePlate("black_stained_pressure_plate", 10);
	public static final Block brown_stained_pressure_plate = new BlockCustomPressurePlate("brown_stained_pressure_plate", 10);

	public static final Block red_stained_button = new BlockCustomButton("red_stained_button");
	public static final Block orange_stained_button = new BlockCustomButton("orange_stained_button");
	public static final Block yellow_stained_button = new BlockCustomButton("yellow_stained_button");
	public static final Block lime_stained_button = new BlockCustomButton("lime_stained_button");
	public static final Block green_stained_button = new BlockCustomButton("green_stained_button");
	public static final Block cyan_stained_button = new BlockCustomButton("cyan_stained_button");
	public static final Block light_blue_stained_button = new BlockCustomButton("light_blue_stained_button");
	public static final Block blue_stained_button = new BlockCustomButton("blue_stained_button");
	public static final Block purple_stained_button = new BlockCustomButton("purple_stained_button");
	public static final Block magenta_stained_button = new BlockCustomButton("magenta_stained_button");
	public static final Block pink_stained_button = new BlockCustomButton("pink_stained_button");
	public static final Block white_stained_button = new BlockCustomButton("white_stained_button");
	public static final Block light_gray_stained_button = new BlockCustomButton("light_gray_stained_button");
	public static final Block gray_stained_button = new BlockCustomButton("gray_stained_button");
	public static final Block black_stained_button = new BlockCustomButton("black_stained_button");
	public static final Block brown_stained_button = new BlockCustomButton("brown_stained_button");

	public static final Block leaves_jacaranda = new BlockJacarandaLeaves("jacaranda_leaves");
	public static final Block leaves_wisteria = new BlockWisteriaLeaves("wisteria_leaves");
	public static final Block leaves_silverbell = new BlockSilverBellLeaves("silverbell_leaves");
	public static final Block leaves_dogwood = new BlockDogwoodLeaves("dogwood_leaves");
	public static final Block leaves_crabapple = new BlockCrabappleLeaves("crabapple_leaves");
	public static final Block leaves_paulownia = new BlockPaulowniaLeaves("paulownia_leaves");
	public static final Block leaves_laburnum = new BlockLaburnumLeaves("laburnum_leaves");

	public static final Block log_jacaranda = new BlockJacarandaLog("jacaranda_log");
	public static final Block log_wisteria = new BlockWisteriaLog("wisteria_log");
	public static final Block log_silverbell = new BlockSilverBellLog("silverbell_log");
	public static final Block log_dogwood = new BlockDogwoodLog("dogwood_log");
	public static final Block log_crabapple = new BlockCrabappleLog("crabapple_log");
	public static final Block log_paulownia = new BlockPaulowniaLog("paulownia_log");
	public static final Block log_laburnum = new BlockLaburnumLog("laburnum_log");

	public static final Block sapling_jacaranda = new BlockJacarandaSapling("jacaranda_sapling");
	public static final Block sapling_wisteria = new BlockWisteriaSapling("wisteria_sapling");
	public static final Block sapling_silverbell = new BlockSilverBellSapling("silverbell_sapling");
	public static final Block sapling_crabapple = new BlockCrabappleSapling("crabapple_sapling");
	public static final Block sapling_dogwood = new BlockDogwoodSapling("dogwood_sapling");
	public static final Block sapling_laburnum = new BlockLaburnumSapling("laburnum_sapling");
	public static final Block sapling_paulownia = new BlockPaulowniaSapling("paulownia_sapling");

	public static final Block sapling_jacaranda_vines = new BlockJacarandaSaplingVines("jacaranda_sapling_vines");
	public static final Block sapling_wisteria_vines = new BlockWisteriaSaplingVines("wisteria_sapling_vines");
	public static final Block sapling_silverbell_vines = new BlockSilverBellSaplingVines("silverbell_sapling_vines");
	public static final Block sapling_crabapple_vines = new BlockCrabappleSaplingVines("crabapple_sapling_vines");
	public static final Block sapling_dogwood_vines = new BlockDogwoodSaplingVines("dogwood_sapling_vines");
	public static final Block sapling_laburnum_vines = new BlockLaburnumSaplingVines("laburnum_sapling_vines");
	public static final Block sapling_paulownia_vines = new BlockPaulowniaSaplingVines("paulownia_sapling_vines");

	public static final Block vine_wisteria = new BlockWisteriaVine("wisteria_vine");
	public static final Block vine_jacaranda = new BlockJacarandaVine("jacaranda_vine");
	public static final Block vine_laburnum = new BlockLaburnumVine("laburnum_vine");
	public static final Block vine_silverbell = new BlockSilverBellVine("silverbell_vine");
	public static final Block vine_paulownia = new BlockPaulowniaVine("paulownia_vine");
	public static final Block vine_dogwood = new BlockDogwoodVine("dogwood_vine");
	public static final Block vine_crabapple = new BlockCrabappleVine("crabapple_vine");

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Block> e) {
		for(Block i : BLOCKS)
			i.setCreativeTab(MaidensMaterials.blockstab);
		
		e.getRegistry().registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	}
	
	@SubscribeEvent
	public static void registerItemsNoTab(RegistryEvent.Register<Block> e) {
		
		e.getRegistry().registerAll(BLOCKS_NO_TAB.toArray(new Block[BLOCKS_NO_TAB.size()]));
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		for (Block itm : BLOCKS) {
			if(itm instanceof BlockSlab) {
				if(((BlockSlab)itm).isDouble()) {
					continue;
				}
			}
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}

	public static void registerOreDictionary() {

		// TODO
		// logs//
		OreDictionary.registerOre("logWood", MaidensBlocks.log_silverbell);
		OreDictionary.registerOre("logWood", MaidensBlocks.log_crabapple);
		OreDictionary.registerOre("logWood", MaidensBlocks.log_dogwood);
		OreDictionary.registerOre("logWood", MaidensBlocks.log_jacaranda);
		OreDictionary.registerOre("logWood", MaidensBlocks.log_wisteria);
		OreDictionary.registerOre("logWood", MaidensBlocks.log_laburnum);
		OreDictionary.registerOre("logWood", MaidensBlocks.log_paulownia);
		OreDictionary.registerOre("logWood", MaidensBlocks.cedar_log);
//leaves//
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.cedar_leaves, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_crabapple, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_dogwood, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_jacaranda, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_laburnum, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_paulownia, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_silverbell, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeLeaves", new ItemStack(MaidensBlocks.leaves_wisteria, 1, WILDCARD_VALUE));
//saplings//
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.cedar_sapling, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_crabapple, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_dogwood, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_jacaranda, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_laburnum, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_paulownia, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_silverbell, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("treeSapling", new ItemStack(MaidensBlocks.sapling_wisteria, 1, WILDCARD_VALUE));
//vines//
		OreDictionary.registerOre("vine", MaidensBlocks.vine_crabapple);
		OreDictionary.registerOre("vine", MaidensBlocks.vine_dogwood);
		OreDictionary.registerOre("vine", MaidensBlocks.vine_jacaranda);
		OreDictionary.registerOre("vine", MaidensBlocks.vine_laburnum);
		OreDictionary.registerOre("vine", MaidensBlocks.vine_paulownia);
		OreDictionary.registerOre("vine", MaidensBlocks.vine_silverbell);
		OreDictionary.registerOre("vine", MaidensBlocks.vine_wisteria);
		// planks//
		OreDictionary.registerOre("plankWood", Blocks.PLANKS);
		OreDictionary.registerOre("plankWood", MaidensBlocks.cedar_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.crabapple_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.dogwood_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.jacaranda_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.laburnum_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.paulownia_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.silverbell_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.wisteria_planks);
		
		OreDictionary.registerOre("plankWood", MaidensBlocks.red_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.orange_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.yellow_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.lime_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.green_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.cyan_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.light_blue_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.blue_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.purple_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.magenta_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.pink_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.white_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.light_gray_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.gray_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.black_stained_planks);
		OreDictionary.registerOre("plankWood", MaidensBlocks.brown_stained_planks);

		// stairs//
		OreDictionary.registerOre("stairWood", MaidensBlocks.silverbell_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.crabapple_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.dogwood_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.jacaranda_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.wisteria_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.laburnum_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.paulownia_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.cedar_stairs);
		
		OreDictionary.registerOre("stairWood", MaidensBlocks.red_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.orange_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.yellow_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.lime_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.green_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.cyan_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.light_blue_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.blue_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.purple_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.magenta_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.pink_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.white_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.light_gray_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.gray_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.black_stained_stairs);
		OreDictionary.registerOre("stairWood", MaidensBlocks.brown_stained_stairs);
		// slabs//
		OreDictionary.registerOre("slabWood", MaidensBlocks.silverbell_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.crabapple_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.dogwood_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.jacaranda_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.wisteria_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.laburnum_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.paulownia_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.cedar_slab_half);

		OreDictionary.registerOre("slabWood", MaidensBlocks.red_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.orange_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.yellow_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.lime_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.green_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.cyan_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.light_blue_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.blue_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.purple_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.magenta_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.pink_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.white_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.light_gray_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.gray_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.black_stained_slab_half);
		OreDictionary.registerOre("slabWood", MaidensBlocks.brown_stained_slab_half);
		// fences//
		
		OreDictionary.registerOre("fenceWood", MaidensBlocks.silverbell_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.crabapple_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.dogwood_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.jacaranda_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.wisteria_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.laburnum_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.paulownia_fence);
		OreDictionary.registerOre("fenceWood", MaidensBlocks.cedar_fence);

		OreDictionary.registerOre("gateWood", MaidensBlocks.red_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.orange_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.yellow_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.lime_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.green_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.cyan_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.light_blue_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.blue_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.purple_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.magenta_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.pink_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.white_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.light_gray_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.gray_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.black_stained_fence);
		OreDictionary.registerOre("gateWood", MaidensBlocks.brown_stained_fence);
		// gates//

		OreDictionary.registerOre("gateWood", MaidensBlocks.silverbell_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.crabapple_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.dogwood_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.jacaranda_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.wisteria_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.laburnum_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.paulownia_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.cedar_fence_gate);

		OreDictionary.registerOre("gateWood", MaidensBlocks.red_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.orange_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.yellow_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.lime_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.green_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.cyan_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.light_blue_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.blue_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.purple_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.magenta_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.pink_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.white_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.light_gray_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.gray_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.black_stained_fence_gate);
		OreDictionary.registerOre("gateWood", MaidensBlocks.brown_stained_fence_gate);
		//buttons//
		OreDictionary.registerOre("buttonWood", MaidensBlocks.silverbell_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.crabapple_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.dogwood_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.jacaranda_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.wisteria_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.laburnum_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.paulownia_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.cedar_button);
		
		OreDictionary.registerOre("buttonWood", MaidensBlocks.red_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.orange_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.yellow_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.lime_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.green_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.cyan_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.light_blue_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.blue_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.purple_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.magenta_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.pink_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.white_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.light_gray_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.gray_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.black_stained_button);
		OreDictionary.registerOre("buttonWood", MaidensBlocks.brown_stained_button);
		//pressure plates//
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.silverbell_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.crabapple_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.dogwood_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.jacaranda_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.wisteria_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.laburnum_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.paulownia_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.cedar_pressure_plate);
		
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.red_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.orange_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.yellow_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.lime_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.green_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.cyan_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.light_blue_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.blue_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.purple_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.magenta_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.pink_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.white_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.light_gray_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.gray_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.black_stained_pressure_plate);
		OreDictionary.registerOre("pressurePlateWood", MaidensBlocks.brown_stained_pressure_plate);
		//bookshelves//
		OreDictionary.registerOre("bookshelf", MaidensBlocks.silverbell_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.crabapple_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.dogwood_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.jacaranda_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.wisteria_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.laburnum_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.paulownia_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.cedar_bookshelf);
		
		OreDictionary.registerOre("bookshelf", MaidensBlocks.red_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.orange_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.yellow_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.lime_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.green_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.cyan_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.light_blue_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.blue_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.purple_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.magenta_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.pink_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.white_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.light_gray_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.gray_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.black_stained_bookshelf);
		OreDictionary.registerOre("bookshelf", MaidensBlocks.brown_stained_bookshelf);
		//concrete//
		OreDictionary.registerOre("blockConcrete", Blocks.CONCRETE);
		
		OreDictionary.registerOre("oreAmethyst", MaidensBlocks.amethyst_ore);
		OreDictionary.registerOre("oreAventurine", MaidensBlocks.aventurine_ore);
		OreDictionary.registerOre("oreCarnelian", MaidensBlocks.carnelian_ore);
		OreDictionary.registerOre("oreChalcopyrite", MaidensBlocks.chalcopyrite_ore);
		OreDictionary.registerOre("oreCitrine", MaidensBlocks.citrine_ore);
		OreDictionary.registerOre("oreJade", MaidensBlocks.jade_ore);
		OreDictionary.registerOre("oreJasper", MaidensBlocks.jasper_ore);
		OreDictionary.registerOre("oreLabradorite", MaidensBlocks.labradorite_ore);
		OreDictionary.registerOre("oreMica", MaidensBlocks.mica_ore);
		OreDictionary.registerOre("oreMoonstone", MaidensBlocks.moonstone_ore);
		OreDictionary.registerOre("oreRoseQuartz", MaidensBlocks.rose_quartz_ore);
		OreDictionary.registerOre("oreSodalite", MaidensBlocks.sodalite_ore);
		
		OreDictionary.registerOre("grass", MaidensBlocks.ornamental_grass);
	
		
		MaidensBlocks.GRASS.add(MaidensBlocks.ornamental_grass);
	
		
	}

	public static final List<Block> ORES = new ArrayList<Block>();
	public static final List<Block> GRASS = new ArrayList<Block>();
	public static final List<Item> GEM_DROPS = new ArrayList<Item>();

	
			
}