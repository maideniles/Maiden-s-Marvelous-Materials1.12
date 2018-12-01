package com.maideniles.maidensmaterials.init.items.potions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.BlockInit;
import com.maideniles.maidensmaterials.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GathererEvents {

	
	
	@SubscribeEvent
	 public void onBlockBreak(BreakEvent event){
	 EntityPlayer player = event.getPlayer();
	 
	 if(!player.capabilities.isCreativeMode && player.isPotionActive(MaidensMaterials.GATHERER)){
	 	
	 
	 if(CommonProxy.validBlocks.contains(event.getState().getBlock())){
		 
		 EntityItem item = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(event.getState().getBlock(), 1));
         
         if(!event.getWorld().isRemote)
         {
        	 item.setPickupDelay(40); //To Set a Small Pickup Delay
             event.getWorld().spawnEntity(item);
         }
     }
 }
}
}