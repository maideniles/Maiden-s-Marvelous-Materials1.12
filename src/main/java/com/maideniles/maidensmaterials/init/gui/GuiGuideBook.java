package com.maideniles.maidensmaterials.init.gui;

import java.io.IOException;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.maideniles.maidensmaterials.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/** @author SoggyMustache's GUI Creator (http://tools.soggymustache.net)*/
public class GuiGuideBook extends GuiScreen {

	Minecraft mc = Minecraft.getMinecraft();
	
	private int currPage = 0;
	
	private final int ImageHeight = 304, ImageWidth = 304, ImageScale = 304;
	public static final ResourceLocation[] TEXTURES = {
		
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_0.png"), 
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_00.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_1.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_2.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_3.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_4.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_5.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_6.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_7.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_8.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_9.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_10.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_11.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_12.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_13.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_14.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_15.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_16.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_17.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_18.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_19.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_20.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_21.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_22.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_23.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_24.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_25.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_26.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_27.png"),
			new ResourceLocation("maidensmaterials:textures/gui/book/my_page_28.png")
			};
	
	
	
public static final String[] TOPLEFTTEXTS = {"","","","Cyan Pigment","Orange Pigment","Lime Pigment","Light Gray Pigment","","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] TOPRIGHTTEXTS = {"","","Red Pigment", "Purple Pigment", "Green Pigment", "Gray Pigment","", "","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] BOTTOMLEFTTEXTS = {"","","","Blue Pigment", "Magenta Pigment", "White Pigment", "Brown Pigment","","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] BOTTOMRIGHTTEXTS = {"","","Yellow Pigment", "Pink Pigment", "Light Blue Pigment", "Black Pigment","","","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] INTRO_TEXT = {"  Somewhere, in your world, lies a wonderful place called the Ornamental Forest. ","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] PAGE2_TEXT = { "This forest is full of colorful, flowering trees that can only be found within, whose blossoms can be crushed into a variety of "
			+ "colorful pigments. With care, they can even yield saplings to be transplanted outside the Forest.","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE2_P2_TEXT = {"To get started, you'll need two things: a set of Pruning Shears and a Mortar & Pestle.","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE3_P1_TEXT = {"","The Pruning Shears are how you will gather the blossoms from the leaves. They're made of iron, and cutting sticks is hard work, "
			+ "so they won't last very long. You may want to take several pairs with you into the Forest.","","","","","","","","","","","","","","","","","","","","","","","","","","","",""}; 
	
public static final String[] PAGE3_P2_TEXT = {"", "Shear the leaves by right-clicking. This will release the blossoms-- and occasionally-- floral essence. You'll want to hold onto that for later.",
		"","","","","","","","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE4_P1_TEXT = {"", "", "Placing your Mortar and Pestle in the center of a crafting table, you can combine the blossoms to create 8 pigments.",
		"","","","","","","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE4_P2_TEXT = {"", "", "These pigments can be combined to form many colors, some of which will require Mica or Charcoal.",
		"","","","","","","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE4_P3_TEXT = {"", "", "Mica can be found in underground deposits, and Charcoal comes from smelting logs.","","","","","","","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE8_P1_TEXT = {"","","","","","", "These pigments can be used to either to make Stain for your wood, or to color clay for bricks and vases. Making colored clay is easy enough; "
			+ "just combine four balls of Clay with four pigments of your choice and your Mortar & Pestle." ,"","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] PAGE9_P1_TEXT = {"","","","","","","", "The stain is a bit more difficult. It requires a bucket of water, a slime ball, and 7 pigments. The recipe shown below will work"
			+ " with all 16 colors of stain. ","","","","","","","","","","","","","","","","","","","","","",""};
		
public static final String[] PAGE10_P1_TEXT = {"","","","","","","","This will make a Dye Bath, which needs to be heated in order to activate. So, just pop it into the furnace for a bit--that"
			+ " will do the trick.","","","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] PAGE11_P1_TEXT = {"","","","","","","","","Before staining wood, you'll need to prepare it with whitewash. (How else do you expect light pink stain to "
		+ "show up on dark oak?)  Whitewash is made of white pigment, clay, and a bucket of water, as shown below: ","","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] PAGE12_P1_TEXT = {"","","","","","","","","You can whitewash planks, stairs, slabs, fences, and fence gates. To whitewash blocks, place the whitewash in the center"
		+ "of the crafting grid and surround it with any wood planks.","","","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE13_P1_TEXT = {"","","","","","","","","","One bucket of whitewash or stain will cover 16 blocks. You can't use it on doors, though--those have to be crafted "
		+ "from colored planks. We will cover doors, in a minute. \n \n Now, place your whitewashed blocks into the crafting "
		+ "table around a bucket of stain, and voila! You have a beautiful new stained block.","","","","","","","","","","","","","","","","","","","",""};
	
public static final String[] PAGE14_P1_TEXT = {"","","","","","","","","","","Now, about those doors...\n \n There are SO many styles you can make. They come in all 16 colors, each wood type, and "
		+ "every door has six different styles to choose from. There's even a wrought iron door! Fancy, eh? See for yourself: ", "","","","","","","","","","","","","","","","","","",""};

public static final String[]PAGE15_P1_TEXT = {"","","","","","","","","","","Now, let's make a door.\n \n First, you'll need to have plans for the type of door you want to build. The recipes here "
		+ "will show you how to create these plans for each style.\n \n Don't worry--each set of plans can be used on many doors. It is, after all, just a blueprint. All it takes is some paper and "
		+ "ink sacs, and you're off to the races!","","","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE16_P1_TEXT = {"","","","","","","","","","","","","Once you have the plans, you need to gather materials. For plain doors, planks will work fine. For Door 4 and "
		+ "Door 5 though, you'll either need some stained glass panes or a dark iron inlay. \n \n  Assuming you know how to get glass panes, the dark iron inlay is made by mixing charcoal and "
		+ "iron nuggets to get smeltable ingots.","","","","","","","","","","","","","","","","",""};

public static final String[] PAGE17_P1_TEXT = {"","","","","","","","","","","","","","To make the inlay, place the ingots in the crafting grid, as shown:",
		"","","","","","","","","","","","","","","",""};

public static final String[] PAGE18_P1_TEXT = {"","","","","","","","","","","","","","The designs shown here explain how to create the door of your dreams simply by arranging the plans, "
		+ "planks, and other sundries into the crafting table.\n \n Follow these recipes to create all 6 styles.","","","","","","","","","","","","","","","",""};

public static final String[] PAGE19_P1_TEXT = {"","","","","","","","","","","","","","","","Want something else to spruce up your dirt hut? Try gemstone tiles! These tiles are created by mining "
		+ "gemstone ore and smashing it to bits with the mortar and pestle. ","","","","","","","","","","","","","",""};

public static final String[] PAGE20_P1_TEXT = {"","","","","","","","","","","","","","","","Just smash the gems...","","","","","","","","","","","","","",""};

public static final String[] PAGE20_P2_TEXT = {"","","","","","","","","","","","","","","","and mix up grout, like so...","","","","","","","","","","","","","","",""};

public static final String[] PAGE21_P1_TEXT = {"","","","","","","","","","","","","","","","","Grab a white concrete block, (you need to have a base to stick the tile to of course) and finally, "

		+ "throw it all into the crafting grid.\n\n Now you have 8 beautiful tiles, ready to be strewn about your base.  ","","","","","","","","","","","","",""};

public static final String[] PAGE22_P1_TEXT = {"","","","","","","","","","","","","","","","",""
		+ "There are six styles of tile, and they come in all of the fashionable gemstone colors: \n \n Amethyst, Moonstone, Jade, Labradorite, Jasper, Mica, Carnelian, Chalcopyrite, Citrine, Rose Quartz, "
		+ "Sodalite, and Aventurine.\n\n Note: Once they are placed, these can only be mined with Silk Touch.", "","","","","","","","","","","","",""};


public static final String[] PAGE23_P1_TEXT = {"","","","","","","","","","","","","","","","","","","Speaking of colors, remember the colored clay we made earlier? We can use it to make bricks"
		+ " to build with, and vases to hold pruned tree blossoms! ", "","","","","","","","","","",""};

public static final String[]PAGE24_P1_TEXT = {"","","","","","","","","","","","","","","","","","","Let's start with the colored bricks. They are made just like regular bricks. All you have "
		+ "to do is smelt a piece of colored clay to make a colored brick.\n \n", "","","","","","","","","","",""} ;

public static final String[]PAGE25_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","Then take 4 bricks and create a brick block, same as you would with regular bricks. "
		+ "That's it! Easy, right?\n \n ", "","","","","","","","","",""};

public static final String[]PAGE26_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","Large Bricks are a wee bit trickier. They start with 8 pieces of colored clay, combined with 1 "
		+ " block of sand, as shown here. \n \n This will make 8 colored clay mixes:", "","","","","","","","","",""};//adding in

