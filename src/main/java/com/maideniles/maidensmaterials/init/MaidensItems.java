package com.maideniles.maidensmaterials.init;

import java.util.ArrayList;
import java.util.List;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.handlers.RecipeHandler;
import com.maideniles.maidensmaterials.init.blocks.item.ItemBlockDoor;
import com.maideniles.maidensmaterials.init.blocks.stained.CustomBlockHalfSlab;
import com.maideniles.maidensmaterials.init.blocks.stained.door.CustomBlockDoor;
import com.maideniles.maidensmaterials.init.items.CustomIngot;
import com.maideniles.maidensmaterials.init.items.ItemDoorPlans;
import com.maideniles.maidensmaterials.init.items.ItemGemBase;
import com.maideniles.maidensmaterials.init.items.ItemGrout;
import com.maideniles.maidensmaterials.init.items.ItemMortarAndPestle;
import com.maideniles.maidensmaterials.init.items.ItemPruningShears;
import com.maideniles.maidensmaterials.init.items.ItemPulverizedMaterials;
import com.maideniles.maidensmaterials.init.items.ItemTreeBlossoms;
import com.maideniles.maidensmaterials.init.items.gui.ItemGuideBook;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
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
public class MaidensItems{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static final Item grout = new ItemGrout("grout");
	public static final Item dark_iron_mix = new ItemGemBase("dark_iron_mix");
	public static final Item dark_iron_inlay = new ItemGemBase("dark_iron_inlay");
	public static final Item dark_iron_ingot = new CustomIngot("dark_iron_ingot");

	public static final Item red_clay = new ItemGemBase("red_clay");
	public static final Item orange_clay = new ItemGemBase("orange_clay");
	public static final Item yellow_clay = new ItemGemBase("yellow_clay");
	public static final Item lime_clay = new ItemGemBase("lime_clay");
	public static final Item green_clay = new ItemGemBase("green_clay");
	public static final Item cyan_clay = new ItemGemBase("cyan_clay");
	public static final Item light_blue_clay = new ItemGemBase("light_blue_clay");
	public static final Item blue_clay = new ItemGemBase("blue_clay");
	public static final Item purple_clay = new ItemGemBase("purple_clay");
	public static final Item magenta_clay = new ItemGemBase("magenta_clay");
	public static final Item pink_clay = new ItemGemBase("pink_clay");
	public static final Item white_clay = new ItemGemBase("white_clay");
	public static final Item light_gray_clay = new ItemGemBase("light_gray_clay");
	public static final Item gray_clay = new ItemGemBase("gray_clay");
	public static final Item black_clay = new ItemGemBase("black_clay");
	public static final Item brown_clay = new ItemGemBase("brown_clay");

	public static final Item red_clay_mix = new ItemGemBase("red_clay_mix");
	public static final Item orange_clay_mix = new ItemGemBase("orange_clay_mix");
	public static final Item yellow_clay_mix = new ItemGemBase("yellow_clay_mix");
	public static final Item lime_clay_mix = new ItemGemBase("lime_clay_mix");
	public static final Item green_clay_mix = new ItemGemBase("green_clay_mix");
	public static final Item cyan_clay_mix = new ItemGemBase("cyan_clay_mix");
	public static final Item light_blue_clay_mix = new ItemGemBase("light_blue_clay_mix");
	public static final Item blue_clay_mix = new ItemGemBase("blue_clay_mix");
	public static final Item purple_clay_mix = new ItemGemBase("purple_clay_mix");
	public static final Item magenta_clay_mix = new ItemGemBase("magenta_clay_mix");
	public static final Item pink_clay_mix = new ItemGemBase("pink_clay_mix");
	public static final Item white_clay_mix = new ItemGemBase("white_clay_mix");
	public static final Item light_gray_clay_mix = new ItemGemBase("light_gray_clay_mix");
	public static final Item gray_clay_mix = new ItemGemBase("gray_clay_mix");
	public static final Item black_clay_mix = new ItemGemBase("black_clay_mix");
	public static final Item brown_clay_mix = new ItemGemBase("brown_clay_mix");

