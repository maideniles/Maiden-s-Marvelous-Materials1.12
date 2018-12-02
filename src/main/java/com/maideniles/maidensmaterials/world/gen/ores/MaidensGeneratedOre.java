package com.maideniles.maidensmaterials.world.gen.ores;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.MaidensBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class MaidensGeneratedOre {
	
	private Block block;
	private int chance, yMin, yMax, size;
	private WorldGenerator gen;
	
	public MaidensGeneratedOre(Block block, int chance, int yMin, int yMax, int size) {
		this.block = block;
		this.chance = chance;
		this.yMin = yMin;
		this.yMax = yMax;
		this.gen = new WorldGenMinable(block.getDefaultState(), size);
	}

	public int getSize() {
		return size;
	}
	
	public WorldGenerator getWorldGenerator() {
		return gen;
	}
	
	public Block getBlock() {
		return block;
	}

	public int getChance() {
		return chance;
	}

	public int getyMin() {
		return yMin;
	}

	public int getyMax() {
		return yMax;
	}

}
