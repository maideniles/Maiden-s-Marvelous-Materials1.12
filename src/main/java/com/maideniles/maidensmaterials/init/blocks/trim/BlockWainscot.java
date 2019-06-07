package com.maideniles.maidensmaterials.init.blocks.trim;


import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.init.blocks.base.BlockFinishingsBase;
import com.maideniles.maidensmaterials.util.BlockStateHandler;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockWainscot extends BlockFinishingsBase
{
	public static final PropertyEnum TYPE = PropertyEnum.create("type", SectionType.class);
	

	public BlockWainscot(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(TYPE, SectionType.NORMAL));
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		if (BlockStateHandler.getBlock(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.DOWN) instanceof BlockWainscot)
		{
			if (BlockStateHandler.getRotation(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.DOWN) == BlockStateHandler.Direction.LEFT)
			{
				return state.withProperty(TYPE, SectionType.CORNER_LEFT);
			}
			else if (BlockStateHandler.getRotation(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.DOWN) == BlockStateHandler.Direction.RIGHT)
			{
				return state.withProperty(TYPE, SectionType.CORNER_RIGHT);
			}
		}
		if (BlockStateHandler.getBlock(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.UP) instanceof BlockWainscot)
		{
			if (BlockStateHandler.getRotation(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.UP) == BlockStateHandler.Direction.LEFT && !(BlockStateHandler.getBlock(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.LEFT) instanceof BlockWainscot))
			{
				return state.withProperty(TYPE, SectionType.INNER_RIGHT);
			}
			else if (BlockStateHandler.getRotation(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.UP) == BlockStateHandler.Direction.RIGHT && !(BlockStateHandler.getBlock(world, pos, (EnumFacing) state.getValue(FACING), BlockStateHandler.Direction.RIGHT) instanceof BlockWainscot))
			{
				return state.withProperty(TYPE, SectionType.INNER_LEFT);
			}
		}
		return state.withProperty(TYPE, SectionType.NORMAL);
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] { FACING, TYPE });
	}

	public static enum SectionType implements IStringSerializable
	{
		NORMAL, CORNER_LEFT, CORNER_RIGHT, INNER_LEFT, INNER_RIGHT;

		@Override
		public String getName()
		{
			return this.toString().toLowerCase();
		}

	}
	
	
}