package com.maideniles.maidensmaterials.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBrickBlock extends Block{

	public CustomBrickBlock(String name,Material materialIn) {
		super(Material.CLAY);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		
	}

	
	
}