package com.maideniles.maidensmaterials.init.blocks.stained;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;

public class CustomBlockHalfSlab extends CustomBlockSlab
{
	
	
	public CustomBlockHalfSlab(String name, float hardness, float resistance) {

super (name, hardness, resistance);
	}

	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
