package com.maideniles.maidensmaterials.init.blocks.trees.log;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockDogwoodLog
  extends BlockLog
{
  public BlockDogwoodLog(String name)
  {
    
    
    setUnlocalizedName(name);
    setRegistryName(name);
    setHarvestLevel("axe", 0);
    setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
	MaidensBlocks.BLOCKS.add(this);
	MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));  
  }



        /**
         * Convert the given metadata into a BlockState for this Block.
         *
         * @param meta the meta
         * @return the state from meta
         */
        @Override
        public IBlockState getStateFromMeta(int meta)
        {
            IBlockState state = this.getDefaultState();

            switch (meta & 12)
            {
                case 0:
                    state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                    break;
                case 4:
                    state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                    break;
                case 8:
                    state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                    break;
                default:
                    state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
            }

            return state;
        }

        /**
         * Convert the BlockState into the correct metadata value.
         *
         * @param state the state
         * @return the meta from state
         */
        @Override
        @SuppressWarnings("incomplete-switch")
        public int getMetaFromState(IBlockState state)
        {
            int meta = 0;

            switch (state.getValue(LOG_AXIS))
            {
                case X:
                    meta |= 4;
                    break;
                case Z:
                    meta |= 8;
                    break;
                case NONE:
                    meta |= 12;
            }

            return meta;
        }

        /* (non-Javadoc)
         * @see net.minecraft.block.BlockRotatedPillar#createBlockState()
         */
        @Override
        protected BlockStateContainer createBlockState()
        {
            return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
        }

        /* (non-Javadoc)
         * @see net.minecraft.block.BlockRotatedPillar#getSilkTouchDrop(net.minecraft.block.state.IBlockState)
         */
        @Override
        protected ItemStack getSilkTouchDrop(IBlockState state)
        {
            return new ItemStack(Item.getItemFromBlock(this), 1);
        }

        /**
         * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
         * returns the metadata of the dropped item based on the old metadata of the block.
         *
         * @param state the state
         * @return the int
         */
        @Override
        public int damageDropped(IBlockState state)
        {
            return 0;
        }
        
        @Override
      	public boolean isWood(IBlockAccess world, BlockPos pos) {
      		// TODO Auto-generated method stub
      		return true;
      	}
        
        @Override
      	public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
      		// TODO Auto-generated method stub
      		return true;
      	}
        
        @Override
      	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
      		// TODO Auto-generated method stub
      		return true;
      	}
      }