	public static final Item red_brick = new CustomIngot("red_brick");
	public static final Item orange_brick = new CustomIngot("orange_brick");
	public static final Item yellow_brick = new CustomIngot("yellow_brick");
	public static final Item lime_brick = new CustomIngot("lime_brick");
	public static final Item green_brick = new CustomIngot("green_brick");
	public static final Item cyan_brick = new CustomIngot("cyan_brick");
	public static final Item light_blue_brick = new CustomIngot("light_blue_brick");
	public static final Item blue_brick = new CustomIngot("blue_brick");
	public static final Item purple_brick = new CustomIngot("purple_brick");
	public static final Item magenta_brick = new CustomIngot("magenta_brick");
	public static final Item pink_brick = new CustomIngot("pink_brick");
	public static final Item white_brick = new CustomIngot("white_brick");
	public static final Item light_gray_brick = new CustomIngot("light_gray_brick");
	public static final Item gray_brick = new CustomIngot("gray_brick");
	public static final Item black_brick = new CustomIngot("black_brick");
	public static final Item brown_brick = new CustomIngot("brown_brick");

	public static final Item clay_vase_red = new ItemGemBase("clay_vase_red");
	public static final Item clay_vase_orange = new ItemGemBase("clay_vase_orange");
	public static final Item clay_vase_yellow = new ItemGemBase("clay_vase_yellow");
	public static final Item clay_vase_lime = new ItemGemBase("clay_vase_lime");
	public static final Item clay_vase_green = new ItemGemBase("clay_vase_green");
	public static final Item clay_vase_cyan = new ItemGemBase("clay_vase_cyan");
	public static final Item clay_vase_light_blue = new ItemGemBase("clay_vase_light_blue");
	public static final Item clay_vase_blue = new ItemGemBase("clay_vase_blue");
	public static final Item clay_vase_purple = new ItemGemBase("clay_vase_purple");
	public static final Item clay_vase_magenta = new ItemGemBase("clay_vase_magenta");
	public static final Item clay_vase_pink = new ItemGemBase("clay_vase_pink");
	public static final Item clay_vase_white = new ItemGemBase("clay_vase_white");
	public static final Item clay_vase_light_gray = new ItemGemBase("clay_vase_light_gray");
	public static final Item clay_vase_gray = new ItemGemBase("clay_vase_gray");
	public static final Item clay_vase_black = new ItemGemBase("clay_vase_black");
	public static final Item clay_vase_brown = new ItemGemBase("clay_vase_brown");

	public static final Item mica_chunk = new CustomIngot("mica_chunk");
	public static final Item mica_fragments = new CustomIngot("mica_fragments");
	public static final Item mica_powder = new CustomIngot("mica_powder");
	public static final Item pruning_shears = new ItemPruningShears("pruning_shears");
	public static final Item mortar_n_pestle = new ItemMortarAndPestle("mortar_and_pestle");

	public static final Item guide_book = new ItemGuideBook("guide_book");

/*	public static final Item amethyst_gem = new ItemGemBase("amethyst");
	public static final Item moonstone_gem = new ItemGemBase("moonstone");
	public static final Item jasper_gem = new ItemGemBase("jasper");
	public static final Item labradorite_gem = new ItemGemBase("labradorite");
	public static final Item jade_gem = new ItemGemBase("jade");
	public static final Item sodalite_gem = new ItemGemBase("sodalite");
	public static final Item rose_quartz_gem = new ItemGemBase("rose_quartz");
	public static final Item chalcopyrite_gem = new ItemGemBase("chalcopyrite");*/

	public static final Item amethyst_fragments = new ItemGemBase("amethyst_fragments");
	public static final Item aventurine_fragments = new ItemGemBase("aventurine_fragments");
	public static final Item carnelian_fragments = new ItemGemBase("carnelian_fragments");
	public static final Item chalcopyrite_fragments = new ItemGemBase("chalcopyrite_fragments");
	public static final Item citrine_fragments = new ItemGemBase("citrine_fragments");
	public static final Item jade_fragments = new ItemGemBase("jade_fragments");
	public static final Item jasper_fragments = new ItemGemBase("jasper_fragments");
	public static final Item labradorite_fragments = new ItemGemBase("labradorite_fragments");
	public static final Item moonstone_fragments = new ItemGemBase("moonstone_fragments");
	public static final Item rose_quartz_fragments = new ItemGemBase("rose_quartz_fragments");
	public static final Item sodalite_fragments = new ItemGemBase("sodalite_fragments");

