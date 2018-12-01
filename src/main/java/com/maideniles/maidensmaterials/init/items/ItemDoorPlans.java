package com.maideniles.maidensmaterials.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDoorPlans extends Item {
	public ItemDoorPlans(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxDamage(30);
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
