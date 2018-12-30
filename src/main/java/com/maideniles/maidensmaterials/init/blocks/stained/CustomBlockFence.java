package com.maideniles.maidensmaterials.init.blocks.stained;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CustomBlockFence extends BlockFence
{
	public CustomBlockFence(String name, float hardness, float resistance) 
	{
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(10);
		setHardness(1.0F);
		setHarvestLevel("axe", 0);
		this.useNeighborBrightness = true;
		MaidensBlocks.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

}