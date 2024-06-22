package info.kg6jay.moredyes.reference;

import info.kg6jay.moredyes.MoreDyes;
import info.kg6jay.moredyes.utility.BlockInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Reference
{
	public static final String MOD_ID="MoreDyes";
	public static final String MOD_NAME="More Dyes";
	public static final String MOD_VERSION="@VERSION@";

	public static final String CLIENT_PROXY="info.kg6jay.moredyes.proxy.ClientProxy";
	public static final String SERVER_PROXY="info.kg6jay.moredyes.proxy.ServerProxy";

	public static final BlockInfo BLOCK_INFO_WOOL= new BlockInfo("wool",Material.cloth,0.8f,Block.soundTypeCloth,"sword",0);
	public static final BlockInfo BLOCK_INFO_STONE=new BlockInfo("stone",Material.rock,1.5f,Block.soundTypeStone,"pickaxe",1,10.0f);
    public static final BlockInfo BLOCK_INFO_HARDENED_CLAY=new BlockInfo("hardenedClay",Material.rock,1.5f,Block.soundTypeStone,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_COBBLE=new BlockInfo("cobble",Material.rock,1.5f,Block.soundTypeStone,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_STONE_BRICK_CARVED=new BlockInfo("stonebrickcarved",Material.rock,1.5f,Block.soundTypeStone,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_STONE_BRICK_CRACKED=new BlockInfo("stonebrickcracked",Material.rock,1.5f,Block.soundTypeStone,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_STONE_BRICK=new BlockInfo("stonebrick",Material.rock,1.5f,Block.soundTypeStone,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_OBSIDIAN=new BlockInfo("obsidian",Material.rock,50.0f,Block.soundTypePiston,"pickaxe",3,2000.0f);
	public static final BlockInfo BLOCK_INFO_SOULSAND = new BlockInfo("soulsand",Material.sand,0.5f,Block.soundTypeSand, "shovel", 0);
	public static final BlockInfo BLOCK_INFO_QUARTZ = new BlockInfo("quartz",Material.rock,0.8f,Block.soundTypePiston,"pickaxe",2);
	public static final BlockInfo BLOCK_INFO_CLAY = new BlockInfo("clay",Material.clay,1.25f, Block.soundTypePiston, "pickaxe", 1, 7.0f);
	public static final BlockInfo BLOCK_INFO_COAL = new BlockInfo("coal",Material.rock,5.0f,Block.soundTypeStone,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_GLOWSTONE = new BlockInfo("glowstone",Material.glass,0.3f,Block.soundTypeGlass,"pickaxe",1);
	public static final BlockInfo BLOCK_INFO_REDSTONE = new BlockInfo("redstone",Material.iron,5.0f,Block.soundTypeMetal,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_LAPIS = new BlockInfo("lapis",Material.rock,3.0f,Block.soundTypePiston,"pickaxe",2,5.0f);
	public static final BlockInfo BLOCK_INFO_PLANK = new BlockInfo("plank",Material.wood,2.0f,Block.soundTypeWood,"axe",0,5.0f,MoreDyes.tabTrees);
	public static final BlockInfo BLOCK_INFO_TULIP = new BlockInfo("tulip",Material.plants,0.0f,Block.soundTypeGrass,"",0);
	public static final BlockInfo BLOCK_INFO_LOG = new BlockInfo("log",Material.wood,2.0f,Block.soundTypeWood,"axe",0,1.0f,MoreDyes.tabTrees);
	public static final BlockInfo BLOCK_INFO_LEAVES = new BlockInfo("leaf",Material.leaves,0.2f,Block.soundTypeGrass,"axe",0,1.0f,MoreDyes.tabTrees);
	public static final BlockInfo BLOCK_INFO_SAPLING = new BlockInfo("sapling",Material.plants,0.0f,Block.soundTypeGrass,"",0,1.0f,MoreDyes.tabTrees);

	public static final BlockInfo BLOCK_INFO_GLASS = new BlockInfo("glass",Material.glass,0.4f,Block.soundTypeGlass,"pickaxe",0,1.0f);

	public static final BlockInfo BLOCK_INFO_SLAB = new BlockInfo("slab",Material.rock,1.0f,Block.soundTypePiston,"pickaxe",1,10.0f);
	public static final BlockInfo BLOCK_INFO_WORKBENCH = new BlockInfo("workbench",Material.wood,2.5f,Block.soundTypeWood,"axe",0);
	public static final BlockInfo BLOCK_INFO_BRICK = new BlockInfo("brick",Material.rock,2.0f,Block.soundTypePiston,"pickaxe",1);
	public static final BlockInfo BLOCK_INFO_SAND = new BlockInfo("sand", Material.sand, 0.5f, Block.soundTypeSand, "shovel", 0);

    public static final BlockInfo BLOCK_INFO_SANDSTONE = new BlockInfo ("sandstone", Material.rock, 2f,Block.soundTypeStone, "pickaxe", 1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_DIORITE = new BlockInfo ("Diorite", Material.rock, 1.5f, Block.soundTypeStone, "pickaxe", 1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_ANDESITE = new BlockInfo ("andesite", Material.rock, 1.5f, Block.soundTypeStone, "pickaxe", 1,10f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CONCRETE_POWDER = new BlockInfo ("concretepowder", Material.sand, 0.3f, Block.soundTypeSand, "shovel", 0,1f,MoreDyes.tabBlocks);

    // Below are the lines I have added.  Starting from the top of Blocks.java and skipping stuff already here. To start just copy and pasting then I'll go global replace to fix the lines.
    public static final BlockInfo BLOCK_INFO_GRANITE = new BlockInfo ("granite",Material.rock,1.0f,Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_GRANITE = new BlockInfo ("polished_granite",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_DIORITE = new BlockInfo ("polished_diorite",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_ANDESITE = new BlockInfo ("polished_andesite",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_DIRT = new BlockInfo ("dirt",Material.ground,0.5F, Block.soundTypeGrass,"shovel",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_PLANKS = new BlockInfo ("oak_planks",Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_PLANKS = new BlockInfo ("spruce_planks",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_PLANKS = new BlockInfo ("birch_planks",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_PLANKS = new BlockInfo ("jungle_planks",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_PLANKS = new BlockInfo ("acacia_planks",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_PLANKS = new BlockInfo ("dark_oak_planks",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_OAK_SAPLING = new BlockInfo ("oak_sapling", Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees); // all Saplings will need ,.tickRandomly in their .java
    public static final BlockInfo BLOCK_INFO_SPRUCE_SAPLING = new BlockInfo ("spruce_sapling", Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_SAPLING = new BlockInfo ("birch_sapling", Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_SAPLING = new BlockInfo ("jungle_sapling", Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_SAPLING = new BlockInfo ("acacia_sapling", Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_SAPLING = new BlockInfo ("dark_oak_sapling", Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_GRAVEL = new BlockInfo ("gravel", Material.sand,0.6F, Block.soundTypeGravel,null,1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_LOG = new BlockInfo ("oak_log",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_LOG = new BlockInfo ("spruce_log",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_LOG = new BlockInfo ("birch_log",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_LOG = new BlockInfo ("jungle_log",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_LOG = new BlockInfo ("acacia_log",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_LOG = new BlockInfo ("dark_oak_log",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_OAK_LEAVES = new BlockInfo ("oak_leaves",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_LEAVES = new BlockInfo ("spruce_leaves",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_LEAVES = new BlockInfo ("birch_leaves",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_LEAVES = new BlockInfo ("jungle_leaves",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_LEAVES = new BlockInfo ("acacia_leaves",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_LEAVES = new BlockInfo ("dark_oak_leaves",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DISPENSER = new BlockInfo ("dispenser",Material.rock,3.5F, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CHISELED_SANDSTONE = new BlockInfo ("chiseled_sandstone",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CUT_SANDSTONE = new BlockInfo ("cut_sandstone",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_NOTE_BLOCK = new BlockInfo ("note_block",Material.wood,0.8F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BED = new BlockInfo ("bed",Material.wood, 1.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_PISTON = new BlockInfo ("piston",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_PISTON_HEAD = new BlockInfo ("piston_head",Material.piston,1.5f, Block.soundTypePiston,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OXEYE_DAISY = new BlockInfo ("oxeye_daisy",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees); //Effects.REGENERATION, ,
    public static final BlockInfo BLOCK_INFO_CORNFLOWER = new BlockInfo ("cornflower",Material.plants,0, Block.soundTypeGrass,null,0,1.0f, MoreDyes.tabTrees);  //,
    public static final BlockInfo BLOCK_INFO_BOOKSHELF = new BlockInfo ("bookshelf",Material.wood,1.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_MOSSY_COBBLESTONE = new BlockInfo ("mossy_cobblestone",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_STAIRS = new BlockInfo ("oak_stairs",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_FURNACE = new BlockInfo ("furnace",Material.rock,3.5F, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_SIGN = new BlockInfo ("oak_sign",Material.wood,0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_SIGN = new BlockInfo ("spruce_sign",Material.wood, 0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_SIGN = new BlockInfo ("birch_sign",Material.wood,0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_SIGN = new BlockInfo ("acacia_sign",Material.wood,0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_SIGN = new BlockInfo ("jungle_sign",Material.wood, 0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_SIGN = new BlockInfo ("dark_oak_sign",Material.wood, 0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_OAK_DOOR = new BlockInfo ("oak_door",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_LADDER = new BlockInfo ("ladder",Material.wood,0.4F, Block.soundTypeLadder,"axe",0,0.4f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_COBBLESTONE_STAIRS = new BlockInfo ("cobblestone_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_WALL_SIGN = new BlockInfo ("oak_wall_sign",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_WALL_SIGN = new BlockInfo ("spruce_wall_sign",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_WALL_SIGN = new BlockInfo ("birch_wall_sign",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_WALL_SIGN = new BlockInfo ("acacia_wall_sign",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_WALL_SIGN = new BlockInfo ("jungle_wall_sign",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_WALL_SIGN = new BlockInfo ("dark_oak_wall_sign",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_STONE_PRESSURE_PLATE = new BlockInfo ("stone_pressure_plate",Material.rock,0.5F, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_IRON_DOOR = new BlockInfo ("iron_door",Material.iron, 5.0F, Block.soundTypeMetal,"pickaxe",1,5.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_PRESSURE_PLATE = new BlockInfo ("oak_pressure_plate",Material.wood, 0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_PRESSURE_PLATE = new BlockInfo ("spruce_pressure_plate",Material.wood, 0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_PRESSURE_PLATE = new BlockInfo ("birch_pressure_plate",Material.wood, 0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_PRESSURE_PLATE = new BlockInfo ("jungle_pressure_plate",Material.wood, 0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_PRESSURE_PLATE = new BlockInfo ("acacia_pressure_plate",Material.wood, 0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_PRESSURE_PLATE = new BlockInfo ("dark_oak_pressure_plate",Material.wood, 0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_STONE_BUTTON = new BlockInfo ("stone_button",Material.rock,0.5F,Block.soundTypeStone,null,0,1f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_JUKEBOX = new BlockInfo ("jukebox",Material.wood,2.0F, Block.soundTypeWood,"axe",0,6.0f, MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_FENCE = new BlockInfo ("oak_fence",Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_PUMPKIN = new BlockInfo ("pumpkin",Material.gourd,1.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_NETHERRACK = new BlockInfo ("netherrack",Material.rock,0.4F, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SOUL_SOIL = new BlockInfo ("soul_soil",Material.ground,0.5F,Block.soundTypeSand,null,1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_BASALT = new BlockInfo ("basalt",Material.rock,1.25F, Block.soundTypeStone,"pickaxe",1,4.25f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_BASALT = new BlockInfo ("polished_basalt",Material.rock,1.25F, Block.soundTypeStone,"pickaxe",1, 4.2F,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CARVED_PUMPKIN = new BlockInfo ("carved_pumpkin",Material.gourd,1.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JACK_O_LANTERN = new BlockInfo ("jack_o_lantern",Material.gourd,1.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_CAKE = new BlockInfo ("cake",Material.cake,0.5F,Block.soundTypeCloth,null,0,0,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_STAINED_GLASS = new BlockInfo ("stained_glass",Material.glass,0.4f,Block.soundTypeGlass,null,0,1.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_TRAPDOOR = new BlockInfo ("oak_trapdoor",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_TRAPDOOR = new BlockInfo ("spruce_trapdoor",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_TRAPDOOR = new BlockInfo ("birch_trapdoor",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_TRAPDOOR = new BlockInfo ("jungle_trapdoor",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_TRAPDOOR = new BlockInfo ("acacia_trapdoor",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_TRAPDOOR = new BlockInfo ("dark_oak_trapdoor",Material.wood,3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_MOSSY_STONE_BRICKS = new BlockInfo ("mossy_stone_bricks",Material.rock,1.5F, Block.soundTypeStone,"pickaxe",1, 6.0F);
    public static final BlockInfo BLOCK_INFO_CRACKED_STONE_BRICKS = new BlockInfo ("cracked_stone_bricks",Material.rock,1.5F, Block.soundTypeStone,"pickaxe",1, 6.0F);
    public static final BlockInfo BLOCK_INFO_CHISELED_STONE_BRICKS = new BlockInfo ("chiseled_stone_bricks",Material.rock,1.5F, Block.soundTypeStone,"pickaxe",1,6.0F);
    public static final BlockInfo BLOCK_INFO_INFESTED_STONE = new BlockInfo ("infested_stone",Material.clay,0, Block.soundTypeStone,"pickaxe",1, 0.75F);
    public static final BlockInfo BLOCK_INFO_INFESTED_COBBLESTONE = new BlockInfo ("infested_cobblestone",Material.clay,0, Block.soundTypeStone,"pickaxe",1,0.75F);
    public static final BlockInfo BLOCK_INFO_INFESTED_STONE_BRICKS = new BlockInfo ("infested_stone_bricks",Material.clay,0, Block.soundTypeStone,"pickaxe",1,0.75F);
    public static final BlockInfo BLOCK_INFO_INFESTED_MOSSY_STONE_BRICKS = new BlockInfo ("infested_mossy_stone_bricks",Material.clay,0, Block.soundTypeStone,"pickaxe",1, 0.75F);
    public static final BlockInfo BLOCK_INFO_INFESTED_CRACKED_STONE_BRICKS = new BlockInfo ("infested_cracked_stone_bricks",Material.clay,0, Block.soundTypeStone,"pickaxe",1,0.75F);
    public static final BlockInfo BLOCK_INFO_INFESTED_CHISELED_STONE_BRICKS = new BlockInfo ("infested_chiseled_stone_bricks",Material.clay,0, Block.soundTypeStone,"pickaxe",1, 0.75F);
    public static final BlockInfo BLOCK_INFO_IRON_BARS = new BlockInfo ("iron_bars",Material.iron,5.0F,Block.soundTypeMetal, "pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CHAIN = new BlockInfo ("chain",Material.iron,5.0F,Block.soundTypeMetal,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_GLASS_PANE = new BlockInfo ("glass_pane",Material.glass,0.4f, Block.soundTypeGlass,null,0,1.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_FENCE_GATE = new BlockInfo ("oak_fence_gate", Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BRICK_STAIRS = new BlockInfo ("brick_stairs",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,10f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_STONE_BRICK_STAIRS = new BlockInfo ("stone_brick_stairs",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,10f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_NETHER_BRICKS = new BlockInfo ("nether_bricks",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_NETHER_BRICK_FENCE = new BlockInfo ("nether_brick_fence",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_NETHER_BRICK_STAIRS = new BlockInfo ("nether_brick_stairs",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_ENCHANTING_TABLE = new BlockInfo ("enchanting_table",Material.rock,5.0F, Block.soundTypeStone,"pickaxe",6, 1200.0F,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CAULDRON = new BlockInfo ("cauldron",Material.iron,2.0F, Block.soundTypeMetal,"pickaxe",1,9f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_END_STONE = new BlockInfo ("end_stone",Material.rock,3.0F, Block.soundTypeStone,"pickaxe",1, 9.0F,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_REDSTONE_LAMP = new BlockInfo ("redstone_lamp",Material.redstoneLight,0.4f, Block.soundTypeGlass,null,0,1.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SANDSTONE_STAIRS = new BlockInfo ("sandstone_stairs",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SPRUCE_STAIRS = new BlockInfo ("spruce_stairs",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_STAIRS = new BlockInfo ("birch_stairs",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_STAIRS = new BlockInfo ("jungle_stairs",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_COBBLESTONE_WALL = new BlockInfo ("cobblestone_wall",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,10f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_MOSSY_COBBLESTONE_WALL = new BlockInfo ("mossy_cobblestone_wall",Material.rock,2.0f, Block.soundTypeStone,"pickaxe",1,10f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_FLOWER_POT = new BlockInfo ("flower_pot",Material.ground, 0, Block.soundTypeGlass,null,0,0,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_OAK_BUTTON = new BlockInfo ("oak_button",Material.wood,0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_BUTTON = new BlockInfo ("spruce_button",Material.wood,0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_BUTTON = new BlockInfo ("birch_button",Material.wood,0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_BUTTON = new BlockInfo ("jungle_button",Material.wood,0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_BUTTON = new BlockInfo ("acacia_button",Material.wood,0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_BUTTON = new BlockInfo ("dark_oak_button",Material.wood,0.5F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_LIGHT_WEIGHTED_PRESSURE_PLATE = new BlockInfo ("light_weighted_pressure_plate",Material.iron, 1.0f, Block.soundTypeMetal, "pickaxe",1,0.5f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_HEAVY_WEIGHTED_PRESSURE_PLATE = new BlockInfo ("heavy_weighted_pressure_plate",Material.iron, 1.0f, Block.soundTypeMetal, "pickaxe",1,0.5f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_HOPPER = new BlockInfo ("hopper",Material.iron,3.0F, Block.soundTypeMetal,"pickaxe",1,4.5f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CHISELED_QUARTZ_BLOCK = new BlockInfo ("chiseled_quartz_block",Material.rock,3.0f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_QUARTZ_PILLAR = new BlockInfo ("quartz_pillar",Material.rock,3.0f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_QUARTZ_STAIRS = new BlockInfo ("quartz_stairs",Material.rock,3.0f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_TERRACOTTA = new BlockInfo ("terracotta",Material.rock,1.25f, Block.soundTypeStone,"pickaxe",1,4.2f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_STAINED_GLASS_PANE = new BlockInfo ("stained_glass_pane",Material.glass,0.4f, Block.soundTypeGlass,null,0,1.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_ACACIA_STAIRS = new BlockInfo ("acacia_stairs",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_STAIRS = new BlockInfo ("dark_oak_stairs",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_IRON_TRAPDOOR = new BlockInfo ("iron_trapdoor",Material.iron,5.0F, Block.soundTypeMetal, "pickaxe",1,5.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_HAY_BLOCK = new BlockInfo ("hay_block",Material.plants,0.5F, Block.soundTypeGrass,null,0,0.5f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CARPET = new BlockInfo ("carpet",Material.carpet,0.1F, Block.soundTypeCloth,null,0,0.1f,MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SUNFLOWER = new BlockInfo ("sunflower",Material.plants, 0.0f, Block.soundTypeGrass,null,0,0.1f,MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_LILAC = new BlockInfo ("lilac",Material.plants,0.0f, Block.soundTypeGrass,null,0,0.1f,MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ROSE_BUSH = new BlockInfo ("rose_bush",Material.plants, 0.0f, Block.soundTypeGrass,null,0,0.1f,MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_PEONY = new BlockInfo ("peony",Material.plants, 0.0f, Block.soundTypeGrass,null,0,0.1f,MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_OAK_SLAB = new BlockInfo ("oak_slab",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_SLAB = new BlockInfo ("spruce_slab",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_SLAB = new BlockInfo ("birch_slab",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_SLAB = new BlockInfo ("jungle_slab",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_SLAB = new BlockInfo ("acacia_slab",Material.wood,2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_SLAB = new BlockInfo ("dark_oak_slab",Material.wood,2.0F,Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_STONE_SLAB = new BlockInfo ("stone_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_STONE_SLAB = new BlockInfo ("smooth_stone_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SANDSTONE_SLAB = new BlockInfo ("sandstone_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CUT_SANDSTONE_SLAB = new BlockInfo ("cut_sandstone_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_PETRIFIED_OAK_SLAB = new BlockInfo ("petrified_oak_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_COBBLESTONE_SLAB = new BlockInfo ("cobblestone_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_BRICK_SLAB = new BlockInfo ("brick_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_STONE_BRICK_SLAB = new BlockInfo ("stone_brick_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_NETHER_BRICK_SLAB = new BlockInfo ("nether_brick_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_QUARTZ_SLAB = new BlockInfo ("quartz_slab",Material.rock,3.0f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_STONE = new BlockInfo ("smooth_stone",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_SANDSTONE = new BlockInfo ("smooth_sandstone",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_QUARTZ = new BlockInfo ("smooth_quartz",Material.rock,3.0f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SPRUCE_FENCE_GATE = new BlockInfo ("spruce_fence_gate", Material.wood, 2.0F,Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_FENCE_GATE = new BlockInfo ("birch_fence_gate", Material.wood, 2.0F,Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_FENCE_GATE = new BlockInfo ("jungle_fence_gate", Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_FENCE_GATE = new BlockInfo ("acacia_fence_gate", Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_FENCE_GATE = new BlockInfo ("dark_oak_fence_gate", Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_FENCE = new BlockInfo ("spruce_fence",Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_FENCE = new BlockInfo ("birch_fence",Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_FENCE = new BlockInfo ("jungle_fence",Material.wood, 2.0F, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_FENCE = new BlockInfo ("acacia_fence",Material.wood, 2.0F,Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_FENCE = new BlockInfo ("dark_oak_fence",Material.wood, 2.0F,Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SPRUCE_DOOR = new BlockInfo ("spruce_door",Material.wood, 3.0F,Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BIRCH_DOOR = new BlockInfo ("birch_door",Material.wood, 3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_JUNGLE_DOOR = new BlockInfo ("jungle_door",Material.wood, 3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_ACACIA_DOOR = new BlockInfo ("acacia_door",Material.wood, 3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_DARK_OAK_DOOR = new BlockInfo ("dark_oak_door",Material.wood, 3.0F, Block.soundTypeWood,"axe",0,3.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_END_STONE_BRICKS = new BlockInfo ("end_stone_bricks",Material.rock,3.0F, Block.soundTypeStone,"pickaxe",1,9f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_BONE_BLOCK = new BlockInfo ("bone_block",Material.rock,2.0F, Block.soundTypeWood,"pickaxe",1,3f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SHULKER_BOX = new BlockInfo ("shulker_box",Material.rock,2.5f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_GLAZED_TERRACOTTA = new BlockInfo ("glazed_terracotta",Material.rock,1.4F, Block.soundTypeStone,"pickaxe",1,1.2f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CONCRETE = new BlockInfo ("concrete",Material.rock,1.8F, Block.soundTypeStone,"pickaxe",1,1.8f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CONDUIT = new BlockInfo ("conduit",Material.glass,3.0F, Block.soundTypeGlass,null,0,3,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_GRANITE_STAIRS = new BlockInfo ("polished_granite_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_MOSSY_STONE_BRICK_STAIRS = new BlockInfo ("mossy_stone_brick_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_DIORITE_STAIRS = new BlockInfo ("polished_diorite_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_MOSSY_COBBLESTONE_STAIRS = new BlockInfo ("mossy_cobblestone_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_END_STONE_BRICK_STAIRS = new BlockInfo ("end_stone_brick_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,9.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_STONE_STAIRS = new BlockInfo ("stone_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_SANDSTONE_STAIRS = new BlockInfo ("smooth_sandstone_stairs",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_QUARTZ_STAIRS = new BlockInfo ("smooth_quartz_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_GRANITE_STAIRS = new BlockInfo ("granite_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_ANDESITE_STAIRS = new BlockInfo ("andesite_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_RED_NETHER_BRICK_STAIRS = new BlockInfo ("red_nether_brick_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_ANDESITE_STAIRS = new BlockInfo ("polished_andesite_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_DIORITE_STAIRS = new BlockInfo ("diorite_stairs",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_GRANITE_SLAB = new BlockInfo ("polished_granite_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_MOSSY_STONE_BRICK_SLAB = new BlockInfo ("mossy_stone_brick_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_DIORITE_SLAB = new BlockInfo ("polished_diorite_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_MOSSY_COBBLESTONE_SLAB = new BlockInfo ("mossy_cobblestone_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_END_STONE_BRICK_SLAB = new BlockInfo ("end_stone_brick_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_SANDSTONE_SLAB = new BlockInfo ("smooth_sandstone_slab",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SMOOTH_QUARTZ_SLAB = new BlockInfo ("smooth_quartz_slab",Material.rock,3.0f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_GRANITE_SLAB = new BlockInfo ("granite_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_ANDESITE_SLAB = new BlockInfo ("andesite_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_RED_NETHER_BRICK_SLAB = new BlockInfo ("red_nether_brick_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_POLISHED_ANDESITE_SLAB = new BlockInfo ("polished_andesite_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_DIORITE_SLAB = new BlockInfo ("diorite_slab",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_BRICK_WALL = new BlockInfo ("brick_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_MOSSY_STONE_BRICK_WALL = new BlockInfo ("mossy_stone_brick_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_GRANITE_WALL = new BlockInfo ("granite_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_STONE_BRICK_WALL = new BlockInfo ("stone_brick_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_NETHER_BRICK_WALL = new BlockInfo ("nether_brick_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_ANDESITE_WALL = new BlockInfo ("andesite_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_RED_NETHER_BRICK_WALL = new BlockInfo ("red_nether_brick_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SANDSTONE_WALL = new BlockInfo ("sandstone_wall",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_END_STONE_BRICK_WALL = new BlockInfo ("end_stone_brick_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_DIORITE_WALL = new BlockInfo ("diorite_wall",Material.rock,1.5f, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_SCAFFOLDING = new BlockInfo ("scaffolding",Material.wood,0, Block.soundTypeWood,null,0,0,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_LOOM = new BlockInfo ("loom",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_BARREL = new BlockInfo ("barrel",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SMOKER = new BlockInfo ("smoker",Material.rock,3.5F, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_BLAST_FURNACE = new BlockInfo ("blast_furnace",Material.rock,3.5F, Block.soundTypeStone,"pickaxe",1,10.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CARTOGRAPHY_TABLE = new BlockInfo ("cartography_table",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_FLETCHING_TABLE = new BlockInfo ("fletching_table",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_GRINDSTONE = new BlockInfo ("grindstone",Material.anvil,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_LECTERN = new BlockInfo ("lectern",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_SMITHING_TABLE = new BlockInfo ("smithing_table",Material.wood,2.0f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_STONECUTTER = new BlockInfo ("stonecutter",Material.rock,3.5F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_BELL = new BlockInfo ("bell",Material.anvil,5.0F, Block.soundTypeAnvil ,"pickaxe",1,5.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_LANTERN = new BlockInfo ("lantern",Material.iron,3.5F, Block.soundTypeMetal,"pickaxe",1,3.5f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_COMPOSTER = new BlockInfo ("composter",Material.wood,0.6f, Block.soundTypeWood,"axe",0,0.6f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_TARGET = new BlockInfo ("target",Material.rock,0.5F, Block.soundTypeStone,"axe",0,0.5f, MoreDyes.tabTrees);
    public static final BlockInfo BLOCK_INFO_NETHERITE_BLOCK = new BlockInfo ("netherite_block",Material.iron,50.0F, Block.soundTypeStone,"pickaxe",4,1200.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CRYING_OBSIDIAN = new BlockInfo ("crying_obsidian",Material.rock,50.0F, Block.soundTypeStone,"pickaxe",4,1200.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CHISELED_NETHER_BRICKS = new BlockInfo ("chiseled_nether_bricks",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CRACKED_NETHER_BRICKS = new BlockInfo ("cracked_nether_bricks",Material.rock,2.0F, Block.soundTypeStone,"pickaxe",1,6.0f,MoreDyes.tabBlocks);
    public static final BlockInfo BLOCK_INFO_CHEST = new BlockInfo ("chest",Material.wood,2.5f, Block.soundTypeWood,"axe",0,1.0f, MoreDyes.tabTrees);

    public static final String[] BLOCKTYPES = {"wool", "stone", "cobble", "stonebrickcarved","stonebrickcracked",
        "stonebrick", "obsidian", "soulsand", "quartz", "clay", "coal", "glowstone", "redstone", "lapis", "plank", "tulip", "log",
        "leaf", "sapling", "glass", "glassfoggy", "workbench", "brick", "sand", "concretepowder",
        "sandstonesmooth", "sandstonecarved", "diorite", "andesite", "slab", "granite", "polished_granite",
        "polished_diorite", "polished_andesite", "dirt", "oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks",
        "oak_sapling", "spruce_sapling", "birch_sapling", "jungle_leaves", "acacia_sapling", "dark_oak_sapling", "gravel", "oak_log", "spruce_log", "birch_log", "jungle_log", "acacia_log", "dark_oak_log",
        "oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves", "acacia_leaves", "dark_oak_leaves", "dispenser", "chiseled_sandstone", "cut_sandstone", "note_block", "bed", "piston", "piston_head",
        "oxeye_daisy", "cornflower", "bookshelf", "mossy_cobblestone", "oak_stairs", "furnace", "oak_sign", "oak_sign", "spruce_sign", "birch_sign", "acacia_sign", "jungle_sign", "dark_oak_sign", "oak_door" ,"ladder", "cobblestone_stairs",
        "oak_wall_sign", "spruce_wall_sign", "birch_wall_sign", "acacia_wall_sign", "jungle_wall_sign", "dark_oak_wall_sign", "stone_pressure_plate", "iron_door", "oak_pressure_plate", "spruce_pressure_plate", "birch_pressure_plate",
        "jungle_pressure_plate", "acacia_pressure_plate", "dark_oak_pressure_plate", "stone_button", "stone_button", "jukebox", "oak_fence", "pumpkin", "netherrack", "soul_soil", "basalt", "polished_basalt", "carved_pumpkin0",
        "jack_o_lantern", "cake", "stained_glass", "oak_trapdoor", "spruce_trapdoor", "birch_trapdoor", "jungle_trapdoor", "acacia_trapdoor", "dark_oak_trapdoor", "mossy_stone_bricks", "cracked_stone_bricks",
        "chiseled_stone_bricks", "infested_stone", "infested_cobblestone", "infested_stone_bricks", "infested_mossy_stone_bricks", "infested_cracked_stone_bricks", "infested_chiseled_stone_bricks", "iron_bars",
        "chain", "glass_pane", "oak_fence_gate", "brick_stairs", "stone_brick_stairs", "nether_bricks", "nether_brick_fence", "nether_brick_stairs", "enchanting_table", "cauldron", "end_stone", "redstone_lamp",
        "sandstone_stairs", "spruce_stairs", "birch_stairs", "jungle_stairs", "cobblestone_wall", "mossy_cobblestone_wall", "flower_pot", "oak_button", "spruce_button", "birch_button", "jungle_button",
        "acacia_button", "dark_oak_button", "light_weighted_pressure_plate", "heavy_weighted_pressure_plate", "hopper", "chiseled_quartz_block", "quartz_pillar", "quartz_stairs", "terracotta", "stained_glass_pane",
        "acacia_stairs", "dark_oak_stairs", "iron_trapdoor", "hay_block", "carpet", "sunflower", "lilac", "rose_bush", "peony", "oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab",
        "stone_slab", "smooth_stone_slab", "sandstone_slab", "cut_sandstone_slab", "petrified_oak_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab", "smooth_stone",
        "smooth_sandstone", "smooth_quartz", "spruce_fence_gate", "birch_fence_gate", "jungle_fence_gate", "acacia_fence_gate", "dark_oak_fence_gate", "spruce_fence", "birch_fence", "jungle_fence", "acacia_fence", "dark_oak_fence",
        "spruce_door", "birch_door", "jungle_door", "acacia_door", "dark_oak_door", "end_stone_bricks", "bone_block", "shulker_box", "glazed_terracotta", "concrete", "conduit", "polished_granite_stairs", "mossy_stone_brick_stairs",
        "polished_diorite_stairs", "mossy_cobblestone_stairs", "end_stone_brick_stairs", "stone_stairs", "stone_stairs", "smooth_sandstone_stairs", "smooth_quartz_stairs", "granite_stairs", "andesite_stairs", "red_nether_brick_stairs",
        "polished_andesite_stairs", "diorite_slab", "brick_wall", "mossy_stone_brick_wall", "granite_wall", "stone_brick_wall", "nether_brick_wall", "andesite_wall", "red_nether_brick_wall", "sandstone_wall", "end_stone_brick_wall",
        "diorite_wall", "scaffolding", "loom", "barrel", "smoker", "blast_furnace", "cartography_table", "fletching_table", "grindstone", "lectern", "composter", "target", "netherite_block", "crying_obsidian",
        "chiseled_nether_bricks", "cracked_nether_bricks", "chest"};


	public static final BlockInfo BLOCK_INFO_ROCK_WOOL= new BlockInfo("woolRock",Material.cloth,0.8f,Block.soundTypeCloth,"sword",0);
}
