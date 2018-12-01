package com.maideniles.maidensmaterials.init.blocks.stained;

import com.maideniles.maidensmaterials.Reference;
import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCustomButton extends BlockButton{

	public BlockCustomButton(String name) {
		super(false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2.0F);
		setResistance(20);
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
