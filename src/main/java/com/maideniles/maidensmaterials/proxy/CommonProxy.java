package com.maideniles.maidensmaterials.proxy;

import java.util.ArrayList;
import java.util.List;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.handlers.GuiHandler;
import com.maideniles.maidensmaterials.handlers.RecipeHandler;
import com.maideniles.maidensmaterials.init.BiomeInit;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensEnchantments;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.world.gen.ores.MaidensWorldGeneration;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy 
{
	public static List<Item> gatheredOres = new ArrayList<>();
    public static List<String> oresIWant = new ArrayList<>();
    public static List<Block> validBlocks = new ArrayList<>();
	
	public void registerModelResourceLocation(Item item){}
	
	public void preInit(FMLPreInitializationEvent event)
	{
	}
	
	public void init(FMLInitializationEvent event)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(MaidensMaterials.INSTANCE, new GuiHandler());
		
		
		MaidensWorldGeneration.register();
		BiomeInit.registerBiomes();
/*		MaidensItems.registerData();
		BlockInit.registerOreDictionary();*/
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		for (String ore : OreDictionary.getOreNames())
			if (ore.toLowerCase().contains("ore"))
				oresIWant.add(ore);

		for (String ore2 : OreDictionary.getOreNames())
			if (ore2.toLowerCase().contains("log"))
				oresIWant.add(ore2);

		for (String dict : oresIWant) {
			NonNullList<ItemStack> blockz = OreDictionary.getOres(dict);
			for (ItemStack s : blockz) {
				gatheredOres.add(s.getItem());

				for (String dict2 : oresIWant) {
					NonNullList<ItemStack> logz = OreDictionary.getOres(dict);
					for (ItemStack s2 : logz) {
						gatheredOres.add(s.getItem());
					}
				}

			}
		}

		for (Item stack : gatheredOres)
			validBlocks.add(Block.getBlockFromItem(stack));

		validBlocks.add(Blocks.GLOWSTONE);

	}
	
}