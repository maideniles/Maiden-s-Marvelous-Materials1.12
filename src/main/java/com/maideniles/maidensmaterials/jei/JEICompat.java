package com.maideniles.maidensmaterials.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.VanillaTypes;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.ItemEnchantedBook;
import com.maideniles.maidensmaterials.init.MaidensEnchantments;

@JEIPlugin
public class JEICompat implements IModPlugin{

	@Override
	public void register(IModRegistry registry) {
	
		
		registry.addIngredientInfo(ItemEnchantedBook.getEnchantedItemStack(new EnchantmentData(MaidensEnchantments.FLOWER_POWER, 1)), VanillaTypes.ITEM, "info.maidens.flower_power");
		registry.addIngredientInfo(ItemEnchantedBook.getEnchantedItemStack(new EnchantmentData(MaidensEnchantments.FANCY_FEET, 1)), VanillaTypes.ITEM, "info.maidens.fancy_feet");
	}
}
