package com.maideniles.maidensmaterials.enchants;

import java.util.Set;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensEnchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EnchantmentFlowerChild extends Enchantment {

	public EnchantmentFlowerChild() {
		super(Rarity.VERY_RARE, MaidensEnchantments.TOOL,
				new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND, EntityEquipmentSlot.OFFHAND });
		setName("flower_power");
		setRegistryName("flower_power");
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public boolean canApply(ItemStack stack) {
		return stack.getItem().getToolClasses(stack).contains("shovel");
	}
	


	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		return canApply(stack);
	}
	
	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}

	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return super.canApplyTogether(ench) && ench != Enchantments.SILK_TOUCH;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 1 + 10 * (enchantmentLevel - 1);
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return super.getMinEnchantability(enchantmentLevel) + 15;
	}

	
	
	@SubscribeEvent
	public static void canHarvestOrnamentalGrass(BreakEvent event) {

		EntityPlayer player = event.getPlayer();

		int hasflowerpower = EnchantmentHelper.getEnchantmentLevel(MaidensEnchantments.FLOWER_POWER,
				player.inventory.getCurrentItem());
		if (hasflowerpower > 0) {

			if (MaidensBlocks.GRASS.contains(event.getState().getBlock())) {
				EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(),
						event.getPos().getZ(), new ItemStack(Item.getItemFromBlock(MaidensBlocks.ornamental_grass), 1));

				if (!event.getWorld().isRemote) {
					item.setPickupDelay(20); // To Set a Small Pickup Delay
					event.getWorld().spawnEntity(item);
				}
			}

		}
	}
}