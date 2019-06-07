package com.maideniles.maidensmaterials.init.blocks.stained.door.frames;

import javax.annotation.Nullable;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.init.blocks.base.BlockFinishingsBase;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDoorFrameTop extends BlockFinishingsBase{
	
	
	
	protected static final AxisAlignedBB TOP_AABB = new AxisAlignedBB(-0.25D, 0.0D, 0.0D, 1.25D, 0.25D, 0.18D);
	 protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0625D, 0.25D, 1.0D);
	    protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.9375D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
	    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(-0.25D, 0.0D, 0.0D, 1.25D, 0.25D, 0.18D);
	    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.9375D, 1.0D, 0.25D, 1.0D);

	public BlockDoorFrameTop(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	 @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

	 public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	  
			 return TOP_AABB;
}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
	
}
