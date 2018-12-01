package com.maideniles.maidensmaterials.init.items;

import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.item.Item;

public class ItemMaiden extends Item{
	
	public ItemMaiden(String unloc) {
		this.setUnlocalizedName(unloc);
		this.setRegistryName(unloc);
		MaidensItems.ITEMS.add(this);
	}
}
