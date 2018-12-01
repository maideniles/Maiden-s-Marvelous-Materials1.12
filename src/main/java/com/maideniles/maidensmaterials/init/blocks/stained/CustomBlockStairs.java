package com.maideniles.maidensmaterials.init.blocks.stained;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class CustomBlockStairs extends BlockStairs 
{

	
	public CustomBlockStairs(String name, IBlockState defaultState) {
		
		super(defaultState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
	}

}