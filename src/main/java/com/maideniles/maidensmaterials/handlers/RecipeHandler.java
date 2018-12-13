package com.maideniles.maidensmaterials.handlers;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerSmelting(){
	{
	
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.cedar_log)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_crabapple)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_dogwood)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_jacaranda)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_laburnum)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_paulownia)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_silverbell)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MaidensBlocks.log_wisteria)), new ItemStack(Items.COAL, 1, 1), 10);
		
		GameRegistry.addSmelting(new ItemStack(MaidensItems.red_clay), new ItemStack(MaidensItems.red_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.orange_clay), new ItemStack(MaidensItems.orange_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.yellow_clay), new ItemStack(MaidensItems.yellow_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.lime_clay), new ItemStack(MaidensItems.lime_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.green_clay), new ItemStack(MaidensItems.green_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.cyan_clay), new ItemStack(MaidensItems.cyan_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.light_blue_clay), new ItemStack(MaidensItems.light_blue_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.blue_clay), new ItemStack(MaidensItems.blue_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.purple_clay), new ItemStack(MaidensItems.purple_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.magenta_clay), new ItemStack(MaidensItems.magenta_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.pink_clay), new ItemStack(MaidensItems.pink_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.white_clay), new ItemStack(MaidensItems.white_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.light_gray_clay), new ItemStack(MaidensItems.light_gray_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.gray_clay), new ItemStack(MaidensItems.gray_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.black_clay), new ItemStack(MaidensItems.black_brick), 10);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.brown_clay), new ItemStack(MaidensItems.brown_brick), 10);
		
		GameRegistry.addSmelting(new ItemStack(MaidensItems.red_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.red_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.orange_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.orange_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.yellow_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.yellow_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.lime_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.lime_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.green_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.green_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.cyan_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.cyan_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.light_blue_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.light_blue_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.blue_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.blue_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.purple_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.purple_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.magenta_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.magenta_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.pink_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.pink_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.white_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.white_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.light_gray_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.light_gray_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.gray_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.gray_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.black_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.black_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(MaidensItems.brown_clay_mix), new ItemStack(Item.getItemFromBlock(MaidensBlocks.brown_clay_block)), 20);
		
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dark_iron_mix), new ItemStack(MaidensItems.dark_iron_ingot), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_red), new ItemStack(MaidensItems.stain_red), 20);		
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_orange), new ItemStack(MaidensItems.stain_orange), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_yellow), new ItemStack(MaidensItems.stain_yellow), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_lime), new ItemStack(MaidensItems.stain_lime), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_green), new ItemStack(MaidensItems.stain_green), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_cyan), new ItemStack(MaidensItems.stain_cyan), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_light_blue), new ItemStack(MaidensItems.stain_light_blue), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_blue), new ItemStack(MaidensItems.stain_blue), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_purple), new ItemStack(MaidensItems.stain_purple), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_magenta), new ItemStack(MaidensItems.stain_magenta), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_pink), new ItemStack(MaidensItems.stain_pink), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_white), new ItemStack(MaidensItems.stain_white), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_light_gray), new ItemStack(MaidensItems.stain_light_gray), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_gray), new ItemStack(MaidensItems.stain_gray), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_black), new ItemStack(MaidensItems.stain_black), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.dye_bath_brown), new ItemStack(MaidensItems.stain_brown), 20);
			
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_red), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_red)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_orange), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_orange)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_yellow), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_yellow)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_lime), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_lime)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_green), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_green)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_cyan), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_cyan)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_light_blue), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_light_blue)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_blue), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_blue)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_purple), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_purple)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_magenta), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_magenta)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_pink), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_pink)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_white), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_light_gray), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_light_gray)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_gray), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_gray)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_black), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_black)), 20);
			GameRegistry.addSmelting(new ItemStack(MaidensItems.clay_vase_brown), new ItemStack(Item.getItemFromBlock(MaidensBlocks.vase_brown)), 20);
		}
	}
}