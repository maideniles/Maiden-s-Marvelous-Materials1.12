package com.maideniles.maidensmaterials.handlers;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.BiomeInit;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.init.items.potions.PotionTypeRegistry;
import com.maideniles.maidensmaterials.world.gen.ores.AmethystOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.AventurineOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.CarnelianOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.ChalcopyriteOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.CitrineOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.JadeOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.JasperOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.LabradoriteOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.MicaOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.MoonstoneOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.RoseQuartzOreGen;
import com.maideniles.maidensmaterials.world.gen.ores.SodaliteOreGen;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryHandler {
	public static void Client() {

	}

	public static void Common() {

		RecipeHandler.registerSmelting();

		MicaOreGen.register();
		AventurineOreGen.register();
		MoonstoneOreGen.register();
		SodaliteOreGen.register();
		CarnelianOreGen.register();
		LabradoriteOreGen.register();
		JasperOreGen.register();
		JadeOreGen.register();
		CitrineOreGen.register();
		RoseQuartzOreGen.register();
		AmethystOreGen.register();
		ChalcopyriteOreGen.register();

		BiomeInit.registerBiomes();
	}


}