	public static final Item amethyst_chunk = new ItemGemBase("amethyst_chunk");
	public static final Item aventurine_chunk = new ItemGemBase("aventurine_chunk");
	public static final Item carnelian_chunk = new ItemGemBase("carnelian_chunk");
	public static final Item chalcopyrite_chunk = new ItemGemBase("chalcopyrite_chunk");
	public static final Item citrine_chunk = new ItemGemBase("citrine_chunk");
	public static final Item jade_chunk = new ItemGemBase("jade_chunk");
	public static final Item jasper_chunk = new ItemGemBase("jasper_chunk");
	public static final Item labradorite_chunk = new ItemGemBase("labradorite_chunk");
	public static final Item moonstone_chunk = new ItemGemBase("moonstone_chunk");
	public static final Item rose_quartz_chunk = new ItemGemBase("rose_quartz_chunk");
	public static final Item sodalite_chunk = new ItemGemBase("sodalite_chunk");

	public static final Item FLORAL_ESSENCE = new ItemTreeBlossoms("floral_essence");
	public static final Item EARTHEN_ESSENCE = new ItemTreeBlossoms("earthen_essence");

	public static final Item door_plans_1 = new ItemDoorPlans("door_plans_1");
	public static final Item door_plans_2 = new ItemDoorPlans("door_plans_2");
	public static final Item door_plans_3 = new ItemDoorPlans("door_plans_3");
	public static final Item door_plans_4 = new ItemDoorPlans("door_plans_4");
	public static final Item door_plans_5 = new ItemDoorPlans("door_plans_5");
	public static final Item door_plans_6 = new ItemDoorPlans("door_plans_6");

	public static final Item silverbell_blossoms = new ItemTreeBlossoms("silverbell_blossoms");
	public static final Item crabapple_blossoms = new ItemTreeBlossoms("crabapple_blossoms");
	public static final Item dogwood_blossoms = new ItemTreeBlossoms("dogwood_blossoms");
	public static final Item jacaranda_blossoms = new ItemTreeBlossoms("jacaranda_blossoms");
	public static final Item laburnum_blossoms = new ItemTreeBlossoms("laburnum_blossoms");
	public static final Item paulownia_blossoms = new ItemTreeBlossoms("paulownia_blossoms");
	public static final Item wisteria_blossoms = new ItemTreeBlossoms("wisteria_blossoms");

	public static final Item pulverized_red = new ItemPulverizedMaterials("pulverized_red");
	public static final Item pulverized_orange = new ItemPulverizedMaterials("pulverized_orange");
	public static final Item pulverized_yellow = new ItemPulverizedMaterials("pulverized_yellow");
	public static final Item pulverized_lime = new ItemPulverizedMaterials("pulverized_lime");
	public static final Item pulverized_green = new ItemPulverizedMaterials("pulverized_green");
	public static final Item pulverized_cyan = new ItemPulverizedMaterials("pulverized_cyan");
	public static final Item pulverized_light_blue = new ItemPulverizedMaterials("pulverized_light_blue");
	public static final Item pulverized_blue = new ItemPulverizedMaterials("pulverized_blue");
	public static final Item pulverized_purple = new ItemPulverizedMaterials("pulverized_purple");
	public static final Item pulverized_magenta = new ItemPulverizedMaterials("pulverized_magenta");
	public static final Item pulverized_pink = new ItemPulverizedMaterials("pulverized_pink");
	public static final Item pulverized_white = new ItemPulverizedMaterials("pulverized_white");
	public static final Item pulverized_light_gray = new ItemPulverizedMaterials("pulverized_light_gray");
	public static final Item pulverized_gray = new ItemPulverizedMaterials("pulverized_gray");
	public static final Item pulverized_black = new ItemPulverizedMaterials("pulverized_black");
	public static final Item pulverized_brown = new ItemPulverizedMaterials("pulverized_brown");

