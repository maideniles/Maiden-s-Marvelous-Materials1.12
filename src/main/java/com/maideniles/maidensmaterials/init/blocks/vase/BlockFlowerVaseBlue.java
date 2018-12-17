package com.maideniles.maidensmaterials.init.blocks.vase;

import java.util.Random;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class BlockFlowerVaseBlue extends Block{
	
	protected static final AxisAlignedBB VASE_AABB = new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D);
	
	public static final Item[] FLOWERS = {
		    MaidensItems.crabapple_blossoms, MaidensItems.dogwood_blossoms, MaidensItems.jacaranda_blossoms, MaidensItems.laburnum_blossoms, 
		    MaidensItems.paulownia_blossoms, MaidensItems.silverbell_blossoms, MaidensItems.wisteria_blossoms};
	public static final PropertyInteger FLOWER = PropertyInteger.create("flower", 0, FLOWERS.length);
	
	public BlockFlowerVaseBlue(String name, Material materialIn) {
		super(Material.CLAY);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setDefaultState(this.getDefaultState().withProperty(FLOWER, 0));
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return VASE_AABB;
    }
	
	public static int getIDFromFlower(Item flower){
	    for (int i = 0; i < FLOWERS.length; i++) {
	        if (FLOWERS[i] == flower) {
	             return i + 1;
	        }
	    }
	    return 0;
	}
	 
	public static Item getFlowerFromID(int id) {
        return (id == 0) ? null : FLOWERS[id - 1];
}
	 
	 @Override
	 public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
	         return this.getDefaultState().withProperty(FLOWER, 0);
	 }
	 
	 @Override
	 public BlockStateContainer createBlockState() {
	         return new BlockStateContainer(this, FLOWER);
	 }
	 
	 @Override
	 public int getMetaFromState(IBlockState state) {
	         return state.getValue(FLOWER).intValue();
	 }

	 @Override
	 public IBlockState getStateFromMeta(int meta) {
	         return getDefaultState().withProperty(FLOWER, meta);
	 }
	 
	 @Override
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
	          int flower = state.getValue(FLOWER).intValue();
	          if (flower != 0) {
	              if (!worldIn.isRemote) {
	              EntityItem entityItem = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack((getFlowerFromID(flower))));
	      entityItem.setNoPickupDelay();
	      worldIn.spawnEntity(entityItem);
	              }
	      worldIn.setBlockState(pos, this.getDefaultState());
	          } else {
	              ItemStack stack = playerIn.getHeldItem(hand);
	              int id = getIDFromFlower(stack.getItem());
	              if (id != 0) {
	                  stack.shrink(1);
	                  System.out.println(id);
	                  worldIn.setBlockState(pos, getDefaultState().withProperty(FLOWER, id));
	              }
	          }
	         return true;
	 }
	 
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Item.getItemFromBlock(MaidensBlocks.vase_blue);
	    }
	 
	 @Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
				EntityPlayer player) {
			// TODO Auto-generated method stub
			return new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_blue));
		}
	 
		@Override
		public boolean isFullCube(IBlockState state) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isOpaqueCube(IBlockState state) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }
		
		@Override
		public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,
				EnumFacing side) {
			// TODO Auto-generated method stub
			return true;
		}
}
