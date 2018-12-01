package com.maideniles.maidensmaterials.init.items.potions;

import com.maideniles.maidensmaterials.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionGatherer extends Potion {
	
	public PotionGatherer() {
		super(false, 16776960);
		setPotionName("effect.gatherer");
		setIconIndex(0, 0);
		setRegistryName(new ResourceLocation(Reference.MODID + ":" + "gatherer"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/potions/potion_effects.png"));
		return true;
	} 
	
}
