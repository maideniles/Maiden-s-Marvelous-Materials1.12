package com.maideniles.maidensmaterials.config;

import java.io.File;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler
{
	public static Configuration config;
	
	//BOOK SPAWN//
	public static boolean BOOK_SPAWN = true;
	
	//BIOME WEIGHT//
	public static int ORNAMENTAL_FOREST_BIOME_WEIGHT = 5;
	
	//ORES//
	public static int AMETHYST_ORE_GEN_CHANCE =5;
	public static int AMETHYST_ORE_Y_MIN =10;
	public static int AMETHYST_ORE_Y_MAX =51;
	public static int AMETHYST_ORE_SIZE =9;

	public static int AVENTURINE_ORE_GEN_CHANCE =6;
	public static int AVENTURINE_ORE_Y_MIN =11;
	public static int AVENTURINE_ORE_Y_MAX =47;
	public static int AVENTURINE_ORE_SIZE =8;
	
	public static int CARNELIAN_ORE_GEN_CHANCE =4;
	public static int CARNELIAN_ORE_Y_MIN =9;
	public static int CARNELIAN_ORE_Y_MAX =45;
	public static int CARNELIAN_ORE_SIZE =9;
	
	public static int CHALCOPYRITE_ORE_GEN_CHANCE =6;
	public static int CHALCOPYRITE_ORE_Y_MIN =10;
	public static int CHALCOPYRITE_ORE_Y_MAX =46;
	public static int CHALCOPYRITE_ORE_SIZE =7;
	
	public static int CITRINE_ORE_GEN_CHANCE =7;
	public static int CITRINE_ORE_Y_MIN =11;
	public static int CITRINE_ORE_Y_MAX =50;
	public static int CITRINE_ORE_SIZE =8;
		
	public static int JADE_ORE_GEN_CHANCE =7;
	public static int JADE_ORE_Y_MIN =9;
	public static int JADE_ORE_Y_MAX =48;
	public static int JADE_ORE_SIZE =9;
		
	public static int JASPER_ORE_GEN_CHANCE =8;
	public static int JASPER_ORE_Y_MIN =11;
	public static int JASPER_ORE_Y_MAX =46;
	public static int JASPER_ORE_SIZE =7;

	public static int LABRADORITE_ORE_GEN_CHANCE =9;
	public static int LABRADORITE_ORE_Y_MIN =9;
	public static int LABRADORITE_ORE_Y_MAX =45;
	public static int LABRADORITE_ORE_SIZE =7;
	
	public static int MICA_ORE_GEN_CHANCE =12;
	public static int MICA_ORE_Y_MIN =10;
	public static int MICA_ORE_Y_MAX =55;
	public static int MICA_ORE_SIZE =9;
	
	public static int MOONSTONE_ORE_GEN_CHANCE =8;
	public static int MOONSTONE_ORE_Y_MIN =10;
	public static int MOONSTONE_ORE_Y_MAX =43;
	public static int MOONSTONE_ORE_SIZE =9;
	
	public static int ROSE_QUARTZ_ORE_GEN_CHANCE =7;
	public static int ROSE_QUARTZ_ORE_Y_MIN =11;
	public static int ROSE_QUARTZ_ORE_Y_MAX =51;
	public static int ROSE_QUARTZ_ORE_SIZE =8;

	public static int SODALITE_ORE_GEN_CHANCE = 6;
	public static int SODALITE_ORE_Y_MIN = 10;
	public static int SODALITE_ORE_Y_MAX = 49;
	public static int SODALITE_ORE_SIZE = 7;
	
	//SPAWN TREES WITH VINES//
	public static boolean FOREST_SPAWN_CRABAPPLE_WITH_VINES = false;
	public static boolean FOREST_SPAWN_DOGWOOD_WITH_VINES = false;
	public static boolean FOREST_SPAWN_JACARANDA_WITH_VINES = false;
	public static boolean FOREST_SPAWN_LABURNUM_WITH_VINES = false;
	public static boolean FOREST_SPAWN_PAULOWNIA_WITH_VINES = true;
	public static boolean FOREST_SPAWN_SILVERBELL_WITH_VINES = true;
	public static boolean FOREST_SPAWN_WISTERIA_WITH_VINES = true;
	
	//VINES//
	public static boolean CRABAPPLE_VINES_GROW = true;
	public static boolean DOGWOOD_VINES_GROW = true;
	public static boolean JACARANDA_VINES_GROW = true;
	public static boolean LABURNUM_VINES_GROW = true;
	public static boolean PAULOWNIA_VINES_GROW = true;
	public static boolean SILVERBELL_VINES_GROW = true;
	public static boolean WISTERIA_VINES_GROW = true;

	
	
	
	
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		
		
		category = "Ornamental Forest Biome Chance";
		config.addCustomCategoryComment(category, "Set Ornamental Forest Biome Rarity");
		ORNAMENTAL_FOREST_BIOME_WEIGHT = config.getInt("Ornamental Forest Biome Chance", category, 5, 1, 100, "Ornamental Forest Biome Chance");
		
		category = "Amethyst Ore Gen";
		config.addCustomCategoryComment(category, "Set Amethyst Ore Generation");
		AMETHYST_ORE_GEN_CHANCE = config.getInt("Amethyst Ore Gen Chance", category, 5, 0, 60, "Amethyst Ore Gen Chance");
        AMETHYST_ORE_Y_MIN = config.getInt("Amethyst Ore Minimim Height", category, 10, 0, 200, "Amethyst Ore Minimum Height");
        AMETHYST_ORE_Y_MAX = config.getInt("Amethyst Ore Maximum Height", category, 51, 0, 200, "Amethyst Ore Maximum Height");
        AMETHYST_ORE_SIZE = config.getInt("Amethyst Ore Size", category, 9, 0, 20, "Amethyst Ore Vein Size");
        
        
        category = "Aventurine Ore Gen";
        config.addCustomCategoryComment(category, "Set Aventurine Ore Generation");
        AVENTURINE_ORE_GEN_CHANCE = config.getInt("Aventurine Ore Gen Chance", category, 6, 0, 50, "Aventurine Ore Gen Chance");
        AVENTURINE_ORE_Y_MIN = config.getInt("Aventurine Ore Minimim Height", category, 11, 0, 200, "Aventurine Ore Minimum Height");
        AVENTURINE_ORE_Y_MAX = config.getInt("Aventurine Ore Maximum Height", category, 47, 0, 200, "Aventurine Ore Maximum Height");
        AVENTURINE_ORE_SIZE = config.getInt("Aventurine Ore Size", category, 8, 0, 20, "Aventurine Ore Vein Size");
        
        category = "Carnelian Ore Gen";
        config.addCustomCategoryComment(category, "Set Carnelian Ore Generation");
        CARNELIAN_ORE_GEN_CHANCE = config.getInt("Carnelian Ore Gen Chance", category, 4, 0, 50, "Carnelian Ore Gen Chance");
        CARNELIAN_ORE_Y_MIN = config.getInt("Carnelian Ore Minimim Height", category, 9, 0, 200, "Carnelian Ore Minimum Height");
        CARNELIAN_ORE_Y_MAX = config.getInt("Carnelian Ore Maximum Height", category, 45, 0, 200, "Carnelian Ore Maximum Height");
        CARNELIAN_ORE_SIZE = config.getInt("Carnelian Ore Size", category, 9, 0, 100, "Carnelian Ore Vein Size");
        
        category = "Chalcopyrite Ore Gen";
        config.addCustomCategoryComment(category, "Set Chalcopyrite Ore Generation");
        CHALCOPYRITE_ORE_GEN_CHANCE = config.getInt("Chalcopyrite Ore Gen Chance", category, 6, 0, 50, "Chalcopyrite Ore Gen Chance");
        CHALCOPYRITE_ORE_Y_MIN = config.getInt("Chalcopyrite Ore Minimim Height", category, 10, 0, 200, "Chalcopyrite Ore Minimum Height");
        CHALCOPYRITE_ORE_Y_MAX = config.getInt("Chalcopyrite Ore Maximum Height", category, 46, 0, 200, "Chalcopyrite Ore Maximum Height");
        CHALCOPYRITE_ORE_SIZE = config.getInt("Chalcopyrite Ore Size", category, 7, 0, 100, "Chalcopyrite Ore Vein Size");
        
        category = "Citrine Ore Gen";
        config.addCustomCategoryComment(category, "Set Citrine Ore Generation");
        CITRINE_ORE_GEN_CHANCE = config.getInt("Citrine Ore Gen Chance", category, 7, 0, 50, "Citrine Ore Gen Chance");
        CITRINE_ORE_Y_MIN = config.getInt("Citrine Ore Minimim Height", category, 11, 0, 200, "Citrine Ore Minimum Height");
        CITRINE_ORE_Y_MAX = config.getInt("Citrine Ore Maximum Height", category, 50, 0, 200, "Citrine Ore Maximum Height");
        CITRINE_ORE_SIZE = config.getInt("Citrine Ore Size", category, 8, 0, 100, "Citrine Ore Vein Size");
        
        category = "Jade Ore Gen";
        config.addCustomCategoryComment(category, "Set Jade Ore Generation");
        JADE_ORE_GEN_CHANCE = config.getInt("Jade Ore Gen Chance", category, 7, 0, 50, "Jade Ore Gen Chance");
        JADE_ORE_Y_MIN = config.getInt("Jade Ore Minimim Height", category, 9, 0, 200, "Jade Ore Minimum Height");
        JADE_ORE_Y_MAX = config.getInt("Jade Ore Maximum Height", category, 48, 0, 200, "Jade Ore Maximum Height");
        JADE_ORE_SIZE = config.getInt("Jade Ore Size", category, 9, 0, 100, "Jade Ore Vein Size");
        
        category = "Jasper Ore Gen";
        config.addCustomCategoryComment(category, "Set Jasper Ore Generation");
        JASPER_ORE_GEN_CHANCE = config.getInt("Jasper Ore Gen Chance", category, 8, 0, 50, "Jasper Ore Gen Chance");
        JASPER_ORE_Y_MIN = config.getInt("Jasper Ore Minimim Height", category, 11, 0, 200, "Jasper Ore Minimum Height");
        JASPER_ORE_Y_MAX = config.getInt("Jasper Ore Maximum Height", category, 46, 0, 200, "Jasper Ore Maximum Height");
        JASPER_ORE_SIZE = config.getInt("Jasper Ore Size", category, 7, 0, 100, "Jasper Ore Vein Size");
        
        category = "Labradorite Ore Gen";
        config.addCustomCategoryComment(category, "Set Labradorite Ore Generation");
        LABRADORITE_ORE_GEN_CHANCE = config.getInt("Labradorite Ore Gen Chance", category, 9, 0, 50, "Labradorite Ore Gen Chance");
        LABRADORITE_ORE_Y_MIN = config.getInt("Labradorite Ore Minimim Height", category, 9, 0, 200, "Labradorite Ore Minimum Height");
        LABRADORITE_ORE_Y_MAX = config.getInt("Labradorite Ore Maximum Height", category, 45, 0, 200, "Labradorite Ore Maximum Height");
        LABRADORITE_ORE_SIZE = config.getInt("Labradorite Ore Size", category, 7, 0, 100, "Labradorite Ore Vein Size");
        
        category = "Mica Ore Gen";
        config.addCustomCategoryComment(category, "Set Mica Ore Generation");
        MICA_ORE_GEN_CHANCE = config.getInt("Mica Ore Gen Chance", category, 12, 0, 50, "Mica Ore Gen Chance");
        MICA_ORE_Y_MIN = config.getInt("Mica Ore Minimim Height", category, 10, 0, 200, "Mica Ore Minimum Height");
        MICA_ORE_Y_MAX = config.getInt("Mica Ore Maximum Height", category, 55, 0, 200, "Mica Ore Maximum Height");
        MICA_ORE_SIZE = config.getInt("Mica Ore Size", category, 9, 0, 100, "Mica Ore Vein Size");
        
        category = "Moonstone Ore Gen";
        config.addCustomCategoryComment(category, "Set Moonstone Ore Generation");
        MOONSTONE_ORE_GEN_CHANCE = config.getInt("Moonstone Ore Gen Chance", category, 8, 0, 50, "Moonstone Ore Gen Chance");
        MOONSTONE_ORE_Y_MIN = config.getInt("Moonstone Ore Minimim Height", category, 10, 0, 200, "Moonstone Ore Minimum Height");
        MOONSTONE_ORE_Y_MAX = config.getInt("Moonstone Ore Maximum Height", category, 43, 0, 200, "Moonstone Ore Maximum Height");
        MOONSTONE_ORE_SIZE = config.getInt("Moonstone Ore Size", category, 9, 0, 100, "Moonstone Ore Vein Size");
        
        category = "Rose Quartz Ore Gen";
        config.addCustomCategoryComment(category, "Set Rose Quartz Ore Generation");
        ROSE_QUARTZ_ORE_GEN_CHANCE = config.getInt("Rose Quartz Ore Gen Chance", category, 7, 0, 50, "Rose Quartz Ore Gen Chance");
        ROSE_QUARTZ_ORE_Y_MIN = config.getInt("Rose Quartz Ore Minimim Height", category, 11, 0, 200, "Rose Quartz Ore Minimum Height");
        ROSE_QUARTZ_ORE_Y_MAX = config.getInt("Rose Quartz Ore Maximum Height", category, 51, 0, 200, "Rose Quartz Ore Maximum Height");
        ROSE_QUARTZ_ORE_SIZE = config.getInt("Rose Quartz Ore Size", category, 8, 0, 100, "Rose Quartz Ore Vein Size");
        
        category = "Sodalite Ore Gen";
        config.addCustomCategoryComment(category, "Set Sodalite Ore Generation");
        SODALITE_ORE_GEN_CHANCE = config.getInt("Sodalite Ore Gen Chance", category, 6, 0, 50, "Sodalite Ore Gen Chance");
        SODALITE_ORE_Y_MIN = config.getInt("Sodalite Ore Minimim Height", category, 10, 0, 100, "Sodalite Ore Minimum Height");
        SODALITE_ORE_Y_MAX = config.getInt("Sodalite Ore Maximum Height", category, 49, 0, 100, "Sodalite Ore Maximum Height");
        SODALITE_ORE_SIZE = config.getInt("Sodalite Ore Size", category, 7, 0, 100, "Sodalite Ore Vein Size");
        
        category = "Spawn Guidebook into Inventory";
		config.addCustomCategoryComment(category, "Spawn Guidebook into Inventory");
		BOOK_SPAWN = config.getBoolean("Spawn GuideBook into Inventory", category, true, "Guide Book Spawns in Inventory");
        
        category = "Spawn Flowering Trees with vines in Ornamental Forest";
		config.addCustomCategoryComment(category, "Control which trees in the Ornamental Forest spawn with vines");
                
		FOREST_SPAWN_CRABAPPLE_WITH_VINES = config.getBoolean("Spawn Crabapple with Vines", category, false, "Make Crabapple trees grow Vines");
		FOREST_SPAWN_DOGWOOD_WITH_VINES = config.getBoolean("Spawn Dogwood with Vines", category, false, "Make Dogwood trees grow Vines");
		FOREST_SPAWN_JACARANDA_WITH_VINES = config.getBoolean("Spawn Jacaranda with Vines", category, false, "Make Jacaranda trees grow Vines");
		FOREST_SPAWN_LABURNUM_WITH_VINES = config.getBoolean("Spawn Laburnum with Vines", category, false, "Make Laburnum trees grow Vines");
		FOREST_SPAWN_PAULOWNIA_WITH_VINES = config.getBoolean("Spawn Paulownia with Vines", category, true, "Make Paulownia trees grow Vines");
		FOREST_SPAWN_SILVERBELL_WITH_VINES = config.getBoolean("Spawn Silverbell with Vines", category, true, "Make Silverbell trees grow Vines");
		FOREST_SPAWN_WISTERIA_WITH_VINES = config.getBoolean("Spawn Wisteria with Vines", category, true, "Make Wisteria trees grow Vines");
		
        category = "Vine Growth Ornamental Forest";
		config.addCustomCategoryComment(category, "Control Vine Growth in the Ornamental Forest");
		
		CRABAPPLE_VINES_GROW = config.getBoolean("Crabapple Vines Grow", category, true, "Crabapple Vines Grow");
		DOGWOOD_VINES_GROW = config.getBoolean("Dogwood Vines Grow", category, true, "Dogwood Vines Grow");
		JACARANDA_VINES_GROW = config.getBoolean("Jacaranda Vines Grow", category, true, "Jacaranda Vines Grow");
		LABURNUM_VINES_GROW = config.getBoolean("Laburnum Vines Grow", category, true, "Laburnum Vines Grow");
		PAULOWNIA_VINES_GROW = config.getBoolean("Paulownia Vines Grow", category, true, "Paulownia Vines Grow");
		SILVERBELL_VINES_GROW = config.getBoolean("SilverBell Vines Grow", category, true, "SilverBell Vines Grow");
		WISTERIA_VINES_GROW = config.getBoolean("Wisteria Vines Grow", category, true, "Wisteria Vines Grow");
		
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		MaidensMaterials.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		MaidensMaterials.config.mkdirs();
		init(new File(MaidensMaterials.config.getPath(), Reference.MODID + ".cfg"));
	}
	
}
