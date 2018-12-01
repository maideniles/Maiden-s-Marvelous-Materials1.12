package com.maideniles.maidensmaterials.init.items;

import javax.annotation.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

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
		// TODO Auto-generated method stub
		return true;
	}
	
	 @Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		// TODO Auto-generated method stub
		return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;  
	}
	
}