public static final String[]PAGE27_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","Next, fire the mixes in a furnace. Unlike Terracotta blocks, this clay mix retains "
		+ " its original color. No orange tint to these babies...Unless you're using orange clay, of course. But I digress. Onward!", "","","","","","","","",""};//adding in again...

public static final String[] PAGE28_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","Lastly, you just place 4 colored clay blocks into the crafting grid, the same as you would for"
		+ " stone bricks. Done! And don't forget--you can craft stairs and slabs out of both regular sized and large clay bricks.", "","","","","","","","",""};

public static final String[] PAGE29_P1_TEXT ={"","","","","","","","","","","","","","","","","","","","","","And now for the vases...\n \n They make amazing decorations for your house, base, castle, "
		+ "or wherever you hide from Creepers. Colored clay goes into the crafting table as shown...","","","","","","","",""};

public static final String[] PAGE30_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","and you can fire the vase in a furnace when it's done. \n \n There! Now it's ready to hold "
		+ "all of your pretty tree clippings.  \n \n Side note:  These ONLY work for tree blossoms.","","","","","","","",""};

public static final String[] PAGE31_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","The last thing we will cover now is potions.\n \n There are two potions that you can use to "
		+ "help you gather all the marvelous materials your little heart desires: \n \n Gatherer's Glee and Floral Fortune.  ","","","","","","","",""};

