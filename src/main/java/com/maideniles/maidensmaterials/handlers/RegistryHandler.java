package com.maideniles.maidensmaterials.handlers;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.BiomeInit;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.ItemInit;
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
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler 
{
	public static void Client()
	{	
	
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		ItemInit.registerOreDictionary();
		
		BlockInit.init();
		BlockInit.register();
		BlockInit.registerOreDictionary();
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
	@SubscribeEvent
	public static void onPotionRegistry(RegistryEvent.Register<Potion> event) {
	    event.getRegistry().register(MaidensMaterials.GATHERER);
	    event.getRegistry().register(MaidensMaterials.FLORAL_FORTUNE);
	   	}
	
	@SubscribeEvent
	public static void onPotionTypeRegister(RegistryEvent.Register<PotionType> event) {
	    PotionTypeRegistry.registerPotionTypes(event);
	}
		
}