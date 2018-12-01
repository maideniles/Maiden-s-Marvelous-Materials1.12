package com.maideniles.maidensmaterials.init.blocks;



import java.util.Random;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockGemStorage extends Block{

	public BlockGemStorage(String name,Material materialIn) {
		super(Material.CLAY);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2.0F);
		
		
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(this);
	}
	
	@Override
	protected boolean canSilkHarvest() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}