public static final String[] PAGE32_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","Gatherer's Glee helps you expertly harvest (granting double what you'd "
		+ "normally get) of ore and wood blocks!\n \n You will need Earthen Essence to make Gatherer's Glee, but don't worry. You can find it once in a while when you mine ore or chop logs.","","","","","",""};

public static final String[] PAGE33_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","Remember when we talked about the floral essence? That's important now--it's "
		+ "used for Floral Fortune! \n \n Floral Fortune gives you strong, deft fingers with which to snap twigs easier than any shear could hope, making the collecting of blossoms even easier!","","","","","",""};

public static final String[] PAGE34_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","",""," Now that we've covered the basics of this mod, you're ready to put what you've"
		+ " learned into practice. \n \n So get out there, explore the Ornamental Forest, and make the most of all of these Marvelous Materials. \n \n You'll be the envy of all the other "
		+ "blockheads around! Happy hunting!","","","","",""};

public static final String[] PAGE34_P2_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","Mod Update: Version 2.0 \n\n"
+"In this update you will find lots of new blocks and recipes!  There are new wood blocks, including bookshelves, buttons, pressure plates and 4 new trapdoors.  "
+ "Each of these are available in all wood types and all 16 colors. " 
+ "Grout is now a re-usable item, good for 4 uses. That should be enough to grout 32 mosaic tile blocks.","","","","","",""};

public static final String[] PAGE35_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","",
"Gem chunks can now be combined to create gem blocks. Each block holds 9 chunks, just like vanilla gem/ingot blocks.\n\n There are also blocks for the essences, as well.\n\n"
+"All of the gem and essence blocks require 9 items for creation, and can be returned to their items by crafting.\n\n","","","",""};

public static final String[] PAGE35_P2_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","","","Now for the other new block recipes:\n\n"
		+ "The new vine tie block can be created by infusing a piece of string with a floral essence in the crafting table, as shown here:","","","",""};

public static final String[] PAGE36_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","","",

