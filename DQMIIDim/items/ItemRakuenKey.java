package DQMIIDim.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRakuenKey extends Item
{
    public ItemRakuenKey(int par1)
    {
        super(par1);
        this.setUnlocalizedName("item.EdenKey.name");
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setMaxDamage(325);
        this.maxStackSize = 1;
    }

    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {

        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
        	/*
        	if (DQMX.blockportalRakuenDim == null || !DQMX.blockportalRakuenDim.tryToCreatePortal(par3World, par4, par5, par6))
        	{
	            if (par3World.isAirBlock(par4, par5, par6))
	            {
	                par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                par3World.setBlock(par4, par5, par6, Block.fire.blockID);
	            }
	            //dqm3modExt.funcDimension.blockportalCrossDim.tryToCreatePortal(par3World, par4, par5, par6);
        	}
        	*/

        	//System.out.println("TEST4" + par3World.getBlockId(par4, par5, par6));
        	//System.out.println("TEST5" + par3World.getBlockId(par4, par5 - 1, par6));

        	//System.out.println("TEST4" + par3World.getBlockId(par4, par5 - 1, par6));

        	if (par3World.getBlockId(par4, par5 - 1, par6) == Block.blockNetherQuartz.blockID && par5 < 128)
        	{
        		//天空ゲート
        		//Block.blocksList[par3World.getBlockId(par4, par5, par6)].try
        		if (DQMIIDim.BlockList.DqmDimGate2.tryToCreatePortal(par3World, par4, par5 - 1, par6))
        		{
                    par1ItemStack.damageItem(50, par2EntityPlayer);
                    return true;
        		}

        	}

            if (par3World.isAirBlock(par4, par5, par6))
            {
                par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                par3World.setBlock(par4, par5, par6, Block.fire.blockID);
            }

            par1ItemStack.damageItem(1, par2EntityPlayer);
            return true;
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("EdenKey");
    }
}
