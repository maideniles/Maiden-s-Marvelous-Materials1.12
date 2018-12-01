package com.maideniles.maidensmaterials.init;

import java.util.ArrayList;
import java.util.List;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.blocks.BlockCobbleVines;
import com.maideniles.maidensmaterials.init.blocks.BlockCustomFacing;
import com.maideniles.maidensmaterials.init.blocks.BlockEssenceStorage;
import com.maideniles.maidensmaterials.init.blocks.BlockGemStorage;
import com.maideniles.maidensmaterials.init.blocks.BlockGemTile;
import com.maideniles.maidensmaterials.init.blocks.CustomBlockGrass;
import com.maideniles.maidensmaterials.init.blocks.CustomBrickBlock;
import com.maideniles.maidensmaterials.init.blocks.CustomIngotBlock;
import com.maideniles.maidensmaterials.init.blocks.CustomOre;
import com.maideniles.maidensmaterials.init.blocks.CustomWoodPlanks;
import com.maideniles.maidensmaterials.init.blocks.item.ItemBlockDoor;
import com.maideniles.maidensmaterials.init.blocks.item.ItemBlockVariants;
import com.maideniles.maidensmaterials.init.blocks.stained.BlockBaseFacing;
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
import com.maideniles.maidensmaterials.init.blocks.trees.sapling.BlockLaburnumSaplingVines;
import com.maideniles.maidensmaterials.world.feature.flower.FairyGlowCup;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public class BlockInit 

