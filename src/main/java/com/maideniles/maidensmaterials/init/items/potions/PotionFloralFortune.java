package com.maideniles.maidensmaterials.init.items.potions;

import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.MaidensMaterials;

import net.minecraft.client.Minecraft;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PotionFloralFortune extends Potion {
		        
	    public PotionFloralFortune() {
		super(false, 65460);
		setPotionName("effect.floral_fortune");
		setIconIndex(1, 0);
		setRegistryName(new ResourceLocation(Reference.MODID + ":" + "floral_fortune"));
		}
	    
	    
	    @Override
		public boolean hasStatusIcon() {
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/potions/potion_effects.png"));
			return true;
		}
 }