"The bookshelves, pressure plates and buttons all use the same recipe template as their vanilla countereparts, but with slabs, instead of planks. \n\n","","","",""};

public static final String[] PAGE36_P2_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","","","",

"As for the new trapdoors, they are fairly simpilar to the vanilla trapdoor recipe, with some small differences.\n\n  Two of them call for items such as a single glass pane or dark iron inlay. "
+ "\n\nTrapdoor style 3 uses slabs instead of planks.  The recipes for trapdoors can be found on the following pages.\n\n","","","",""};

public static final String[] PAGE37_P1_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","The last block added is a new type of cobblestone. Tree vines"
		+ "can be combined with a cobblestone block to create vine-covered cobblestone, similar to mossy cobblestone. These come in all the tree vine colors.","",""};

public static final String[] PAGE37_P2_TEXT = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","Thank you for using Maiden's Marvelous Materials. I hope you "
		+ "have as much fun playing with it, as I had making it!"
		+ "\n \n \n \n ~Maideniles","",""};

	private GenericButton Back;
	private GenericButton Next;
	private GenericButton Done;

	public GuiGuideBook(){
	}

	@Override
	public void initGui() {
		buttonList.clear();
		int offLeft = (width - ImageWidth) / 2;
		int offTop = 0;
		buttonList.add(Back = new GenericButton(offLeft + (145 - 140) + (25 / 3), 213 + offTop, 35, 20, "Back"));
		buttonList.add(Next = new GenericButton(offLeft + (390 - 140) + (25 / 3), 213 + offTop, 35, 20, "Next"));
		buttonList.add(Done = new GenericButton(offLeft + (390 - 140) + (25 / 3), 213 + offTop, 35, 20, "Done"));
	}

	@Override
	public void updateScreen() 
		{
	    	Done.visible = (currPage == TEXTURES.length - 1);
	        Next.visible = (currPage < TEXTURES.length - 1);
	        Back.visible = currPage > 0;
	    }

	@Override
	public void drawScreen(int parWidth, int parHeight, float particle) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.enableColorMaterial();
		this.mc.getTextureManager().bindTexture(TEXTURES[currPage]);

		//Adjust these values to move locations of elements without individual adjusmaidensmaterialsent
		int offLeft = (int) ((width - ImageWidth) / 2.0F);
		int offTop = 30;
		int topOffset = 20;

		drawModalRectWithCustomSizedTexture(offLeft, offTop, 0, 0, ImageScale,ImageScale,ImageScale,ImageScale);

		
		fontRenderer.drawSplitString(INTRO_TEXT[currPage], offLeft + 165-140, (255-130) + topOffset, 124, 0X9900CC); //bottom of first page
		fontRenderer.drawSplitString(PAGE2_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE2_P2_TEXT[currPage], offLeft + 305 - 140 , (275- 130) + topOffset, 124, 0X9900CC); //middle of 2nd page
		fontRenderer.drawSplitString(PAGE3_P1_TEXT[currPage], offLeft + 165-140, (160-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE3_P2_TEXT[currPage], offLeft + 165 - 140 , (257- 130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE4_P1_TEXT[currPage], offLeft + 165-140, (160-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE4_P2_TEXT[currPage], offLeft + 165-140, (220-130) + topOffset, 124, 0X9900CC);	
		fontRenderer.drawSplitString(PAGE4_P3_TEXT[currPage], offLeft + 165-140, (270-130) + topOffset, 124, 0X9900CC);	
		fontRenderer.drawSplitString(PAGE8_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE9_P1_TEXT[currPage], offLeft + 165 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE10_P1_TEXT[currPage], offLeft + 300 - 140 , (165- 130) + topOffset, 124, 0X9900CC); 
		fontRenderer.drawSplitString(PAGE11_P1_TEXT[currPage], offLeft + 165-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE12_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE13_P1_TEXT[currPage], offLeft + 165-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE14_P1_TEXT[currPage], offLeft + 165-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE15_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE16_P1_TEXT[currPage], offLeft + 305-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE17_P1_TEXT[currPage], offLeft + 165-140, (235-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE18_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE19_P1_TEXT[currPage], offLeft + 165 - 140 , (250- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE20_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE20_P2_TEXT[currPage], offLeft + 300 - 140 , (240- 130) + topOffset, 120, 0X9900CC);
		fontRenderer.drawSplitString(PAGE21_P1_TEXT[currPage], offLeft + 165-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE22_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE23_P1_TEXT[currPage], offLeft + 165 - 140 , (250- 130) + topOffset, 120, 0X9900CC);
		fontRenderer.drawSplitString(PAGE24_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE25_P1_TEXT[currPage], offLeft + 165-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE26_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE27_P1_TEXT[currPage], offLeft + 165-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE28_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE29_P1_TEXT[currPage], offLeft + 305 - 140 , (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE30_P1_TEXT[currPage], offLeft + 165 - 140, (165- 130) + topOffset, 124, 0X9900CC); //top of 1st page
		fontRenderer.drawSplitString(PAGE31_P1_TEXT[currPage], offLeft + 305-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE32_P1_TEXT[currPage], offLeft + 165 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE33_P1_TEXT[currPage], offLeft + 305-140, (165-130) + topOffset, 124, 0X9900CC);
		fontRenderer.drawSplitString(PAGE34_P1_TEXT[currPage], offLeft + 165 - 140 , (165- 130) + topOffset, 124, 0X9900CC); 
		fontRenderer.drawSplitString(PAGE34_P2_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //new mod update page
		fontRenderer.drawSplitString(PAGE35_P1_TEXT[currPage], offLeft + 165 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE35_P2_TEXT[currPage], offLeft + 165 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE36_P1_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); 
		fontRenderer.drawSplitString(PAGE36_P2_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); //top of 2nd page
		fontRenderer.drawSplitString(PAGE37_P1_TEXT[currPage], offLeft + 165 - 140 , (165- 130) + topOffset, 124, 0X9900CC); 
		fontRenderer.drawSplitString(PAGE37_P2_TEXT[currPage], offLeft + 305 - 140 , (165- 130) + topOffset, 124, 0X9900CC); 
		
		
	fontRenderer.drawSplitString(TOPLEFTTEXTS[currPage], offLeft + 165-140, (165-130) + topOffset, 120, 0X9900CC);	
	fontRenderer.drawSplitString(BOTTOMLEFTTEXTS[currPage], offLeft + 165 - 140 , (250- 130) + topOffset, 120, 0X9900CC);
	fontRenderer.drawSplitString(TOPRIGHTTEXTS[currPage], offLeft + 300 - 140 , (165- 130) + topOffset, 120, 0X9900CC); 
	fontRenderer.drawSplitString(BOTTOMRIGHTTEXTS[currPage], offLeft + 300 - 140 , (250- 130) + topOffset, 120, 0X9900CC); 

		super.drawScreen(parWidth, parHeight, particle);
	}
	@Override
	protected void keyTyped(char typedChar, int keyCode){
	if (keyCode == 1 || keyCode == this.mc.gameSettings.keyBindInventory.getKeyCode())
		Minecraft.getMinecraft().player.closeScreen();
	}
	@Override
	protected void mouseClickMove(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) { }

	@Override
	protected void actionPerformed(GuiButton button) {
		 {
		    	if (button == Done)
		    	{
		    		
		    		
		    	
		    		mc.displayGuiScreen((GuiScreen)null);
		    	}
		        else if (button == Next)
		        {
		            if (currPage < TEXTURES.length - 1)
		            {
		            	
		            	
		            	
		            
		                ++currPage;
		             
		            }
		        }
		        else if (button == Back)
		        {
		            if (currPage > 0)
		            {
		            	
		            
		            
		            	
		                --currPage;
		            }
		        }
		    	
		 }
		 
	}

	@Override
	public void onGuiClosed() { }

	@Override
	public boolean doesGuiPauseGame() {
		return true;
	}

	@SideOnly(Side.CLIENT)
   	static class GenericButton extends GuiButton{
		public GenericButton(int x, int y, int width, int height, String text) {
			super(1, x, y, width, height, text);
		}
	}
}
