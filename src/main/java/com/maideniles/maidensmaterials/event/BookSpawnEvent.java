package com.maideniles.maidensmaterials.event;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.MaidensItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.items.ItemHandlerHelper;


@Mod.EventBusSubscriber
public class BookSpawnEvent {

	public static final String TAG_PLAYER_HAS_BOOK = "maidensmaterials.book";

	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerLoggedInEvent event) {
		NBTTagCompound playerData = event.player.getEntityData();
		NBTTagCompound data = playerData != null ? playerData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG) : new NBTTagCompound();
		if (!data.getBoolean(TAG_PLAYER_HAS_BOOK) && (ConfigHandler.BOOK_SPAWN)) {
			ItemHandlerHelper.giveItemToPlayer(event.player, new ItemStack(MaidensItems.guide_book));
			data.setBoolean(TAG_PLAYER_HAS_BOOK, true);
			playerData.setTag(EntityPlayer.PERSISTED_NBT_TAG, data);
		}
	}
}
