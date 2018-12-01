package com.maideniles.maidensmaterials.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockGemTile extends Block{

	public BlockGemTile(String name,Material materialIn) {
		super(Material.CLAY);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Blocks.AIR);
	}
	
	@Override
	protected boolean canSilkHarvest() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		// TODO Auto-generated method stub
		return new ItemStack(Item.getItemFromBlock(this));
	}
}
