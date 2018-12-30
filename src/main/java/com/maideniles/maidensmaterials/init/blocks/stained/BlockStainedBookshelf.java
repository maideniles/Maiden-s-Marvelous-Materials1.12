package com.maideniles.maidensmaterials.init.blocks.stained;

import java.util.Random;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockBookshelf;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockStainedBookshelf extends BlockBookshelf{
	
	
	public BlockStainedBookshelf(String name, Material materialIn){
	super();
	setUnlocalizedName(name);
	setRegistryName(name);
	setSoundType(SoundType.WOOD);
	setHardness(2.0F);
	setHarvestLevel("axe", 0);
	MaidensBlocks.BLOCKS.add(this);
	MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	 public int quantityDropped(Random random)
	    {
	        return 3;
	    }

	    
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Items.BOOK;
	    }
	    
	    @Override
	    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
	    		EntityPlayer player) {
	    	// TODO Auto-generated method stub
	    	return new ItemStack(Item.getItemFromBlock(this));
	    }
	    
	    @Override
	    public float getEnchantPowerBonus(World world, BlockPos pos) {
	    	// TODO Auto-generated method stub
	    	return 1;
	    }

	    
	   
}
