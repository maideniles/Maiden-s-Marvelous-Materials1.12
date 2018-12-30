package com.maideniles.maidensmaterials.init.blocks.stained;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class CustomBlockStairs extends BlockStairs 
{

	
	public CustomBlockStairs(String name, IBlockState defaultState) {
		
		super(defaultState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setHardness(1.0F);
		setHarvestLevel("axe", 0);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

}