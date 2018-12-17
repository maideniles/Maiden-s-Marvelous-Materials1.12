package com.maideniles.maidensmaterials.init.blocks;

import java.util.Random;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CustomOre extends Block 
{
	public CustomOre(String name) 
	{
		super(Material.ROCK);
		
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(2.0F);
		setResistance(4.0F);
		setHarvestLevel("pickaxe", 2);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		 
		
		
	}
	
	public int quantityDropped(Random random)
    {
        return 3 + random.nextInt(1);
    }
	
	  @Override
	    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	    {
	    super.getDrops(drops, world, pos, state, 3);
	    
	    drops.clear();
	   
	    if(state.getBlock() == MaidensBlocks.amethyst_ore)
	    {
	    	
	    	drops.add(new ItemStack(MaidensItems.amethyst_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }

	  if(state.getBlock() == MaidensBlocks.chalcopyrite_ore)
	  {
		  drops.add(new ItemStack(MaidensItems.chalcopyrite_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	   
	  if(state.getBlock() == MaidensBlocks.jade_ore)
	  {
		  drops.add(new ItemStack(MaidensItems.jade_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	    
	  if(state.getBlock() == MaidensBlocks.jasper_ore)
	  {
		  drops.add(new ItemStack(MaidensItems.jasper_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	  
	  if(state.getBlock() == MaidensBlocks.labradorite_ore)
	  {
		  drops.add(new ItemStack(MaidensItems.labradorite_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	  
	    if(state.getBlock() == MaidensBlocks.mica_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.mica_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == MaidensBlocks.moonstone_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.moonstone_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == MaidensBlocks.rose_quartz_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.rose_quartz_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == MaidensBlocks.sodalite_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.sodalite_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == MaidensBlocks.aventurine_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.aventurine_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == MaidensBlocks.carnelian_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.carnelian_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == MaidensBlocks.citrine_ore)
	    {
	    	drops.add(new ItemStack(MaidensItems.citrine_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	   
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
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		int i = 0;

        
            return MathHelper.getInt(rand, 0, 2);
	}
}