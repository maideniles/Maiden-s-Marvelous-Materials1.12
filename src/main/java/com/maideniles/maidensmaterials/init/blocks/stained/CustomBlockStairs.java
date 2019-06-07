package com.maideniles.maidensmaterials.init.blocks.stained;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomBlockStairs extends BlockStairs 
{

	
	public CustomBlockStairs(String name, IBlockState defaultState) {
		
		super(defaultState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setHardness(1.0F);
		setHarvestLevel("axe", 0);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	 @Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		// TODO Auto-generated method stub
		return BlockFaceShape.UNDEFINED;
	}
	 
	 @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }
}