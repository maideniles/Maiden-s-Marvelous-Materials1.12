package com.maideniles.maidensmaterials.tabs;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MMBlocksTab extends CreativeTabs
{
	public MMBlocksTab(String label) { super("mmblocks_tab"); 
	 }
	public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(BlockInit.cyan_stained_stairs));}
}