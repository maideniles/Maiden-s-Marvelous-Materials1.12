package com.maideniles.maidensmaterials.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMortarAndPestle extends ItemMaiden {

	private Item containerItem;

	public ItemMortarAndPestle(String name) {
		super(name);
		setMaxStackSize(1);
		setMaxDamage(64);
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