	public static final Item whitewash = new ItemPulverizedMaterials("whitewash");

	public static final Item dye_bath_red = new ItemPulverizedMaterials("dye_bath_red");
	public static final Item dye_bath_orange = new ItemPulverizedMaterials("dye_bath_orange");
	public static final Item dye_bath_yellow = new ItemPulverizedMaterials("dye_bath_yellow");
	public static final Item dye_bath_lime = new ItemPulverizedMaterials("dye_bath_lime");
	public static final Item dye_bath_green = new ItemPulverizedMaterials("dye_bath_green");
	public static final Item dye_bath_cyan = new ItemPulverizedMaterials("dye_bath_cyan");
	public static final Item dye_bath_light_blue = new ItemPulverizedMaterials("dye_bath_light_blue");
	public static final Item dye_bath_blue = new ItemPulverizedMaterials("dye_bath_blue");
	public static final Item dye_bath_purple = new ItemPulverizedMaterials("dye_bath_purple");
	public static final Item dye_bath_magenta = new ItemPulverizedMaterials("dye_bath_magenta");
	public static final Item dye_bath_pink = new ItemPulverizedMaterials("dye_bath_pink");
	public static final Item dye_bath_white = new ItemPulverizedMaterials("dye_bath_white");
	public static final Item dye_bath_light_gray = new ItemPulverizedMaterials("dye_bath_light_gray");
	public static final Item dye_bath_gray = new ItemPulverizedMaterials("dye_bath_gray");
	public static final Item dye_bath_black = new ItemPulverizedMaterials("dye_bath_black");
	public static final Item dye_bath_brown = new ItemPulverizedMaterials("dye_bath_brown");

