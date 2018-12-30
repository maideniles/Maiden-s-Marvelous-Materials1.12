package com.maideniles.maidensmaterials.event;

import java.util.Random;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensItems;
import com.maideniles.maidensmaterials.init.items.potions.PotionTypeRegistry;
import com.maideniles.maidensmaterials.proxy.CommonProxy;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionType;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class MaidensEventHandler {

	private static final Random rand = new Random();

	@SubscribeEvent
	public static void onDropBlocksEvent(HarvestDropsEvent event) {
		if (CommonProxy.validBlocks.contains(event.getState().getBlock())) {
			if (rand.nextInt(200) ==0) {
				event.getDrops().add(new ItemStack(MaidensItems.EARTHEN_ESSENCE, 1));
			}
		}
	}

	@SubscribeEvent
	public static void onBlockBreak(BreakEvent event) {
		EntityPlayer player = event.getPlayer();

		if (!player.capabilities.isCreativeMode && player.isPotionActive(MaidensMaterials.GATHERER)) {

			if (CommonProxy.validBlocks.contains(event.getState().getBlock())) {

				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(event.getState().getBlock(), 1));

				if (!event.getWorld().isRemote) {
					item.setPickupDelay(40); // To Set a Small Pickup Delay
					event.getWorld().spawnEntity(item);
				}
			}
		}
	}
	
	@SubscribeEvent
	public static void onBlockBreak2(BreakEvent event) {
		EntityPlayer player = event.getPlayer();
		if (!player.capabilities.isCreativeMode && player.isPotionActive(MaidensMaterials.FLORAL_FORTUNE)) {

			if (MaidensBlocks.GRASS.contains(event.getState().getBlock())) {

				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Item.getItemFromBlock(MaidensBlocks.ornamental_grass), 1));

				if (!event.getWorld().isRemote) {
					item.setPickupDelay(40); // To Set a Small Pickup Delay
					event.getWorld().spawnEntity(item);
				}
			}
		}

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
