package com.maideniles.maidensmaterials.init;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.items.CustomIngot;
import com.maideniles.maidensmaterials.init.items.ItemDoorPlans;
import com.maideniles.maidensmaterials.init.items.ItemGemBase;
import com.maideniles.maidensmaterials.init.items.ItemGrout;
import com.maideniles.maidensmaterials.init.items.ItemMortarAndPestle;
import com.maideniles.maidensmaterials.init.items.ItemPruningShears;
import com.maideniles.maidensmaterials.init.items.ItemPulverizedMaterials;
import com.maideniles.maidensmaterials.init.items.ItemTreeBlossoms;
import com.maideniles.maidensmaterials.init.items.gui.ItemGuideBook;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public class ItemInit 
//TODO
{
	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	
	public static Item guide_book;
	public static Item pruning_shears;
	public static Item mortar_n_pestle;
	public static Item mica_powder;
	public static Item grout;
		
	public static Item dark_iron_mix;
	public static Item dark_iron_ingot;
	public static Item dark_iron_inlay;
	
	public static Item door_plans_1;
	public static Item door_plans_2;
	public static Item door_plans_3;
	public static Item door_plans_4;
	public static Item door_plans_5;
	public static Item door_plans_6;
	
	public static Item silverbell_blossoms;
	public static Item crabapple_blossoms;
	public static Item dogwood_blossoms;
	public static Item jacaranda_blossoms;
	public static Item laburnum_blossoms;
	public static Item paulownia_blossoms;
	public static Item wisteria_blossoms;
	public static Item FLORAL_ESSENCE;
	public static Item EARTHEN_ESSENCE;
	
	public static Item amethyst_chunk;
	public static Item aventurine_chunk;
	public static Item carnelian_chunk;
	public static Item chalcopyrite_chunk;
	public static Item citrine_chunk;
	public static Item jade_chunk;
	public static Item jasper_chunk;
	public static Item labradorite_chunk;
	public static Item mica_chunk;
	public static Item moonstone_chunk;
	public static Item rose_quartz_chunk;
	public static Item sodalite_chunk;
	
	public static Item amethyst_gem;
	public static Item moonstone_gem;
	public static Item jasper_gem;
	public static Item labradorite_gem;
	public static Item jade_gem;
	public static Item sodalite_gem;
	public static Item rose_quartz_gem;
	public static Item chalcopyrite_gem;
	
	public static Item amethyst_fragments;
	public static Item aventurine_fragments;
	public static Item carnelian_fragments;
	public static Item chalcopyrite_fragments;
	public static Item citrine_fragments;
	public static Item jade_fragments;
	public static Item jasper_fragments;
	public static Item labradorite_fragments;
	public static Item mica_fragments;
	public static Item moonstone_fragments;
	public static Item rose_quartz_fragments;
	public static Item sodalite_fragments;
	
	public static Item red_clay;
	public static Item orange_clay;
	public static Item yellow_clay;
	public static Item lime_clay;
	public static Item green_clay;
	public static Item cyan_clay;
	public static Item light_blue_clay;
	public static Item blue_clay;
	public static Item purple_clay;
	public static Item magenta_clay;
	public static Item pink_clay;
	public static Item white_clay;
	public static Item light_gray_clay;
	public static Item gray_clay;
	public static Item black_clay;
	public static Item brown_clay;
	
	public static Item red_clay_mix;
	public static Item orange_clay_mix;
	public static Item yellow_clay_mix;
	public static Item lime_clay_mix;
	public static Item green_clay_mix;
	public static Item cyan_clay_mix;
	public static Item light_blue_clay_mix;
	public static Item blue_clay_mix;
	public static Item purple_clay_mix;
	public static Item magenta_clay_mix;
	public static Item pink_clay_mix;
	public static Item white_clay_mix;
	public static Item light_gray_clay_mix;
	public static Item gray_clay_mix;
	public static Item black_clay_mix;
	public static Item brown_clay_mix;
	
	public static Item red_brick;
	public static Item orange_brick;
	public static Item yellow_brick;
	public static Item lime_brick;
	public static Item green_brick;
	public static Item cyan_brick;
	public static Item light_blue_brick;
	public static Item blue_brick;
	public static Item purple_brick;
	public static Item magenta_brick;
	public static Item pink_brick;
	public static Item white_brick;
	public static Item light_gray_brick;
	public static Item gray_brick;
	public static Item black_brick;
	public static Item brown_brick;
	
	public static Item clay_vase_red;
	public static Item clay_vase_orange;
	public static Item clay_vase_yellow;
	public static Item clay_vase_lime;
	public static Item clay_vase_green;
	public static Item clay_vase_cyan;
	public static Item clay_vase_light_blue;
	public static Item clay_vase_blue;
	public static Item clay_vase_purple;
	public static Item clay_vase_magenta;
	public static Item clay_vase_pink;
	public static Item clay_vase_white;
	public static Item clay_vase_light_gray;
	public static Item clay_vase_gray;
	public static Item clay_vase_black;
	public static Item clay_vase_brown;
	
	public static Item stain_red;
	public static Item stain_orange;
	public static Item stain_yellow;
	public static Item stain_lime;
	public static Item stain_green;
	public static Item stain_cyan;
	public static Item stain_light_blue;
	public static Item stain_blue;
	public static Item stain_purple;
	public static Item stain_magenta;
	public static Item stain_pink;
	public static Item stain_white;
	public static Item stain_light_gray;
	public static Item stain_gray;
	public static Item stain_black;
	public static Item stain_brown;
	
	public static Item pulverized_red;
	public static Item pulverized_orange;
	public static Item pulverized_yellow;
	public static Item pulverized_lime;
	public static Item pulverized_green;
	public static Item pulverized_cyan;
	public static Item pulverized_light_blue;
	public static Item pulverized_blue;
	public static Item pulverized_purple;
	public static Item pulverized_magenta;
	public static Item pulverized_pink;
	public static Item pulverized_white;
	public static Item pulverized_light_gray;
	public static Item pulverized_gray;
	public static Item pulverized_black;
	public static Item pulverized_brown;
	
	public static Item whitewash;
	public static Item dye_bath_red;
	public static Item dye_bath_orange;
	public static Item dye_bath_yellow;
	public static Item dye_bath_lime;
	public static Item dye_bath_green;
	public static Item dye_bath_cyan;
	public static Item dye_bath_light_blue;
	public static Item dye_bath_blue;
	public static Item dye_bath_purple;
	public static Item dye_bath_magenta;
	public static Item dye_bath_pink;
	public static Item dye_bath_white;
	public static Item dye_bath_light_gray;
	public static Item dye_bath_gray;
	public static Item dye_bath_black;
	public static Item dye_bath_brown;
	

	
	
	
	
	
	public static void init()
	//TODO
	{
		Blocks.FIRE.setFireInfo(BlockInit.cedar_log, 5, 20);
		
		grout = new ItemGrout("grout");
		dark_iron_mix = new ItemGemBase("dark_iron_mix");
		dark_iron_inlay = new ItemGemBase("dark_iron_inlay");
		dark_iron_ingot = new CustomIngot("dark_iron_ingot");
		
		red_clay = new ItemGemBase("red_clay");
		orange_clay = new ItemGemBase("orange_clay");
		yellow_clay = new ItemGemBase("yellow_clay");
		lime_clay = new ItemGemBase("lime_clay");
		green_clay = new ItemGemBase("green_clay");
		cyan_clay = new ItemGemBase("cyan_clay");
		light_blue_clay = new ItemGemBase("light_blue_clay");
		blue_clay = new ItemGemBase("blue_clay");
		purple_clay = new ItemGemBase("purple_clay");
		magenta_clay = new ItemGemBase("magenta_clay");
		pink_clay = new ItemGemBase("pink_clay");
		white_clay = new ItemGemBase("white_clay");
		light_gray_clay = new ItemGemBase("light_gray_clay");
		gray_clay = new ItemGemBase("gray_clay");
		black_clay = new ItemGemBase("black_clay");
		brown_clay = new ItemGemBase("brown_clay");
		
		red_clay_mix = new ItemGemBase("red_clay_mix");
		orange_clay_mix = new ItemGemBase("orange_clay_mix");
		yellow_clay_mix = new ItemGemBase("yellow_clay_mix");
		lime_clay_mix = new ItemGemBase("lime_clay_mix");
		green_clay_mix = new ItemGemBase("green_clay_mix");
		cyan_clay_mix = new ItemGemBase("cyan_clay_mix");
		light_blue_clay_mix = new ItemGemBase("light_blue_clay_mix");
		blue_clay_mix = new ItemGemBase("blue_clay_mix");
		purple_clay_mix = new ItemGemBase("purple_clay_mix");
		magenta_clay_mix = new ItemGemBase("magenta_clay_mix");
		pink_clay_mix = new ItemGemBase("pink_clay_mix");
		white_clay_mix = new ItemGemBase("white_clay_mix");
		light_gray_clay_mix = new ItemGemBase("light_gray_clay_mix");
		gray_clay_mix = new ItemGemBase("gray_clay_mix");
		black_clay_mix = new ItemGemBase("black_clay_mix");
		brown_clay_mix = new ItemGemBase("brown_clay_mix");
		
		red_brick = new CustomIngot("red_brick");
		orange_brick = new CustomIngot("orange_brick");
		yellow_brick = new CustomIngot("yellow_brick");
		lime_brick = new CustomIngot("lime_brick");
		green_brick = new CustomIngot("green_brick");
		cyan_brick = new CustomIngot("cyan_brick");
		light_blue_brick = new CustomIngot("light_blue_brick");
		blue_brick = new CustomIngot("blue_brick");
		purple_brick = new CustomIngot("purple_brick");
		magenta_brick = new CustomIngot("magenta_brick");
		pink_brick = new CustomIngot("pink_brick");
		white_brick = new CustomIngot("white_brick");
		light_gray_brick = new CustomIngot("light_gray_brick");
		gray_brick = new CustomIngot("gray_brick");
		black_brick = new CustomIngot("black_brick");
		brown_brick = new CustomIngot("brown_brick");
		
		clay_vase_red = new ItemGemBase("clay_vase_red");
		clay_vase_orange = new ItemGemBase("clay_vase_orange");
		clay_vase_yellow = new ItemGemBase("clay_vase_yellow");
		clay_vase_lime = new ItemGemBase("clay_vase_lime");
		clay_vase_green = new ItemGemBase("clay_vase_green");
		clay_vase_cyan = new ItemGemBase("clay_vase_cyan");
		clay_vase_light_blue = new ItemGemBase("clay_vase_light_blue");
		clay_vase_blue = new ItemGemBase("clay_vase_blue");
		clay_vase_purple = new ItemGemBase("clay_vase_purple");
		clay_vase_magenta = new ItemGemBase("clay_vase_magenta");
		clay_vase_pink = new ItemGemBase("clay_vase_pink");
		clay_vase_white = new ItemGemBase("clay_vase_white");
		clay_vase_light_gray = new ItemGemBase("clay_vase_light_gray");
		clay_vase_gray = new ItemGemBase("clay_vase_gray");
		clay_vase_black = new ItemGemBase("clay_vase_black");
		clay_vase_brown = new ItemGemBase("clay_vase_brown");
		
	
		mica_chunk = new CustomIngot("mica_chunk");
		mica_fragments = new CustomIngot("mica_fragments");
		mica_powder = new CustomIngot("mica_powder");
		pruning_shears = new ItemPruningShears("pruning_shears");
		mortar_n_pestle = new ItemMortarAndPestle("mortar_and_pestle");
	
		guide_book = new ItemGuideBook("guide_book");
		
		 amethyst_gem = new ItemGemBase("amethyst");
		 moonstone_gem = new ItemGemBase("moonstone");
		 jasper_gem = new ItemGemBase("jasper");
		 labradorite_gem = new ItemGemBase("labradorite");
		 jade_gem = new ItemGemBase("jade");
		 sodalite_gem = new ItemGemBase("sodalite");
		 rose_quartz_gem = new ItemGemBase("rose_quartz");
		 chalcopyrite_gem = new ItemGemBase("chalcopyrite");
		 
		 amethyst_fragments = new ItemGemBase("amethyst_fragments");
		 aventurine_fragments = new ItemGemBase("aventurine_fragments");
		 carnelian_fragments = new ItemGemBase("carnelian_fragments");
		 chalcopyrite_fragments = new ItemGemBase("chalcopyrite_fragments");
		 citrine_fragments = new ItemGemBase("citrine_fragments");
		 jade_fragments = new ItemGemBase("jade_fragments");
		 jasper_fragments = new ItemGemBase("jasper_fragments");
		 labradorite_fragments = new ItemGemBase("labradorite_fragments");
		 moonstone_fragments = new ItemGemBase("moonstone_fragments");
		 rose_quartz_fragments = new ItemGemBase("rose_quartz_fragments");
		 sodalite_fragments = new ItemGemBase("sodalite_fragments");
		 
		 amethyst_chunk = new ItemGemBase("amethyst_chunk");
		 aventurine_chunk = new ItemGemBase("aventurine_chunk");
		 carnelian_chunk = new ItemGemBase("carnelian_chunk");
		 chalcopyrite_chunk = new ItemGemBase("chalcopyrite_chunk");
		 citrine_chunk = new ItemGemBase("citrine_chunk");
		 jade_chunk = new ItemGemBase("jade_chunk");
		 jasper_chunk = new ItemGemBase("jasper_chunk");
		 labradorite_chunk = new ItemGemBase("labradorite_chunk");
		 moonstone_chunk = new ItemGemBase("moonstone_chunk");
		 rose_quartz_chunk = new ItemGemBase("rose_quartz_chunk");
		 sodalite_chunk = new ItemGemBase("sodalite_chunk");
		 
		
		
		
		FLORAL_ESSENCE = new ItemTreeBlossoms("floral_essence");
		EARTHEN_ESSENCE = new ItemTreeBlossoms("earthen_essence");
	
		
		
		door_plans_1 = new ItemDoorPlans("door_plans_1");
		door_plans_2 = new ItemDoorPlans("door_plans_2");
		door_plans_3 = new ItemDoorPlans("door_plans_3");
		door_plans_4 = new ItemDoorPlans("door_plans_4");
		door_plans_5 = new ItemDoorPlans("door_plans_5");
		door_plans_6 = new ItemDoorPlans("door_plans_6");
		
		
		
		silverbell_blossoms = new ItemTreeBlossoms("silverbell_blossoms");
		crabapple_blossoms = new ItemTreeBlossoms("crabapple_blossoms");
		dogwood_blossoms = new ItemTreeBlossoms("dogwood_blossoms");
		jacaranda_blossoms = new ItemTreeBlossoms("jacaranda_blossoms");
		laburnum_blossoms = new ItemTreeBlossoms("laburnum_blossoms");
		paulownia_blossoms = new ItemTreeBlossoms("paulownia_blossoms");
		wisteria_blossoms = new ItemTreeBlossoms("wisteria_blossoms");
		
		pulverized_red = new ItemPulverizedMaterials("pulverized_red");
		pulverized_orange = new ItemPulverizedMaterials("pulverized_orange");
		pulverized_yellow = new ItemPulverizedMaterials("pulverized_yellow");
		pulverized_lime = new ItemPulverizedMaterials("pulverized_lime");
		pulverized_green = new ItemPulverizedMaterials("pulverized_green");
		pulverized_cyan = new ItemPulverizedMaterials("pulverized_cyan");
		pulverized_light_blue = new ItemPulverizedMaterials("pulverized_light_blue");
		pulverized_blue = new ItemPulverizedMaterials("pulverized_blue");
		pulverized_purple = new ItemPulverizedMaterials("pulverized_purple");
		pulverized_magenta = new ItemPulverizedMaterials("pulverized_magenta");
		pulverized_pink = new ItemPulverizedMaterials("pulverized_pink");
		pulverized_white = new ItemPulverizedMaterials("pulverized_white");
		pulverized_light_gray = new ItemPulverizedMaterials("pulverized_light_gray");
		pulverized_gray = new ItemPulverizedMaterials("pulverized_gray");
		pulverized_black = new ItemPulverizedMaterials("pulverized_black");
		pulverized_brown = new ItemPulverizedMaterials("pulverized_brown");
		
		whitewash = new ItemPulverizedMaterials("whitewash");
		
		dye_bath_red = new ItemPulverizedMaterials("dye_bath_red");
		dye_bath_orange = new ItemPulverizedMaterials("dye_bath_orange");
		dye_bath_yellow = new ItemPulverizedMaterials("dye_bath_yellow");
		dye_bath_lime = new ItemPulverizedMaterials("dye_bath_lime");
		dye_bath_green = new ItemPulverizedMaterials("dye_bath_green");
		dye_bath_cyan = new ItemPulverizedMaterials("dye_bath_cyan");
		dye_bath_light_blue = new ItemPulverizedMaterials("dye_bath_light_blue");
		dye_bath_blue = new ItemPulverizedMaterials("dye_bath_blue");
		dye_bath_purple = new ItemPulverizedMaterials("dye_bath_purple");
		dye_bath_magenta = new ItemPulverizedMaterials("dye_bath_magenta");
		dye_bath_pink = new ItemPulverizedMaterials("dye_bath_pink");
		dye_bath_white = new ItemPulverizedMaterials("dye_bath_white");
		dye_bath_light_gray = new ItemPulverizedMaterials("dye_bath_light_gray");
		dye_bath_gray = new ItemPulverizedMaterials("dye_bath_gray");
		dye_bath_black = new ItemPulverizedMaterials("dye_bath_black");
		dye_bath_brown = new ItemPulverizedMaterials("dye_bath_brown");
		
		
		
		
		stain_red = new ItemPulverizedMaterials("stain_red");
		stain_orange = new ItemPulverizedMaterials("stain_orange");
		stain_yellow = new ItemPulverizedMaterials("stain_yellow");
		stain_lime = new ItemPulverizedMaterials("stain_lime");
		stain_green = new ItemPulverizedMaterials("stain_green");
		stain_cyan = new ItemPulverizedMaterials("stain_cyan");
		stain_light_blue = new ItemPulverizedMaterials("stain_light_blue");
		stain_blue = new ItemPulverizedMaterials("stain_blue");
		stain_purple = new ItemPulverizedMaterials("stain_purple");
		stain_magenta = new ItemPulverizedMaterials("stain_magenta");
		stain_pink = new ItemPulverizedMaterials("stain_pink");
		stain_white = new ItemPulverizedMaterials("stain_white");
		stain_light_gray = new ItemPulverizedMaterials("stain_light_gray");
		stain_gray = new ItemPulverizedMaterials("stain_gray");
		stain_black = new ItemPulverizedMaterials("stain_black");
		stain_brown = new ItemPulverizedMaterials("stain_brown");
	}
	
	public static void register()
	//TODO
	{
		registerItem(guide_book);
		registerItem(pruning_shears);
		registerItem(mortar_n_pestle);
		
		registerItem(silverbell_blossoms);
		registerItem(crabapple_blossoms);
		registerItem(dogwood_blossoms);
		registerItem(jacaranda_blossoms);
		registerItem(laburnum_blossoms);
		registerItem(paulownia_blossoms);
		registerItem(wisteria_blossoms);
		
		registerItem(FLORAL_ESSENCE);
		registerItem(EARTHEN_ESSENCE);
		
		registerItem(amethyst_chunk);
		registerItem(aventurine_chunk);
		registerItem(carnelian_chunk);
		registerItem(chalcopyrite_chunk);
		registerItem(citrine_chunk);
		registerItem(jade_chunk);
		registerItem(jasper_chunk);
		registerItem(labradorite_chunk);
		registerItem(moonstone_chunk);
		registerItem(rose_quartz_chunk);
		registerItem(sodalite_chunk);
		
		registerItem(mica_chunk);
		registerItem(mica_fragments);
		registerItem(amethyst_fragments);
		registerItem(aventurine_fragments);
		registerItem(carnelian_fragments);
		registerItem(chalcopyrite_fragments);
		registerItem(citrine_fragments);
		registerItem(jade_fragments);
		registerItem(jasper_fragments);
		registerItem(labradorite_fragments);
		registerItem(moonstone_fragments);
		registerItem(rose_quartz_fragments);
		registerItem(sodalite_fragments);
		
		registerItem(pulverized_red);
		registerItem(pulverized_orange);
		registerItem(pulverized_yellow);
		registerItem(pulverized_lime);
		registerItem(pulverized_green);
		registerItem(pulverized_cyan);
		registerItem(pulverized_light_blue);
		registerItem(pulverized_blue);
		registerItem(pulverized_purple);
		registerItem(pulverized_magenta);
		registerItem(pulverized_pink);
		registerItem(pulverized_white);
		registerItem(pulverized_light_gray);
		registerItem(pulverized_gray);
		registerItem(pulverized_black);
		registerItem(pulverized_brown);
		
		registerItem(red_clay);
		registerItem(orange_clay);
		registerItem(yellow_clay);
		registerItem(lime_clay);
		registerItem(green_clay);
		registerItem(cyan_clay);
		registerItem(light_blue_clay);
		registerItem(blue_clay);
		registerItem(purple_clay);
		registerItem(magenta_clay);
		registerItem(pink_clay);
		registerItem(white_clay);
		registerItem(light_gray_clay);
		registerItem(gray_clay);
		registerItem(black_clay);
		registerItem(brown_clay);
		
		registerItem(red_clay_mix);
		registerItem(orange_clay_mix);
		registerItem(yellow_clay_mix);
		registerItem(lime_clay_mix);
		registerItem(green_clay_mix);
		registerItem(cyan_clay_mix);
		registerItem(light_blue_clay_mix);
		registerItem(blue_clay_mix);
		registerItem(purple_clay_mix);
		registerItem(magenta_clay_mix);
		registerItem(pink_clay_mix);
		registerItem(white_clay_mix);
		registerItem(light_gray_clay_mix);
		registerItem(gray_clay_mix);
		registerItem(black_clay_mix);
		registerItem(brown_clay_mix);
		
		registerItem(red_brick);
		registerItem(orange_brick);
		registerItem(yellow_brick);
		registerItem(lime_brick);
		registerItem(green_brick);
		registerItem(cyan_brick);
		registerItem(light_blue_brick);
		registerItem(blue_brick);
		registerItem(purple_brick);
		registerItem(magenta_brick);
		registerItem(pink_brick);
		registerItem(white_brick);
		registerItem(light_gray_brick);
		registerItem(gray_brick);
		registerItem(black_brick);
		registerItem(brown_brick);
		
		registerItem(whitewash);
		registerItem(dye_bath_red);
		registerItem(dye_bath_orange);
		registerItem(dye_bath_yellow);
		registerItem(dye_bath_lime);
		registerItem(dye_bath_green);
		registerItem(dye_bath_cyan);
		registerItem(dye_bath_light_blue);
		registerItem(dye_bath_blue);
		registerItem(dye_bath_purple);
		registerItem(dye_bath_magenta);
		registerItem(dye_bath_pink);
		registerItem(dye_bath_white);
		registerItem(dye_bath_light_gray);
		registerItem(dye_bath_gray);
		registerItem(dye_bath_black);
		registerItem(dye_bath_brown);
		
		registerItem(stain_red);
		registerItem(stain_orange);
		registerItem(stain_yellow);
		registerItem(stain_lime);
		registerItem(stain_green);
		registerItem(stain_cyan);
		registerItem(stain_light_blue);
		registerItem(stain_blue);
		registerItem(stain_purple);
		registerItem(stain_magenta);
		registerItem(stain_pink);
		registerItem(stain_white);
		registerItem(stain_light_gray);
		registerItem(stain_gray);
		registerItem(stain_black);
		registerItem(stain_brown);
				
		registerItem(clay_vase_red);
		registerItem(clay_vase_orange);
		registerItem(clay_vase_yellow);
		registerItem(clay_vase_lime);
		registerItem(clay_vase_green);
		registerItem(clay_vase_cyan);
		registerItem(clay_vase_light_blue);
		registerItem(clay_vase_blue);
		registerItem(clay_vase_purple);
		registerItem(clay_vase_magenta);
		registerItem(clay_vase_pink);
		registerItem(clay_vase_white);
		registerItem(clay_vase_light_gray);
		registerItem(clay_vase_gray);
		registerItem(clay_vase_black);
		registerItem(clay_vase_brown);
		
		registerItem(door_plans_1);
		registerItem(door_plans_2);
		registerItem(door_plans_3);
		registerItem(door_plans_4);
		registerItem(door_plans_5);
		registerItem(door_plans_6);
		registerItem(mica_powder);
		registerItem(grout);
		registerItem(dark_iron_mix);
		registerItem(dark_iron_ingot);
		registerItem(dark_iron_inlay);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(MaidensMaterials.itemstab);
		MaidensMaterials.proxy.registerModelResourceLocation(item);
	}
	
	
	
	

	public static void registerOreDictionary() {
		//Items//
		OreDictionary.registerOre("mortar_and_pestle", new ItemStack(ItemInit.mortar_n_pestle, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("grout", new ItemStack(ItemInit.grout, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_1", new ItemStack(ItemInit.door_plans_1, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_2", new ItemStack(ItemInit.door_plans_2, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_3", new ItemStack(ItemInit.door_plans_3,  1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_4", new ItemStack(ItemInit.door_plans_4, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_5", new ItemStack(ItemInit.door_plans_5, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("door_plans_6", new ItemStack(ItemInit.door_plans_6, 1, OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("gemAmethyst",  ItemInit.amethyst_chunk);
		OreDictionary.registerOre("gemAventurine",  ItemInit.aventurine_chunk);
		OreDictionary.registerOre("gemCarnelian",  ItemInit.carnelian_chunk);
		OreDictionary.registerOre("gemChalcopyrite",  ItemInit.chalcopyrite_chunk);
		OreDictionary.registerOre("gemCitrine",  ItemInit.citrine_chunk);
		OreDictionary.registerOre("gemJade",  ItemInit.jade_chunk);
		OreDictionary.registerOre("gemJasper",  ItemInit.jasper_chunk);
		OreDictionary.registerOre("gemLabradorite",  ItemInit.labradorite_chunk);
		OreDictionary.registerOre("gemMica",  ItemInit.mica_chunk);
		OreDictionary.registerOre("gemMoonstone",  ItemInit.moonstone_chunk);
		OreDictionary.registerOre("gemRoseQuartz",  ItemInit.rose_quartz_chunk);
		OreDictionary.registerOre("gemSodalite",  ItemInit.sodalite_chunk);
		
		OreDictionary.registerOre("dyeRed", new ItemStack(ItemInit.pulverized_red, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeOrange", new ItemStack(ItemInit.pulverized_orange, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeYellow", new ItemStack(ItemInit.pulverized_yellow, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeLime", new ItemStack(ItemInit.pulverized_lime, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeGreen", new ItemStack(ItemInit.pulverized_green, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeCyan", new ItemStack(ItemInit.pulverized_cyan, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeLightBlue", new ItemStack(ItemInit.pulverized_light_blue, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeBlue", new ItemStack(ItemInit.pulverized_blue, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyePurple", new ItemStack(ItemInit.pulverized_purple, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeMagenta", new ItemStack(ItemInit.pulverized_magenta, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyePink", new ItemStack(ItemInit.pulverized_pink, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeWhite", new ItemStack(ItemInit.pulverized_white, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeLightGray", new ItemStack(ItemInit.pulverized_light_gray, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeRedGray", new ItemStack(ItemInit.pulverized_gray, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeBlack", new ItemStack(ItemInit.pulverized_black, 1, WILDCARD_VALUE));
		OreDictionary.registerOre("dyeBrown", new ItemStack(ItemInit.pulverized_brown, 1, WILDCARD_VALUE));
		

}
	
}