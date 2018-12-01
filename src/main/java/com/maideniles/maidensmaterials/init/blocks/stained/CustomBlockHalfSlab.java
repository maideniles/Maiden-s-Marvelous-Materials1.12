package com.maideniles.maidensmaterials.init.blocks.stained;

import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class CustomBlockHalfSlab extends CustomBlockSlab
{
	
	
	public CustomBlockHalfSlab(String name, float hardness, float resistance) {

super (name, hardness, resistance);
BlockInit.BLOCKS.add(this);
MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
