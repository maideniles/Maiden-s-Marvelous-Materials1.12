package com.maideniles.maidensmaterials.init.items.potions;

import java.util.Random;

import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.init.ItemInit;
import com.maideniles.maidensmaterials.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class DropEarthEvent {

	private static final Random rand = new Random();
	@SubscribeEvent
	public static void onDropBlocksEvent(HarvestDropsEvent event) {
		
		if(CommonProxy.validBlocks.contains(event.getState().getBlock())){
	    if((rand.nextInt(200) + 1) < 20) {
	        event.getDrops().add(new ItemStack(ItemInit.EARTHEN_ESSENCE, 1));
	    }
	}
  }
}
