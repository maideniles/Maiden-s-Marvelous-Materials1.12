package com.maideniles.maidensmaterials.init.blocks.stained;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.maideniles.maidensmaterials.init.BlockInit;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CustomBlockDoubleSlab extends CustomBlockSlab
{
	public CustomBlockDoubleSlab(String name, float hardness, float resistance) 
	{
		super(name, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() 
	{
		return true;
	}
	
	
	
}
