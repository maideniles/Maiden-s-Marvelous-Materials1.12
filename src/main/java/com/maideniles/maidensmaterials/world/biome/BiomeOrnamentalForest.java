package com.maideniles.maidensmaterials.world.biome;
 
import java.util.List;
import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;
import com.maideniles.maidensmaterials.init.BiomeInit;
import com.maideniles.maidensmaterials.init.MaidensBlocks;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenSilverBellTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenSilverbellTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenWisteriaTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenCedarTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenCrabappleTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenCrabappleTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenDogwoodTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenDogwoodTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenJacarandaTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenJacarandaTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenLaburnumTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenLaburnumTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenPaulowniaTree;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenPaulowniaTreeTallVines;
import com.maideniles.maidensmaterials.world.feature.tree.WorldGenWisteriaTreeTallVines;
 
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Blocks;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.Biome.FlowerEntry;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
public class BiomeOrnamentalForest extends Biome {
 
    
   
    private int WaterColorMultiplier;
 
    public BiomeOrnamentalForest() {
        super(new BiomeProperties("Ornamental Forest").setBaseHeight(0.125F).setHeightVariation(0.01F).setTemperature(0.7F).setRainfall(0.8F).setWaterColor(65535));
       
 
    topBlock = MaidensBlocks.ornamental_grass.getDefaultState();
    fillerBlock = Blocks.DIRT.getDefaultState();
   
   
   
   
   
    this.decorator.treesPerChunk = -1;
    this.decorator.grassPerChunk = 2;
    this.decorator.flowersPerChunk = 60;
    this.decorator.mushroomsPerChunk = 70;
    this.decorator.bigMushroomsPerChunk = 2;
 
    this.spawnableCaveCreatureList.clear();
    this.spawnableCreatureList.clear();
    this.spawnableMonsterList.clear();
    this.spawnableWaterCreatureList.clear();
    this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 10, 1, 5));
    this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class, 10, 1, 5));
    this.addDefaultFlowers();
    this.WaterColorMultiplier = 16777215;
   
    
    this.flowers.clear();
    for (BlockFlower.EnumFlowerType type : BlockFlower.EnumFlowerType.values())
    {
        if (type.getBlockType() == BlockFlower.EnumFlowerColor.YELLOW) continue;
        if (type == BlockFlower.EnumFlowerType.BLUE_ORCHID) type = BlockFlower.EnumFlowerType.BLUE_ORCHID;
        addFlower(net.minecraft.init.Blocks.RED_FLOWER.getDefaultState().withProperty(net.minecraft.init.Blocks.RED_FLOWER.getTypeProperty(), type), 10);
    }
 }
   
   
     @SideOnly(Side.CLIENT)
        public int getGrassColorAtPos(BlockPos pos)
        {
           
            return 108855;
        }
     
    @Override
    public int getFoliageColorAtPos(BlockPos pos) {
        // TODO Auto-generated method stub
        return 108855;
    }
   
   
   
    public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
    {
       
            double d0 = MathHelper.clamp((1.0D + GRASS_COLOR_NOISE.getValue((double)pos.getX() / 48.0D, (double)pos.getZ() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
            BlockFlower.EnumFlowerType blockflower$enumflowertype = BlockFlower.EnumFlowerType.values()[(int)(d0 * (double)BlockFlower.EnumFlowerType.values().length)];
            return blockflower$enumflowertype == BlockFlower.EnumFlowerType.BLUE_ORCHID ? BlockFlower.EnumFlowerType.BLUE_ORCHID : blockflower$enumflowertype;
     
    }
   
   
     public void addDoublePlants(World p_185378_1_, Random p_185378_2_, BlockPos p_185378_3_, int p_185378_4_)
        {
            for (int i = 0; i < p_185378_4_; ++i)
            {
                int j = p_185378_2_.nextInt(3);
 
                if (j == 0)
                {
                    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
                }
                else if (j == 1)
                {
                    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.ROSE);
                }
                else if (j == 2)
                {
                    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.PAEONIA);
                }
 
                for (int k = 0; k < 5; ++k)
                {
                    int l = p_185378_2_.nextInt(16) + 8;
                    int i1 = p_185378_2_.nextInt(16) + 8;
                    int j1 = p_185378_2_.nextInt(p_185378_1_.getHeight(p_185378_3_.add(l, 0, i1)).getY() + 32);
 
                    if (DOUBLE_PLANT_GENERATOR.generate(p_185378_1_, p_185378_2_, new BlockPos(p_185378_3_.getX() + l, j1, p_185378_3_.getZ() + i1)))
                    {
                        break;
                    }
                }
            }
        }
   
     public void addCedarTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                 int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(3);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree CEDAR = new WorldGenCedarTree(true, true); //tall cedar tree
                	 
                     CEDAR.generate(p_185379_1_, p_185379_2_, blockpos);
                   
                    } else {
                }
             }
         }
     }
     
     public void addCrabappleTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(2);
                 int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(2);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree CRABAPPLE = new WorldGenCrabappleTree(true, true);  //tall Crabapple Tree//
                	 WorldGenAbstractTree CRABAPPLE_VINES = new WorldGenCrabappleTreeTallVines(true); //tall Crabapple Tree with vines//
                	 
                    if(ConfigHandler.FOREST_SPAWN_CRABAPPLE_WITH_VINES){
                    	CRABAPPLE_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                    }
                    else{
                     CRABAPPLE.generate(p_185379_1_, p_185379_2_, blockpos);
                    } 
                    } else {
                }
             }
         }
     }
        
     public void addDogwoodTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(5);
                 int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(5);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree DOGWOOD = new WorldGenDogwoodTree(true, true); //tall dogwood tree wth vines//
                	 WorldGenAbstractTree DOGWOOD_VINES = new WorldGenDogwoodTreeTallVines(true);
                    
                	 
                	 if(ConfigHandler.FOREST_SPAWN_DOGWOOD_WITH_VINES){
                     	DOGWOOD_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                     }
                	 else{
                     DOGWOOD.generate(p_185379_1_, p_185379_2_, blockpos);
                	 }
                    } else {
                }
             }
         }
     }
     
     public void addJacarandaTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 1 + 8 + p_185379_2_.nextInt(4);
                 int l = j * 4 + 1 + 8 + p_185379_2_.nextInt(4);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree JACARANDA = new WorldGenJacarandaTree(true, true); //tall Jacaranda tree with vines//
                	 WorldGenAbstractTree JACARANDA_VINES = new WorldGenJacarandaTreeTallVines(true);
                    
                	 
                	 if(ConfigHandler.FOREST_SPAWN_JACARANDA_WITH_VINES){
                     	JACARANDA_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                     }
                	 else{
                     JACARANDA.generate(p_185379_1_, p_185379_2_, blockpos);
                	 }
                    } else {
                }
             }
         }
     }
     
     public void addLaburnumTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 3 + 8 + p_185379_2_.nextInt(3);
                 int l = j * 4 + 3 + 8 + p_185379_2_.nextInt(3);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree LABURNUM = new WorldGenLaburnumTree(true, true); //tall Laburnum tree with vines//
                	 WorldGenAbstractTree LABURNUM_VINES = new WorldGenLaburnumTreeTallVines(true);
                    
                	 if(ConfigHandler.FOREST_SPAWN_LABURNUM_WITH_VINES){
                     	LABURNUM_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                     }
                	 else{
                    LABURNUM.generate(p_185379_1_, p_185379_2_, blockpos);
                	 }
                    } else {
                }
             }
         }
     }
     
     public void addPaulowniaTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 2 + 8 + p_185379_2_.nextInt(5);
                 int l = j * 4 + 2 + 8 + p_185379_2_.nextInt(5);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree PAULOWNIA = new WorldGenPaulowniaTree(true,true);
                	 WorldGenAbstractTree PAULOWNIA_VINES = new WorldGenPaulowniaTreeTallVines(true); //tall Paulownia tree with vines//
                
                	 if(ConfigHandler.FOREST_SPAWN_PAULOWNIA_WITH_VINES){
                      	PAULOWNIA_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                      }
                	 else{
                    PAULOWNIA.generate(p_185379_1_, p_185379_2_, blockpos);
                	 }
                    } else {
                }
             }
         }
     }
     
     public void addSilverbellTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 3 + 8 + p_185379_2_.nextInt(2);
                 int l = j * 4 + 3 + 8 + p_185379_2_.nextInt(2);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree SILVERBELL = new WorldGenSilverbellTree(true,true);
                	 WorldGenAbstractTree SILVERBELL_VINES = new WorldGenSilverBellTreeTallVines(true); //tall Silverbell tree with vines//
                
                	 if(ConfigHandler.FOREST_SPAWN_SILVERBELL_WITH_VINES){
                       	SILVERBELL_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                       }
                	 else{
                    SILVERBELL.generate(p_185379_1_, p_185379_2_, blockpos);
                	 }
                    } else {
                }
             }
         }
     }
     
     public void addWisteriaTrees(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_) {

         for (int i = 0; i < 4; ++i) {
             for (int j = 0; j < 4; ++j) {
                 int k = i * 4 + 2 + 8 + p_185379_2_.nextInt(1);
                 int l = j * 4 + 2 + 8 + p_185379_2_.nextInt(1);
                 BlockPos blockpos = p_185379_1_.getHeight(p_185379_3_.add(k, 0, l));
                 BlockPos blockpos2 = p_185379_1_.getHeight(p_185379_3_.add(k, -2, l));

                 if (p_185379_2_.nextInt(1) == 0 && net.minecraftforge.event.terraingen.TerrainGen.decorate(p_185379_1_, p_185379_2_, blockpos, 
                		 net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE)) {
                	
                	 WorldGenAbstractTree WISTERIA = new WorldGenWisteriaTree(true,true);
                	 WorldGenAbstractTree WISTERIA_VINES = new WorldGenWisteriaTreeTallVines(true); //tall Wisteria tree with vines
                	 
                	 if(ConfigHandler.FOREST_SPAWN_WISTERIA_WITH_VINES){
                       	WISTERIA_VINES.generate(p_185379_1_, p_185379_2_, blockpos);
                       }
                	 else{
                    WISTERIA.generate(p_185379_1_, p_185379_2_, blockpos);
                	 }
                    } else {
                }
             }
         }
     }
     
     public void decorate(World worldIn, Random rand, BlockPos pos)
        {
            if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
            { // no tab for patch
            int i = rand.nextInt(5) - 3;
 
            this.addDoublePlants(worldIn, rand, pos, i);
            
            this.addCedarTrees(worldIn, rand, pos);
            this.addCrabappleTrees(worldIn, rand, pos);
            this.addDogwoodTrees(worldIn, rand, pos);
            this.addJacarandaTrees(worldIn, rand, pos);
            this.addLaburnumTrees(worldIn, rand, pos);
            this.addPaulowniaTrees(worldIn, rand, pos);
            this.addSilverbellTrees(worldIn, rand, pos);
            this.addWisteriaTrees(worldIn,rand,pos);
            }
            super.decorate(worldIn, rand, pos);
        }
     
   
}