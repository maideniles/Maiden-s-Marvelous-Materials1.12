package com.maideniles.maidensmaterials.init.items.gui;

import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.items.ItemMaiden;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemGuideBook extends ItemMaiden {

	public ItemGuideBook(String name) {
		super(name);
		setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand) {
		ItemStack stack = playerIn.getHeldItem(hand);
		if (worldIn.isRemote)
			playerIn.openGui(MaidensMaterials.INSTANCE, 0, worldIn, (int) Math.floor(playerIn.posX), (int) Math.floor(playerIn.posY), (int) Math.floor(playerIn.posZ));

		return new ActionResult<>(EnumActionResult.SUCCESS, stack);
	}
}