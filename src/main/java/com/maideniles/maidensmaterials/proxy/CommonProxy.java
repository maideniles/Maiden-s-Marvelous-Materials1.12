package com.maideniles.maidensmaterials.proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.handlers.GuiHandler;
import com.maideniles.maidensmaterials.handlers.RegistryHandler;
import com.maideniles.maidensmaterials.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy 
{
	public static List<Item> gatheredOres = new ArrayList<>();
    public static   List<String> oresIWant = new ArrayList<>();
    public static List<Block> validBlocks = new ArrayList<>();
	
	public void registerModelResourceLocation(Item item){}
	
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.Common();
	}
	
	public void init(FMLInitializationEvent event)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(MaidensMaterials.INSTANCE, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		        for(String ore : OreDictionary.getOreNames())
	            if(ore.toLowerCase().contains("ore")) 
	                oresIWant.add(ore);
	            
	        for(String ore : OreDictionary.getOreNames())
	            if(ore.toLowerCase().contains("log")) 
	        
	        for(String dict : oresIWant) {
	            NonNullList<ItemStack> blockz = OreDictionary.getOres(dict);
	            for(ItemStack s : blockz) {
	                gatheredOres.add(s.getItem());
	                
	                for(String dict2 : oresIWant) {
	    	            NonNullList<ItemStack> logz = OreDictionary.getOres(dict);
	    	            for(ItemStack s2 : logz) {
	    	                gatheredOres.add(s.getItem());
	    	            }
	    	        }
	               
	            }
	        }
	        
	        for(Item stack : gatheredOres)
	        	validBlocks.add(Block.getBlockFromItem(stack));  

	}
	
	public void openMyGui() 
	{
		
	}
}