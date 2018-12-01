package com.maideniles.maidensmaterials.init.items.gui;

import com.maideniles.maidensmaterials.Reference;
import com.maideniles.maidensmaterials.MaidensMaterials;
import com.maideniles.maidensmaterials.init.items.ItemGemBase;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGuideBook extends Item {

    public ItemGuideBook(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
    }

     @Override
    
        public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand)
        {
    	  ItemStack stack = playerIn.getHeldItem(hand);
         if(worldIn.isRemote)
             playerIn.openGui(MaidensMaterials.INSTANCE, 0,  worldIn, (int)Math.floor(playerIn.posX), (int)Math.floor(playerIn.posY), (int)Math.floor(playerIn.posZ));
       
         return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
}