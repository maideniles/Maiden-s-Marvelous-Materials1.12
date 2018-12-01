package com.maideniles.maidensmaterials.init.blocks;

import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class CustomBrickBlock extends Block{

	public CustomBrickBlock(String name,Material materialIn) {
		super(Material.CLAY);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		BlockInit.BLOCKS.add(this);
		MaidensItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	
	
}