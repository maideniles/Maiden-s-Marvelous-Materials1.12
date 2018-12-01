package com.maideniles.maidensmaterials;
import java.io.File;
import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.blocks.trees.log.LogFurnaceEvents;
import com.maideniles.maidensmaterials.init.items.gui.BookSpawnEvent;
import com.maideniles.maidensmaterials.init.items.potions.GathererEvents;
import com.maideniles.maidensmaterials.init.items.potions.FloralFortuneEvent;
import com.maideniles.maidensmaterials.init.items.potions.PotionGatherer;
import com.maideniles.maidensmaterials.init.items.potions.PotionFloralFortune;
import com.maideniles.maidensmaterials.proxy.CommonProxy;
import com.maideniles.maidensmaterials.tabs.MMBlocksTab;
import com.maideniles.maidensmaterials.tabs.MMItemsTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
		
		
		
		  MinecraftForge.EVENT_BUS.register(new GathererEvents());
		  MinecraftForge.EVENT_BUS.register(new FloralFortuneEvent());
		  MinecraftForge.EVENT_BUS.register(new BookSpawnEvent());
		  MinecraftForge.EVENT_BUS.register(new LogFurnaceEvents());
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