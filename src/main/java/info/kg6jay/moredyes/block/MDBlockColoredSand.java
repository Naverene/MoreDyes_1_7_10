package info.kg6jay.moredyes.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import info.kg6jay.moredyes.handler.ConfigHandler;
import info.kg6jay.moredyes.reference.Reference;
import info.kg6jay.moredyes.utility.BlockInfo;
import net.minecraft.block.BlockFalling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class MDBlockColoredSand extends BlockFalling implements IBlockColored
{
    @SideOnly(Side.CLIENT)
    protected IIcon[] icons;
    protected String[] blockColors;
    protected String blockName,colorSet;
	public MDBlockColoredSand(String[] colors, BlockInfo info, String colorSet)
	{
		super(info.blockMaterial);
        this.blockColors=colors;
        this.blockName=info.blockName;
        this.colorSet = colorSet;
        this.setHardness(info.hardness);
        this.setHarvestLevel(info.harvestTool, info.harvestLevel);
        this.setStepSound(info.sound);
        this.setResistance(info.resistance);
        char tmp = (char)(((int)this.blockName.charAt(0))-32);
        this.setBlockName(colorSet+"Mix"+tmp+this.blockName.substring(1));
        this.setCreativeTab(info.tab);
	}
	@Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < blockColors.length; ++i)
        {
        	list.add(new ItemStack(item, 1, i));
        }
    }
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
    	if(meta>=this.icons.length)
    	{
    		meta=0;
    	}
        return this.icons[meta];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.icons = new IIcon[blockColors.length];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":"+blockName+"/" + blockColors[i]);
        }
    }
    @Override
    public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z)
    {
        if(ConfigHandler.overrideDefaultMobSpawning)
        {
            return ConfigHandler.mobSpawnOnBlock;
        }
        else
        {
            return super.canCreatureSpawn(type, world, x, y, z);
        }
    }
    public int damageDropped(int meta)
    {
        return meta;
    }
    public String getColorSet()
    {
    	return this.colorSet;
    }
    public int getMaxMeta()
    {
    	return this.blockColors.length-1;
    }
}