//TODO
{
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	
	public static Block vine_tie;
	
	public static Block earthen_block, floral_block;
	public static Block crabapple_cobblestone, dogwood_cobblestone, jacaranda_cobblestone, laburnum_cobblestone, paulownia_cobblestone, silverbell_cobblestone, wisteria_cobblestone;
	public static Block amethyst_block,aventurine_block,carnelian_block,chalcopyrite_block,citrine_block,jade_block,jasper_block,labradorite_block,mica_block,moonstone_block,rose_quartz_block, sodalite_block;
	public static Block amethyst_tile_1, amethyst_tile_2, amethyst_tile_3, amethyst_tile_4, amethyst_tile_5, amethyst_tile_6;
	public static Block chalcopyrite_tile_1, chalcopyrite_tile_2, chalcopyrite_tile_3, chalcopyrite_tile_4, chalcopyrite_tile_5, chalcopyrite_tile_6;
	public static Block jade_tile_1, jade_tile_2, jade_tile_3, jade_tile_4, jade_tile_5, jade_tile_6;
	public static Block jasper_tile_1, jasper_tile_2, jasper_tile_3, jasper_tile_4, jasper_tile_5, jasper_tile_6;
	public static Block mica_tile_1, mica_tile_2, mica_tile_3, mica_tile_4, mica_tile_5, mica_tile_6;
	public static Block labradorite_tile_1, labradorite_tile_2, labradorite_tile_3, labradorite_tile_4, labradorite_tile_5, labradorite_tile_6;
	public static Block moonstone_tile_1, moonstone_tile_2, moonstone_tile_3, moonstone_tile_4, moonstone_tile_5, moonstone_tile_6;
	public static Block rose_quartz_tile_1, rose_quartz_tile_2, rose_quartz_tile_3, rose_quartz_tile_4, rose_quartz_tile_5, rose_quartz_tile_6;
	public static Block sodalite_tile_1, sodalite_tile_2, sodalite_tile_3, sodalite_tile_4, sodalite_tile_5, sodalite_tile_6;
	public static Block citrine_tile_1, citrine_tile_2, citrine_tile_3, citrine_tile_4, citrine_tile_5, citrine_tile_6;
	public static Block aventurine_tile_1, aventurine_tile_2, aventurine_tile_3, aventurine_tile_4, aventurine_tile_5, aventurine_tile_6;
	public static Block carnelian_tile_1, carnelian_tile_2, carnelian_tile_3, carnelian_tile_4, carnelian_tile_5, carnelian_tile_6;
	
	public static Block red_clay_block,orange_clay_block,yellow_clay_block,lime_clay_block,green_clay_block,cyan_clay_block,light_blue_clay_block;
	public static Block blue_clay_block, purple_clay_block, magenta_clay_block, brown_clay_block, black_clay_block, gray_clay_block, light_gray_clay_block;
	public static Block white_clay_block, pink_clay_block;
	
	public static Block red_brick_block,orange_brick_block,yellow_brick_block,lime_brick_block,green_brick_block,cyan_brick_block,light_blue_brick_block;
	public static Block blue_brick_block, purple_brick_block, magenta_brick_block, brown_brick_block, black_brick_block, gray_brick_block, light_gray_brick_block;
	public static Block white_brick_block, pink_brick_block;
	
	public static Block red_brick_stairs,orange_brick_stairs,yellow_brick_stairs,lime_brick_stairs,green_brick_stairs,cyan_brick_stairs,light_blue_brick_stairs;
	public static Block blue_brick_stairs, purple_brick_stairs, magenta_brick_stairs, brown_brick_stairs, black_brick_stairs, gray_brick_stairs, light_gray_brick_stairs;
	public static Block white_brick_stairs, pink_brick_stairs;
		
	public static CustomBlockHalfSlab red_brick_slab_half;
	public static CustomBlockHalfSlab orange_brick_slab_half;
	public static CustomBlockHalfSlab yellow_brick_slab_half;
	public static CustomBlockHalfSlab lime_brick_slab_half;
	public static CustomBlockHalfSlab green_brick_slab_half;
	public static CustomBlockHalfSlab cyan_brick_slab_half;
	public static CustomBlockHalfSlab light_blue_brick_slab_half;
	public static CustomBlockHalfSlab blue_brick_slab_half;
	public static CustomBlockHalfSlab purple_brick_slab_half;
	public static CustomBlockHalfSlab magenta_brick_slab_half;
	public static CustomBlockHalfSlab pink_brick_slab_half;
	public static CustomBlockHalfSlab white_brick_slab_half;
	public static CustomBlockHalfSlab light_gray_brick_slab_half;
	public static CustomBlockHalfSlab gray_brick_slab_half;
	public static CustomBlockHalfSlab black_brick_slab_half;
	public static CustomBlockHalfSlab brown_brick_slab_half;
	
	public static CustomBlockDoubleSlab red_brick_slab_double;
	public static CustomBlockDoubleSlab orange_brick_slab_double;
	public static CustomBlockDoubleSlab yellow_brick_slab_double;
	public static CustomBlockDoubleSlab lime_brick_slab_double;
	public static CustomBlockDoubleSlab green_brick_slab_double;
	public static CustomBlockDoubleSlab cyan_brick_slab_double;
	public static CustomBlockDoubleSlab light_blue_brick_slab_double;
	public static CustomBlockDoubleSlab blue_brick_slab_double;
	public static CustomBlockDoubleSlab purple_brick_slab_double;
	public static CustomBlockDoubleSlab magenta_brick_slab_double;
	public static CustomBlockDoubleSlab pink_brick_slab_double;
	public static CustomBlockDoubleSlab white_brick_slab_double;
	public static CustomBlockDoubleSlab light_gray_brick_slab_double;
	public static CustomBlockDoubleSlab gray_brick_slab_double;
	public static CustomBlockDoubleSlab black_brick_slab_double;
	public static CustomBlockDoubleSlab brown_brick_slab_double;
	
	public static Block red_large_brick_block,orange_large_brick_block,yellow_large_brick_block,lime_large_brick_block,green_large_brick_block,cyan_large_brick_block,light_blue_large_brick_block;
	public static Block blue_large_brick_block, purple_large_brick_block, magenta_large_brick_block, brown_large_brick_block, black_large_brick_block, gray_large_brick_block, light_gray_large_brick_block;
	public static Block white_large_brick_block, pink_large_brick_block;
	
	public static Block red_large_brick_stairs,orange_large_brick_stairs,yellow_large_brick_stairs,lime_large_brick_stairs,green_large_brick_stairs,cyan_large_brick_stairs,light_blue_large_brick_stairs;
	public static Block blue_large_brick_stairs, purple_large_brick_stairs, magenta_large_brick_stairs, brown_large_brick_stairs, black_large_brick_stairs, gray_large_brick_stairs, light_gray_large_brick_stairs;
	public static Block white_large_brick_stairs, pink_large_brick_stairs;
		
	public static CustomBlockHalfSlab red_large_brick_slab_half;
	public static CustomBlockHalfSlab orange_large_brick_slab_half;
	public static CustomBlockHalfSlab yellow_large_brick_slab_half;
	public static CustomBlockHalfSlab lime_large_brick_slab_half;
	public static CustomBlockHalfSlab green_large_brick_slab_half;
	public static CustomBlockHalfSlab cyan_large_brick_slab_half;
	public static CustomBlockHalfSlab light_blue_large_brick_slab_half;
	public static CustomBlockHalfSlab blue_large_brick_slab_half;
	public static CustomBlockHalfSlab purple_large_brick_slab_half;
	public static CustomBlockHalfSlab magenta_large_brick_slab_half;
	public static CustomBlockHalfSlab pink_large_brick_slab_half;
	public static CustomBlockHalfSlab white_large_brick_slab_half;
	public static CustomBlockHalfSlab light_gray_large_brick_slab_half;
	public static CustomBlockHalfSlab gray_large_brick_slab_half;
	public static CustomBlockHalfSlab black_large_brick_slab_half;
	public static CustomBlockHalfSlab brown_large_brick_slab_half;
	
	public static CustomBlockDoubleSlab red_large_brick_slab_double;
	public static CustomBlockDoubleSlab orange_large_brick_slab_double;
	public static CustomBlockDoubleSlab yellow_large_brick_slab_double;
	public static CustomBlockDoubleSlab lime_large_brick_slab_double;
	public static CustomBlockDoubleSlab green_large_brick_slab_double;
	public static CustomBlockDoubleSlab cyan_large_brick_slab_double;
	public static CustomBlockDoubleSlab light_blue_large_brick_slab_double;
	public static CustomBlockDoubleSlab blue_large_brick_slab_double;
	public static CustomBlockDoubleSlab purple_large_brick_slab_double;
	public static CustomBlockDoubleSlab magenta_large_brick_slab_double;
	public static CustomBlockDoubleSlab pink_large_brick_slab_double;
	public static CustomBlockDoubleSlab white_large_brick_slab_double;
	public static CustomBlockDoubleSlab light_gray_large_brick_slab_double;
	public static CustomBlockDoubleSlab gray_large_brick_slab_double;
	public static CustomBlockDoubleSlab black_large_brick_slab_double;
	public static CustomBlockDoubleSlab brown_large_brick_slab_double;
	
	public static Block vase, vase_red, vase_orange, vase_yellow, vase_lime, vase_green, vase_cyan, vase_light_blue, vase_blue, vase_purple;
	public static Block vase_magenta, vase_pink, vase_light_gray, vase_gray, vase_black, vase_brown;
	
	public static Block cedar_planks, cedar_sapling, cedar_log, cedar_leaves;
	

	public static Block ornamental_grass;
	public static Block ornamental_dirt;

	public static Block fairy_glow_cup;
	
	public static Block mica_ore, mica_ore_end, mica_ore_nether;
	public static Block amethyst_ore, amethyst_ore_nether, amethyst_ore_end;
	public static Block chalcopyrite_ore, chalcopyrite_ore_nether, chalcopyrite_ore_end;
	public static Block jade_ore, jade_ore_nether, jade_ore_end;
	public static Block jasper_ore, jasper_ore_nether, jasper_ore_end;
	public static Block labradorite_ore, labradorite_ore_nether, labradorite_ore_end;
	public static Block moonstone_ore, moonstone_ore_nether, moonstone_ore_end;
	public static Block rose_quartz_ore, rose_quartz_ore_nether, rose_quartz_ore_end;
	public static Block sodalite_ore, sodalite_ore_nether, sodalite_ore_end;
	public static Block aventurine_ore, aventurine_ore_nether, aventurine_ore_end;
	public static Block citrine_ore, citrine_ore_nether, citrine_ore_end;
	public static Block carnelian_ore, carnelian_ore_nether, carnelian_ore_end;
	
	public static CustomBlockHalfSlab base_slab_half;
	public static CustomBlockDoubleSlab base_slab_double;
	
	public static Block silverbell_planks, crabapple_planks, dogwood_planks, jacaranda_planks, wisteria_planks, whitewashed_planks, laburnum_planks, paulownia_planks;
	public static CustomBlockHalfSlab silverbell_slab_half, crabapple_slab_half, dogwood_slab_half, jacaranda_slab_half, wisteria_slab_half, whitewashed_slab_half, paulownia_slab_half, laburnum_slab_half, cedar_slab_half;
	public static CustomBlockDoubleSlab silverbell_slab_double, crabapple_slab_double, dogwood_slab_double, jacaranda_slab_double, wisteria_slab_double, whitewashed_slab_double, paulownia_slab_double, laburnum_slab_double, cedar_slab_double;
	public static Block silverbell_stairs, crabapple_stairs, dogwood_stairs, jacaranda_stairs, wisteria_stairs, whitewashed_stairs, paulownia_stairs, laburnum_stairs,cedar_stairs;
	public static Block silverbell_fence, crabapple_fence, dogwood_fence, jacaranda_fence, wisteria_fence, whitewashed_fence, paulownia_fence, laburnum_fence, cedar_fence;
	public static Block silverbell_fence_gate, crabapple_fence_gate, dogwood_fence_gate, jacaranda_fence_gate, wisteria_fence_gate, whitewashed_fence_gate, paulownia_fence_gate, laburnum_fence_gate, cedar_fence_gate;
	
	public static Block red_stained_trapdoor_1, orange_stained_trapdoor_1, yellow_stained_trapdoor_1, lime_stained_trapdoor_1, green_stained_trapdoor_1, cyan_stained_trapdoor_1, light_blue_stained_trapdoor_1;
	public static Block blue_stained_trapdoor_1, purple_stained_trapdoor_1, magenta_stained_trapdoor_1, pink_stained_trapdoor_1, white_stained_trapdoor_1, light_gray_stained_trapdoor_1, gray_stained_trapdoor_1;
	public static Block black_stained_trapdoor_1, brown_stained_trapdoor_1;
	
	public static Block red_stained_trapdoor_4, orange_stained_trapdoor_4, yellow_stained_trapdoor_4, lime_stained_trapdoor_4, green_stained_trapdoor_4, cyan_stained_trapdoor_4, light_blue_stained_trapdoor_4;
	public static Block blue_stained_trapdoor_4, purple_stained_trapdoor_4, magenta_stained_trapdoor_4, pink_stained_trapdoor_4, white_stained_trapdoor_4, light_gray_stained_trapdoor_4, gray_stained_trapdoor_4;
	public static Block black_stained_trapdoor_4, brown_stained_trapdoor_4;
			
	public static Block red_stained_door_1, orange_stained_door_1, yellow_stained_door_1, lime_stained_door_1, green_stained_door_1, cyan_stained_door_1, light_blue_stained_door_1;
	public static Block blue_stained_door_1, purple_stained_door_1, magenta_stained_door_1, pink_stained_door_1, white_stained_door_1, light_gray_stained_door_1, gray_stained_door_1;
	public static Block black_stained_door_1, brown_stained_door_1;
	
	public static Block red_stained_door_2, orange_stained_door_2, yellow_stained_door_2, lime_stained_door_2, green_stained_door_2, cyan_stained_door_2, light_blue_stained_door_2;
	public static Block blue_stained_door_2,  purple_stained_door_2, magenta_stained_door_2, pink_stained_door_2, white_stained_door_2,light_gray_stained_door_2; 
	public static Block gray_stained_door_2, black_stained_door_2, brown_stained_door_2;

	public static Block red_stained_door_3, orange_stained_door_3, yellow_stained_door_3, lime_stained_door_3, green_stained_door_3, cyan_stained_door_3, light_blue_stained_door_3;
	public static Block blue_stained_door_3,  purple_stained_door_3, magenta_stained_door_3, pink_stained_door_3, white_stained_door_3,light_gray_stained_door_3; 
	public static Block gray_stained_door_3, black_stained_door_3, brown_stained_door_3;
	
	public static Block red_stained_door_4, orange_stained_door_4, yellow_stained_door_4, lime_stained_door_4, green_stained_door_4, cyan_stained_door_4, light_blue_stained_door_4;
	public static Block blue_stained_door_4,  purple_stained_door_4, magenta_stained_door_4, pink_stained_door_4, white_stained_door_4,light_gray_stained_door_4; 
	public static Block gray_stained_door_4, black_stained_door_4, brown_stained_door_4;
	
	public static Block red_stained_door_5, orange_stained_door_5, yellow_stained_door_5, lime_stained_door_5, green_stained_door_5, cyan_stained_door_5, light_blue_stained_door_5;
	public static Block blue_stained_door_5,  purple_stained_door_5, magenta_stained_door_5, pink_stained_door_5, white_stained_door_5,light_gray_stained_door_5; 
	public static Block gray_stained_door_5, black_stained_door_5, brown_stained_door_5;
	
	public static Block red_stained_door_6, orange_stained_door_6, yellow_stained_door_6, lime_stained_door_6, green_stained_door_6, cyan_stained_door_6, light_blue_stained_door_6;
	public static Block blue_stained_door_6,  purple_stained_door_6, magenta_stained_door_6, pink_stained_door_6, white_stained_door_6,light_gray_stained_door_6; 
	public static Block gray_stained_door_6, black_stained_door_6, brown_stained_door_6;
		
	public static Block acacia_door_1, acacia_door_2, acacia_door_3, acacia_door_4, acacia_door_5, acacia_door_6;
	
	public static Block birch_door_1, birch_door_2, birch_door_3, birch_door_4, birch_door_5, birch_door_6;
	
	public static Block oak_door_1, oak_door_2, oak_door_3, oak_door_4, oak_door_5, oak_door_6;
	
	public static Block spruce_door_1, spruce_door_2, spruce_door_3, spruce_door_4, spruce_door_5, spruce_door_6;
	
	public static Block dark_oak_door_1, dark_oak_door_2, dark_oak_door_3, dark_oak_door_4, dark_oak_door_5, dark_oak_door_6;
	
	public static Block jungle_door_1, jungle_door_2, jungle_door_3, jungle_door_4, jungle_door_5, jungle_door_6;
	
	public static Block silverbell_door_1, silverbell_door_2, silverbell_door_3, silverbell_door_4, silverbell_door_5, silverbell_door_6;
	public static Block crabapple_door_1, crabapple_door_2, crabapple_door_3, crabapple_door_4, crabapple_door_5, crabapple_door_6;
	public static Block dogwood_door_1, dogwood_door_2, dogwood_door_3, dogwood_door_4, dogwood_door_5, dogwood_door_6;
	public static Block jacaranda_door_1, jacaranda_door_2, jacaranda_door_3, jacaranda_door_4, jacaranda_door_5, jacaranda_door_6;
	public static Block paulownia_door_1, paulownia_door_2, paulownia_door_3, paulownia_door_4, paulownia_door_5, paulownia_door_6;
	public static Block wisteria_door_1, wisteria_door_2, wisteria_door_3, wisteria_door_4, wisteria_door_5, wisteria_door_6;
	public static Block laburnum_door_1, laburnum_door_2, laburnum_door_3, laburnum_door_4, laburnum_door_5, laburnum_door_6;
	public static Block cedar_door_1, cedar_door_2, cedar_door_3, cedar_door_4, cedar_door_5, cedar_door_6;
	
	public static Block red_stained_stairs,orange_stained_stairs,yellow_stained_stairs,lime_stained_stairs,green_stained_stairs,cyan_stained_stairs,light_blue_stained_stairs;
	public static Block blue_stained_stairs, purple_stained_stairs, magenta_stained_stairs, brown_stained_stairs, black_stained_stairs, gray_stained_stairs, light_gray_stained_stairs;
	public static Block white_stained_stairs, pink_stained_stairs;
	
	public static Block red_stained_planks,orange_stained_planks,yellow_stained_planks,lime_stained_planks,green_stained_planks,cyan_stained_planks,light_blue_stained_planks;
	public static Block blue_stained_planks, purple_stained_planks, magenta_stained_planks, brown_stained_planks, black_stained_planks, gray_stained_planks, light_gray_stained_planks;
	public static Block white_stained_planks, pink_stained_planks;
	
	public static Block red_stained_bookshelf, orange_stained_bookshelf, yellow_stained_bookshelf, lime_stained_bookshelf, green_stained_bookshelf, cyan_stained_bookshelf, light_blue_stained_bookshelf;
	public static Block blue_stained_bookshelf, purple_stained_bookshelf, magenta_stained_bookshelf, brown_stained_bookshelf, black_stained_bookshelf, gray_stained_bookshelf; 
	public static Block light_gray_stained_bookshelf, white_stained_bookshelf, pink_stained_bookshelf;
	public static Block cedar_bookshelf, crabapple_bookshelf, dogwood_bookshelf, jacaranda_bookshelf, laburnum_bookshelf, paulownia_bookshelf, silverbell_bookshelf, wisteria_bookshelf;
	public static Block acacia_bookshelf, birch_bookshelf, oak_bookshelf, spruce_bookshelf, dark_oak_bookshelf, jungle_bookshelf;
	 
	public static CustomBlockHalfSlab red_stained_slab_half;
	public static CustomBlockHalfSlab orange_stained_slab_half;
	public static CustomBlockHalfSlab yellow_stained_slab_half;
	public static CustomBlockHalfSlab lime_stained_slab_half;
	public static CustomBlockHalfSlab green_stained_slab_half;
	public static CustomBlockHalfSlab cyan_stained_slab_half;
	public static CustomBlockHalfSlab light_blue_stained_slab_half;
	public static CustomBlockHalfSlab blue_stained_slab_half;
	public static CustomBlockHalfSlab purple_stained_slab_half;
	public static CustomBlockHalfSlab magenta_stained_slab_half;
	public static CustomBlockHalfSlab pink_stained_slab_half;
	public static CustomBlockHalfSlab white_stained_slab_half;
	public static CustomBlockHalfSlab light_gray_stained_slab_half;
	public static CustomBlockHalfSlab gray_stained_slab_half;
	public static CustomBlockHalfSlab black_stained_slab_half;
	public static CustomBlockHalfSlab brown_stained_slab_half;
	
	public static CustomBlockDoubleSlab red_stained_slab_double;
	public static CustomBlockDoubleSlab orange_stained_slab_double;
	public static CustomBlockDoubleSlab yellow_stained_slab_double;
	public static CustomBlockDoubleSlab lime_stained_slab_double;
	public static CustomBlockDoubleSlab green_stained_slab_double;
	public static CustomBlockDoubleSlab cyan_stained_slab_double;
	public static CustomBlockDoubleSlab light_blue_stained_slab_double;
	public static CustomBlockDoubleSlab blue_stained_slab_double;
	public static CustomBlockDoubleSlab purple_stained_slab_double;
	public static CustomBlockDoubleSlab magenta_stained_slab_double;
	public static CustomBlockDoubleSlab pink_stained_slab_double;
	public static CustomBlockDoubleSlab white_stained_slab_double;
	public static CustomBlockDoubleSlab light_gray_stained_slab_double;
	public static CustomBlockDoubleSlab gray_stained_slab_double;
	public static CustomBlockDoubleSlab black_stained_slab_double;
	public static CustomBlockDoubleSlab brown_stained_slab_double;
	
	public static Block red_stained_fence,orange_stained_fence,yellow_stained_fence,lime_stained_fence,green_stained_fence,cyan_stained_fence,light_blue_stained_fence;
	public static Block blue_stained_fence, purple_stained_fence, magenta_stained_fence, brown_stained_fence, black_stained_fence, gray_stained_fence, light_gray_stained_fence;
	public static Block white_stained_fence, pink_stained_fence;
	
	public static Block red_stained_fence_gate,orange_stained_fence_gate,yellow_stained_fence_gate,lime_stained_fence_gate,green_stained_fence_gate,cyan_stained_fence_gate;
	public static Block light_blue_stained_fence_gate, blue_stained_fence_gate, purple_stained_fence_gate, magenta_stained_fence_gate, brown_stained_fence_gate; 
	public static Block black_stained_fence_gate, gray_stained_fence_gate, light_gray_stained_fence_gate, white_stained_fence_gate, pink_stained_fence_gate;
	
	public static Block red_stained_pressure_plate,orange_stained_pressure_plate,yellow_stained_pressure_plate,lime_stained_pressure_plate,green_stained_pressure_plate,cyan_stained_pressure_plate,light_blue_stained_pressure_plate;
	public static Block blue_stained_pressure_plate, purple_stained_pressure_plate, magenta_stained_pressure_plate, brown_stained_pressure_plate, black_stained_pressure_plate, gray_stained_pressure_plate, light_gray_stained_pressure_plate;
	public static Block white_stained_pressure_plate, pink_stained_pressure_plate;
	
	public static Block red_stained_button,orange_stained_button,yellow_stained_button,lime_stained_button,green_stained_button,cyan_stained_button,light_blue_stained_button;
	public static Block blue_stained_button, purple_stained_button, magenta_stained_button, brown_stained_button, black_stained_button, gray_stained_button, light_gray_stained_button;
	public static Block white_stained_button, pink_stained_button;

	
	public static Block cedar_pressure_plate, crabapple_pressure_plate, dogwood_pressure_plate, jacaranda_pressure_plate, laburnum_pressure_plate, paulownia_pressure_plate, silverbell_pressure_plate, wisteria_pressure_plate;
	public static Block acacia_pressure_plate, birch_pressure_plate, oak_pressure_plate, spruce_pressure_plate, dark_oak_pressure_plate, jungle_pressure_plate;
	
	public static Block cedar_button, crabapple_button, dogwood_button, jacaranda_button, laburnum_button, paulownia_button, silverbell_button, wisteria_button;
	public static Block acacia_button, birch_button, oak_button, dark_oak_button, spruce_button, jungle_button;
	public static Block vine_wisteria, vine_jacaranda, vine_laburnum, vine_dogwood, vine_crabapple, vine_silverbell, vine_paulownia;
	
	//TODO 
	
	public static Block cedar_trapdoor_1, crabapple_trapdoor_1, dogwood_trapdoor_1, jacaranda_trapdoor_1, laburnum_trapdoor_1, paulownia_trapdoor_1, silverbell_trapdoor_1, wisteria_trapdoor_1;
	
	public static Block acacia_trapdoor_1, birch_trapdoor_1, oak_trapdoor_1, spruce_trapdoor_1, dark_oak_trapdoor_1, jungle_trapdoor_1;
	
	public static Block red_stained_trapdoor_2, orange_stained_trapdoor_2, yellow_stained_trapdoor_2, lime_stained_trapdoor_2, green_stained_trapdoor_2, cyan_stained_trapdoor_2, light_blue_stained_trapdoor_2;
	public static Block blue_stained_trapdoor_2, purple_stained_trapdoor_2, magenta_stained_trapdoor_2, pink_stained_trapdoor_2, white_stained_trapdoor_2, light_gray_stained_trapdoor_2, gray_stained_trapdoor_2;
	public static Block black_stained_trapdoor_2, brown_stained_trapdoor_2;
	
	public static Block cedar_trapdoor_2, crabapple_trapdoor_2, dogwood_trapdoor_2, jacaranda_trapdoor_2, laburnum_trapdoor_2, paulownia_trapdoor_2, silverbell_trapdoor_2, wisteria_trapdoor_2;
	
	public static Block acacia_trapdoor_2, birch_trapdoor_2, oak_trapdoor_2, spruce_trapdoor_2, dark_oak_trapdoor_2, jungle_trapdoor_2;
	
	public static Block red_stained_trapdoor_3, orange_stained_trapdoor_3, yellow_stained_trapdoor_3, lime_stained_trapdoor_3, green_stained_trapdoor_3, cyan_stained_trapdoor_3, light_blue_stained_trapdoor_3;
	public static Block blue_stained_trapdoor_3, purple_stained_trapdoor_3, magenta_stained_trapdoor_3, pink_stained_trapdoor_3, white_stained_trapdoor_3, light_gray_stained_trapdoor_3, gray_stained_trapdoor_3;
	public static Block black_stained_trapdoor_3, brown_stained_trapdoor_3;
	
	public static Block cedar_trapdoor_3, crabapple_trapdoor_3, dogwood_trapdoor_3, jacaranda_trapdoor_3, laburnum_trapdoor_3, paulownia_trapdoor_3, silverbell_trapdoor_3, wisteria_trapdoor_3;
	
	public static Block acacia_trapdoor_3, birch_trapdoor_3, oak_trapdoor_3, spruce_trapdoor_3, dark_oak_trapdoor_3, jungle_trapdoor_3;
	
public static Block cedar_trapdoor_4, crabapple_trapdoor_4, dogwood_trapdoor_4, jacaranda_trapdoor_4, laburnum_trapdoor_4, paulownia_trapdoor_4, silverbell_trapdoor_4, wisteria_trapdoor_4;
	
	public static Block acacia_trapdoor_4, birch_trapdoor_4, oak_trapdoor_4, spruce_trapdoor_4, dark_oak_trapdoor_4, jungle_trapdoor_4;
	
	 public static Block leaves_jacaranda,leaves_wisteria, leaves_silverbell, leaves_dogwood, leaves_crabapple, leaves_paulownia, leaves_laburnum;
	 
	 public static Block log_jacaranda, log_wisteria, log_silverbell, log_dogwood, log_crabapple, log_paulownia, log_laburnum;
	 
	 public static Block sapling_jacaranda,sapling_wisteria, sapling_silverbell, sapling_dogwood, sapling_crabapple, sapling_paulownia, sapling_laburnum;
	 
	 public static Block sapling_jacaranda_vines, sapling_wisteria_vines, sapling_silverbell_vines, sapling_dogwood_vines, sapling_crabapple_vines, sapling_paulownia_vines, sapling_laburnum_vines;
	
	 
	public static void init()
	{
		// TODO Auto-generated method stub
		
vine_tie = new BlockVineTie("vine_tie", Material.CLOTH);

earthen_block = new BlockEssenceStorage("earthen_block", Material.ROCK);
floral_block = new BlockEssenceStorage("floral_block", Material.ROCK);
crabapple_cobblestone = new BlockCobbleVines("crabapple_cobblestone", 2.0f, 4.5F);
dogwood_cobblestone = new BlockCobbleVines("dogwood_cobblestone", 2.0f, 4.5F);
jacaranda_cobblestone = new BlockCobbleVines("jacaranda_cobblestone", 2.0f, 4.5F);
laburnum_cobblestone = new BlockCobbleVines("laburnum_cobblestone", 2.0f, 4.5F);
paulownia_cobblestone = new BlockCobbleVines("paulownia_cobblestone", 2.0f, 4.5F);
silverbell_cobblestone = new BlockCobbleVines("silverbell_cobblestone", 2.0f, 4.5F);
wisteria_cobblestone = new BlockCobbleVines("wisteria_cobblestone", 2.0f, 4.5F);

amethyst_block = new BlockGemStorage("amethyst_block", Material.ROCK);
aventurine_block = new BlockGemStorage("aventurine_block", Material.ROCK);
chalcopyrite_block = new BlockGemStorage("chalcopyrite_block", Material.ROCK);
carnelian_block = new BlockGemStorage("carnelian_block", Material.ROCK);
citrine_block = new BlockGemStorage("citrine_block", Material.ROCK);
jade_block = new BlockGemStorage("jade_block", Material.ROCK);
jasper_block = new BlockGemStorage("jasper_block", Material.ROCK);
labradorite_block = new BlockGemStorage("labradorite_block", Material.ROCK);
mica_block = new BlockGemStorage("mica_block", Material.ROCK);
moonstone_block = new BlockGemStorage("moonstone_block", Material.ROCK);
rose_quartz_block = new BlockGemStorage("rose_quartz_block", Material.ROCK);
sodalite_block = new BlockGemStorage("sodalite_block", Material.ROCK);
		
amethyst_tile_1 = new BlockGemTile("amethyst_tile_1", Material.CLAY);
amethyst_tile_2 = new BlockGemTile("amethyst_tile_2",Material.CLAY);
amethyst_tile_3 = new BlockGemTile("amethyst_tile_3",Material.CLAY);
amethyst_tile_4 = new BlockGemTile("amethyst_tile_4",Material.CLAY);
amethyst_tile_5 = new BlockGemTile("amethyst_tile_5",Material.CLAY);
amethyst_tile_6 = new BlockGemTile("amethyst_tile_6",Material.CLAY);

aventurine_tile_1 = new BlockGemTile("aventurine_tile_1", Material.CLAY);
aventurine_tile_2 = new BlockGemTile("aventurine_tile_2",Material.CLAY);
aventurine_tile_3 = new BlockGemTile("aventurine_tile_3",Material.CLAY);
aventurine_tile_4 = new BlockGemTile("aventurine_tile_4",Material.CLAY);
aventurine_tile_5 = new BlockGemTile("aventurine_tile_5",Material.CLAY);
aventurine_tile_6 = new BlockGemTile("aventurine_tile_6",Material.CLAY);

carnelian_tile_1 = new BlockGemTile("carnelian_tile_1", Material.CLAY);
carnelian_tile_2 = new BlockGemTile("carnelian_tile_2",Material.CLAY);
carnelian_tile_3 = new BlockGemTile("carnelian_tile_3",Material.CLAY);
carnelian_tile_4 = new BlockGemTile("carnelian_tile_4",Material.CLAY);
carnelian_tile_5 = new BlockGemTile("carnelian_tile_5",Material.CLAY);
carnelian_tile_6 = new BlockGemTile("carnelian_tile_6",Material.CLAY);

chalcopyrite_tile_1 = new BlockGemTile("chalcopyrite_tile_1",Material.CLAY);
chalcopyrite_tile_2 = new BlockGemTile("chalcopyrite_tile_2",Material.CLAY);
chalcopyrite_tile_3 = new BlockGemTile("chalcopyrite_tile_3",Material.CLAY);
chalcopyrite_tile_4 = new BlockGemTile("chalcopyrite_tile_4",Material.CLAY);
chalcopyrite_tile_5 = new BlockGemTile("chalcopyrite_tile_5",Material.CLAY);
chalcopyrite_tile_6 = new BlockGemTile("chalcopyrite_tile_6",Material.CLAY);

citrine_tile_1 = new BlockGemTile("citrine_tile_1", Material.CLAY);
citrine_tile_2 = new BlockGemTile("citrine_tile_2",Material.CLAY);
citrine_tile_3 = new BlockGemTile("citrine_tile_3",Material.CLAY);
citrine_tile_4 = new BlockGemTile("citrine_tile_4",Material.CLAY);
citrine_tile_5 = new BlockGemTile("citrine_tile_5",Material.CLAY);
citrine_tile_6 = new BlockGemTile("citrine_tile_6",Material.CLAY);

jade_tile_1 = new BlockGemTile("jade_tile_1",Material.CLAY);
jade_tile_2 = new BlockGemTile("jade_tile_2",Material.CLAY);
jade_tile_3 = new BlockGemTile("jade_tile_3",Material.CLAY);
jade_tile_4 = new BlockGemTile("jade_tile_4",Material.CLAY);
jade_tile_5 = new BlockGemTile("jade_tile_5",Material.CLAY);
jade_tile_6 = new BlockGemTile("jade_tile_6",Material.CLAY);

jasper_tile_1 = new BlockGemTile("jasper_tile_1",Material.CLAY);
jasper_tile_2 = new BlockGemTile("jasper_tile_2",Material.CLAY);
jasper_tile_3 = new BlockGemTile("jasper_tile_3",Material.CLAY);
jasper_tile_4 = new BlockGemTile("jasper_tile_4",Material.CLAY);
jasper_tile_5 = new BlockGemTile("jasper_tile_5",Material.CLAY);
jasper_tile_6 = new BlockGemTile("jasper_tile_6",Material.CLAY);

labradorite_tile_1 = new BlockGemTile("labradorite_tile_1",Material.CLAY);
labradorite_tile_2 = new BlockGemTile("labradorite_tile_2",Material.CLAY);
labradorite_tile_3 = new BlockGemTile("labradorite_tile_3",Material.CLAY);
labradorite_tile_4 = new BlockGemTile("labradorite_tile_4",Material.CLAY);
labradorite_tile_5 = new BlockGemTile("labradorite_tile_5",Material.CLAY);
labradorite_tile_6 = new BlockGemTile("labradorite_tile_6",Material.CLAY);

mica_tile_1 = new BlockGemTile("mica_tile_1",Material.CLAY);
mica_tile_2 = new BlockGemTile("mica_tile_2",Material.CLAY);
mica_tile_3 = new BlockGemTile("mica_tile_3",Material.CLAY);
mica_tile_4 = new BlockGemTile("mica_tile_4",Material.CLAY);
mica_tile_5 = new BlockGemTile("mica_tile_5",Material.CLAY);
mica_tile_6 = new BlockGemTile("mica_tile_6",Material.CLAY);

moonstone_tile_1 = new BlockGemTile("moonstone_tile_1",Material.CLAY);
moonstone_tile_2 = new BlockGemTile("moonstone_tile_2",Material.CLAY);
moonstone_tile_3 = new BlockGemTile("moonstone_tile_3",Material.CLAY);
moonstone_tile_4 = new BlockGemTile("moonstone_tile_4",Material.CLAY);
moonstone_tile_5 = new BlockGemTile("moonstone_tile_5",Material.CLAY);
moonstone_tile_6 = new BlockGemTile("moonstone_tile_6",Material.CLAY);

rose_quartz_tile_1 = new BlockGemTile("rose_quartz_tile_1",Material.CLAY);
rose_quartz_tile_2 = new BlockGemTile("rose_quartz_tile_2",Material.CLAY);
rose_quartz_tile_3 = new BlockGemTile("rose_quartz_tile_3",Material.CLAY);
rose_quartz_tile_4 = new BlockGemTile("rose_quartz_tile_4",Material.CLAY);
rose_quartz_tile_5 = new BlockGemTile("rose_quartz_tile_5",Material.CLAY);
rose_quartz_tile_6 = new BlockGemTile("rose_quartz_tile_6",Material.CLAY);

sodalite_tile_1 = new BlockGemTile("sodalite_tile_1",Material.CLAY);
sodalite_tile_2 = new BlockGemTile("sodalite_tile_2",Material.CLAY);
sodalite_tile_3 = new BlockGemTile("sodalite_tile_3",Material.CLAY);
sodalite_tile_4 = new BlockGemTile("sodalite_tile_4",Material.CLAY);
sodalite_tile_5 = new BlockGemTile("sodalite_tile_5",Material.CLAY);
sodalite_tile_6 = new BlockGemTile("sodalite_tile_6",Material.CLAY);

red_clay_block = new CustomBrickBlock("red_clay_block",Material.CLAY);
orange_clay_block = new CustomBrickBlock("orange_clay_block",Material.CLAY);
yellow_clay_block = new CustomBrickBlock("yellow_clay_block",Material.CLAY);
lime_clay_block = new CustomBrickBlock("lime_clay_block",Material.CLAY);
green_clay_block = new CustomBrickBlock("green_clay_block",Material.CLAY);
light_blue_clay_block = new CustomBrickBlock("light_blue_clay_block",Material.CLAY);
cyan_clay_block = new CustomBrickBlock("cyan_clay_block", Material.CLAY);
blue_clay_block = new CustomBrickBlock("blue_clay_block",Material.CLAY);
purple_clay_block = new CustomBrickBlock("purple_clay_block",Material.CLAY);
magenta_clay_block = new CustomBrickBlock("magenta_clay_block",Material.CLAY);
pink_clay_block = new CustomBrickBlock("pink_clay_block",Material.CLAY);
white_clay_block = new CustomBrickBlock("white_clay_block",Material.CLAY);
light_gray_clay_block = new CustomBrickBlock("light_gray_clay_block",Material.CLAY);
gray_clay_block = new CustomBrickBlock("gray_clay_block",Material.CLAY);
black_clay_block = new CustomBrickBlock("black_clay_block",Material.CLAY);
brown_clay_block = new CustomBrickBlock("brown_clay_block",Material.CLAY);

red_brick_block = new CustomBrickBlock("red_brick_block",Material.CLAY);
orange_brick_block = new CustomBrickBlock("orange_brick_block",Material.CLAY);
yellow_brick_block = new CustomBrickBlock("yellow_brick_block",Material.CLAY);
lime_brick_block = new CustomBrickBlock("lime_brick_block",Material.CLAY);
green_brick_block = new CustomBrickBlock("green_brick_block",Material.CLAY);
light_blue_brick_block = new CustomBrickBlock("light_blue_brick_block",Material.CLAY);
cyan_brick_block = new CustomBrickBlock("cyan_brick_block", Material.CLAY);
blue_brick_block = new CustomBrickBlock("blue_brick_block",Material.CLAY);
purple_brick_block = new CustomBrickBlock("purple_brick_block",Material.CLAY);
magenta_brick_block = new CustomBrickBlock("magenta_brick_block",Material.CLAY);
pink_brick_block = new CustomBrickBlock("pink_brick_block",Material.CLAY);
white_brick_block = new CustomBrickBlock("white_brick_block",Material.CLAY);
light_gray_brick_block = new CustomBrickBlock("light_gray_brick_block",Material.CLAY);
gray_brick_block = new CustomBrickBlock("gray_brick_block",Material.CLAY);
black_brick_block = new CustomBrickBlock("black_brick_block",Material.CLAY);
brown_brick_block = new CustomBrickBlock("brown_brick_block",Material.CLAY);

red_brick_stairs = new CustomBlockStairs("red_brick_stairs", white_brick_block.getDefaultState());
orange_brick_stairs = new CustomBlockStairs("orange_brick_stairs", white_brick_block.getDefaultState());
yellow_brick_stairs = new CustomBlockStairs("yellow_brick_stairs", white_brick_block.getDefaultState());
lime_brick_stairs = new CustomBlockStairs("lime_brick_stairs", white_brick_block.getDefaultState());
green_brick_stairs = new CustomBlockStairs("green_brick_stairs", white_brick_block.getDefaultState());
cyan_brick_stairs = new CustomBlockStairs("cyan_brick_stairs", white_brick_block.getDefaultState());
light_blue_brick_stairs = new CustomBlockStairs("light_blue_brick_stairs", white_brick_block.getDefaultState());
blue_brick_stairs = new CustomBlockStairs("blue_brick_stairs", white_brick_block.getDefaultState());
purple_brick_stairs = new CustomBlockStairs("purple_brick_stairs", white_brick_block.getDefaultState());
magenta_brick_stairs = new CustomBlockStairs("magenta_brick_stairs", white_brick_block.getDefaultState());
pink_brick_stairs = new CustomBlockStairs("pink_brick_stairs", white_brick_block.getDefaultState());
white_brick_stairs = new CustomBlockStairs("white_brick_stairs", white_brick_block.getDefaultState());
light_gray_brick_stairs = new CustomBlockStairs("light_gray_brick_stairs", white_brick_block.getDefaultState());
gray_brick_stairs = new CustomBlockStairs("gray_brick_stairs", white_brick_block.getDefaultState());
black_brick_stairs = new CustomBlockStairs("black_brick_stairs", white_brick_block.getDefaultState());
brown_brick_stairs = new CustomBlockStairs("brown_brick_stairs", white_brick_block.getDefaultState());

red_brick_slab_half = new CustomBlockHalfSlab("red_brick_slab_half", 2.5F, 4.5F);
orange_brick_slab_half = new CustomBlockHalfSlab("orange_brick_slab_half", 2.5F, 4.5F);
yellow_brick_slab_half = new CustomBlockHalfSlab("yellow_brick_slab_half", 2.5F, 4.5F);
lime_brick_slab_half = new CustomBlockHalfSlab("lime_brick_slab_half", 2.5F, 4.5F);
green_brick_slab_half = new CustomBlockHalfSlab("green_brick_slab_half", 2.5F, 4.5F);
cyan_brick_slab_half = new CustomBlockHalfSlab("cyan_brick_slab_half", 2.5F, 4.5F);
light_blue_brick_slab_half = new CustomBlockHalfSlab("light_blue_brick_slab_half", 2.5F, 4.5F);
blue_brick_slab_half = new CustomBlockHalfSlab("blue_brick_slab_half", 2.5F, 4.5F);
purple_brick_slab_half = new CustomBlockHalfSlab("purple_brick_slab_half", 2.5F, 4.5F);
magenta_brick_slab_half = new CustomBlockHalfSlab("magenta_brick_slab_half", 2.5F, 4.5F);
pink_brick_slab_half = new CustomBlockHalfSlab("pink_brick_slab_half", 2.5F, 4.5F);
white_brick_slab_half = new CustomBlockHalfSlab("white_brick_slab_half", 2.5F, 4.5F);
light_gray_brick_slab_half = new CustomBlockHalfSlab("light_gray_brick_slab_half", 2.5F, 4.5F);
gray_brick_slab_half = new CustomBlockHalfSlab("gray_brick_slab_half", 2.5F, 4.5F);
black_brick_slab_half = new CustomBlockHalfSlab("black_brick_slab_half", 2.5F, 4.5F);
brown_brick_slab_half = new CustomBlockHalfSlab("brown_brick_slab_half", 2.5F, 4.5F);
	
red_brick_slab_double = new CustomBlockDoubleSlab("red_brick_slab_double", 2.5F, 4.5F);
orange_brick_slab_double = new CustomBlockDoubleSlab("orange_brick_slab_double", 2.5F, 4.5F);
yellow_brick_slab_double = new CustomBlockDoubleSlab("yellow_brick_slab_double", 2.5F, 4.5F);
lime_brick_slab_double = new CustomBlockDoubleSlab("lime_brick_slab_double", 2.5F, 4.5F);
green_brick_slab_double = new CustomBlockDoubleSlab("green_brick_slab_double", 2.5F, 4.5F);
cyan_brick_slab_double = new CustomBlockDoubleSlab("cyan_brick_slab_double", 2.5F, 4.5F);
light_blue_brick_slab_double = new CustomBlockDoubleSlab("light_blue_brick_slab_double", 2.5F, 4.5F);
blue_brick_slab_double = new CustomBlockDoubleSlab("blue_brick_slab_double", 2.5F, 4.5F);
purple_brick_slab_double = new CustomBlockDoubleSlab("purple_brick_slab_double", 2.5F, 4.5F);
magenta_brick_slab_double = new CustomBlockDoubleSlab("magenta_brick_slab_double", 2.5F, 4.5F);
pink_brick_slab_double = new CustomBlockDoubleSlab("pink_brick_slab_double", 2.5F, 4.5F);
white_brick_slab_double = new CustomBlockDoubleSlab("white_brick_slab_double", 2.5F, 4.5F);
light_gray_brick_slab_double = new CustomBlockDoubleSlab("light_gray_brick_slab_double", 2.5F, 4.5F);
gray_brick_slab_double = new CustomBlockDoubleSlab("gray_brick_slab_double", 2.5F, 4.5F);
black_brick_slab_double = new CustomBlockDoubleSlab("black_brick_slab_double", 2.5F, 4.5F);
brown_brick_slab_double = new CustomBlockDoubleSlab("brown_brick_slab_double", 2.5F, 4.5F);

red_large_brick_block = new CustomBrickBlock("red_large_brick_block",Material.CLAY);
orange_large_brick_block = new CustomBrickBlock("orange_large_brick_block",Material.CLAY);
yellow_large_brick_block = new CustomBrickBlock("yellow_large_brick_block",Material.CLAY);
lime_large_brick_block = new CustomBrickBlock("lime_large_brick_block",Material.CLAY);
green_large_brick_block = new CustomBrickBlock("green_large_brick_block",Material.CLAY);
light_blue_large_brick_block = new CustomBrickBlock("light_blue_large_brick_block",Material.CLAY);
cyan_large_brick_block = new CustomBrickBlock("cyan_large_brick_block", Material.CLAY);
blue_large_brick_block = new CustomBrickBlock("blue_large_brick_block",Material.CLAY);
purple_large_brick_block = new CustomBrickBlock("purple_large_brick_block",Material.CLAY);
magenta_large_brick_block = new CustomBrickBlock("magenta_large_brick_block",Material.CLAY);
pink_large_brick_block = new CustomBrickBlock("pink_large_brick_block",Material.CLAY);
white_large_brick_block = new CustomBrickBlock("white_large_brick_block",Material.CLAY);
light_gray_large_brick_block = new CustomBrickBlock("light_gray_large_brick_block",Material.CLAY);
gray_large_brick_block = new CustomBrickBlock("gray_large_brick_block",Material.CLAY);
black_large_brick_block = new CustomBrickBlock("black_large_brick_block",Material.CLAY);
brown_large_brick_block = new CustomBrickBlock("brown_large_brick_block",Material.CLAY);

red_large_brick_stairs = new CustomBlockStairs("red_large_brick_stairs", white_large_brick_block.getDefaultState());
orange_large_brick_stairs = new CustomBlockStairs("orange_large_brick_stairs", white_large_brick_block.getDefaultState());
yellow_large_brick_stairs = new CustomBlockStairs("yellow_large_brick_stairs", white_large_brick_block.getDefaultState());
lime_large_brick_stairs = new CustomBlockStairs("lime_large_brick_stairs", white_large_brick_block.getDefaultState());
green_large_brick_stairs = new CustomBlockStairs("green_large_brick_stairs", white_large_brick_block.getDefaultState());
cyan_large_brick_stairs = new CustomBlockStairs("cyan_large_brick_stairs", white_large_brick_block.getDefaultState());
light_blue_large_brick_stairs = new CustomBlockStairs("light_blue_large_brick_stairs", white_large_brick_block.getDefaultState());
blue_large_brick_stairs = new CustomBlockStairs("blue_large_brick_stairs", white_large_brick_block.getDefaultState());
purple_large_brick_stairs = new CustomBlockStairs("purple_large_brick_stairs", white_large_brick_block.getDefaultState());
magenta_large_brick_stairs = new CustomBlockStairs("magenta_large_brick_stairs", white_large_brick_block.getDefaultState());
pink_large_brick_stairs = new CustomBlockStairs("pink_large_brick_stairs", white_large_brick_block.getDefaultState());
white_large_brick_stairs = new CustomBlockStairs("white_large_brick_stairs", white_large_brick_block.getDefaultState());
light_gray_large_brick_stairs = new CustomBlockStairs("light_gray_large_brick_stairs", white_large_brick_block.getDefaultState());
gray_large_brick_stairs = new CustomBlockStairs("gray_large_brick_stairs", white_large_brick_block.getDefaultState());
black_large_brick_stairs = new CustomBlockStairs("black_large_brick_stairs", white_large_brick_block.getDefaultState());
brown_large_brick_stairs = new CustomBlockStairs("brown_large_brick_stairs", white_large_brick_block.getDefaultState());

red_large_brick_slab_half = new CustomBlockHalfSlab("red_large_brick_slab_half", 2.5F, 4.5F);
orange_large_brick_slab_half = new CustomBlockHalfSlab("orange_large_brick_slab_half", 2.5F, 4.5F);
yellow_large_brick_slab_half = new CustomBlockHalfSlab("yellow_large_brick_slab_half", 2.5F, 4.5F);
lime_large_brick_slab_half = new CustomBlockHalfSlab("lime_large_brick_slab_half", 2.5F, 4.5F);
green_large_brick_slab_half = new CustomBlockHalfSlab("green_large_brick_slab_half", 2.5F, 4.5F);
cyan_large_brick_slab_half = new CustomBlockHalfSlab("cyan_large_brick_slab_half", 2.5F, 4.5F);
light_blue_large_brick_slab_half = new CustomBlockHalfSlab("light_blue_large_brick_slab_half", 2.5F, 4.5F);
blue_large_brick_slab_half = new CustomBlockHalfSlab("blue_large_brick_slab_half", 2.5F, 4.5F);
purple_large_brick_slab_half = new CustomBlockHalfSlab("purple_large_brick_slab_half", 2.5F, 4.5F);
magenta_large_brick_slab_half = new CustomBlockHalfSlab("magenta_large_brick_slab_half", 2.5F, 4.5F);
pink_large_brick_slab_half = new CustomBlockHalfSlab("pink_large_brick_slab_half", 2.5F, 4.5F);
white_large_brick_slab_half = new CustomBlockHalfSlab("white_large_brick_slab_half", 2.5F, 4.5F);
light_gray_large_brick_slab_half = new CustomBlockHalfSlab("light_gray_large_brick_slab_half", 2.5F, 4.5F);
gray_large_brick_slab_half = new CustomBlockHalfSlab("gray_large_brick_slab_half", 2.5F, 4.5F);
black_large_brick_slab_half = new CustomBlockHalfSlab("black_large_brick_slab_half", 2.5F, 4.5F);
brown_large_brick_slab_half = new CustomBlockHalfSlab("brown_large_brick_slab_half", 2.5F, 4.5F);
	
red_large_brick_slab_double = new CustomBlockDoubleSlab("red_large_brick_slab_double", 2.5F, 4.5F);
orange_large_brick_slab_double = new CustomBlockDoubleSlab("orange_large_brick_slab_double", 2.5F, 4.5F);
yellow_large_brick_slab_double = new CustomBlockDoubleSlab("yellow_large_brick_slab_double", 2.5F, 4.5F);
lime_large_brick_slab_double = new CustomBlockDoubleSlab("lime_large_brick_slab_double", 2.5F, 4.5F);
green_large_brick_slab_double = new CustomBlockDoubleSlab("green_large_brick_slab_double", 2.5F, 4.5F);
cyan_large_brick_slab_double = new CustomBlockDoubleSlab("cyan_large_brick_slab_double", 2.5F, 4.5F);
light_blue_large_brick_slab_double = new CustomBlockDoubleSlab("light_blue_large_brick_slab_double", 2.5F, 4.5F);
blue_large_brick_slab_double = new CustomBlockDoubleSlab("blue_large_brick_slab_double", 2.5F, 4.5F);
purple_large_brick_slab_double = new CustomBlockDoubleSlab("purple_large_brick_slab_double", 2.5F, 4.5F);
magenta_large_brick_slab_double = new CustomBlockDoubleSlab("magenta_large_brick_slab_double", 2.5F, 4.5F);
pink_large_brick_slab_double = new CustomBlockDoubleSlab("pink_large_brick_slab_double", 2.5F, 4.5F);
white_large_brick_slab_double = new CustomBlockDoubleSlab("white_large_brick_slab_double", 2.5F, 4.5F);
light_gray_large_brick_slab_double = new CustomBlockDoubleSlab("light_gray_large_brick_slab_double", 2.5F, 4.5F);
gray_large_brick_slab_double = new CustomBlockDoubleSlab("gray_large_brick_slab_double", 2.5F, 4.5F);
black_large_brick_slab_double = new CustomBlockDoubleSlab("black_large_brick_slab_double", 2.5F, 4.5F);
brown_large_brick_slab_double = new CustomBlockDoubleSlab("brown_large_brick_slab_double", 2.5F, 4.5F);


		
		vase = new BlockFlowerVase("vase", Material.CLAY);
		vase_red = new BlockFlowerVaseRed("vase_red", Material.CLAY);
		vase_orange = new BlockFlowerVaseOrange("vase_orange", Material.CLAY);
		vase_yellow = new BlockFlowerVaseYellow("vase_yellow", Material.CLAY);
		vase_lime = new BlockFlowerVaseLime("vase_lime", Material.CLAY);
		vase_green = new BlockFlowerVaseGreen("vase_green", Material.CLAY);
		vase_cyan = new BlockFlowerVaseCyan("vase_cyan", Material.CLAY);
		vase_light_blue = new BlockFlowerVaseLightBlue("vase_light_blue", Material.CLAY);
		vase_blue = new BlockFlowerVaseBlue("vase_blue", Material.CLAY);
		vase_purple = new BlockFlowerVasePurple("vase_purple", Material.CLAY);
		vase_magenta = new BlockFlowerVaseMagenta("vase_magenta", Material.CLAY);
		vase_pink = new BlockFlowerVasePink("vase_pink", Material.CLAY);
		vase_light_gray = new BlockFlowerVaseLightGray("vase_light_gray", Material.CLAY);
		vase_gray = new BlockFlowerVaseGray("vase_gray", Material.CLAY);
		vase_black = new BlockFlowerVaseBlack("vase_black", Material.CLAY);
		vase_brown = new BlockFlowerVaseBrown("vase_brown", Material.CLAY);
				
		
		ornamental_grass = new CustomBlockGrass("ornamental_grass", Material.GRASS);
		ornamental_dirt = new CustomBlockGrass("ornamental_dirt", Material.GROUND);
		
		cedar_log = new BlockCedarLog("cedar_log");
		cedar_leaves = new BlockCedarLeaves("cedar_leaves");
		cedar_sapling = new BlockCedarSapling("cedar_sapling");
		cedar_planks = new CustomWoodPlanks("cedar_planks", Material.WOOD);
		
		fairy_glow_cup = new FairyGlowCup("fairy_glow_cup");
		mica_ore = new CustomOre("mica_ore");
		mica_ore_end = new CustomOre("mica_ore_end");
		mica_ore_nether = new CustomOre("mica_ore_nether");
	
	      amethyst_ore_end = new CustomOre("amethyst_ore_end");
		  amethyst_ore_nether = new CustomOre("amethyst_ore_nether");
		  amethyst_ore = new CustomOre("amethyst_ore");
		  
		  aventurine_ore_end = new CustomOre("aventurine_ore_end");
		  aventurine_ore_nether = new CustomOre("aventurine_ore_nether");
		  aventurine_ore = new CustomOre("aventurine_ore");
		 	 
		  citrine_ore_end = new CustomOre("citrine_ore_end");
		  citrine_ore_nether = new CustomOre("citrine_ore_nether");
		  citrine_ore = new CustomOre("citrine_ore");
		  
		  carnelian_ore_end = new CustomOre("carnelian_ore_end");
		  carnelian_ore_nether = new CustomOre("carnelian_ore_nether");
		  carnelian_ore = new CustomOre("carnelian_ore");
		  
		   chalcopyrite_ore_end = new CustomOre("chalcopyrite_ore_end");
		  chalcopyrite_ore_nether = new CustomOre("chalcopyrite_ore_nether");
		  chalcopyrite_ore = new CustomOre("chalcopyrite_ore");
		 
		 jade_ore_end = new CustomOre("jade_ore_end");
		  jade_ore_nether = new CustomOre("jade_ore_nether");
		  jade_ore = new CustomOre("jade_ore");
		  
		  jasper_ore_end = new CustomOre("jasper_ore_end");
		  jasper_ore_nether = new CustomOre("jasper_ore_nether");
		  jasper_ore = new CustomOre("jasper_ore");
		  
		  labradorite_ore_end = new CustomOre("labradorite_ore_end");
		  labradorite_ore_nether = new CustomOre("labradorite_ore_nether");
		  labradorite_ore = new CustomOre("labradorite_ore");
		  
		  moonstone_ore_end = new CustomOre("moonstone_ore_end");
		  moonstone_ore_nether = new CustomOre("moonstone_ore_nether");
		  moonstone_ore = new CustomOre("moonstone_ore");
		  
		  rose_quartz_ore_end = new CustomOre("rose_quartz_ore_end");
		  rose_quartz_ore_nether = new CustomOre("rose_quartz_ore_nether");
		  rose_quartz_ore = new CustomOre("rose_quartz_ore");
		  
		  sodalite_ore_end = new CustomOre("sodalite_ore_end");
		  sodalite_ore_nether = new CustomOre("sodalite_ore_nether");
		  sodalite_ore = new CustomOre("sodalite_ore");
		
		whitewashed_planks = new CustomWoodPlanks("whitewashed_planks", Material.WOOD);
		whitewashed_slab_half = new CustomBlockHalfSlab("whitewashed_slab_half", 2.5F, 4.5F);
		whitewashed_slab_double = new CustomBlockDoubleSlab("whitewashed_slab_double", 2.5F, 4.5F);
		
		silverbell_planks = new CustomWoodPlanks("silverbell_planks", Material.WOOD);
		crabapple_planks = new CustomWoodPlanks("crabapple_planks", Material.WOOD);
		dogwood_planks = new CustomWoodPlanks("dogwood_planks", Material.WOOD);
		jacaranda_planks = new CustomWoodPlanks("jacaranda_planks", Material.WOOD);
		laburnum_planks = new CustomWoodPlanks("laburnum_planks", Material.WOOD);
		paulownia_planks = new CustomWoodPlanks("paulownia_planks", Material.WOOD);
		
		wisteria_planks = new CustomWoodPlanks("wisteria_planks", Material.WOOD);
		
		base_slab_half = new CustomBlockHalfSlab("base_slab_half", 2.5F, 4.5F);
		
		cedar_slab_half = new CustomBlockHalfSlab("cedar_slab_half", 2.5F, 4.5F);
		silverbell_slab_half = new CustomBlockHalfSlab("silverbell_slab_half", 2.5F, 4.5F);
		crabapple_slab_half = new CustomBlockHalfSlab("crabapple_slab_half", 2.5F, 4.5F);
		dogwood_slab_half = new CustomBlockHalfSlab("dogwood_slab_half", 2.5F, 4.5F);
		jacaranda_slab_half = new CustomBlockHalfSlab("jacaranda_slab_half", 2.5F, 4.5F);
		wisteria_slab_half = new CustomBlockHalfSlab("wisteria_slab_half", 2.5F, 4.5F);
		laburnum_slab_half = new CustomBlockHalfSlab("laburnum_slab_half", 2.5F, 4.5F);
		paulownia_slab_half = new CustomBlockHalfSlab("paulownia_slab_half", 2.5F, 4.5F);

		base_slab_double = new CustomBlockDoubleSlab("base_slab_double", 2.5F, 4.5F);
		
		cedar_slab_double = new CustomBlockDoubleSlab("cedar_slab_double", 2.5F, 4.5F);
		silverbell_slab_double = new CustomBlockDoubleSlab("silverbell_slab_double", 2.5F, 4.5F);
		crabapple_slab_double = new CustomBlockDoubleSlab("crabapple_slab_double", 2.5F, 4.5F);
		dogwood_slab_double = new CustomBlockDoubleSlab("dogwood_slab_double", 2.5F, 4.5F);
		jacaranda_slab_double = new CustomBlockDoubleSlab("jacaranda_slab_double", 2.5F, 4.5F);
		wisteria_slab_double = new CustomBlockDoubleSlab("wisteria_slab_double", 2.5F, 4.5F);
		laburnum_slab_double = new CustomBlockDoubleSlab("laburnum_slab_double", 2.5F, 4.5F);
		paulownia_slab_double = new CustomBlockDoubleSlab("paulownia_slab_double", 2.5F, 4.5F);
		
		silverbell_stairs = new CustomBlockStairs("silverbell_stairs", whitewashed_planks.getDefaultState());
		crabapple_stairs = new CustomBlockStairs("crabapple_stairs", whitewashed_planks.getDefaultState());
		dogwood_stairs = new CustomBlockStairs("dogwood_stairs", whitewashed_planks.getDefaultState());
		jacaranda_stairs = new CustomBlockStairs("jacaranda_stairs", whitewashed_planks.getDefaultState());
		wisteria_stairs = new CustomBlockStairs("wisteria_stairs", whitewashed_planks.getDefaultState());
		laburnum_stairs = new CustomBlockStairs("laburnum_stairs", whitewashed_planks.getDefaultState());
		paulownia_stairs = new CustomBlockStairs("paulownia_stairs", whitewashed_planks.getDefaultState());
		whitewashed_stairs = new CustomBlockStairs("whitewashed_stairs", whitewashed_planks.getDefaultState());
		cedar_stairs = new CustomBlockStairs("cedar_stairs", whitewashed_planks.getDefaultState());
		
		cedar_fence = new CustomBlockFence("cedar_fence", 2.5F, 4.5F);
		silverbell_fence = new CustomBlockFence("silverbell_fence", 2.5F, 4.5F);
		crabapple_fence = new CustomBlockFence("crabapple_fence", 2.5F, 4.5F);
		dogwood_fence = new CustomBlockFence("dogwood_fence", 2.5F, 4.5F);
		jacaranda_fence = new CustomBlockFence("jacaranda_fence", 2.5F, 4.5F);
		laburnum_fence = new CustomBlockFence("laburnum_fence", 2.5F, 4.5F);
		paulownia_fence = new CustomBlockFence("paulownia_fence", 2.5F, 4.5F);
		wisteria_fence = new CustomBlockFence("wisteria_fence", 2.5F, 4.5F);
		whitewashed_fence = new CustomBlockFence("whitewashed_fence", 2.5F, 4.5F);
		
		silverbell_fence_gate = new CustomBlockFenceGate("silverbell_fence_gate", 2.5F, 4.5F);
		crabapple_fence_gate = new CustomBlockFenceGate("crabapple_fence_gate", 2.5F, 4.5F);
		dogwood_fence_gate = new CustomBlockFenceGate("dogwood_fence_gate", 2.5F, 4.5F);
		jacaranda_fence_gate = new CustomBlockFenceGate("jacaranda_fence_gate", 2.5F, 4.5F);
		wisteria_fence_gate = new CustomBlockFenceGate("wisteria_fence_gate", 2.5F, 4.5F);
		laburnum_fence_gate = new CustomBlockFenceGate("laburnum_fence_gate", 2.5F, 4.5F);
		paulownia_fence_gate = new CustomBlockFenceGate("paulownia_fence_gate", 2.5F, 4.5F);
		whitewashed_fence_gate = new CustomBlockFenceGate("whitewashed_fence_gate", 2.5F, 4.5F);
		cedar_fence_gate = new CustomBlockFenceGate("cedar_fence_gate", 2.5F, 4.5F);
		
		cedar_pressure_plate = new BlockCustomPressurePlate("cedar_pressure_plate", 10);
		crabapple_pressure_plate = new BlockCustomPressurePlate("crabapple_pressure_plate", 10);
		dogwood_pressure_plate = new BlockCustomPressurePlate("dogwood_pressure_plate", 10);
		jacaranda_pressure_plate = new BlockCustomPressurePlate("jacaranda_pressure_plate", 10);
		laburnum_pressure_plate = new BlockCustomPressurePlate("laburnum_pressure_plate", 10);
		paulownia_pressure_plate = new BlockCustomPressurePlate("paulownia_pressure_plate", 10);
		silverbell_pressure_plate = new BlockCustomPressurePlate("silverbell_pressure_plate", 10);
		wisteria_pressure_plate = new BlockCustomPressurePlate("wisteria_pressure_plate", 10);
		
		acacia_pressure_plate = new BlockCustomPressurePlate("acacia_pressure_plate",  10);
		birch_pressure_plate = new BlockCustomPressurePlate("birch_pressure_plate",  10);
		oak_pressure_plate = new BlockCustomPressurePlate("oak_pressure_plate",  10);
		dark_oak_pressure_plate = new BlockCustomPressurePlate("dark_oak_pressure_plate",  10);
		spruce_pressure_plate = new BlockCustomPressurePlate("spruce_pressure_plate",  10);
		jungle_pressure_plate = new BlockCustomPressurePlate("jungle_pressure_plate",  10);
		
		cedar_button = new BlockCustomButton("cedar_button");
		crabapple_button = new BlockCustomButton("crabapple_button");
		dogwood_button = new BlockCustomButton("dogwood_button");
		jacaranda_button = new BlockCustomButton("jacaranda_button");
		laburnum_button = new BlockCustomButton("laburnum_button");
		paulownia_button = new BlockCustomButton("paulownia_button");
		silverbell_button = new BlockCustomButton("silverbell_button");
		wisteria_button = new BlockCustomButton("wisteria_button");
		
		acacia_button = new BlockCustomButton("acacia_button");
		birch_button = new BlockCustomButton("birch_button");
		oak_button = new BlockCustomButton("oak_button");
		dark_oak_button = new BlockCustomButton("dark_oak_button");
		spruce_button = new BlockCustomButton("spruce_button");
		jungle_button = new BlockCustomButton("jungle_button");
		
		cedar_trapdoor_1 = new CustomBlockTrapDoor("cedar_trapdoor_1");
		crabapple_trapdoor_1 = new CustomBlockTrapDoor("crabapple_trapdoor_1");
		dogwood_trapdoor_1 = new CustomBlockTrapDoor("dogwood_trapdoor_1");
		jacaranda_trapdoor_1 = new CustomBlockTrapDoor("jacaranda_trapdoor_1");
		laburnum_trapdoor_1 = new CustomBlockTrapDoor("laburnum_trapdoor_1");
		paulownia_trapdoor_1 = new CustomBlockTrapDoor("paulownia_trapdoor_1");
		silverbell_trapdoor_1 = new CustomBlockTrapDoor("silverbell_trapdoor_1");
		wisteria_trapdoor_1 = new CustomBlockTrapDoor("wisteria_trapdoor_1");
	
		//TODO
		
		acacia_trapdoor_1 = new CustomBlockTrapDoor("acacia_trapdoor_1");
		birch_trapdoor_1 = new CustomBlockTrapDoor("birch_trapdoor_1");
		oak_trapdoor_1 = new CustomBlockTrapDoor("oak_trapdoor_1");
		dark_oak_trapdoor_1 = new CustomBlockTrapDoor("dark_oak_trapdoor_1");
		spruce_trapdoor_1 = new CustomBlockTrapDoor("spruce_trapdoor_1");
		jungle_trapdoor_1 = new CustomBlockTrapDoor("jungle_trapdoor_1");
		
		red_stained_trapdoor_1 = new CustomBlockTrapDoor("red_stained_trapdoor_1");
		orange_stained_trapdoor_1 = new CustomBlockTrapDoor("orange_stained_trapdoor_1");
		yellow_stained_trapdoor_1 = new CustomBlockTrapDoor("yellow_stained_trapdoor_1");
		lime_stained_trapdoor_1 = new CustomBlockTrapDoor("lime_stained_trapdoor_1");
		green_stained_trapdoor_1 = new CustomBlockTrapDoor("green_stained_trapdoor_1");
		cyan_stained_trapdoor_1 = new CustomBlockTrapDoor("cyan_stained_trapdoor_1");
		light_blue_stained_trapdoor_1 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_1");
		blue_stained_trapdoor_1 = new CustomBlockTrapDoor("blue_stained_trapdoor_1");
		purple_stained_trapdoor_1 = new CustomBlockTrapDoor("purple_stained_trapdoor_1");
		magenta_stained_trapdoor_1 = new CustomBlockTrapDoor("magenta_stained_trapdoor_1");
		pink_stained_trapdoor_1 = new CustomBlockTrapDoor("pink_stained_trapdoor_1");
		white_stained_trapdoor_1 = new CustomBlockTrapDoor("white_stained_trapdoor_1");
		light_gray_stained_trapdoor_1 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_1");
		gray_stained_trapdoor_1 = new CustomBlockTrapDoor("gray_stained_trapdoor_1");
		black_stained_trapdoor_1 = new CustomBlockTrapDoor("black_stained_trapdoor_1");
		brown_stained_trapdoor_1 = new CustomBlockTrapDoor("brown_stained_trapdoor_1");
		
		cedar_trapdoor_2 = new CustomBlockTrapDoor("cedar_trapdoor_2");
		crabapple_trapdoor_2 = new CustomBlockTrapDoor("crabapple_trapdoor_2");
		dogwood_trapdoor_2 = new CustomBlockTrapDoor("dogwood_trapdoor_2");
		jacaranda_trapdoor_2 = new CustomBlockTrapDoor("jacaranda_trapdoor_2");
		laburnum_trapdoor_2 = new CustomBlockTrapDoor("laburnum_trapdoor_2");
		paulownia_trapdoor_2 = new CustomBlockTrapDoor("paulownia_trapdoor_2");
		silverbell_trapdoor_2 = new CustomBlockTrapDoor("silverbell_trapdoor_2");
		wisteria_trapdoor_2 = new CustomBlockTrapDoor("wisteria_trapdoor_2");
		
		acacia_trapdoor_2 = new CustomBlockTrapDoor("acacia_trapdoor_2");
		birch_trapdoor_2 = new CustomBlockTrapDoor("birch_trapdoor_2");
		oak_trapdoor_2 = new CustomBlockTrapDoor("oak_trapdoor_2");
		dark_oak_trapdoor_2 = new CustomBlockTrapDoor("dark_oak_trapdoor_2");
		spruce_trapdoor_2 = new CustomBlockTrapDoor("spruce_trapdoor_2");
		jungle_trapdoor_2 = new CustomBlockTrapDoor("jungle_trapdoor_2");
		
		red_stained_trapdoor_2 = new CustomBlockTrapDoor("red_stained_trapdoor_2");
		orange_stained_trapdoor_2 = new CustomBlockTrapDoor("orange_stained_trapdoor_2");
		yellow_stained_trapdoor_2 = new CustomBlockTrapDoor("yellow_stained_trapdoor_2");
		lime_stained_trapdoor_2 = new CustomBlockTrapDoor("lime_stained_trapdoor_2");
		green_stained_trapdoor_2 = new CustomBlockTrapDoor("green_stained_trapdoor_2");
		cyan_stained_trapdoor_2 = new CustomBlockTrapDoor("cyan_stained_trapdoor_2");
		light_blue_stained_trapdoor_2 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_2");
		blue_stained_trapdoor_2 = new CustomBlockTrapDoor("blue_stained_trapdoor_2");
		purple_stained_trapdoor_2 = new CustomBlockTrapDoor("purple_stained_trapdoor_2");
		magenta_stained_trapdoor_2 = new CustomBlockTrapDoor("magenta_stained_trapdoor_2");
		pink_stained_trapdoor_2 = new CustomBlockTrapDoor("pink_stained_trapdoor_2");
		white_stained_trapdoor_2 = new CustomBlockTrapDoor("white_stained_trapdoor_2");
		light_gray_stained_trapdoor_2 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_2");
		gray_stained_trapdoor_2 = new CustomBlockTrapDoor("gray_stained_trapdoor_2");
		black_stained_trapdoor_2 = new CustomBlockTrapDoor("black_stained_trapdoor_2");
		brown_stained_trapdoor_2 = new CustomBlockTrapDoor("brown_stained_trapdoor_2");
		
		cedar_trapdoor_3 = new CustomBlockTrapDoor("cedar_trapdoor_3");
		crabapple_trapdoor_3 = new CustomBlockTrapDoor("crabapple_trapdoor_3");
		dogwood_trapdoor_3 = new CustomBlockTrapDoor("dogwood_trapdoor_3");
		jacaranda_trapdoor_3 = new CustomBlockTrapDoor("jacaranda_trapdoor_3");
		laburnum_trapdoor_3 = new CustomBlockTrapDoor("laburnum_trapdoor_3");
		paulownia_trapdoor_3 = new CustomBlockTrapDoor("paulownia_trapdoor_3");
		silverbell_trapdoor_3 = new CustomBlockTrapDoor("silverbell_trapdoor_3");
		wisteria_trapdoor_3 = new CustomBlockTrapDoor("wisteria_trapdoor_3");
		
		acacia_trapdoor_3 = new CustomBlockTrapDoor("acacia_trapdoor_3");
		birch_trapdoor_3 = new CustomBlockTrapDoor("birch_trapdoor_3");
		oak_trapdoor_3 = new CustomBlockTrapDoor("oak_trapdoor_3");
		dark_oak_trapdoor_3 = new CustomBlockTrapDoor("dark_oak_trapdoor_3");
		spruce_trapdoor_3 = new CustomBlockTrapDoor("spruce_trapdoor_3");
		jungle_trapdoor_3 = new CustomBlockTrapDoor("jungle_trapdoor_3");
		
		red_stained_trapdoor_3 = new CustomBlockTrapDoor("red_stained_trapdoor_3");
		orange_stained_trapdoor_3 = new CustomBlockTrapDoor("orange_stained_trapdoor_3");
		yellow_stained_trapdoor_3 = new CustomBlockTrapDoor("yellow_stained_trapdoor_3");
		lime_stained_trapdoor_3 = new CustomBlockTrapDoor("lime_stained_trapdoor_3");
		green_stained_trapdoor_3 = new CustomBlockTrapDoor("green_stained_trapdoor_3");
		cyan_stained_trapdoor_3 = new CustomBlockTrapDoor("cyan_stained_trapdoor_3");
		light_blue_stained_trapdoor_3 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_3");
		blue_stained_trapdoor_3 = new CustomBlockTrapDoor("blue_stained_trapdoor_3");
		purple_stained_trapdoor_3 = new CustomBlockTrapDoor("purple_stained_trapdoor_3");
		magenta_stained_trapdoor_3 = new CustomBlockTrapDoor("magenta_stained_trapdoor_3");
		pink_stained_trapdoor_3 = new CustomBlockTrapDoor("pink_stained_trapdoor_3");
		white_stained_trapdoor_3 = new CustomBlockTrapDoor("white_stained_trapdoor_3");
		light_gray_stained_trapdoor_3 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_3");
		gray_stained_trapdoor_3 = new CustomBlockTrapDoor("gray_stained_trapdoor_3");
		black_stained_trapdoor_3 = new CustomBlockTrapDoor("black_stained_trapdoor_3");
		brown_stained_trapdoor_3 = new CustomBlockTrapDoor("brown_stained_trapdoor_3");
		
		cedar_trapdoor_4 = new CustomBlockTrapDoor("cedar_trapdoor_4");
		crabapple_trapdoor_4 = new CustomBlockTrapDoor("crabapple_trapdoor_4");
		dogwood_trapdoor_4 = new CustomBlockTrapDoor("dogwood_trapdoor_4");
		jacaranda_trapdoor_4 = new CustomBlockTrapDoor("jacaranda_trapdoor_4");
		laburnum_trapdoor_4 = new CustomBlockTrapDoor("laburnum_trapdoor_4");
		paulownia_trapdoor_4 = new CustomBlockTrapDoor("paulownia_trapdoor_4");
		silverbell_trapdoor_4 = new CustomBlockTrapDoor("silverbell_trapdoor_4");
		wisteria_trapdoor_4 = new CustomBlockTrapDoor("wisteria_trapdoor_4");
		
		acacia_trapdoor_4 = new CustomBlockTrapDoor("acacia_trapdoor_4");
		birch_trapdoor_4 = new CustomBlockTrapDoor("birch_trapdoor_4");
		oak_trapdoor_4 = new CustomBlockTrapDoor("oak_trapdoor_4");
		dark_oak_trapdoor_4 = new CustomBlockTrapDoor("dark_oak_trapdoor_4");
		spruce_trapdoor_4 = new CustomBlockTrapDoor("spruce_trapdoor_4");
		jungle_trapdoor_4 = new CustomBlockTrapDoor("jungle_trapdoor_4");
		
		red_stained_trapdoor_4 = new CustomBlockTrapDoor("red_stained_trapdoor_4");
		orange_stained_trapdoor_4 = new CustomBlockTrapDoor("orange_stained_trapdoor_4");
		yellow_stained_trapdoor_4 = new CustomBlockTrapDoor("yellow_stained_trapdoor_4");
		lime_stained_trapdoor_4 = new CustomBlockTrapDoor("lime_stained_trapdoor_4");
		green_stained_trapdoor_4 = new CustomBlockTrapDoor("green_stained_trapdoor_4");
		cyan_stained_trapdoor_4 = new CustomBlockTrapDoor("cyan_stained_trapdoor_4");
		light_blue_stained_trapdoor_4 = new CustomBlockTrapDoor("light_blue_stained_trapdoor_4");
		blue_stained_trapdoor_4 = new CustomBlockTrapDoor("blue_stained_trapdoor_4");
		purple_stained_trapdoor_4 = new CustomBlockTrapDoor("purple_stained_trapdoor_4");
		magenta_stained_trapdoor_4 = new CustomBlockTrapDoor("magenta_stained_trapdoor_4");
		pink_stained_trapdoor_4 = new CustomBlockTrapDoor("pink_stained_trapdoor_4");
		white_stained_trapdoor_4 = new CustomBlockTrapDoor("white_stained_trapdoor_4");
		light_gray_stained_trapdoor_4 = new CustomBlockTrapDoor("light_gray_stained_trapdoor_4");
		gray_stained_trapdoor_4 = new CustomBlockTrapDoor("gray_stained_trapdoor_4");
		black_stained_trapdoor_4 = new CustomBlockTrapDoor("black_stained_trapdoor_4");
		brown_stained_trapdoor_4 = new CustomBlockTrapDoor("brown_stained_trapdoor_4");
		
		
		red_stained_door_1 = new CustomBlockDoor("red_stained_door_1");
		orange_stained_door_1 = new CustomBlockDoor("orange_stained_door_1");
		yellow_stained_door_1 = new CustomBlockDoor("yellow_stained_door_1");
		lime_stained_door_1 = new CustomBlockDoor("lime_stained_door_1");
		green_stained_door_1 = new CustomBlockDoor("green_stained_door_1");
		cyan_stained_door_1 = new CustomBlockDoor("cyan_stained_door_1");
		light_blue_stained_door_1 = new CustomBlockDoor("light_blue_stained_door_1");
		blue_stained_door_1 = new CustomBlockDoor("blue_stained_door_1");
		purple_stained_door_1 = new CustomBlockDoor("purple_stained_door_1");
		magenta_stained_door_1 = new CustomBlockDoor("magenta_stained_door_1");
		pink_stained_door_1 = new CustomBlockDoor("pink_stained_door_1");
		white_stained_door_1 = new CustomBlockDoor("white_stained_door_1");
		light_gray_stained_door_1 = new CustomBlockDoor("light_gray_stained_door_1");
		gray_stained_door_1 = new CustomBlockDoor("gray_stained_door_1");
		black_stained_door_1 = new CustomBlockDoor("black_stained_door_1");
		brown_stained_door_1 = new CustomBlockDoor("brown_stained_door_1");
		
		red_stained_door_2 = new CustomBlockDoor("red_stained_door_2");
		orange_stained_door_2 = new CustomBlockDoor("orange_stained_door_2");
		yellow_stained_door_2 = new CustomBlockDoor("yellow_stained_door_2");
		lime_stained_door_2 = new CustomBlockDoor("lime_stained_door_2");
		green_stained_door_2 = new CustomBlockDoor("green_stained_door_2");
		cyan_stained_door_2 = new CustomBlockDoor("cyan_stained_door_2");
		light_blue_stained_door_2 = new CustomBlockDoor("light_blue_stained_door_2");
		blue_stained_door_2 = new CustomBlockDoor("blue_stained_door_2");
		purple_stained_door_2 = new CustomBlockDoor("purple_stained_door_2");
		magenta_stained_door_2 = new CustomBlockDoor("magenta_stained_door_2");
		pink_stained_door_2 = new CustomBlockDoor("pink_stained_door_2");
		white_stained_door_2 = new CustomBlockDoor("white_stained_door_2");
		light_gray_stained_door_2 = new CustomBlockDoor("light_gray_stained_door_2");
		gray_stained_door_2 = new CustomBlockDoor("gray_stained_door_2");
		black_stained_door_2 = new CustomBlockDoor("black_stained_door_2");
		brown_stained_door_2 = new CustomBlockDoor("brown_stained_door_2");
		
		red_stained_door_3 = new CustomBlockDoor("red_stained_door_3");
		orange_stained_door_3 = new CustomBlockDoor("orange_stained_door_3");
		yellow_stained_door_3 = new CustomBlockDoor("yellow_stained_door_3");
		lime_stained_door_3 = new CustomBlockDoor("lime_stained_door_3");
		green_stained_door_3 = new CustomBlockDoor("green_stained_door_3");
		cyan_stained_door_3 = new CustomBlockDoor("cyan_stained_door_3");
		light_blue_stained_door_3 = new CustomBlockDoor("light_blue_stained_door_3");
		blue_stained_door_3 = new CustomBlockDoor("blue_stained_door_3");
		purple_stained_door_3 = new CustomBlockDoor("purple_stained_door_3");
		magenta_stained_door_3 = new CustomBlockDoor("magenta_stained_door_3");
		pink_stained_door_3 = new CustomBlockDoor("pink_stained_door_3");
		white_stained_door_3 = new CustomBlockDoor("white_stained_door_3");
		light_gray_stained_door_3 = new CustomBlockDoor("light_gray_stained_door_3");
		gray_stained_door_3 = new CustomBlockDoor("gray_stained_door_3");
		black_stained_door_3 = new CustomBlockDoor("black_stained_door_3");
		brown_stained_door_3 = new CustomBlockDoor("brown_stained_door_3");
		
		red_stained_door_4 = new CustomBlockDoor("red_stained_door_4");
		orange_stained_door_4 = new CustomBlockDoor("orange_stained_door_4");
		yellow_stained_door_4 = new CustomBlockDoor("yellow_stained_door_4");
		lime_stained_door_4 = new CustomBlockDoor("lime_stained_door_4");
		green_stained_door_4 = new CustomBlockDoor("green_stained_door_4");
		cyan_stained_door_4 = new CustomBlockDoor("cyan_stained_door_4");
		light_blue_stained_door_4 = new CustomBlockDoor("light_blue_stained_door_4");
		blue_stained_door_4 = new CustomBlockDoor("blue_stained_door_4");
		purple_stained_door_4 = new CustomBlockDoor("purple_stained_door_4");
		magenta_stained_door_4 = new CustomBlockDoor("magenta_stained_door_4");
		pink_stained_door_4 = new CustomBlockDoor("pink_stained_door_4");
		white_stained_door_4 = new CustomBlockDoor("white_stained_door_4");
		light_gray_stained_door_4 = new CustomBlockDoor("light_gray_stained_door_4");
		gray_stained_door_4 = new CustomBlockDoor("gray_stained_door_4");
		black_stained_door_4 = new CustomBlockDoor("black_stained_door_4");
		brown_stained_door_4 = new CustomBlockDoor("brown_stained_door_4");
		
		red_stained_door_5 = new CustomBlockDoor("red_stained_door_5");
		orange_stained_door_5 = new CustomBlockDoor("orange_stained_door_5");
		yellow_stained_door_5 = new CustomBlockDoor("yellow_stained_door_5");
		lime_stained_door_5 = new CustomBlockDoor("lime_stained_door_5");
		green_stained_door_5 = new CustomBlockDoor("green_stained_door_5");
		cyan_stained_door_5 = new CustomBlockDoor("cyan_stained_door_5");
		light_blue_stained_door_5 = new CustomBlockDoor("light_blue_stained_door_5");
		blue_stained_door_5 = new CustomBlockDoor("blue_stained_door_5");
		purple_stained_door_5 = new CustomBlockDoor("purple_stained_door_5");
		magenta_stained_door_5 = new CustomBlockDoor("magenta_stained_door_5");
		pink_stained_door_5 = new CustomBlockDoor("pink_stained_door_5");
		white_stained_door_5 = new CustomBlockDoor("white_stained_door_5");
		light_gray_stained_door_5 = new CustomBlockDoor("light_gray_stained_door_5");
		gray_stained_door_5 = new CustomBlockDoor("gray_stained_door_5");
		black_stained_door_5 = new CustomBlockDoor("black_stained_door_5");
		brown_stained_door_5 = new CustomBlockDoor("brown_stained_door_5");
		
		red_stained_door_6 = new CustomBlockDoor("red_stained_door_6");
		orange_stained_door_6 = new CustomBlockDoor("orange_stained_door_6");
		yellow_stained_door_6 = new CustomBlockDoor("yellow_stained_door_6");
		lime_stained_door_6 = new CustomBlockDoor("lime_stained_door_6");
		green_stained_door_6 = new CustomBlockDoor("green_stained_door_6");
		cyan_stained_door_6 = new CustomBlockDoor("cyan_stained_door_6");
		light_blue_stained_door_6 = new CustomBlockDoor("light_blue_stained_door_6");
		blue_stained_door_6 = new CustomBlockDoor("blue_stained_door_6");
		purple_stained_door_6 = new CustomBlockDoor("purple_stained_door_6");
		magenta_stained_door_6 = new CustomBlockDoor("magenta_stained_door_6");
		pink_stained_door_6 = new CustomBlockDoor("pink_stained_door_6");
		white_stained_door_6 = new CustomBlockDoor("white_stained_door_6");
		light_gray_stained_door_6 = new CustomBlockDoor("light_gray_stained_door_6");
		gray_stained_door_6 = new CustomBlockDoor("gray_stained_door_6");
		black_stained_door_6 = new CustomBlockDoor("black_stained_door_6");
		brown_stained_door_6 = new CustomBlockDoor("brown_stained_door_6");
		
		acacia_door_1 =new CustomBlockDoor("acacia_door_1");
		acacia_door_2 = new CustomBlockDoor("acacia_door_2");
		acacia_door_3 = new CustomBlockDoor("acacia_door_3");
		acacia_door_4 = new CustomBlockDoor("acacia_door_4");
		acacia_door_5 = new CustomBlockDoor("acacia_door_5");
		acacia_door_6 = new CustomBlockDoor("acacia_door_6");
		
		birch_door_1 =new CustomBlockDoor("birch_door_1");
		birch_door_2 = new CustomBlockDoor("birch_door_2");
		birch_door_3 = new CustomBlockDoor("birch_door_3");
		birch_door_4 = new CustomBlockDoor("birch_door_4");
		birch_door_5 = new CustomBlockDoor("birch_door_5");
		birch_door_6 = new CustomBlockDoor("birch_door_6");
		
		oak_door_1 =new CustomBlockDoor("oak_door_1");
		oak_door_2 = new CustomBlockDoor("oak_door_2");
		oak_door_3 = new CustomBlockDoor("oak_door_3");
		oak_door_4 = new CustomBlockDoor("oak_door_4");
		oak_door_5 = new CustomBlockDoor("oak_door_5");
		oak_door_6 = new CustomBlockDoor("oak_door_6");
		
		spruce_door_1 =new CustomBlockDoor("spruce_door_1");
		spruce_door_2 = new CustomBlockDoor("spruce_door_2");
		spruce_door_3 = new CustomBlockDoor("spruce_door_3");
		spruce_door_4 = new CustomBlockDoor("spruce_door_4");
		spruce_door_5 = new CustomBlockDoor("spruce_door_5");
		spruce_door_6 = new CustomBlockDoor("spruce_door_6");
				
		dark_oak_door_1 =new CustomBlockDoor("dark_oak_door_1");
		dark_oak_door_2 = new CustomBlockDoor("dark_oak_door_2");
		dark_oak_door_3 = new CustomBlockDoor("dark_oak_door_3");
		dark_oak_door_4 = new CustomBlockDoor("dark_oak_door_4");
		dark_oak_door_5 = new CustomBlockDoor("dark_oak_door_5");
		dark_oak_door_6 = new CustomBlockDoor("dark_oak_door_6");
		
		jungle_door_1 =new CustomBlockDoor("jungle_door_1");
		jungle_door_2 = new CustomBlockDoor("jungle_door_2");
		jungle_door_3 = new CustomBlockDoor("jungle_door_3");
		jungle_door_4 = new CustomBlockDoor("jungle_door_4");
		jungle_door_5 = new CustomBlockDoor("jungle_door_5");
		jungle_door_6 = new CustomBlockDoor("jungle_door_6");
		
		silverbell_door_1 = new CustomBlockDoor("silverbell_door_1");
		silverbell_door_2 = new CustomBlockDoor("silverbell_door_2");
		silverbell_door_3 = new CustomBlockDoor("silverbell_door_3");
		silverbell_door_4 = new CustomBlockDoor("silverbell_door_4");
		silverbell_door_5 = new CustomBlockDoor("silverbell_door_5");
		silverbell_door_6 = new CustomBlockDoor("silverbell_door_6");
		
		cedar_door_1 =new CustomBlockDoor("cedar_door_1");
		cedar_door_2 = new CustomBlockDoor("cedar_door_2");
		cedar_door_3 = new CustomBlockDoor("cedar_door_3");
		cedar_door_4 = new CustomBlockDoor("cedar_door_4");
		cedar_door_5 = new CustomBlockDoor("cedar_door_5");
		cedar_door_6 = new CustomBlockDoor("cedar_door_6");
		
		crabapple_door_1 = new CustomBlockDoor("crabapple_door_1");
		crabapple_door_2 = new CustomBlockDoor("crabapple_door_2");
		crabapple_door_3 = new CustomBlockDoor("crabapple_door_3");
		crabapple_door_4 = new CustomBlockDoor("crabapple_door_4");
		crabapple_door_5 = new CustomBlockDoor("crabapple_door_5");
		crabapple_door_6 = new CustomBlockDoor("crabapple_door_6");
		
		dogwood_door_1 = new CustomBlockDoor("dogwood_door_1");
		dogwood_door_2 = new CustomBlockDoor("dogwood_door_2");
		dogwood_door_3 = new CustomBlockDoor("dogwood_door_3");
		dogwood_door_4 = new CustomBlockDoor("dogwood_door_4");
		dogwood_door_5 = new CustomBlockDoor("dogwood_door_5");
		dogwood_door_6 = new CustomBlockDoor("dogwood_door_6");
		
		jacaranda_door_1 = new CustomBlockDoor("jacaranda_door_1");
		jacaranda_door_2 = new CustomBlockDoor("jacaranda_door_2");
		jacaranda_door_3 = new CustomBlockDoor("jacaranda_door_3");
		jacaranda_door_4 = new CustomBlockDoor("jacaranda_door_4");
		jacaranda_door_5 = new CustomBlockDoor("jacaranda_door_5");
		jacaranda_door_6 = new CustomBlockDoor("jacaranda_door_6");
		
		laburnum_door_1 = new CustomBlockDoor("laburnum_door_1");
		laburnum_door_2 = new CustomBlockDoor("laburnum_door_2");
		laburnum_door_3 = new CustomBlockDoor("laburnum_door_3");
		laburnum_door_4 = new CustomBlockDoor("laburnum_door_4");
		laburnum_door_5 = new CustomBlockDoor("laburnum_door_5");
		laburnum_door_6 = new CustomBlockDoor("laburnum_door_6");
		
		paulownia_door_1 = new CustomBlockDoor("paulownia_door_1");
		paulownia_door_2 = new CustomBlockDoor("paulownia_door_2");
		paulownia_door_3 = new CustomBlockDoor("paulownia_door_3");
		paulownia_door_4 = new CustomBlockDoor("paulownia_door_4");
		paulownia_door_5 = new CustomBlockDoor("paulownia_door_5");
		paulownia_door_6 = new CustomBlockDoor("paulownia_door_6");
		
		wisteria_door_1 = new CustomBlockDoor("wisteria_door_1");
		wisteria_door_2 = new CustomBlockDoor("wisteria_door_2");
		wisteria_door_3 = new CustomBlockDoor("wisteria_door_3");
		wisteria_door_4 = new CustomBlockDoor("wisteria_door_4");
		wisteria_door_5 = new CustomBlockDoor("wisteria_door_5");
		wisteria_door_6 = new CustomBlockDoor("wisteria_door_6");
		
		red_stained_planks = new CustomWoodPlanks("red_stained_planks", Material.WOOD);
		orange_stained_planks = new CustomWoodPlanks("orange_stained_planks", Material.WOOD);
		yellow_stained_planks = new CustomWoodPlanks("yellow_stained_planks",  Material.WOOD);
		lime_stained_planks = new CustomWoodPlanks("lime_stained_planks", Material.WOOD);
		green_stained_planks = new CustomWoodPlanks("green_stained_planks",  Material.WOOD);
		cyan_stained_planks = new CustomWoodPlanks("cyan_stained_planks",   Material.WOOD);
		light_blue_stained_planks = new CustomWoodPlanks("light_blue_stained_planks", Material.WOOD);
		blue_stained_planks = new CustomWoodPlanks("blue_stained_planks",  Material.WOOD);
		purple_stained_planks = new CustomWoodPlanks("purple_stained_planks",  Material.WOOD);
		magenta_stained_planks = new CustomWoodPlanks("magenta_stained_planks",  Material.WOOD);
		pink_stained_planks = new CustomWoodPlanks("pink_stained_planks",  Material.WOOD);
		white_stained_planks = new CustomWoodPlanks("white_stained_planks",  Material.WOOD);
		light_gray_stained_planks = new CustomWoodPlanks("light_gray_stained_planks",   Material.WOOD);
		gray_stained_planks = new CustomWoodPlanks("gray_stained_planks",  Material.WOOD);
		black_stained_planks = new CustomWoodPlanks("black_stained_planks",  Material.WOOD);
		brown_stained_planks = new CustomWoodPlanks("brown_stained_planks",  Material.WOOD);
		
		red_stained_bookshelf = new BlockStainedBookshelf("red_stained_bookshelf", Material.WOOD);
		orange_stained_bookshelf = new BlockStainedBookshelf("orange_stained_bookshelf", Material.WOOD);
		yellow_stained_bookshelf = new BlockStainedBookshelf("yellow_stained_bookshelf",  Material.WOOD);
		lime_stained_bookshelf = new BlockStainedBookshelf("lime_stained_bookshelf", Material.WOOD);
		green_stained_bookshelf = new BlockStainedBookshelf("green_stained_bookshelf",  Material.WOOD);
		cyan_stained_bookshelf = new BlockStainedBookshelf("cyan_stained_bookshelf",   Material.WOOD);
		light_blue_stained_bookshelf = new BlockStainedBookshelf("light_blue_stained_bookshelf", Material.WOOD);
		blue_stained_bookshelf = new BlockStainedBookshelf("blue_stained_bookshelf",  Material.WOOD);
		purple_stained_bookshelf = new BlockStainedBookshelf("purple_stained_bookshelf",  Material.WOOD);
		magenta_stained_bookshelf = new BlockStainedBookshelf("magenta_stained_bookshelf",  Material.WOOD);
		pink_stained_bookshelf = new BlockStainedBookshelf("pink_stained_bookshelf",  Material.WOOD);
		white_stained_bookshelf = new BlockStainedBookshelf("white_stained_bookshelf",  Material.WOOD);
		light_gray_stained_bookshelf = new BlockStainedBookshelf("light_gray_stained_bookshelf",   Material.WOOD);
		gray_stained_bookshelf = new BlockStainedBookshelf("gray_stained_bookshelf",  Material.WOOD);
		black_stained_bookshelf = new BlockStainedBookshelf("black_stained_bookshelf",  Material.WOOD);
		brown_stained_bookshelf = new BlockStainedBookshelf("brown_stained_bookshelf",  Material.WOOD);
		
		cedar_bookshelf = new BlockStainedBookshelf("cedar_bookshelf",  Material.WOOD);
		crabapple_bookshelf = new BlockStainedBookshelf("crabapple_bookshelf",  Material.WOOD);
		dogwood_bookshelf = new BlockStainedBookshelf("dogwood_bookshelf",  Material.WOOD);
		jacaranda_bookshelf = new BlockStainedBookshelf("jacaranda_bookshelf",  Material.WOOD);
		laburnum_bookshelf = new BlockStainedBookshelf("laburnum_bookshelf",   Material.WOOD);
		paulownia_bookshelf = new BlockStainedBookshelf("paulownia_bookshelf",  Material.WOOD);
		silverbell_bookshelf = new BlockStainedBookshelf("silverbell_bookshelf",  Material.WOOD);
		wisteria_bookshelf = new BlockStainedBookshelf("wisteria_bookshelf",  Material.WOOD);
		
		acacia_bookshelf = new BlockStainedBookshelf("acacia_bookshelf",  Material.WOOD);
		birch_bookshelf = new BlockStainedBookshelf("birch_bookshelf",  Material.WOOD);
		oak_bookshelf = new BlockStainedBookshelf("oak_bookshelf",  Material.WOOD);
		dark_oak_bookshelf = new BlockStainedBookshelf("dark_oak_bookshelf",  Material.WOOD);
		spruce_bookshelf = new BlockStainedBookshelf("spruce_bookshelf",  Material.WOOD);
		jungle_bookshelf = new BlockStainedBookshelf("jungle_bookshelf",  Material.WOOD);
		
		
		red_stained_stairs = new CustomBlockStairs("red_stained_stairs", whitewashed_planks.getDefaultState());
		orange_stained_stairs = new CustomBlockStairs("orange_stained_stairs", whitewashed_planks.getDefaultState());
		yellow_stained_stairs = new CustomBlockStairs("yellow_stained_stairs", whitewashed_planks.getDefaultState());
		lime_stained_stairs = new CustomBlockStairs("lime_stained_stairs", whitewashed_planks.getDefaultState());
		green_stained_stairs = new CustomBlockStairs("green_stained_stairs", whitewashed_planks.getDefaultState());
		cyan_stained_stairs = new CustomBlockStairs("cyan_stained_stairs", whitewashed_planks.getDefaultState());
		light_blue_stained_stairs = new CustomBlockStairs("light_blue_stained_stairs", whitewashed_planks.getDefaultState());
		blue_stained_stairs = new CustomBlockStairs("blue_stained_stairs", whitewashed_planks.getDefaultState());
		purple_stained_stairs = new CustomBlockStairs("purple_stained_stairs", whitewashed_planks.getDefaultState());
		magenta_stained_stairs = new CustomBlockStairs("magenta_stained_stairs", whitewashed_planks.getDefaultState());
		brown_stained_stairs = new CustomBlockStairs("brown_stained_stairs", whitewashed_planks.getDefaultState());
		black_stained_stairs = new CustomBlockStairs("black_stained_stairs", whitewashed_planks.getDefaultState());
		gray_stained_stairs = new CustomBlockStairs("gray_stained_stairs", whitewashed_planks.getDefaultState());
		light_gray_stained_stairs = new CustomBlockStairs("light_gray_stained_stairs", whitewashed_planks.getDefaultState());
		white_stained_stairs = new CustomBlockStairs("white_stained_stairs", whitewashed_planks.getDefaultState());
		pink_stained_stairs = new CustomBlockStairs("pink_stained_stairs", whitewashed_planks.getDefaultState());
		
		red_stained_slab_half = new CustomBlockHalfSlab("red_stained_slab_half", 2.5F, 4.5F);
		orange_stained_slab_half = new CustomBlockHalfSlab("orange_stained_slab_half", 2.5F, 4.5F);
		yellow_stained_slab_half = new CustomBlockHalfSlab("yellow_stained_slab_half", 2.5F, 4.5F);
		lime_stained_slab_half = new CustomBlockHalfSlab("lime_stained_slab_half", 2.5F, 4.5F);
		green_stained_slab_half = new CustomBlockHalfSlab("green_stained_slab_half", 2.5F, 4.5F);
		cyan_stained_slab_half = new CustomBlockHalfSlab("cyan_stained_slab_half", 2.5F, 4.5F);
		light_blue_stained_slab_half = new CustomBlockHalfSlab("light_blue_stained_slab_half", 2.5F, 4.5F);
		blue_stained_slab_half = new CustomBlockHalfSlab("blue_stained_slab_half", 2.5F, 4.5F);
		purple_stained_slab_half = new CustomBlockHalfSlab("purple_stained_slab_half", 2.5F, 4.5F);
		magenta_stained_slab_half = new CustomBlockHalfSlab("magenta_stained_slab_half", 2.5F, 4.5F);
		pink_stained_slab_half = new CustomBlockHalfSlab("pink_stained_slab_half", 2.5F, 4.5F);
		white_stained_slab_half = new CustomBlockHalfSlab("white_stained_slab_half", 2.5F, 4.5F);
		light_gray_stained_slab_half = new CustomBlockHalfSlab("light_gray_stained_slab_half", 2.5F, 4.5F);
		gray_stained_slab_half = new CustomBlockHalfSlab("gray_stained_slab_half", 2.5F, 4.5F);
		black_stained_slab_half = new CustomBlockHalfSlab("black_stained_slab_half", 2.5F, 4.5F);
		brown_stained_slab_half = new CustomBlockHalfSlab("brown_stained_slab_half", 2.5F, 4.5F);
			
		red_stained_slab_double = new CustomBlockDoubleSlab("red_stained_slab_double", 2.5F, 4.5F);
		orange_stained_slab_double = new CustomBlockDoubleSlab("orange_stained_slab_double", 2.5F, 4.5F);
		yellow_stained_slab_double = new CustomBlockDoubleSlab("yellow_stained_slab_double", 2.5F, 4.5F);
		lime_stained_slab_double = new CustomBlockDoubleSlab("lime_stained_slab_double", 2.5F, 4.5F);
		green_stained_slab_double = new CustomBlockDoubleSlab("green_stained_slab_double", 2.5F, 4.5F);
		cyan_stained_slab_double = new CustomBlockDoubleSlab("cyan_stained_slab_double", 2.5F, 4.5F);
		light_blue_stained_slab_double = new CustomBlockDoubleSlab("light_blue_stained_slab_double", 2.5F, 4.5F);
		blue_stained_slab_double = new CustomBlockDoubleSlab("blue_stained_slab_double", 2.5F, 4.5F);
		purple_stained_slab_double = new CustomBlockDoubleSlab("purple_stained_slab_double", 2.5F, 4.5F);
		magenta_stained_slab_double = new CustomBlockDoubleSlab("magenta_stained_slab_double", 2.5F, 4.5F);
		pink_stained_slab_double = new CustomBlockDoubleSlab("pink_stained_slab_double", 2.5F, 4.5F);
		white_stained_slab_double = new CustomBlockDoubleSlab("white_stained_slab_double", 2.5F, 4.5F);
		light_gray_stained_slab_double = new CustomBlockDoubleSlab("light_gray_stained_slab_double", 2.5F, 4.5F);
		gray_stained_slab_double = new CustomBlockDoubleSlab("gray_stained_slab_double", 2.5F, 4.5F);
		black_stained_slab_double = new CustomBlockDoubleSlab("black_stained_slab_double", 2.5F, 4.5F);
		brown_stained_slab_double = new CustomBlockDoubleSlab("brown_stained_slab_double", 2.5F, 4.5F);
		
		red_stained_fence = new CustomBlockFence("red_stained_fence", 2.5F, 4.5F);
		orange_stained_fence = new CustomBlockFence("orange_stained_fence", 2.5F, 4.5F);
		yellow_stained_fence = new CustomBlockFence("yellow_stained_fence", 2.5F, 4.5F);
		lime_stained_fence = new CustomBlockFence("lime_stained_fence", 2.5F, 4.5F);
		green_stained_fence = new CustomBlockFence("green_stained_fence", 2.5F, 4.5F);
		cyan_stained_fence = new CustomBlockFence("cyan_stained_fence", 2.5F, 4.5F);
		light_blue_stained_fence = new CustomBlockFence("light_blue_stained_fence", 2.5F, 4.5F);
		blue_stained_fence = new CustomBlockFence("blue_stained_fence", 2.5F, 4.5F);
		purple_stained_fence = new CustomBlockFence("purple_stained_fence", 2.5F, 4.5F);
		magenta_stained_fence = new CustomBlockFence("magenta_stained_fence", 2.5F, 4.5F);
		pink_stained_fence = new CustomBlockFence("pink_stained_fence", 2.5F, 4.5F);
		white_stained_fence = new CustomBlockFence("white_stained_fence", 2.5F, 4.5F);
		light_gray_stained_fence = new CustomBlockFence("light_gray_stained_fence", 2.5F, 4.5F);
		gray_stained_fence = new CustomBlockFence("gray_stained_fence", 2.5F, 4.5F);
		black_stained_fence = new CustomBlockFence("black_stained_fence", 2.5F, 4.5F);
		brown_stained_fence = new CustomBlockFence("brown_stained_fence", 2.5F, 4.5F);

		red_stained_fence_gate = new CustomBlockFenceGate("red_stained_fence_gate", 2.5F, 4.5F);
		orange_stained_fence_gate = new CustomBlockFenceGate("orange_stained_fence_gate", 2.5F, 4.5F);
		yellow_stained_fence_gate = new CustomBlockFenceGate("yellow_stained_fence_gate", 2.5F, 4.5F);
		lime_stained_fence_gate = new CustomBlockFenceGate("lime_stained_fence_gate", 2.5F, 4.5F);
		green_stained_fence_gate = new CustomBlockFenceGate("green_stained_fence_gate", 2.5F, 4.5F);
		cyan_stained_fence_gate = new CustomBlockFenceGate("cyan_stained_fence_gate", 2.5F, 4.5F);
		light_blue_stained_fence_gate = new CustomBlockFenceGate("light_blue_stained_fence_gate", 2.5F, 4.5F);
		blue_stained_fence_gate = new CustomBlockFenceGate("blue_stained_fence_gate", 2.5F, 4.5F);
		purple_stained_fence_gate = new CustomBlockFenceGate("purple_stained_fence_gate", 2.5F, 4.5F);
		magenta_stained_fence_gate = new CustomBlockFenceGate("magenta_stained_fence_gate", 2.5F, 4.5F);
		pink_stained_fence_gate = new CustomBlockFenceGate("pink_stained_fence_gate", 2.5F, 4.5F);
		white_stained_fence_gate = new CustomBlockFenceGate("white_stained_fence_gate", 2.5F, 4.5F);
		light_gray_stained_fence_gate = new CustomBlockFenceGate("light_gray_stained_fence_gate", 2.5F, 4.5F);
		gray_stained_fence_gate = new CustomBlockFenceGate("gray_stained_fence_gate", 2.5F, 4.5F);
		black_stained_fence_gate = new CustomBlockFenceGate("black_stained_fence_gate", 2.5F, 4.5F);
		brown_stained_fence_gate = new CustomBlockFenceGate("brown_stained_fence_gate", 2.5F, 4.5F);
		
		red_stained_pressure_plate = new BlockCustomPressurePlate("red_stained_pressure_plate", 10);
		orange_stained_pressure_plate = new BlockCustomPressurePlate("orange_stained_pressure_plate", 10);
		yellow_stained_pressure_plate = new BlockCustomPressurePlate("yellow_stained_pressure_plate", 10);
		lime_stained_pressure_plate = new BlockCustomPressurePlate("lime_stained_pressure_plate", 10);
		green_stained_pressure_plate = new BlockCustomPressurePlate("green_stained_pressure_plate", 10);
		cyan_stained_pressure_plate = new BlockCustomPressurePlate("cyan_stained_pressure_plate", 10);
		light_blue_stained_pressure_plate = new BlockCustomPressurePlate("light_blue_stained_pressure_plate", 10);
		blue_stained_pressure_plate = new BlockCustomPressurePlate("blue_stained_pressure_plate", 10);
		purple_stained_pressure_plate = new BlockCustomPressurePlate("purple_stained_pressure_plate", 10);
		magenta_stained_pressure_plate = new BlockCustomPressurePlate("magenta_stained_pressure_plate", 10);
		pink_stained_pressure_plate = new BlockCustomPressurePlate("pink_stained_pressure_plate", 10);
		white_stained_pressure_plate = new BlockCustomPressurePlate("white_stained_pressure_plate", 10);
		light_gray_stained_pressure_plate = new BlockCustomPressurePlate("light_gray_stained_pressure_plate", 10);
		gray_stained_pressure_plate = new BlockCustomPressurePlate("gray_stained_pressure_plate", 10);
		black_stained_pressure_plate = new BlockCustomPressurePlate("black_stained_pressure_plate", 10);
		brown_stained_pressure_plate = new BlockCustomPressurePlate("brown_stained_pressure_plate", 10);
		
		red_stained_button = new BlockCustomButton("red_stained_button");
		orange_stained_button = new BlockCustomButton("orange_stained_button");
		yellow_stained_button = new BlockCustomButton("yellow_stained_button");
		lime_stained_button = new BlockCustomButton("lime_stained_button");
		green_stained_button = new BlockCustomButton("green_stained_button");
		cyan_stained_button = new BlockCustomButton("cyan_stained_button");
		light_blue_stained_button = new BlockCustomButton("light_blue_stained_button");
		blue_stained_button = new BlockCustomButton("blue_stained_button");
		purple_stained_button = new BlockCustomButton("purple_stained_button");
		magenta_stained_button = new BlockCustomButton("magenta_stained_button");
		pink_stained_button = new BlockCustomButton("pink_stained_button");
		white_stained_button = new BlockCustomButton("white_stained_button");
		light_gray_stained_button = new BlockCustomButton("light_gray_stained_button");
		gray_stained_button = new BlockCustomButton("gray_stained_button");
		black_stained_button = new BlockCustomButton("black_stained_button");
		brown_stained_button = new BlockCustomButton("brown_stained_button");
		
		leaves_jacaranda = new BlockJacarandaLeaves("jacaranda_leaves");
		leaves_wisteria = new BlockWisteriaLeaves("wisteria_leaves");
		leaves_silverbell = new BlockSilverBellLeaves("silverbell_leaves");
		leaves_dogwood = new BlockDogwoodLeaves("dogwood_leaves");
		leaves_crabapple = new BlockCrabappleLeaves("crabapple_leaves");
		leaves_paulownia = new BlockPaulowniaLeaves("paulownia_leaves");
		leaves_laburnum = new BlockLaburnumLeaves("laburnum_leaves");
		
		log_jacaranda = new BlockJacarandaLog("jacaranda_log");
		log_wisteria = new BlockWisteriaLog("wisteria_log");
		log_silverbell = new BlockSilverBellLog("silverbell_log");
		log_dogwood = new BlockDogwoodLog("dogwood_log");
		log_crabapple = new BlockCrabappleLog("crabapple_log");
		log_paulownia = new BlockPaulowniaLog("paulownia_log");
		log_laburnum = new BlockLaburnumLog("laburnum_log");
		
		sapling_jacaranda = new BlockJacarandaSapling("jacaranda_sapling");
		sapling_wisteria = new BlockWisteriaSapling("wisteria_sapling");
		sapling_silverbell = new BlockSilverBellSapling("silverbell_sapling");
		sapling_crabapple = new BlockCrabappleSapling("crabapple_sapling");
		sapling_dogwood = new BlockDogwoodSapling("dogwood_sapling");
		sapling_laburnum = new BlockLaburnumSapling("laburnum_sapling");
		sapling_paulownia = new BlockPaulowniaSapling("paulownia_sapling");
		
		sapling_jacaranda_vines = new BlockJacarandaSaplingVines("jacaranda_sapling_vines");
		sapling_wisteria_vines = new BlockWisteriaSaplingVines("wisteria_sapling_vines");
		sapling_silverbell_vines = new BlockSilverBellSaplingVines("silverbell_sapling_vines");
		sapling_crabapple_vines = new BlockCrabappleSaplingVines("crabapple_sapling_vines");
		sapling_dogwood_vines = new BlockDogwoodSaplingVines("dogwood_sapling_vines");
		sapling_laburnum_vines = new BlockLaburnumSaplingVines("laburnum_sapling_vines");
		sapling_paulownia_vines = new BlockPaulowniaSaplingVines("paulownia_sapling_vines");
	
		vine_wisteria = new BlockWisteriaVine("wisteria_vine");
		vine_jacaranda = new BlockJacarandaVine("jacaranda_vine");
		vine_laburnum = new BlockLaburnumVine("laburnum_vine");
		vine_silverbell = new BlockSilverBellVine("silverbell_vine");
		vine_paulownia = new BlockPaulowniaVine("paulownia_vine");
		vine_dogwood = new BlockDogwoodVine("dogwood_vine");
		vine_crabapple = new BlockCrabappleVine("crabapple_vine");
		
	}
	


	public static void register()
	//TODO
	{
		registerBlock(crabapple_cobblestone);
		registerBlock(dogwood_cobblestone);
		registerBlock(jacaranda_cobblestone);
		registerBlock(laburnum_cobblestone);
		registerBlock(paulownia_cobblestone);
		registerBlock(silverbell_cobblestone);
		registerBlock(wisteria_cobblestone);
		registerBlock(vine_tie);
		registerBlock(earthen_block);
		registerBlock(floral_block);
		registerBlock(amethyst_block);
		registerBlock(aventurine_block);
		registerBlock(carnelian_block);
		registerBlock(chalcopyrite_block);
		registerBlock(citrine_block);
		registerBlock(jade_block);
		registerBlock(jasper_block);
		registerBlock(labradorite_block);
		registerBlock(mica_block);
		registerBlock(moonstone_block);
		registerBlock(rose_quartz_block);
		registerBlock(sodalite_block);
		
		registerBlock(amethyst_ore);
		registerBlock(aventurine_ore);
		registerBlock(carnelian_ore);
		registerBlock(chalcopyrite_ore);
		registerBlock(citrine_ore);
		registerBlock(jade_ore);
		registerBlock(jasper_ore);
		registerBlock(labradorite_ore);
		registerBlock(mica_ore);
		registerBlock(moonstone_ore);
		registerBlock(rose_quartz_ore);
		registerBlock(sodalite_ore);
				
		registerBlock(ornamental_grass);
		registerBlock(ornamental_dirt);
						
		registerBlock(cedar_log);
		registerBlock(log_crabapple);
		registerBlock(log_dogwood);
		registerBlock(log_jacaranda);
		registerBlock(log_laburnum);
		registerBlock(log_paulownia);
		registerBlock(log_silverbell);
		registerBlock(log_wisteria);
				
		registerBlock(cedar_leaves);
		registerBlock(leaves_crabapple);
		registerBlock(leaves_dogwood);
		registerBlock(leaves_jacaranda);
		registerBlock(leaves_laburnum);
		registerBlock(leaves_paulownia);
		registerBlock(leaves_silverbell);
		registerBlock(leaves_wisteria);
				
		registerBlock(amethyst_tile_1);
		registerBlock(amethyst_tile_2);
		registerBlock(amethyst_tile_3);
		registerBlock(amethyst_tile_4);
		registerBlock(amethyst_tile_5);
		registerBlock(amethyst_tile_6);
		
		registerBlock(aventurine_tile_1);
		registerBlock(aventurine_tile_2);
		registerBlock(aventurine_tile_3);
		registerBlock(aventurine_tile_4);
		registerBlock(aventurine_tile_5);
		registerBlock(aventurine_tile_6);
		
		registerBlock(carnelian_tile_1);
		registerBlock(carnelian_tile_2);
		registerBlock(carnelian_tile_3);
		registerBlock(carnelian_tile_4);
		registerBlock(carnelian_tile_5);
		registerBlock(carnelian_tile_6);
		
		registerBlock(chalcopyrite_tile_1);
		registerBlock(chalcopyrite_tile_2);
		registerBlock(chalcopyrite_tile_3);
		registerBlock(chalcopyrite_tile_4);
		registerBlock(chalcopyrite_tile_5);
		registerBlock(chalcopyrite_tile_6);
		
		registerBlock(citrine_tile_1);
		registerBlock(citrine_tile_2);
		registerBlock(citrine_tile_3);
		registerBlock(citrine_tile_4);
		registerBlock(citrine_tile_5);
		registerBlock(citrine_tile_6);
		
		registerBlock(jade_tile_1);
		registerBlock(jade_tile_2);
		registerBlock(jade_tile_3);
		registerBlock(jade_tile_4);
		registerBlock(jade_tile_5);
		registerBlock(jade_tile_6);
		
		registerBlock(jasper_tile_1);
		registerBlock(jasper_tile_2);
		registerBlock(jasper_tile_3);
		registerBlock(jasper_tile_4);
		registerBlock(jasper_tile_5);
		registerBlock(jasper_tile_6);
		
		registerBlock(labradorite_tile_1);
		registerBlock(labradorite_tile_2);
		registerBlock(labradorite_tile_3);
		registerBlock(labradorite_tile_4);
		registerBlock(labradorite_tile_5);
		registerBlock(labradorite_tile_6);
		
		registerBlock(mica_tile_1);
		registerBlock(mica_tile_2);
		registerBlock(mica_tile_3);
		registerBlock(mica_tile_4);
		registerBlock(mica_tile_5);
		registerBlock(mica_tile_6);
		
		registerBlock(moonstone_tile_1);
		registerBlock(moonstone_tile_2);
		registerBlock(moonstone_tile_3);
		registerBlock(moonstone_tile_4);
		registerBlock(moonstone_tile_5);
		registerBlock(moonstone_tile_6);
		
		registerBlock(rose_quartz_tile_1);
		registerBlock(rose_quartz_tile_2);
		registerBlock(rose_quartz_tile_3);
		registerBlock(rose_quartz_tile_4);
		registerBlock(rose_quartz_tile_5);
		registerBlock(rose_quartz_tile_6);
		
		registerBlock(sodalite_tile_1);
		registerBlock(sodalite_tile_2);
		registerBlock(sodalite_tile_3);
		registerBlock(sodalite_tile_4);
		registerBlock(sodalite_tile_5);
		registerBlock(sodalite_tile_6);
		
		registerBlock(red_clay_block);
		registerBlock(orange_clay_block);
		registerBlock(yellow_clay_block);
		registerBlock(lime_clay_block);
		registerBlock(green_clay_block);
		registerBlock(cyan_clay_block);
		registerBlock(light_blue_clay_block);
		registerBlock(blue_clay_block);
		registerBlock(purple_clay_block);
		registerBlock(magenta_clay_block);
		registerBlock(brown_clay_block);
		registerBlock(black_clay_block);
		registerBlock(gray_clay_block);
		registerBlock(light_gray_clay_block);
		registerBlock(white_clay_block);
		registerBlock(pink_clay_block);

		
		registerBlock(red_brick_block);
		registerBlock(orange_brick_block);
		registerBlock(yellow_brick_block);
		registerBlock(lime_brick_block);
		registerBlock(green_brick_block);
		registerBlock(cyan_brick_block);
		registerBlock(light_blue_brick_block);
		registerBlock(blue_brick_block);
		registerBlock(purple_brick_block);
		registerBlock(magenta_brick_block);
		registerBlock(brown_brick_block);
		registerBlock(black_brick_block);
		registerBlock(gray_brick_block);
		registerBlock(light_gray_brick_block);
		registerBlock(white_brick_block);
		registerBlock(pink_brick_block);
		
		registerBlock(red_brick_stairs);
		registerBlock(orange_brick_stairs);
		registerBlock(yellow_brick_stairs);
		registerBlock(lime_brick_stairs);
		registerBlock(green_brick_stairs);
		registerBlock(cyan_brick_stairs);
		registerBlock(light_blue_brick_stairs);
		registerBlock(blue_brick_stairs);
		registerBlock(purple_brick_stairs);
		registerBlock(magenta_brick_stairs);
		registerBlock(brown_brick_stairs);
		registerBlock(black_brick_stairs);
		registerBlock(gray_brick_stairs);
		registerBlock(light_gray_brick_stairs);
		registerBlock(white_brick_stairs);
		registerBlock(pink_brick_stairs);
		
		
		
		registerBlock(red_brick_slab_half, new ItemSlab(red_brick_slab_half, red_brick_slab_half, red_brick_slab_double));
		ForgeRegistries.BLOCKS.register(red_brick_slab_double);
		
		registerBlock(orange_brick_slab_half, new ItemSlab(orange_brick_slab_half, orange_brick_slab_half, orange_brick_slab_double));
		ForgeRegistries.BLOCKS.register(orange_brick_slab_double);
		
		registerBlock(yellow_brick_slab_half, new ItemSlab(yellow_brick_slab_half, yellow_brick_slab_half, yellow_brick_slab_double));
		ForgeRegistries.BLOCKS.register(yellow_brick_slab_double);
		
		registerBlock(lime_brick_slab_half, new ItemSlab(lime_brick_slab_half, lime_brick_slab_half, lime_brick_slab_double));
		ForgeRegistries.BLOCKS.register(lime_brick_slab_double);
		
		registerBlock(green_brick_slab_half, new ItemSlab(green_brick_slab_half, green_brick_slab_half, green_brick_slab_double));
		ForgeRegistries.BLOCKS.register(green_brick_slab_double);
		
		registerBlock(cyan_brick_slab_half, new ItemSlab(cyan_brick_slab_half, cyan_brick_slab_half, cyan_brick_slab_double));
		ForgeRegistries.BLOCKS.register(cyan_brick_slab_double);
		
		registerBlock(light_blue_brick_slab_half, new ItemSlab(light_blue_brick_slab_half, light_blue_brick_slab_half, light_blue_brick_slab_double));
		ForgeRegistries.BLOCKS.register(light_blue_brick_slab_double);
		
		registerBlock(blue_brick_slab_half, new ItemSlab(blue_brick_slab_half, blue_brick_slab_half, blue_brick_slab_double));
		ForgeRegistries.BLOCKS.register(blue_brick_slab_double);
		
		registerBlock(purple_brick_slab_half, new ItemSlab(purple_brick_slab_half, purple_brick_slab_half, purple_brick_slab_double));
		ForgeRegistries.BLOCKS.register(purple_brick_slab_double);
		
		registerBlock(magenta_brick_slab_half, new ItemSlab(magenta_brick_slab_half, magenta_brick_slab_half, magenta_brick_slab_double));
		ForgeRegistries.BLOCKS.register(magenta_brick_slab_double);
		
		registerBlock(pink_brick_slab_half, new ItemSlab(pink_brick_slab_half, pink_brick_slab_half, pink_brick_slab_double));
		ForgeRegistries.BLOCKS.register(pink_brick_slab_double);
		
		registerBlock(white_brick_slab_half, new ItemSlab(white_brick_slab_half, white_brick_slab_half, white_brick_slab_double));
		ForgeRegistries.BLOCKS.register(white_brick_slab_double);
		
		registerBlock(light_gray_brick_slab_half, new ItemSlab(light_gray_brick_slab_half, light_gray_brick_slab_half, light_gray_brick_slab_double));
		ForgeRegistries.BLOCKS.register(light_gray_brick_slab_double);
		
		registerBlock(gray_brick_slab_half, new ItemSlab(gray_brick_slab_half, gray_brick_slab_half, gray_brick_slab_double));
		ForgeRegistries.BLOCKS.register(gray_brick_slab_double);
		
		registerBlock(black_brick_slab_half, new ItemSlab(black_brick_slab_half, black_brick_slab_half, black_brick_slab_double));
		ForgeRegistries.BLOCKS.register(black_brick_slab_double);
		
		registerBlock(brown_brick_slab_half, new ItemSlab(brown_brick_slab_half, brown_brick_slab_half, brown_brick_slab_double));
		ForgeRegistries.BLOCKS.register(brown_brick_slab_double);
		
		registerBlock(red_large_brick_block);
		registerBlock(orange_large_brick_block);
		registerBlock(yellow_large_brick_block);
		registerBlock(lime_large_brick_block);
		registerBlock(green_large_brick_block);
		registerBlock(cyan_large_brick_block);
		registerBlock(light_blue_large_brick_block);
		registerBlock(blue_large_brick_block);
		registerBlock(purple_large_brick_block);
		registerBlock(magenta_large_brick_block);
		registerBlock(brown_large_brick_block);
		registerBlock(black_large_brick_block);
		registerBlock(gray_large_brick_block);
		registerBlock(light_gray_large_brick_block);
		registerBlock(white_large_brick_block);
		registerBlock(pink_large_brick_block);
		
		registerBlock(red_large_brick_stairs);
		registerBlock(orange_large_brick_stairs);
		registerBlock(yellow_large_brick_stairs);
		registerBlock(lime_large_brick_stairs);
		registerBlock(green_large_brick_stairs);
		registerBlock(cyan_large_brick_stairs);
		registerBlock(light_blue_large_brick_stairs);
		registerBlock(blue_large_brick_stairs);
		registerBlock(purple_large_brick_stairs);
		registerBlock(magenta_large_brick_stairs);
		registerBlock(brown_large_brick_stairs);
		registerBlock(black_large_brick_stairs);
		registerBlock(gray_large_brick_stairs);
		registerBlock(light_gray_large_brick_stairs);
		registerBlock(white_large_brick_stairs);
		registerBlock(pink_large_brick_stairs);
		
		
		
		registerBlock(red_large_brick_slab_half, new ItemSlab(red_large_brick_slab_half, red_large_brick_slab_half, red_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(red_large_brick_slab_double);
		
		registerBlock(orange_large_brick_slab_half, new ItemSlab(orange_large_brick_slab_half, orange_large_brick_slab_half, orange_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(orange_large_brick_slab_double);
		
		registerBlock(yellow_large_brick_slab_half, new ItemSlab(yellow_large_brick_slab_half, yellow_large_brick_slab_half, yellow_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(yellow_large_brick_slab_double);
		
		registerBlock(lime_large_brick_slab_half, new ItemSlab(lime_large_brick_slab_half, lime_large_brick_slab_half, lime_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(lime_large_brick_slab_double);
		
		registerBlock(green_large_brick_slab_half, new ItemSlab(green_large_brick_slab_half, green_large_brick_slab_half, green_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(green_large_brick_slab_double);
		
		registerBlock(cyan_large_brick_slab_half, new ItemSlab(cyan_large_brick_slab_half, cyan_large_brick_slab_half, cyan_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(cyan_large_brick_slab_double);
		
		registerBlock(light_blue_large_brick_slab_half, new ItemSlab(light_blue_large_brick_slab_half, light_blue_large_brick_slab_half, light_blue_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(light_blue_large_brick_slab_double);
		
		registerBlock(blue_large_brick_slab_half, new ItemSlab(blue_large_brick_slab_half, blue_large_brick_slab_half, blue_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(blue_large_brick_slab_double);
		
		registerBlock(purple_large_brick_slab_half, new ItemSlab(purple_large_brick_slab_half, purple_large_brick_slab_half, purple_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(purple_large_brick_slab_double);
		
		registerBlock(magenta_large_brick_slab_half, new ItemSlab(magenta_large_brick_slab_half, magenta_large_brick_slab_half, magenta_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(magenta_large_brick_slab_double);
		
		registerBlock(pink_large_brick_slab_half, new ItemSlab(pink_large_brick_slab_half, pink_large_brick_slab_half, pink_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(pink_large_brick_slab_double);
		
		registerBlock(white_large_brick_slab_half, new ItemSlab(white_large_brick_slab_half, white_large_brick_slab_half, white_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(white_large_brick_slab_double);
		
		registerBlock(light_gray_large_brick_slab_half, new ItemSlab(light_gray_large_brick_slab_half, light_gray_large_brick_slab_half, light_gray_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(light_gray_large_brick_slab_double);
		
		registerBlock(gray_large_brick_slab_half, new ItemSlab(gray_large_brick_slab_half, gray_large_brick_slab_half, gray_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(gray_large_brick_slab_double);
		
		registerBlock(black_large_brick_slab_half, new ItemSlab(black_large_brick_slab_half, black_large_brick_slab_half, black_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(black_large_brick_slab_double);
		
		registerBlock(brown_large_brick_slab_half, new ItemSlab(brown_large_brick_slab_half, brown_large_brick_slab_half, brown_large_brick_slab_double));
		ForgeRegistries.BLOCKS.register(brown_large_brick_slab_double);
		
		registerBlock(cedar_planks);
		registerBlock(crabapple_planks);
		registerBlock(dogwood_planks);
		registerBlock(jacaranda_planks);
		registerBlock(laburnum_planks);
		registerBlock(paulownia_planks);
		registerBlock(silverbell_planks);
		registerBlock(wisteria_planks);
		registerBlock(whitewashed_planks);
		
	//	registerBlock(acacia_bookshelf);
	//	registerBlock(birch_bookshelf);
	//	registerBlock(dark_oak_bookshelf);
	//	registerBlock(jungle_bookshelf);
	//	registerBlock(oak_bookshelf);
	//	registerBlock(spruce_bookshelf);
		registerBlock(cedar_bookshelf);
		registerBlock(crabapple_bookshelf);
		registerBlock(dogwood_bookshelf);
		registerBlock(jacaranda_bookshelf);
		registerBlock(laburnum_bookshelf);
		registerBlock(paulownia_bookshelf);
		registerBlock(silverbell_bookshelf);
		registerBlock(wisteria_bookshelf);
		
		
		
		
		
		registerBlock(crabapple_slab_half, new ItemSlab(crabapple_slab_half, crabapple_slab_half, crabapple_slab_double));
		ForgeRegistries.BLOCKS.register(crabapple_slab_double);
		registerBlock(dogwood_slab_half, new ItemSlab(dogwood_slab_half, dogwood_slab_half, dogwood_slab_double));
		ForgeRegistries.BLOCKS.register(dogwood_slab_double);
		registerBlock(jacaranda_slab_half, new ItemSlab(jacaranda_slab_half, jacaranda_slab_half, jacaranda_slab_double));
		ForgeRegistries.BLOCKS.register(jacaranda_slab_double);
		registerBlock(laburnum_slab_half, new ItemSlab(laburnum_slab_half, laburnum_slab_half, laburnum_slab_double));
		ForgeRegistries.BLOCKS.register(laburnum_slab_double);
		registerBlock(paulownia_slab_half, new ItemSlab(paulownia_slab_half, paulownia_slab_half, paulownia_slab_double));
		ForgeRegistries.BLOCKS.register(paulownia_slab_double);
		registerBlock(silverbell_slab_half, new ItemSlab(silverbell_slab_half, silverbell_slab_half, silverbell_slab_double));
		ForgeRegistries.BLOCKS.register(silverbell_slab_double);
		registerBlock(wisteria_slab_half, new ItemSlab(wisteria_slab_half, wisteria_slab_half, wisteria_slab_double));
		ForgeRegistries.BLOCKS.register(wisteria_slab_double);
		registerBlock(cedar_slab_half, new ItemSlab(cedar_slab_half, cedar_slab_half, cedar_slab_double));
		ForgeRegistries.BLOCKS.register(cedar_slab_double);
		registerBlock(whitewashed_slab_half, new ItemSlab(whitewashed_slab_half, whitewashed_slab_half, whitewashed_slab_double));
		ForgeRegistries.BLOCKS.register(whitewashed_slab_double);
				
		registerBlock(cedar_stairs);
		registerBlock(crabapple_stairs);
		registerBlock(dogwood_stairs);
		registerBlock(jacaranda_stairs);
		registerBlock(laburnum_stairs);
		registerBlock(paulownia_stairs);
		registerBlock(silverbell_stairs);
		registerBlock(wisteria_stairs);
		registerBlock(whitewashed_stairs);
	
		
		registerBlock(cedar_fence);
		registerBlock(crabapple_fence);
		registerBlock(dogwood_fence);
		registerBlock(jacaranda_fence);
		registerBlock(laburnum_fence);
		registerBlock(paulownia_fence);
		registerBlock(silverbell_fence);
		registerBlock(wisteria_fence);
		registerBlock(whitewashed_fence);
		
		
		registerBlock(cedar_fence_gate);
		registerBlock(crabapple_fence_gate);
		registerBlock(dogwood_fence_gate);
		registerBlock(jacaranda_fence_gate);
		registerBlock(laburnum_fence_gate);
		registerBlock(paulownia_fence_gate);
		registerBlock(silverbell_fence_gate);
		registerBlock(wisteria_fence_gate);
		registerBlock(whitewashed_fence_gate);
		
		//registerBlock(acacia_pressure_plate);
	//	registerBlock(birch_pressure_plate);
	//	registerBlock(dark_oak_pressure_plate);
	//	registerBlock(jungle_pressure_plate);
	//	registerBlock(oak_pressure_plate);
	//	registerBlock(spruce_pressure_plate);
		registerBlock(cedar_pressure_plate);
		registerBlock(crabapple_pressure_plate);
		registerBlock(dogwood_pressure_plate);
		registerBlock(jacaranda_pressure_plate);
		registerBlock(laburnum_pressure_plate);
		registerBlock(paulownia_pressure_plate);
		registerBlock(silverbell_pressure_plate);
		registerBlock(wisteria_pressure_plate);
		
		//registerBlock(acacia_button);
	//	registerBlock(birch_button);
		//registerBlock(dark_oak_button);
		//registerBlock(jungle_button);
	//	registerBlock(oak_button);
	//	registerBlock(spruce_button);
		registerBlock(cedar_button);
		registerBlock(crabapple_button);
		registerBlock(dogwood_button);
		registerBlock(jacaranda_button);
		registerBlock(laburnum_button);
		registerBlock(paulownia_button);
		registerBlock(silverbell_button);
		registerBlock(wisteria_button);
	
		
		registerBlock(red_stained_planks);
		registerBlock(orange_stained_planks);
		registerBlock(yellow_stained_planks);
		registerBlock(lime_stained_planks);
		registerBlock(green_stained_planks);
		registerBlock(cyan_stained_planks);
		registerBlock(light_blue_stained_planks);
		registerBlock(blue_stained_planks);
		registerBlock(purple_stained_planks);
		registerBlock(magenta_stained_planks);
		registerBlock(brown_stained_planks);
		registerBlock(black_stained_planks);
		registerBlock(gray_stained_planks);
		registerBlock(light_gray_stained_planks);
		registerBlock(white_stained_planks);
		registerBlock(pink_stained_planks);
		
		registerBlock(red_stained_bookshelf);
		registerBlock(orange_stained_bookshelf);
		registerBlock(yellow_stained_bookshelf);
		registerBlock(lime_stained_bookshelf);
		registerBlock(green_stained_bookshelf);
		registerBlock(cyan_stained_bookshelf);
		registerBlock(light_blue_stained_bookshelf);
		registerBlock(blue_stained_bookshelf);
		registerBlock(purple_stained_bookshelf);
		registerBlock(magenta_stained_bookshelf);
		registerBlock(brown_stained_bookshelf);
		registerBlock(black_stained_bookshelf);
		registerBlock(gray_stained_bookshelf);
		registerBlock(light_gray_stained_bookshelf);
		registerBlock(white_stained_bookshelf);
		registerBlock(pink_stained_bookshelf);
		
		registerBlock(red_stained_stairs);
		registerBlock(orange_stained_stairs);
		registerBlock(yellow_stained_stairs);
		registerBlock(lime_stained_stairs);
		registerBlock(green_stained_stairs);
		registerBlock(cyan_stained_stairs);
		registerBlock(light_blue_stained_stairs);
		registerBlock(blue_stained_stairs);
		registerBlock(purple_stained_stairs);
		registerBlock(magenta_stained_stairs);
		registerBlock(brown_stained_stairs);
		registerBlock(black_stained_stairs);
		registerBlock(gray_stained_stairs);
		registerBlock(light_gray_stained_stairs);
		registerBlock(white_stained_stairs);
		registerBlock(pink_stained_stairs);
		
		registerBlock(red_stained_slab_half, new ItemSlab(red_stained_slab_half, red_stained_slab_half, red_stained_slab_double));
		ForgeRegistries.BLOCKS.register(red_stained_slab_double);
		
		registerBlock(orange_stained_slab_half, new ItemSlab(orange_stained_slab_half, orange_stained_slab_half, orange_stained_slab_double));
		ForgeRegistries.BLOCKS.register(orange_stained_slab_double);
		
		registerBlock(yellow_stained_slab_half, new ItemSlab(yellow_stained_slab_half, yellow_stained_slab_half, yellow_stained_slab_double));
		ForgeRegistries.BLOCKS.register(yellow_stained_slab_double);
		
		registerBlock(lime_stained_slab_half, new ItemSlab(lime_stained_slab_half, lime_stained_slab_half, lime_stained_slab_double));
		ForgeRegistries.BLOCKS.register(lime_stained_slab_double);
		
		registerBlock(green_stained_slab_half, new ItemSlab(green_stained_slab_half, green_stained_slab_half, green_stained_slab_double));
		ForgeRegistries.BLOCKS.register(green_stained_slab_double);
		
		registerBlock(cyan_stained_slab_half, new ItemSlab(cyan_stained_slab_half, cyan_stained_slab_half, cyan_stained_slab_double));
		ForgeRegistries.BLOCKS.register(cyan_stained_slab_double);
		
		registerBlock(light_blue_stained_slab_half, new ItemSlab(light_blue_stained_slab_half, light_blue_stained_slab_half, light_blue_stained_slab_double));
		ForgeRegistries.BLOCKS.register(light_blue_stained_slab_double);
		
		registerBlock(blue_stained_slab_half, new ItemSlab(blue_stained_slab_half, blue_stained_slab_half, blue_stained_slab_double));
		ForgeRegistries.BLOCKS.register(blue_stained_slab_double);
		
		registerBlock(purple_stained_slab_half, new ItemSlab(purple_stained_slab_half, purple_stained_slab_half, purple_stained_slab_double));
		ForgeRegistries.BLOCKS.register(purple_stained_slab_double);
		
		registerBlock(magenta_stained_slab_half, new ItemSlab(magenta_stained_slab_half, magenta_stained_slab_half, magenta_stained_slab_double));
		ForgeRegistries.BLOCKS.register(magenta_stained_slab_double);
		
		registerBlock(pink_stained_slab_half, new ItemSlab(pink_stained_slab_half, pink_stained_slab_half, pink_stained_slab_double));
		ForgeRegistries.BLOCKS.register(pink_stained_slab_double);
		
		registerBlock(white_stained_slab_half, new ItemSlab(white_stained_slab_half, white_stained_slab_half, white_stained_slab_double));
		ForgeRegistries.BLOCKS.register(white_stained_slab_double);
		
		registerBlock(light_gray_stained_slab_half, new ItemSlab(light_gray_stained_slab_half, light_gray_stained_slab_half, light_gray_stained_slab_double));
		ForgeRegistries.BLOCKS.register(light_gray_stained_slab_double);
		
		registerBlock(gray_stained_slab_half, new ItemSlab(gray_stained_slab_half, gray_stained_slab_half, gray_stained_slab_double));
		ForgeRegistries.BLOCKS.register(gray_stained_slab_double);
		
		registerBlock(black_stained_slab_half, new ItemSlab(black_stained_slab_half, black_stained_slab_half, black_stained_slab_double));
		ForgeRegistries.BLOCKS.register(black_stained_slab_double);
		
		registerBlock(brown_stained_slab_half, new ItemSlab(brown_stained_slab_half, brown_stained_slab_half, brown_stained_slab_double));
		ForgeRegistries.BLOCKS.register(brown_stained_slab_double);
				
		registerBlock(red_stained_fence);
		registerBlock(orange_stained_fence);
		registerBlock(yellow_stained_fence);
		registerBlock(lime_stained_fence);
		registerBlock(green_stained_fence);
		registerBlock(cyan_stained_fence);
		registerBlock(light_blue_stained_fence);
		registerBlock(blue_stained_fence);
		registerBlock(purple_stained_fence);
		registerBlock(magenta_stained_fence);
		registerBlock(pink_stained_fence);
		registerBlock(white_stained_fence);
		registerBlock(light_gray_stained_fence);
		registerBlock(gray_stained_fence);
		registerBlock(black_stained_fence);
		registerBlock(brown_stained_fence);

		registerBlock(red_stained_fence_gate);
		registerBlock(orange_stained_fence_gate);
		registerBlock(yellow_stained_fence_gate);
		registerBlock(lime_stained_fence_gate);
		registerBlock(green_stained_fence_gate);
		registerBlock(cyan_stained_fence_gate);
		registerBlock(light_blue_stained_fence_gate);
		registerBlock(blue_stained_fence_gate);
		registerBlock(purple_stained_fence_gate);
		registerBlock(magenta_stained_fence_gate);
		registerBlock(pink_stained_fence_gate);
		registerBlock(white_stained_fence_gate);
		registerBlock(light_gray_stained_fence_gate);
		registerBlock(gray_stained_fence_gate);
		registerBlock(black_stained_fence_gate);
		registerBlock(brown_stained_fence_gate);
		
		registerBlock(red_stained_pressure_plate);
		registerBlock(orange_stained_pressure_plate);
		registerBlock(yellow_stained_pressure_plate);
		registerBlock(lime_stained_pressure_plate);
		registerBlock(green_stained_pressure_plate);
		registerBlock(cyan_stained_pressure_plate);
		registerBlock(light_blue_stained_pressure_plate);
		registerBlock(blue_stained_pressure_plate);
		registerBlock(purple_stained_pressure_plate);
		registerBlock(magenta_stained_pressure_plate);
		registerBlock(pink_stained_pressure_plate);
		registerBlock(white_stained_pressure_plate);
		registerBlock(light_gray_stained_pressure_plate);
		registerBlock(gray_stained_pressure_plate);
		registerBlock(black_stained_pressure_plate);
		registerBlock(brown_stained_pressure_plate);
		
		registerBlock(red_stained_button);
		registerBlock(orange_stained_button);
		registerBlock(yellow_stained_button);
		registerBlock(lime_stained_button);
		registerBlock(green_stained_button);
		registerBlock(cyan_stained_button);
		registerBlock(light_blue_stained_button);
		registerBlock(blue_stained_button);
		registerBlock(purple_stained_button);
		registerBlock(magenta_stained_button);
		registerBlock(pink_stained_button);
		registerBlock(white_stained_button);
		registerBlock(light_gray_stained_button);
		registerBlock(gray_stained_button);
		registerBlock(black_stained_button);
		registerBlock(brown_stained_button);
		
		registerBlock(acacia_door_1, new ItemBlockDoor(acacia_door_1));
		registerBlock(acacia_door_2, new ItemBlockDoor(acacia_door_2));
		registerBlock(acacia_door_3, new ItemBlockDoor(acacia_door_3));
		registerBlock(acacia_door_4, new ItemBlockDoor(acacia_door_4));
		registerBlock(acacia_door_5, new ItemBlockDoor(acacia_door_5));
		registerBlock(acacia_door_6, new ItemBlockDoor(acacia_door_6));
		
		registerBlock(birch_door_1, new ItemBlockDoor(birch_door_1));
		registerBlock(birch_door_2, new ItemBlockDoor(birch_door_2));
		registerBlock(birch_door_3, new ItemBlockDoor(birch_door_3));
		registerBlock(birch_door_4, new ItemBlockDoor(birch_door_4));
		registerBlock(birch_door_5, new ItemBlockDoor(birch_door_5));
		registerBlock(birch_door_6, new ItemBlockDoor(birch_door_6));
		
		registerBlock(oak_door_1, new ItemBlockDoor(oak_door_1));
		registerBlock(oak_door_2, new ItemBlockDoor(oak_door_2));
		registerBlock(oak_door_3, new ItemBlockDoor(oak_door_3));
		registerBlock(oak_door_4, new ItemBlockDoor(oak_door_4));
		registerBlock(oak_door_5, new ItemBlockDoor(oak_door_5));
		registerBlock(oak_door_6, new ItemBlockDoor(oak_door_6));
		
		registerBlock(spruce_door_1, new ItemBlockDoor(spruce_door_1));
		registerBlock(spruce_door_2, new ItemBlockDoor(spruce_door_2));
		registerBlock(spruce_door_3, new ItemBlockDoor(spruce_door_3));
		registerBlock(spruce_door_4, new ItemBlockDoor(spruce_door_4));
		registerBlock(spruce_door_5, new ItemBlockDoor(spruce_door_5));
		registerBlock(spruce_door_6, new ItemBlockDoor(spruce_door_6));
		
		registerBlock(dark_oak_door_1, new ItemBlockDoor(dark_oak_door_1));
		registerBlock(dark_oak_door_2, new ItemBlockDoor(dark_oak_door_2));
		registerBlock(dark_oak_door_3, new ItemBlockDoor(dark_oak_door_3));
		registerBlock(dark_oak_door_4, new ItemBlockDoor(dark_oak_door_4));
		registerBlock(dark_oak_door_5, new ItemBlockDoor(dark_oak_door_5));
		registerBlock(dark_oak_door_6, new ItemBlockDoor(dark_oak_door_6));
		
		registerBlock(jungle_door_1, new ItemBlockDoor(jungle_door_1));
		registerBlock(jungle_door_2, new ItemBlockDoor(jungle_door_2));
		registerBlock(jungle_door_3, new ItemBlockDoor(jungle_door_3));
		registerBlock(jungle_door_4, new ItemBlockDoor(jungle_door_4));
		registerBlock(jungle_door_5, new ItemBlockDoor(jungle_door_5));
		registerBlock(jungle_door_6, new ItemBlockDoor(jungle_door_6));
		
		
		registerBlock(cedar_door_1, new ItemBlockDoor(cedar_door_1));
		registerBlock(cedar_door_2, new ItemBlockDoor(cedar_door_2));
		registerBlock(cedar_door_3, new ItemBlockDoor(cedar_door_3));
		registerBlock(cedar_door_4, new ItemBlockDoor(cedar_door_4));
		registerBlock(cedar_door_5, new ItemBlockDoor(cedar_door_5));
		registerBlock(cedar_door_6, new ItemBlockDoor(cedar_door_6));
		
		registerBlock(crabapple_door_1, new ItemBlockDoor(crabapple_door_1));
		registerBlock(crabapple_door_2, new ItemBlockDoor(crabapple_door_2));
		registerBlock(crabapple_door_3, new ItemBlockDoor(crabapple_door_3));
		registerBlock(crabapple_door_4, new ItemBlockDoor(crabapple_door_4));
		registerBlock(crabapple_door_5, new ItemBlockDoor(crabapple_door_5));
		registerBlock(crabapple_door_6, new ItemBlockDoor(crabapple_door_6));
		
		registerBlock(dogwood_door_1, new ItemBlockDoor(dogwood_door_1));
		registerBlock(dogwood_door_2, new ItemBlockDoor(dogwood_door_2));
		registerBlock(dogwood_door_3, new ItemBlockDoor(dogwood_door_3));
		registerBlock(dogwood_door_4, new ItemBlockDoor(dogwood_door_4));
		registerBlock(dogwood_door_5, new ItemBlockDoor(dogwood_door_5));
		registerBlock(dogwood_door_6, new ItemBlockDoor(dogwood_door_6));
		
		registerBlock(jacaranda_door_1, new ItemBlockDoor(jacaranda_door_1));
		registerBlock(jacaranda_door_2, new ItemBlockDoor(jacaranda_door_2));
		registerBlock(jacaranda_door_3, new ItemBlockDoor(jacaranda_door_3));
		registerBlock(jacaranda_door_4, new ItemBlockDoor(jacaranda_door_4));
		registerBlock(jacaranda_door_5, new ItemBlockDoor(jacaranda_door_5));
		registerBlock(jacaranda_door_6, new ItemBlockDoor(jacaranda_door_6));
		
		registerBlock(laburnum_door_1, new ItemBlockDoor(laburnum_door_1));
		registerBlock(laburnum_door_2, new ItemBlockDoor(laburnum_door_2));
		registerBlock(laburnum_door_3, new ItemBlockDoor(laburnum_door_3));
		registerBlock(laburnum_door_4, new ItemBlockDoor(laburnum_door_4));
		registerBlock(laburnum_door_5, new ItemBlockDoor(laburnum_door_5));
		registerBlock(laburnum_door_6, new ItemBlockDoor(laburnum_door_6));
		
		registerBlock(paulownia_door_1, new ItemBlockDoor(paulownia_door_1));
		registerBlock(paulownia_door_2, new ItemBlockDoor(paulownia_door_2));
		registerBlock(paulownia_door_3, new ItemBlockDoor(paulownia_door_3));
		registerBlock(paulownia_door_4, new ItemBlockDoor(paulownia_door_4));
		registerBlock(paulownia_door_5, new ItemBlockDoor(paulownia_door_5));
		registerBlock(paulownia_door_6, new ItemBlockDoor(paulownia_door_6));
		
		registerBlock(silverbell_door_1, new ItemBlockDoor(silverbell_door_1));
		registerBlock(silverbell_door_2, new ItemBlockDoor(silverbell_door_2));
		registerBlock(silverbell_door_3, new ItemBlockDoor(silverbell_door_3));
		registerBlock(silverbell_door_4, new ItemBlockDoor(silverbell_door_4));
		registerBlock(silverbell_door_5, new ItemBlockDoor(silverbell_door_5));
		registerBlock(silverbell_door_6, new ItemBlockDoor(silverbell_door_6));
		
		registerBlock(wisteria_door_1, new ItemBlockDoor(wisteria_door_1));
		registerBlock(wisteria_door_2, new ItemBlockDoor(wisteria_door_2));
		registerBlock(wisteria_door_3, new ItemBlockDoor(wisteria_door_3));
		registerBlock(wisteria_door_4, new ItemBlockDoor(wisteria_door_4));
		registerBlock(wisteria_door_5, new ItemBlockDoor(wisteria_door_5));
		registerBlock(wisteria_door_6, new ItemBlockDoor(wisteria_door_6));
						
		registerBlock(red_stained_door_1, new ItemBlockDoor(red_stained_door_1));
		registerBlock(orange_stained_door_1, new ItemBlockDoor(orange_stained_door_1));
		registerBlock(yellow_stained_door_1, new ItemBlockDoor(yellow_stained_door_1));
		registerBlock(lime_stained_door_1, new ItemBlockDoor(lime_stained_door_1));
		registerBlock(green_stained_door_1, new ItemBlockDoor(green_stained_door_1));
		registerBlock(cyan_stained_door_1, new ItemBlockDoor(cyan_stained_door_1));
		registerBlock(light_blue_stained_door_1, new ItemBlockDoor(light_blue_stained_door_1));
		registerBlock(blue_stained_door_1, new ItemBlockDoor(blue_stained_door_1));
		registerBlock(purple_stained_door_1, new ItemBlockDoor(purple_stained_door_1));
		registerBlock(magenta_stained_door_1, new ItemBlockDoor(magenta_stained_door_1));
		registerBlock(pink_stained_door_1, new ItemBlockDoor(pink_stained_door_1));
		registerBlock(white_stained_door_1, new ItemBlockDoor(white_stained_door_1));
		registerBlock(light_gray_stained_door_1, new ItemBlockDoor(light_gray_stained_door_1));
		registerBlock(gray_stained_door_1, new ItemBlockDoor(gray_stained_door_1));
		registerBlock(black_stained_door_1, new ItemBlockDoor(black_stained_door_1));
		registerBlock(brown_stained_door_1, new ItemBlockDoor(brown_stained_door_1));
		
		registerBlock(red_stained_door_2, new ItemBlockDoor(red_stained_door_2));
		registerBlock(orange_stained_door_2, new ItemBlockDoor(orange_stained_door_2));
		registerBlock(yellow_stained_door_2, new ItemBlockDoor(yellow_stained_door_2));
		registerBlock(lime_stained_door_2, new ItemBlockDoor(lime_stained_door_2));
		registerBlock(green_stained_door_2, new ItemBlockDoor(green_stained_door_2));
		registerBlock(cyan_stained_door_2, new ItemBlockDoor(cyan_stained_door_2));
		registerBlock(light_blue_stained_door_2, new ItemBlockDoor(light_blue_stained_door_2));
		registerBlock(blue_stained_door_2, new ItemBlockDoor(blue_stained_door_2));
		registerBlock(purple_stained_door_2, new ItemBlockDoor(purple_stained_door_2));
		registerBlock(magenta_stained_door_2, new ItemBlockDoor(magenta_stained_door_2));
		registerBlock(pink_stained_door_2, new ItemBlockDoor(pink_stained_door_2));
		registerBlock(white_stained_door_2, new ItemBlockDoor(white_stained_door_2));
		registerBlock(light_gray_stained_door_2, new ItemBlockDoor(light_gray_stained_door_2));
		registerBlock(gray_stained_door_2, new ItemBlockDoor(gray_stained_door_2));
		registerBlock(black_stained_door_2, new ItemBlockDoor(black_stained_door_2));
		registerBlock(brown_stained_door_2, new ItemBlockDoor(brown_stained_door_2));
		
		registerBlock(red_stained_door_3, new ItemBlockDoor(red_stained_door_3));
		registerBlock(orange_stained_door_3, new ItemBlockDoor(orange_stained_door_3));
		registerBlock(yellow_stained_door_3, new ItemBlockDoor(yellow_stained_door_3));
		registerBlock(lime_stained_door_3, new ItemBlockDoor(lime_stained_door_3));
		registerBlock(green_stained_door_3, new ItemBlockDoor(green_stained_door_3));
		registerBlock(cyan_stained_door_3, new ItemBlockDoor(cyan_stained_door_3));
		registerBlock(light_blue_stained_door_3, new ItemBlockDoor(light_blue_stained_door_3));
		registerBlock(blue_stained_door_3, new ItemBlockDoor(blue_stained_door_3));
		registerBlock(purple_stained_door_3, new ItemBlockDoor(purple_stained_door_3));
		registerBlock(magenta_stained_door_3, new ItemBlockDoor(magenta_stained_door_3));
		registerBlock(pink_stained_door_3, new ItemBlockDoor(pink_stained_door_3));
		registerBlock(white_stained_door_3, new ItemBlockDoor(white_stained_door_3));
		registerBlock(light_gray_stained_door_3, new ItemBlockDoor(light_gray_stained_door_3));
		registerBlock(gray_stained_door_3, new ItemBlockDoor(gray_stained_door_3));
		registerBlock(black_stained_door_3, new ItemBlockDoor(black_stained_door_3));
		registerBlock(brown_stained_door_3, new ItemBlockDoor(brown_stained_door_3));
		
		registerBlock(red_stained_door_4, new ItemBlockDoor(red_stained_door_4));
		registerBlock(orange_stained_door_4, new ItemBlockDoor(orange_stained_door_4));
		registerBlock(yellow_stained_door_4, new ItemBlockDoor(yellow_stained_door_4));
		registerBlock(lime_stained_door_4, new ItemBlockDoor(lime_stained_door_4));
		registerBlock(green_stained_door_4, new ItemBlockDoor(green_stained_door_4));
		registerBlock(cyan_stained_door_4, new ItemBlockDoor(cyan_stained_door_4));
		registerBlock(light_blue_stained_door_4, new ItemBlockDoor(light_blue_stained_door_4));
		registerBlock(blue_stained_door_4, new ItemBlockDoor(blue_stained_door_4));
		registerBlock(purple_stained_door_4, new ItemBlockDoor(purple_stained_door_4));
		registerBlock(magenta_stained_door_4, new ItemBlockDoor(magenta_stained_door_4));
		registerBlock(pink_stained_door_4, new ItemBlockDoor(pink_stained_door_4));
		registerBlock(white_stained_door_4, new ItemBlockDoor(white_stained_door_4));
		registerBlock(light_gray_stained_door_4, new ItemBlockDoor(light_gray_stained_door_4));
		registerBlock(gray_stained_door_4, new ItemBlockDoor(gray_stained_door_4));
		registerBlock(black_stained_door_4, new ItemBlockDoor(black_stained_door_4));
		registerBlock(brown_stained_door_4, new ItemBlockDoor(brown_stained_door_4));
		
		registerBlock(red_stained_door_5, new ItemBlockDoor(red_stained_door_5));
		registerBlock(orange_stained_door_5, new ItemBlockDoor(orange_stained_door_5));
		registerBlock(yellow_stained_door_5, new ItemBlockDoor(yellow_stained_door_5));
		registerBlock(lime_stained_door_5, new ItemBlockDoor(lime_stained_door_5));
		registerBlock(green_stained_door_5, new ItemBlockDoor(green_stained_door_5));
		registerBlock(cyan_stained_door_5, new ItemBlockDoor(cyan_stained_door_5));
		registerBlock(light_blue_stained_door_5, new ItemBlockDoor(light_blue_stained_door_5));
		registerBlock(blue_stained_door_5, new ItemBlockDoor(blue_stained_door_5));
		registerBlock(purple_stained_door_5, new ItemBlockDoor(purple_stained_door_5));
		registerBlock(magenta_stained_door_5, new ItemBlockDoor(magenta_stained_door_5));
		registerBlock(pink_stained_door_5, new ItemBlockDoor(pink_stained_door_5));
		registerBlock(white_stained_door_5, new ItemBlockDoor(white_stained_door_5));
		registerBlock(light_gray_stained_door_5, new ItemBlockDoor(light_gray_stained_door_5));
		registerBlock(gray_stained_door_5, new ItemBlockDoor(gray_stained_door_5));
		registerBlock(black_stained_door_5, new ItemBlockDoor(black_stained_door_5));
		registerBlock(brown_stained_door_5, new ItemBlockDoor(brown_stained_door_5));
		
		registerBlock(red_stained_door_6, new ItemBlockDoor(red_stained_door_6));
		registerBlock(orange_stained_door_6, new ItemBlockDoor(orange_stained_door_6));
		registerBlock(yellow_stained_door_6, new ItemBlockDoor(yellow_stained_door_6));
		registerBlock(lime_stained_door_6, new ItemBlockDoor(lime_stained_door_6));
		registerBlock(green_stained_door_6, new ItemBlockDoor(green_stained_door_6));
		registerBlock(cyan_stained_door_6, new ItemBlockDoor(cyan_stained_door_6));
		registerBlock(light_blue_stained_door_6, new ItemBlockDoor(light_blue_stained_door_6));
		registerBlock(blue_stained_door_6, new ItemBlockDoor(blue_stained_door_6));
		registerBlock(purple_stained_door_6, new ItemBlockDoor(purple_stained_door_6));
		registerBlock(magenta_stained_door_6, new ItemBlockDoor(magenta_stained_door_6));
		registerBlock(pink_stained_door_6, new ItemBlockDoor(pink_stained_door_6));
		registerBlock(white_stained_door_6, new ItemBlockDoor(white_stained_door_6));
		registerBlock(light_gray_stained_door_6, new ItemBlockDoor(light_gray_stained_door_6));
		registerBlock(gray_stained_door_6, new ItemBlockDoor(gray_stained_door_6));
		registerBlock(black_stained_door_6, new ItemBlockDoor(black_stained_door_6));
		registerBlock(brown_stained_door_6, new ItemBlockDoor(brown_stained_door_6));
		
		registerBlock(cedar_trapdoor_1);
		registerBlock(crabapple_trapdoor_1);
		registerBlock(dogwood_trapdoor_1);
		registerBlock(jacaranda_trapdoor_1);
		registerBlock(laburnum_trapdoor_1);
		registerBlock(paulownia_trapdoor_1);
		registerBlock(silverbell_trapdoor_1);
		registerBlock(wisteria_trapdoor_1);
		
		registerBlock(acacia_trapdoor_1);
		registerBlock(birch_trapdoor_1);
		registerBlock(oak_trapdoor_1);
		registerBlock(spruce_trapdoor_1);
		registerBlock(dark_oak_trapdoor_1);
		registerBlock(jungle_trapdoor_1);
		
		
		registerBlock(red_stained_trapdoor_1);
		registerBlock(orange_stained_trapdoor_1);
		registerBlock(yellow_stained_trapdoor_1);
		registerBlock(lime_stained_trapdoor_1);
		registerBlock(green_stained_trapdoor_1);
		registerBlock(cyan_stained_trapdoor_1);
		registerBlock(light_blue_stained_trapdoor_1);
		registerBlock(blue_stained_trapdoor_1);
		registerBlock(purple_stained_trapdoor_1);
		registerBlock(magenta_stained_trapdoor_1);
		registerBlock(brown_stained_trapdoor_1);
		registerBlock(black_stained_trapdoor_1);
		registerBlock(gray_stained_trapdoor_1);
		registerBlock(light_gray_stained_trapdoor_1);
		registerBlock(white_stained_trapdoor_1);
		registerBlock(pink_stained_trapdoor_1);
		
		registerBlock(cedar_trapdoor_2);
		registerBlock(crabapple_trapdoor_2);
		registerBlock(dogwood_trapdoor_2);
		registerBlock(jacaranda_trapdoor_2);
		registerBlock(laburnum_trapdoor_2);
		registerBlock(paulownia_trapdoor_2);
		registerBlock(silverbell_trapdoor_2);
		registerBlock(wisteria_trapdoor_2);
		
		registerBlock(acacia_trapdoor_2);
		registerBlock(birch_trapdoor_2);
		registerBlock(oak_trapdoor_2);
		registerBlock(spruce_trapdoor_2);
		registerBlock(dark_oak_trapdoor_2);
		registerBlock(jungle_trapdoor_2);
		
		
		registerBlock(red_stained_trapdoor_2);
		registerBlock(orange_stained_trapdoor_2);
		registerBlock(yellow_stained_trapdoor_2);
		registerBlock(lime_stained_trapdoor_2);
		registerBlock(green_stained_trapdoor_2);
		registerBlock(cyan_stained_trapdoor_2);
		registerBlock(light_blue_stained_trapdoor_2);
		registerBlock(blue_stained_trapdoor_2);
		registerBlock(purple_stained_trapdoor_2);
		registerBlock(magenta_stained_trapdoor_2);
		registerBlock(brown_stained_trapdoor_2);
		registerBlock(black_stained_trapdoor_2);
		registerBlock(gray_stained_trapdoor_2);
		registerBlock(light_gray_stained_trapdoor_2);
		registerBlock(white_stained_trapdoor_2);
		registerBlock(pink_stained_trapdoor_2);
		
		registerBlock(cedar_trapdoor_3);
		registerBlock(crabapple_trapdoor_3);
		registerBlock(dogwood_trapdoor_3);
		registerBlock(jacaranda_trapdoor_3);
		registerBlock(laburnum_trapdoor_3);
		registerBlock(paulownia_trapdoor_3);
		registerBlock(silverbell_trapdoor_3);
		registerBlock(wisteria_trapdoor_3);
		
		registerBlock(acacia_trapdoor_3);
		registerBlock(birch_trapdoor_3);
		registerBlock(oak_trapdoor_3);
		registerBlock(spruce_trapdoor_3);
		registerBlock(dark_oak_trapdoor_3);
		registerBlock(jungle_trapdoor_3);
		
		
		registerBlock(red_stained_trapdoor_3);
		registerBlock(orange_stained_trapdoor_3);
		registerBlock(yellow_stained_trapdoor_3);
		registerBlock(lime_stained_trapdoor_3);
		registerBlock(green_stained_trapdoor_3);
		registerBlock(cyan_stained_trapdoor_3);
		registerBlock(light_blue_stained_trapdoor_3);
		registerBlock(blue_stained_trapdoor_3);
		registerBlock(purple_stained_trapdoor_3);
		registerBlock(magenta_stained_trapdoor_3);
		registerBlock(brown_stained_trapdoor_3);
		registerBlock(black_stained_trapdoor_3);
		registerBlock(gray_stained_trapdoor_3);
		registerBlock(light_gray_stained_trapdoor_3);
		registerBlock(white_stained_trapdoor_3);
		registerBlock(pink_stained_trapdoor_3);
		
		registerBlock(cedar_trapdoor_4);
		registerBlock(crabapple_trapdoor_4);
		registerBlock(dogwood_trapdoor_4);
		registerBlock(jacaranda_trapdoor_4);
		registerBlock(laburnum_trapdoor_4);
		registerBlock(paulownia_trapdoor_4);
		registerBlock(silverbell_trapdoor_4);
		registerBlock(wisteria_trapdoor_4);
		
		registerBlock(acacia_trapdoor_4);
		registerBlock(birch_trapdoor_4);
		registerBlock(oak_trapdoor_4);
		registerBlock(spruce_trapdoor_4);
		registerBlock(dark_oak_trapdoor_4);
		registerBlock(jungle_trapdoor_4);
		
		
		registerBlock(red_stained_trapdoor_4);
		registerBlock(orange_stained_trapdoor_4);
		registerBlock(yellow_stained_trapdoor_4);
		registerBlock(lime_stained_trapdoor_4);
		registerBlock(green_stained_trapdoor_4);
		registerBlock(cyan_stained_trapdoor_4);
		registerBlock(light_blue_stained_trapdoor_4);
		registerBlock(blue_stained_trapdoor_4);
		registerBlock(purple_stained_trapdoor_4);
		registerBlock(magenta_stained_trapdoor_4);
		registerBlock(brown_stained_trapdoor_4);
		registerBlock(black_stained_trapdoor_4);
		registerBlock(gray_stained_trapdoor_4);
		registerBlock(light_gray_stained_trapdoor_4);
		registerBlock(white_stained_trapdoor_4);
		registerBlock(pink_stained_trapdoor_4);
		
		registerBlock(cedar_sapling);
		registerBlock(sapling_crabapple);
		registerBlock(sapling_dogwood);
		registerBlock(sapling_jacaranda);
		registerBlock(sapling_laburnum);
		registerBlock(sapling_paulownia);
		registerBlock(sapling_silverbell);
		registerBlock(sapling_wisteria);
		
		registerBlock(sapling_crabapple_vines);
		registerBlock(sapling_dogwood_vines);
		registerBlock(sapling_jacaranda_vines);
		registerBlock(sapling_laburnum_vines);
		registerBlock(sapling_paulownia_vines);
		registerBlock(sapling_silverbell_vines);
		registerBlock(sapling_wisteria_vines);
	
		registerBlock(vine_crabapple);
		registerBlock(vine_dogwood);
		registerBlock(vine_jacaranda);
		registerBlock(vine_laburnum);
		registerBlock(vine_paulownia);
		registerBlock(vine_silverbell);
		registerBlock(vine_wisteria);
		
	
		registerBlockWithoutTab(fairy_glow_cup);
		
		
		registerBlock(vase);
		registerBlock(vase_red);
		registerBlock(vase_orange);
		registerBlock(vase_yellow);
		registerBlock(vase_lime);
		registerBlock(vase_green);
		registerBlock(vase_cyan);
		registerBlock(vase_light_blue);
		registerBlock(vase_blue);
		registerBlock(vase_purple);
		registerBlock(vase_magenta);
		registerBlock(vase_pink);
		registerBlock(vase_light_gray);
		registerBlock(vase_gray);
		registerBlock(vase_black);
		registerBlock(vase_brown);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(MaidensMaterials.blockstab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		MaidensMaterials.proxy.registerModelResourceLocation(Item.getItemFromBlock(block));
	}
	
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(MaidensMaterials.blockstab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		MaidensMaterials.proxy.registerModelResourceLocation(Item.getItemFromBlock(block));
	}
	
	
	public static void registerRender(Block block, int meta, String filename)
	{
		MaidensMaterials.proxy.registerModelResourceLocation(Item.getItemFromBlock(block));
	}
	
	public static void registerBlockWithoutTab(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
 
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);
        
        MaidensMaterials.proxy.registerModelResourceLocation(Item.getItemFromBlock(block));
    }
	
	public static void registerOreDictionary() {
		
		//TODO
									//logs//
			OreDictionary.registerOre("logWood", BlockInit.log_silverbell);
			OreDictionary.registerOre("logWood", BlockInit.log_crabapple);
			OreDictionary.registerOre("logWood", BlockInit.log_dogwood);
			OreDictionary.registerOre("logWood", BlockInit.log_jacaranda);
			OreDictionary.registerOre("logWood", BlockInit.log_wisteria);
			OreDictionary.registerOre("logWood", BlockInit.log_laburnum);
			OreDictionary.registerOre("logWood", BlockInit.log_paulownia);
			OreDictionary.registerOre("logWood", BlockInit.cedar_log);
			
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.cedar_leaves, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_crabapple, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_dogwood, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_jacaranda, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_laburnum, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_paulownia, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_silverbell, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeLeaves",  new ItemStack(BlockInit.leaves_wisteria, 1, WILDCARD_VALUE));
			
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.cedar_sapling, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_crabapple, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_dogwood, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_jacaranda, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_laburnum, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_paulownia, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_silverbell, 1, WILDCARD_VALUE));
			OreDictionary.registerOre("treeSapling", new ItemStack(BlockInit.sapling_wisteria, 1, WILDCARD_VALUE));
			
			OreDictionary.registerOre("vine", BlockInit.vine_crabapple);
			OreDictionary.registerOre("vine", BlockInit.vine_dogwood);
			OreDictionary.registerOre("vine", BlockInit.vine_jacaranda);
			OreDictionary.registerOre("vine", BlockInit.vine_laburnum);
			OreDictionary.registerOre("vine", BlockInit.vine_paulownia);
			OreDictionary.registerOre("vine", BlockInit.vine_silverbell);
			OreDictionary.registerOre("vine", BlockInit.vine_wisteria);
									//planks
			OreDictionary.registerOre("plankWood", Blocks.PLANKS);
			
									//stairs//
			OreDictionary.registerOre("stairWood", BlockInit.silverbell_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.crabapple_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.dogwood_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.jacaranda_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.wisteria_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.laburnum_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.paulownia_stairs);
			OreDictionary.registerOre("stairWood", BlockInit.cedar_stairs);
									//slabs//
			 OreDictionary.registerOre("slabWood", BlockInit.silverbell_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.crabapple_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.dogwood_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.jacaranda_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.wisteria_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.laburnum_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.paulownia_slab_half);
			 OreDictionary.registerOre("slabWood", BlockInit.cedar_slab_half);
			 
			 						//fences//
			 //vanilla//
			 OreDictionary.registerOre("fenceWood", Blocks.ACACIA_FENCE);
			 OreDictionary.registerOre("fenceWood", Blocks.BIRCH_FENCE);
			 OreDictionary.registerOre("fenceWood", Blocks.JUNGLE_FENCE);
			 OreDictionary.registerOre("fenceWood", Blocks.DARK_OAK_FENCE);
			 OreDictionary.registerOre("fenceWood", Blocks.OAK_FENCE);
			 OreDictionary.registerOre("fenceWood", Blocks.SPRUCE_FENCE);
			 //mine//
			 OreDictionary.registerOre("fenceWood", BlockInit.silverbell_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.crabapple_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.dogwood_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.jacaranda_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.wisteria_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.laburnum_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.paulownia_fence);
			 OreDictionary.registerOre("fenceWood", BlockInit.cedar_fence);
			 
			 						//gates//
			 
			 //vanilla//
			 OreDictionary.registerOre("gateWood", Blocks.ACACIA_FENCE_GATE);
			 OreDictionary.registerOre("gateWood", Blocks.BIRCH_FENCE_GATE);
			 OreDictionary.registerOre("gateWood", Blocks.JUNGLE_FENCE_GATE);
			 OreDictionary.registerOre("gateWood", Blocks.DARK_OAK_FENCE_GATE);
			 OreDictionary.registerOre("gateWood", Blocks.OAK_FENCE_GATE);
			 OreDictionary.registerOre("gateWood", Blocks.SPRUCE_FENCE_GATE);
			 //mine//
			 OreDictionary.registerOre("gateWood", BlockInit.silverbell_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.crabapple_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.dogwood_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.jacaranda_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.wisteria_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.laburnum_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.paulownia_fence_gate);
			 OreDictionary.registerOre("gateWood", BlockInit.cedar_fence_gate);
			 
			 OreDictionary.registerOre("blockConcrete", Blocks.CONCRETE);
			
				OreDictionary.registerOre("coloredPlanks", BlockInit.red_stained_planks);
				OreDictionary.registerOre("coloredPlanks", BlockInit.orange_stained_planks );
				OreDictionary.registerOre("coloredPlanks", BlockInit.yellow_stained_planks );
				OreDictionary.registerOre( "coloredPlanks", BlockInit.lime_stained_planks );
				OreDictionary.registerOre("coloredPlanks", BlockInit.green_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.cyan_stained_planks   );
				OreDictionary.registerOre( "coloredPlanks", BlockInit.light_blue_stained_planks );
				OreDictionary.registerOre( "coloredPlanks", BlockInit.blue_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.purple_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.magenta_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.pink_stained_planks);
				OreDictionary.registerOre("coloredPlanks", BlockInit.white_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.light_gray_stained_planks   );
				OreDictionary.registerOre( "coloredPlanks", BlockInit.gray_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.black_stained_planks);
				OreDictionary.registerOre( "coloredPlanks", BlockInit.brown_stained_planks);
			
			OreDictionary.registerOre("oreAmethyst",  BlockInit.amethyst_ore);
			OreDictionary.registerOre("oreAventurine", BlockInit.aventurine_ore);
			OreDictionary.registerOre("oreCarnelian", BlockInit.carnelian_ore);
			OreDictionary.registerOre("oreChalcopyrite", BlockInit.chalcopyrite_ore);
			OreDictionary.registerOre("oreCitrine", BlockInit.citrine_ore);
			OreDictionary.registerOre("oreJade", BlockInit.jade_ore);
			OreDictionary.registerOre("oreJasper", BlockInit.jasper_ore);
			OreDictionary.registerOre("oreLabradorite", BlockInit.labradorite_ore);
			OreDictionary.registerOre("oreMica",  BlockInit.mica_ore);
			OreDictionary.registerOre("oreMoonstone", BlockInit.moonstone_ore);
			OreDictionary.registerOre("oreRoseQuartz", BlockInit.rose_quartz_ore);
			OreDictionary.registerOre("oreSodalite", BlockInit.sodalite_ore);
	}
	
	public static final List<Block> ORES = new ArrayList<Block>();
	public static final List<Block> GRASS = new ArrayList<Block>();
	
	public static final List<Item>GEM_DROPS = new ArrayList<Item>();
	
	
		
	





	


	
}