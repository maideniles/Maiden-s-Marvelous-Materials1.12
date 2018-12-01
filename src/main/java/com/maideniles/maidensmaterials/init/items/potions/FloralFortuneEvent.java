package com.maideniles.maidensmaterials.init.items.potions;

import java.util.ArrayList;
import java.util.List;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.blocks.CustomBlockGrass;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class FloralFortuneEvent {

	

		
		
		@SubscribeEvent
		 public void onBlockBreak(BreakEvent event){
		 EntityPlayer player = event.getPlayer();
		 
		 if(!player.capabilities.isCreativeMode && player.isPotionActive(MaidensMaterials.FLORAL_FORTUNE)){
		 	
		 
		 if(BlockInit.GRASS.contains(event.getState().getBlock())){
			 
			 
		
			 EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), 
					 new ItemStack(Item.getItemFromBlock(BlockInit.ornamental_grass), 1));
	         
	         if(!event.getWorld().isRemote)
	         {
	        	 item.setPickupDelay(40); //To Set a Small Pickup Delay
	             event.getWorld().spawnEntity(item);
	         }
	     }
	 }

	}
	
}
