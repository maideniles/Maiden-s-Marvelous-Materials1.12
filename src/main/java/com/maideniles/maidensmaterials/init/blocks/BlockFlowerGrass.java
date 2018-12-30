package com.maideniles.maidensmaterials.init.blocks;

import java.util.Random;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.BlockSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFlowerGrass extends BlockBush {

	protected static final AxisAlignedBB FLOWERS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.01D, 1.0D);

	public BlockFlowerGrass(String name, Material materialIn) {
		super(Material.PLANTS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(0.2F);
		setSoundType(SoundType.PLANT);
		this.setTickRandomly(true);
		MaidensBlocks.BLOCKS_NO_TAB.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return FLOWERS_AABB;
	}

	@Override
	protected boolean canSustainBush(IBlockState state) {
		return false;
	}

	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos) {
		return world.getBlockState(pos).getBlock().isReplaceable(world, pos)
				&& canBlockStay(world, pos, getDefaultState());
	}

	@Override
	public boolean canBlockStay(World world, BlockPos pos, IBlockState state) {
		IBlockState soil = world.getBlockState(pos.down());
		if (world.getBlockState(pos.down()) instanceof BlockGrass || world.getBlockState(pos.down()) instanceof BlockDirt)
				{
			return true;
		}
		if(world.getBlockState(pos.down().add(0,1,0)) instanceof BlockLiquid) {
			return false;
		}
		return super.canBlockStay(world, pos, state);
	}

	@Override
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side) {
		
		return super.canPlaceBlockOnSide(worldIn, pos, side);
	}

	
	
	public int tickRate(World worldIn) {
		return 2;
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (state.getBlock() == MaidensBlocks.WALK_FLOWERS) {

			worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
		}
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.AIR);
	}

	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return face == EnumFacing.DOWN ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED;
	}

	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
}
