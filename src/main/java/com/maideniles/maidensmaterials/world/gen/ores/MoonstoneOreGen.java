package com.maideniles.maidensmaterials.world.gen.ores;

import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MoonstoneOreGen implements IWorldGenerator
{
	private WorldGenerator moonstone_ore, nether, end;
	
	public MoonstoneOreGen() 
	{
		moonstone_ore = new WorldGenMinable(BlockInit.moonstone_ore.getDefaultState(), 9);
		nether = new WorldGenMinable(BlockInit.moonstone_ore_nether.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		end = new WorldGenMinable(BlockInit.moonstone_ore_end.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(moonstone_ore, world, random, chunkX, chunkZ, ConfigHandler.MOONSTONE_ORE_GEN_CHANCE, ConfigHandler.MOONSTONE_ORE_Y_MIN, ConfigHandler.MOONSTONE_ORE_Y_MAX);
			
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
	
	public static void register()
	{
		GameRegistry.registerWorldGenerator(new MoonstoneOreGen(), 0);
	}

}