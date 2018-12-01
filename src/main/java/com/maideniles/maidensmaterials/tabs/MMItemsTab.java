package com.maideniles.maidensmaterials.tabs;
import com.maideniles.maidensmaterials.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MMItemsTab extends CreativeTabs
{
	public MMItemsTab(String label) { super("mmitems_tab"); 
	 }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.mortar_n_pestle);}
}