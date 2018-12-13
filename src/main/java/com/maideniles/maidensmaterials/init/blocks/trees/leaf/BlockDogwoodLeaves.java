package com.maideniles.maidensmaterials.init.blocks.trees.leaf;
import java.util.Random;

import javax.annotation.Nullable;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockDogwoodLeaves extends BlockLeaves
{
    public BlockDogwoodLeaves(String name)
    {
    	setUnlocalizedName(name);
		setRegistryName(name);
        setDefaultState(blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
    {
        if (worldIn.rand.nextInt(chance) == 3)
        {
            spawnAsEntity(worldIn, pos, new ItemStack(Item.getItemFromBlock(MaidensBlocks.sapling_dogwood_vines)));
        }
    }
        
    protected int getSaplingDropChance(IBlockState state)
    {
        return 90;
    }
 
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(MaidensBlocks.sapling_dogwood);
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this));
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this));
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }

  
    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (!state.getValue(DECAYABLE).booleanValue())
        {
            i |= 4;
        }

        if (state.getValue(CHECK_DECAY).booleanValue())
        {
            i |= 8;
        }

        return i;
    }

    /* (non-Javadoc)
     * @see net.minecraft.block.Block#createBlockState()
     */
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return 0;
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
    {
        if (!worldIn.isRemote && stack.getItem() == Items.SHEARS)
        {
            player.addStat(StatList.getBlockStats(this));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }

    @Override
    public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        return NonNullList.withSize(1, new ItemStack(this));
    }
  
    @Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack mainHandItemStack = playerIn.getHeldItemMainhand();
		Item mainHandItem = playerIn.getHeldItemMainhand().getItem();

		if (mainHandItem == MaidensItems.pruning_shears || playerIn.isPotionActive(MaidensMaterials.FLORAL_FORTUNE)) {
			if (!worldIn.isRemote) {
				if (mainHandItem == MaidensItems.pruning_shears && !playerIn.isPotionActive(MaidensMaterials.FLORAL_FORTUNE)) {
					mainHandItemStack.damageItem(1, playerIn);
				}

				EntityItem itemblossoms = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(),new ItemStack(MaidensItems.dogwood_blossoms, 1));
				itemblossoms.setPickupDelay(0);
				worldIn.spawnEntity(itemblossoms); // To Spawn the Item

				if ((new Random().nextInt(100) + 1) < 10) {
					EntityItem itemessence = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(),new ItemStack(MaidensItems.FLORAL_ESSENCE, 1));
					itemessence.setPickupDelay(0);
					worldIn.spawnEntity(itemessence);
				} // To Spawn the Item
			}
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);

	}
    
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
      return BlockRenderLayer.CUTOUT_MIPPED;
    }
    
    
    public boolean isOpaqueCube(IBlockState state)
    {
      return false;
    }
    
    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) 
    {
    	    return true;
    }

	@Override
	public EnumType getWoodType(int meta) 
	{
				return null;
	}
}