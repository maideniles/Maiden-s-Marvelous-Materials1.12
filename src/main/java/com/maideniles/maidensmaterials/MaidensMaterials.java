package com.maideniles.maidensmaterials;

import java.io.File;
import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.init.items.potions.PotionFloralFortune;
import com.maideniles.maidensmaterials.init.items.potions.PotionGatherer;
import com.maideniles.maidensmaterials.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MaidensMaterials {

	public static File config;
	public static final Random RANDOM = new Random();
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;

	@Instance(Reference.MODID)
	public static MaidensMaterials INSTANCE;

	public static final Potion GATHERER = new PotionGatherer();
	public static final Potion FLORAL_FORTUNE = new PotionFloralFortune();

	public static final CreativeTabs blockstab = new CreativeTabs("blocks_tab") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(BlockInit.cyan_stained_stairs));
		}
	};
	
	public static final CreativeTabs itemstab = new CreativeTabs("items_tab") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.DIAMOND);
		}
	};
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {

		proxy.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public static void preInitRegestries(FMLPreInitializationEvent event) {
		ConfigHandler.registerConfig(event);
	}
}