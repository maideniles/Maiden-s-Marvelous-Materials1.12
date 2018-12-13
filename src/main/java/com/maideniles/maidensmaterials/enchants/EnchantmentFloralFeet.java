package com.maideniles.maidensmaterials.enchants;

import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.init.MaidensEnchantments;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EnchantmentFloralFeet extends Enchantment {

	public EnchantmentFloralFeet() {
		super(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] { EntityEquipmentSlot.FEET });
		this.setName("fancy_feet");
		this.setRegistryName("fancy_feet");

	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public boolean canApply(ItemStack stack) {
		return stack.getItem() instanceof ItemArmor
				&& ((ItemArmor) stack.getItem()).armorType == EntityEquipmentSlot.FEET;
	}

	@Override
	public boolean isTreasureEnchantment() {
		return true;
	}
	
	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		
		return true;
	}

	@SubscribeEvent
	public static void growFlowersUnderFeet(LivingUpdateEvent event) {
		if (!event.getEntity().world.isRemote) {
			int level = EnchantmentHelper.getMaxEnchantmentLevel(MaidensEnchantments.FANCY_FEET,
					event.getEntityLiving());

			if (level > 0 && event.getEntityLiving().onGround) {
				Entity e = event.getEntity();
				if (e instanceof EntityPlayerMP && ((EntityPlayerMP) e).isSpectator()) {
					return;
				}
			
				World w = e.world;
				int r = level + 1;
				BlockPos pos = e.getPosition();
				for (int x = -r; x <= r; x++) {
					for (int z = -r; z <= r; z++) {
						BlockPos blockpos = pos.add(x, -1, z);
						if (blockpos.distanceSq(pos.getX(), pos.getY(), pos.getZ()) > r * r) {
							continue;
						}

						IBlockState iblockstate = w.getBlockState(blockpos);
					
						if (iblockstate.getBlock() == Blocks.DIRT
								&& iblockstate.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT
								|| iblockstate.getBlock() == Blocks.GRASS) {
							if(MaidensBlocks.WALK_FLOWERS.canPlaceBlockAt(w, pos)) {
								w.setBlockState(pos, MaidensBlocks.WALK_FLOWERS.getDefaultState());
							}
							
						}
					}
				}
			}
		}
	}

}
