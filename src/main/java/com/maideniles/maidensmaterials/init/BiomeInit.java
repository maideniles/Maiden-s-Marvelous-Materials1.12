package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.world.biome.BiomeOrnamentalForest;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {
	
	public static final Biome ORNAMENTAL_FOREST = new BiomeOrnamentalForest();
	

	public static void registerBiomes(){
		
		InitBiome(ORNAMENTAL_FOREST, "ornamental_forest", BiomeType.WARM, Type.FOREST, Type.MAGICAL, Type.LUSH, Type.RIVER);
	}
	
	private static Biome InitBiome(Biome biome, String name, BiomeType biomeType, Type... types){
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType,  new BiomeEntry(biome, ConfigHandler.ORNAMENTAL_FOREST_BIOME_WEIGHT));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}
}
