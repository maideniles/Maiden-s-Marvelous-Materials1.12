package com.maideniles.maidensmaterials.init.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Locale;
import java.util.Random;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.init.blocks.base.BlockFinishingsBase;

public class BlockVerticalConnect extends BlockFinishingsBase
{
    public static final PropertyEnum<VerticalType> TYPE = PropertyEnum.create("type", VerticalType.class);

    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);

    public BlockVerticalConnect(String name, Material material)
    {
    	super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName())); 
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, VerticalType.TOP).withProperty(FACING, EnumFacing.NORTH));
      
       
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BOUNDING_BOX;
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        if(world.getBlockState(pos.up()).getBlock() == this)
        {
            return state.withProperty(TYPE, VerticalType.BOTTOM);
        }
        else
        {
            return state.withProperty(TYPE, VerticalType.TOP);
        }
    }

   

    @Override
    public int getMetaFromState(IBlockState state)
    {
    	return state.getValue(TYPE).ordinal() | state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
    	return this.getDefaultState().withProperty(TYPE, VerticalType.values()[meta & 1]).withProperty(FACING, EnumFacing.getHorizontal(meta));
    	
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, TYPE, FACING);
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }

    public enum VerticalType implements IStringSerializable
    {
        TOP,
        BOTTOM;

        @Override
        public String getName()
        {
            return this.toString().toLowerCase(Locale.US);
        }
    }

}