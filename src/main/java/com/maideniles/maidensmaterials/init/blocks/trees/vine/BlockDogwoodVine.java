package com.maideniles.maidensmaterials.init.blocks.trees.vine;

import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDogwoodVine extends BlockVine {
	
	public BlockDogwoodVine(String name){
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	
	private boolean canAttachVineOn(IBlockState state)
    {
        return state.isFullCube() && state.getMaterial().blocksMovement();
    }
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if(ConfigHandler.DOGWOOD_VINES_GROW){
		
		// TODO Auto-generated method stub
		super.updateTick(worldIn, pos, state, rand);
		}
	}
}
