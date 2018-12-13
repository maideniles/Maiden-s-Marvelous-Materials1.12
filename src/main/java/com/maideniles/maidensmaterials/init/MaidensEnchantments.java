package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.enchants.EnchantmentFloralFeet;
import com.maideniles.maidensmaterials.enchants.EnchantmentFlowerChild;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

@Mod.EventBusSubscriber
public class MaidensEnchantments {
public static final EnumEnchantmentType TOOL = EnumHelper.addEnchantmentType("tool", (item)->(item instanceof ItemSpade));
	
	public static final Enchantment FLOWER_POWER = new EnchantmentFlowerChild();
	public static final Enchantment FANCY_FEET = new EnchantmentFloralFeet();
	
	        

        @SubscribeEvent
    	public static void registerEnchantments(Register<Enchantment> event) {
    		event.getRegistry().registerAll(FLOWER_POWER, FANCY_FEET);
    		// DEBUG
            System.out.println("Registering Enchantments");
        }
}