	public static final Item stain_red = new ItemPulverizedMaterials("stain_red");
	public static final Item stain_orange = new ItemPulverizedMaterials("stain_orange");
	public static final Item stain_yellow = new ItemPulverizedMaterials("stain_yellow");
	public static final Item stain_lime = new ItemPulverizedMaterials("stain_lime");
	public static final Item stain_green = new ItemPulverizedMaterials("stain_green");
	public static final Item stain_cyan = new ItemPulverizedMaterials("stain_cyan");
	public static final Item stain_light_blue = new ItemPulverizedMaterials("stain_light_blue");
	public static final Item stain_blue = new ItemPulverizedMaterials("stain_blue");
	public static final Item stain_purple = new ItemPulverizedMaterials("stain_purple");
	public static final Item stain_magenta = new ItemPulverizedMaterials("stain_magenta");
	public static final Item stain_pink = new ItemPulverizedMaterials("stain_pink");
	public static final Item stain_white = new ItemPulverizedMaterials("stain_white");
	public static final Item stain_light_gray = new ItemPulverizedMaterials("stain_light_gray");
	public static final Item stain_gray = new ItemPulverizedMaterials("stain_gray");
	public static final Item stain_black = new ItemPulverizedMaterials("stain_black");
	public static final Item stain_brown = new ItemPulverizedMaterials("stain_brown").setCreativeTab(MaidensMaterials.itemstab);

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {
		for(Item i : ITEMS)
			i.setCreativeTab(MaidensMaterials.itemstab);
		
		for(Block i : MaidensBlocks.BLOCKS) {
			if(i instanceof CustomBlockHalfSlab) {
				Block doubleSlab = null;
				for(Block b : MaidensBlocks.BLOCKS) {
					if(b != i) {
						if(b.getUnlocalizedName().contains(i.getUnlocalizedName().split("_half")[0])) {
							doubleSlab = b;
							break;
						}
					}
				}
				if(doubleSlab != null) {
					MaidensItems.ITEMS.add(new ItemSlab(i, (BlockSlab)i, (BlockSlab)doubleSlab).setRegistryName(i.getRegistryName()));
				}
			}
		}
		
		for(Block i : MaidensBlocks.BLOCKS) {
			if(i instanceof CustomBlockDoor) {
				if(i != null)
					MaidensItems.ITEMS.add(new ItemBlockDoor(i).setRegistryName(i.getRegistryName()));
			}	
		}
		
		e.getRegistry().registerAll(ITEMS.toArray(new Item[ITEMS.size()]));
		
		MaidensBlocks.registerOreDictionary();
		registerData();
		
		RecipeHandler.registerSmelting();
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		for (Item itm : ITEMS) {
			if(itm instanceof ItemSlab) {
				BlockSlab b = (BlockSlab) Block.getBlockFromItem(itm);
				if(b.isDouble()) {
					continue;
				}
			}
			ModelLoader.setCustomModelResourceLocation(itm, 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}

	public static void registerData() {
		Blocks.FIRE.setFireInfo(MaidensBlocks.cedar_log, 5, 20);

		OreDictionary.registerOre("mortar_and_pestle",new ItemStack(MaidensItems.mortar_n_pestle, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("grout", new ItemStack(MaidensItems.grout, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_1", new ItemStack(MaidensItems.door_plans_1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_2", new ItemStack(MaidensItems.door_plans_2, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_3", new ItemStack(MaidensItems.door_plans_3, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_4", new ItemStack(MaidensItems.door_plans_4, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_5", new ItemStack(MaidensItems.door_plans_5, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_6", new ItemStack(MaidensItems.door_plans_6, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("gemAmethyst", MaidensItems.amethyst_chunk);
		OreDictionary.registerOre("gemAventurine", MaidensItems.aventurine_chunk);
		OreDictionary.registerOre("gemCarnelian", MaidensItems.carnelian_chunk);
		OreDictionary.registerOre("gemChalcopyrite", MaidensItems.chalcopyrite_chunk);
		OreDictionary.registerOre("gemCitrine", MaidensItems.citrine_chunk);
		OreDictionary.registerOre("gemJade", MaidensItems.jade_chunk);
		OreDictionary.registerOre("gemJasper", MaidensItems.jasper_chunk);
		OreDictionary.registerOre("gemLabradorite", MaidensItems.labradorite_chunk);
		OreDictionary.registerOre("gemMica", MaidensItems.mica_chunk);
		OreDictionary.registerOre("gemMoonstone", MaidensItems.moonstone_chunk);
		OreDictionary.registerOre("gemRoseQuartz", MaidensItems.rose_quartz_chunk);
		OreDictionary.registerOre("gemSodalite", MaidensItems.sodalite_chunk);

		OreDictionary.registerOre("dyeRed", new ItemStack(MaidensItems.pulverized_red, 1));
		OreDictionary.registerOre("dyeOrange", new ItemStack(MaidensItems.pulverized_orange, 1));
		OreDictionary.registerOre("dyeYellow", new ItemStack(MaidensItems.pulverized_yellow, 1));
		OreDictionary.registerOre("dyeLime", new ItemStack(MaidensItems.pulverized_lime, 1));
		OreDictionary.registerOre("dyeGreen", new ItemStack(MaidensItems.pulverized_green, 1));
		OreDictionary.registerOre("dyeCyan", new ItemStack(MaidensItems.pulverized_cyan, 1));
		OreDictionary.registerOre("dyeLightBlue", new ItemStack(MaidensItems.pulverized_light_blue, 1));
		OreDictionary.registerOre("dyeBlue", new ItemStack(MaidensItems.pulverized_blue, 1));
		OreDictionary.registerOre("dyePurple", new ItemStack(MaidensItems.pulverized_purple, 1));
		OreDictionary.registerOre("dyeMagenta", new ItemStack(MaidensItems.pulverized_magenta, 1));
		OreDictionary.registerOre("dyePink", new ItemStack(MaidensItems.pulverized_pink, 1));
		OreDictionary.registerOre("dyeWhite", new ItemStack(MaidensItems.pulverized_white, 1));
		OreDictionary.registerOre("dyeLightGray", new ItemStack(MaidensItems.pulverized_light_gray, 1));
		OreDictionary.registerOre("dyeRedGray", new ItemStack(MaidensItems.pulverized_gray, 1));
		OreDictionary.registerOre("dyeBlack", new ItemStack(MaidensItems.pulverized_black, 1));
		OreDictionary.registerOre("dyeBrown", new ItemStack(MaidensItems.pulverized_brown, 1));
	}

}