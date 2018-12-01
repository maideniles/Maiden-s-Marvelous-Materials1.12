package com.maideniles.maidensmaterials.init.blocks;

import java.util.Random;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.ItemInit;
import com.maideniles.maidensmaterials.init.items.potions.GathererEvents;
import com.maideniles.maidensmaterials.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
	   
	    if(state.getBlock() == BlockInit.amethyst_ore)
	    {
	    	
	    	drops.add(new ItemStack(ItemInit.amethyst_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }

	  if(state.getBlock() == BlockInit.chalcopyrite_ore)
	  {
		  drops.add(new ItemStack(ItemInit.chalcopyrite_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	   
	  if(state.getBlock() == BlockInit.jade_ore)
	  {
		  drops.add(new ItemStack(ItemInit.jade_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	    
	  if(state.getBlock() == BlockInit.jasper_ore)
	  {
		  drops.add(new ItemStack(ItemInit.jasper_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	  
	  if(state.getBlock() == BlockInit.labradorite_ore)
	  {
		  drops.add(new ItemStack(ItemInit.labradorite_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	  }
	  
	    if(state.getBlock() == BlockInit.mica_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.mica_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == BlockInit.moonstone_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.moonstone_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == BlockInit.rose_quartz_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.rose_quartz_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == BlockInit.sodalite_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.sodalite_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == BlockInit.aventurine_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.aventurine_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == BlockInit.carnelian_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.carnelian_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
	    }
	    
	    if(state.getBlock() == BlockInit.citrine_ore)
	    {
	    	drops.add(new ItemStack(ItemInit.citrine_chunk, 3 + MaidensMaterials.RANDOM.nextInt(3)));
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