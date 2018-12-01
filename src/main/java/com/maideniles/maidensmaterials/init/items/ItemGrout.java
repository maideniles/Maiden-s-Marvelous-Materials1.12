package com.maideniles.maidensmaterials.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrout extends Item {

	private Item containerItem;

	public ItemGrout(String name) {

		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setMaxDamage(3);
		setNoRepair();
		
	}

	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	 @Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;  
	}
	
}
