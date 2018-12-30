package com.maideniles.maidensmaterials.init.blocks.stained;

import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCustomButton extends BlockButton{

	public BlockCustomButton(String name) {
		super(false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		setResistance(20);
		setHarvestLevel("axe", 0);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	
	
	@Override
	public int tickRate(World worldIn) {
		
		return 15;
	}



	@Override
	protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		
	}



	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		
	}

}
