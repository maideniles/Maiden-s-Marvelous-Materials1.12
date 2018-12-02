package com.maideniles.maidensmaterials.init.blocks.trees.sapling;


import java.util.Random;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenJacarandaTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenPaulowniaTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenWisteriaTreeTallVines;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockPaulowniaSapling
  extends BlockBush
  implements IGrowable
{
  private static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
  private static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
  
  public BlockPaulowniaSapling(String name){
	    
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
	    setHardness(0.0F);
	    setTickRandomly(true);
	    setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
  
  public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos)
  {
    return SAPLING_AABB;
  }
  
  public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
  {
    return true;
  }
  
  public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
  {
    return worldIn.rand.nextFloat() < 0.45D;
  }
  
  public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
  {
    grow(worldIn, pos, state, rand);
  }
  
  private void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
  {
    if (((Integer)state.getValue(STAGE)).intValue() == 0) {
      worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
    } else {
      generateTree(worldIn, pos, state, rand);
    }
  }
  
  public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
  {
    if (!TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
      return;
    }
    IBlockState LOG = MaidensBlocks.log_paulownia.getDefaultState();
    IBlockState LEAF = MaidensBlocks.leaves_paulownia.getDefaultState();
    WorldGenerator worldgenerator = new WorldGenPaulowniaTreeTallVines(true);
    
    IBlockState iblockstate2 = Blocks.AIR.getDefaultState();
    worldIn.setBlockState(pos, iblockstate2, 4);
    if (!worldgenerator.generate(worldIn, rand, pos.add(0, 0, 0))) {
      worldIn.setBlockState(pos, state, 4);
    }
  }
  
  public IBlockState getStateFromMeta(int meta)
  {
    return getDefaultState().withProperty(STAGE, Integer.valueOf(0));
  }
  
  public int getMetaFromState(IBlockState state)
  {
    int i = 0;
    i |= ((Integer)state.getValue(STAGE)).intValue();
    return i;
  }
  
  protected BlockStateContainer createBlockState()
  {
    return new BlockStateContainer(this, new IProperty[] { STAGE });
  }
  
  public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
  {
    if (!worldIn.isRemote)
    {
      super.updateTick(worldIn, pos, state, rand);
      if ((worldIn.getLightFromNeighbors(pos.up()) >= 9) && (rand.nextInt(7) == 0)) {
        grow(worldIn, pos, state, rand);
      }
    }
  }
}
