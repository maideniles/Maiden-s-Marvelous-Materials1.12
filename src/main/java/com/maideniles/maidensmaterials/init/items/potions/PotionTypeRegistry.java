package com.maideniles.maidensmaterials.init.items.potions;
import com.google.common.base.Predicate;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.event.RegistryEvent;


public class PotionTypeRegistry {
	
	public static final PotionType FLORAL_FORTUNE = new PotionType("floral_fortune", new PotionEffect[] {new PotionEffect(MaidensMaterials.FLORAL_FORTUNE, 900)}).setRegistryName("floral_fortune");
	public static final PotionType GATHERER = new PotionType("gatherer", new PotionEffect[] {new PotionEffect(MaidensMaterials.GATHERER, 900)}).setRegistryName("gatherer");
	
	    
	public static void registerPotionTypes(RegistryEvent.Register<PotionType> event) {
	    event.getRegistry().register(GATHERER);
	    event.getRegistry().register(FLORAL_FORTUNE);
	 
	      
	      //---Recipes---//
	        PotionHelper.addMix(PotionTypes.MUNDANE, MaidensItems.EARTHEN_ESSENCE, GATHERER);
	        PotionHelper.addMix(PotionTypes.MUNDANE, MaidensItems.FLORAL_ESSENCE, FLORAL_FORTUNE);
	}
}