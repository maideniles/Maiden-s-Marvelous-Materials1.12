package com.maideniles.maidensmaterials.handlers;

import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.ItemInit;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerSmelting(){
	{
	
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.cedar_log)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_crabapple)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_dogwood)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_dogwood)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_jacaranda)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_laburnum)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_paulownia)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_silverbell)), new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockInit.log_wisteria)), new ItemStack(Items.COAL, 1, 1), 10);
		
		GameRegistry.addSmelting(new ItemStack(ItemInit.red_clay), new ItemStack(ItemInit.red_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.orange_clay), new ItemStack(ItemInit.orange_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.yellow_clay), new ItemStack(ItemInit.yellow_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.lime_clay), new ItemStack(ItemInit.lime_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.green_clay), new ItemStack(ItemInit.green_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.cyan_clay), new ItemStack(ItemInit.cyan_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.light_blue_clay), new ItemStack(ItemInit.light_blue_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.blue_clay), new ItemStack(ItemInit.blue_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.purple_clay), new ItemStack(ItemInit.purple_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.magenta_clay), new ItemStack(ItemInit.magenta_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.pink_clay), new ItemStack(ItemInit.pink_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.white_clay), new ItemStack(ItemInit.white_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.light_gray_clay), new ItemStack(ItemInit.light_gray_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.gray_clay), new ItemStack(ItemInit.gray_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.black_clay), new ItemStack(ItemInit.black_brick), 10);
		GameRegistry.addSmelting(new ItemStack(ItemInit.brown_clay), new ItemStack(ItemInit.brown_brick), 10);
		
		GameRegistry.addSmelting(new ItemStack(ItemInit.red_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.red_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.orange_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.orange_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.yellow_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.yellow_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.lime_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.lime_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.green_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.green_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.cyan_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.cyan_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.light_blue_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.light_blue_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.blue_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.blue_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.purple_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.purple_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.magenta_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.magenta_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.pink_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.pink_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.white_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.white_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.light_gray_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.light_gray_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.gray_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.gray_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.black_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.black_clay_block)), 20);
		GameRegistry.addSmelting(new ItemStack(ItemInit.brown_clay_mix), new ItemStack(Item.getItemFromBlock(BlockInit.brown_clay_block)), 20);
		
			GameRegistry.addSmelting(new ItemStack(ItemInit.dark_iron_mix), new ItemStack(ItemInit.dark_iron_ingot), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_red), new ItemStack(ItemInit.stain_red), 20);		
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_orange), new ItemStack(ItemInit.stain_orange), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_yellow), new ItemStack(ItemInit.stain_yellow), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_lime), new ItemStack(ItemInit.stain_lime), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_green), new ItemStack(ItemInit.stain_green), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_cyan), new ItemStack(ItemInit.stain_cyan), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_light_blue), new ItemStack(ItemInit.stain_light_blue), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_blue), new ItemStack(ItemInit.stain_blue), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_purple), new ItemStack(ItemInit.stain_purple), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_magenta), new ItemStack(ItemInit.stain_magenta), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_pink), new ItemStack(ItemInit.stain_pink), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_white), new ItemStack(ItemInit.stain_white), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_light_gray), new ItemStack(ItemInit.stain_light_gray), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_gray), new ItemStack(ItemInit.stain_gray), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_black), new ItemStack(ItemInit.stain_black), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.dye_bath_brown), new ItemStack(ItemInit.stain_brown), 20);
			
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_red), new ItemStack(Item.getItemFromBlock(BlockInit.vase_red)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_orange), new ItemStack(Item.getItemFromBlock(BlockInit.vase_orange)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_yellow), new ItemStack(Item.getItemFromBlock(BlockInit.vase_yellow)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_lime), new ItemStack(Item.getItemFromBlock(BlockInit.vase_lime)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_green), new ItemStack(Item.getItemFromBlock(BlockInit.vase_green)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_cyan), new ItemStack(Item.getItemFromBlock(BlockInit.vase_cyan)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_light_blue), new ItemStack(Item.getItemFromBlock(BlockInit.vase_light_blue)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_blue), new ItemStack(Item.getItemFromBlock(BlockInit.vase_blue)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_purple), new ItemStack(Item.getItemFromBlock(BlockInit.vase_purple)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_magenta), new ItemStack(Item.getItemFromBlock(BlockInit.vase_magenta)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_pink), new ItemStack(Item.getItemFromBlock(BlockInit.vase_pink)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_white), new ItemStack(Item.getItemFromBlock(BlockInit.vase)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_light_gray), new ItemStack(Item.getItemFromBlock(BlockInit.vase_light_gray)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_gray), new ItemStack(Item.getItemFromBlock(BlockInit.vase_gray)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_black), new ItemStack(Item.getItemFromBlock(BlockInit.vase_black)), 20);
			GameRegistry.addSmelting(new ItemStack(ItemInit.clay_vase_brown), new ItemStack(Item.getItemFromBlock(BlockInit.vase_brown)), 20);
		}
	}
}