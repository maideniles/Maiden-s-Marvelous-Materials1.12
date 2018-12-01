package com.maideniles.maidensmaterials.init.blocks;
import java.util.Random;

import com.maideniles.maidensmaterials.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class CustomBlockGrass extends BlockGrass
{
	public CustomBlockGrass(String name, Material material)
	{
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(0.6F);
		setSoundType(SoundType.GROUND);
		BlockInit.GRASS.add(BlockInit.ornamental_grass);
		
		
	}
	

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
			IPlantable plantable) {
		// TODO Auto-generated method stub
		return true;
	}
	
	 public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        Block block = worldIn.getBlockState(pos.up()).getBlock();
	        return state.withProperty(SNOWY, Boolean.valueOf(block == Blocks.SNOW || block == Blocks.SNOW_LAYER));
	    }

	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            if (!worldIn.isAreaLoaded(pos, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
	            if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2)
	            {
	                worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
	            }
	            else
	            {
	                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
	                {
	                    for (int i = 0; i < 4; ++i)
	                    {
	                        BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

	                        if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos))
	                        {
	                            return;
	                        }

	                        IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
	                        IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

	                        if (iblockstate1.getBlock() == Blocks.DIRT && iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(worldIn, pos.up()) <= 2)
	                        {
	                            worldIn.setBlockState(blockpos, BlockInit.ornamental_grass.getDefaultState());
	                        }
	                    }
	                }
	            }
	        }
	    }
	
	@Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
    super.getDrops(drops, world, pos, state, 3);
    
    drops.clear();
    drops.add(new ItemStack(Item.getItemFromBlock(Blocks.DIRT)));
    }
	
	@Override
	protected boolean canSilkHarvest() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		// TODO Auto-generated method stub
		return new ItemStack(Item.getItemFromBlock(Blocks.DIRT));
	}
}