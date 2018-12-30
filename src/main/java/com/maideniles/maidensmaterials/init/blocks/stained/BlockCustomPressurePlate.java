package com.maideniles.maidensmaterials.init.blocks.stained;

import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A block which acts like a pressure plate
 * @author maideniles
 *
 */
public class BlockCustomPressurePlate extends BlockPressurePlateWeighted {

	/**
	 * Default constructor
	 * @param unlocalizedName The unlocalized name of the block
	 */
	public BlockCustomPressurePlate(String name, int sensitivityIn) {
		super(Material.WOOD, 10);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		setHarvestLevel("axe", 0);
		setResistance(20);
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	/**
	 * Change this if you want to emit a redstone signal different to that of a weighted pressure plate
	 */
	@Override
	protected int computeRedstoneStrength(World worldIn, BlockPos pos) {
		return super.computeRedstoneStrength(worldIn, pos);
	}
	
	/**
	 * Change this to play your own click on sound
	 */
	@Override
	protected void playClickOffSound(World worldIn, BlockPos pos) {
		super.playClickOffSound(worldIn, pos);
	}
	
	/**
	 * Change this to play your own click off sound
	 */
	@Override
	protected void playClickOnSound(World worldIn, BlockPos color) {
		super.playClickOnSound(worldIn, color);
	}

}