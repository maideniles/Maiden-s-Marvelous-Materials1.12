package com.maideniles.maidensmaterials.init.items;
import com.maideniles.maidensmaterials.MaidensMaterials;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemNewBook extends Item
{
public ItemNewBook(String name){
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setMaxDamage(5);
	}

@Override
public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand)
{
    setMaxStackSize(16);
    ItemStack stack = playerIn.getHeldItem(hand);
    if(worldIn.isRemote)
    {
    	if (!worldIn.isRemote)
        {
            MaidensMaterials.proxy.openMyGui();
    }
   
}
    return new ActionResult<>(EnumActionResult.SUCCESS, stack);
}
}
