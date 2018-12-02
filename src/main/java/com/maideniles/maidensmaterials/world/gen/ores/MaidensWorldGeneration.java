package com.maideniles.maidensmaterials.world.gen.ores;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.MaidensBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MaidensWorldGeneration implements IWorldGenerator{
	
	private static List<MaidensGeneratedOre> ores = Lists.newArrayList();
	
	public MaidensWorldGeneration() {
		ores.add(new MaidensGeneratedOre(MaidensBlocks.moonstone_ore, ConfigHandler.MOONSTONE_ORE_GEN_CHANCE, ConfigHandler.MOONSTONE_ORE_Y_MIN, ConfigHandler.MOONSTONE_ORE_Y_MAX, ConfigHandler.MOONSTONE_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.amethyst_ore, ConfigHandler.AMETHYST_ORE_GEN_CHANCE, ConfigHandler.AMETHYST_ORE_Y_MIN, ConfigHandler.AMETHYST_ORE_Y_MAX, ConfigHandler.AMETHYST_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.aventurine_ore, ConfigHandler.AVENTURINE_ORE_GEN_CHANCE, ConfigHandler.AVENTURINE_ORE_Y_MIN, ConfigHandler.AVENTURINE_ORE_Y_MAX, ConfigHandler.AVENTURINE_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.carnelian_ore, ConfigHandler.CARNELIAN_ORE_GEN_CHANCE, ConfigHandler.CARNELIAN_ORE_Y_MIN, ConfigHandler.CARNELIAN_ORE_Y_MAX, ConfigHandler.CARNELIAN_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.citrine_ore, ConfigHandler.CITRINE_ORE_GEN_CHANCE, ConfigHandler.CITRINE_ORE_Y_MIN, ConfigHandler.CITRINE_ORE_Y_MAX, ConfigHandler.CITRINE_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.chalcopyrite_ore, ConfigHandler.CHALCOPYRITE_ORE_GEN_CHANCE, ConfigHandler.CHALCOPYRITE_ORE_Y_MIN, ConfigHandler.CHALCOPYRITE_ORE_Y_MAX, ConfigHandler.CHALCOPYRITE_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.sodalite_ore, ConfigHandler.SODALITE_ORE_GEN_CHANCE, ConfigHandler.SODALITE_ORE_Y_MIN, ConfigHandler.SODALITE_ORE_Y_MAX, ConfigHandler.SODALITE_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.mica_ore, ConfigHandler.MICA_ORE_GEN_CHANCE, ConfigHandler.MICA_ORE_Y_MIN, ConfigHandler.MICA_ORE_Y_MAX, ConfigHandler.MICA_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.labradorite_ore, ConfigHandler.LABRADORITE_ORE_GEN_CHANCE, ConfigHandler.LABRADORITE_ORE_Y_MIN, ConfigHandler.LABRADORITE_ORE_Y_MAX, ConfigHandler.LABRADORITE_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.jasper_ore, ConfigHandler.JASPER_ORE_GEN_CHANCE, ConfigHandler.JASPER_ORE_Y_MIN, ConfigHandler.JASPER_ORE_Y_MAX, ConfigHandler.JASPER_ORE_SIZE));
		ores.add(new MaidensGeneratedOre(MaidensBlocks.jade_ore, ConfigHandler.JADE_ORE_GEN_CHANCE, ConfigHandler.JADE_ORE_Y_MIN, ConfigHandler.JADE_ORE_Y_MAX, ConfigHandler.JADE_ORE_SIZE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			for(MaidensGeneratedOre f : ores) {
				runGenerator(f.getWorldGenerator(), world, random, chunkX, chunkZ, f.getChance(), f.getyMin(), f.getyMax());
			}
			break;
		case 1:
			
			break;
		case -1:
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	public static void register(){
		GameRegistry.registerWorldGenerator(new MaidensWorldGeneration(), 0);
	}
}