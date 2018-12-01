package com.maideniles.maidensmaterials.proxy;
import com.maideniles.maidensmaterials.handlers.RegistryHandler;
import com.maideniles.maidensmaterials.init.items.gui.GuiGuideBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerModelResourceLocation(Item item) {
	    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		RegistryHandler.Client();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
	
	@Override
	public void openMyGui()
	{
		Minecraft.getMinecraft().displayGuiScreen(new GuiGuideBook());
	}
}