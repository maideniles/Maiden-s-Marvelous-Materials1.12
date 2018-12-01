package com.maideniles.maidensmaterials;
import java.io.File;
import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.items.potions.PotionFloralFortune;
import com.maideniles.maidensmaterials.init.items.potions.PotionGatherer;
import com.maideniles.maidensmaterials.proxy.CommonProxy;
import com.maideniles.maidensmaterials.tabs.MMBlocksTab;
import com.maideniles.maidensmaterials.tabs.MMItemsTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MaidensMaterials 
{	
	public static final CreativeTabs blockstab = new MMBlocksTab("blocks_tab");
	public static final CreativeTabs itemstab = new MMItemsTab("items_tab");
	public static final Random RANDOM = new Random();
	public static File config;
	
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	
	
	@Instance(Reference.MODID)
	public static MaidensMaterials INSTANCE;
	
	
	public static final Potion GATHERER = new PotionGatherer();
	 public static final Potion FLORAL_FORTUNE = new PotionFloralFortune();
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	 
		}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
	
		proxy.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
	
	@EventHandler
	public static void preInitRegestries(FMLPreInitializationEvent event)
    {
        ConfigHandler.registerConfig(event);
    }
}