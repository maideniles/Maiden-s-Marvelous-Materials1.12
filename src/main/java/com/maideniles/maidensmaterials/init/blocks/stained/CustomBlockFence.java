package com.maideniles.maidensmaterials.init.blocks.stained;

import com.maideniles.maidensmaterials.init.BlockInit;
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
		setResistance(resistance);
		setHardness(hardness);
		this.useNeighborBrightness = true;
		BlockInit.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

}