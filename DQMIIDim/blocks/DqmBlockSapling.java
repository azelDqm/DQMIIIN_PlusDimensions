package DQMIIDim.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.event.terraingen.TerrainGen;
import DQMII.DqmTabNextBlock;
import DQMIIDim.gen.WorldGenBigTreeX;
import DQMIIDim.gen.WorldGenForestX;
import DQMIIDim.gen.WorldGenHugeTreesX;
import DQMIIDim.gen.WorldGenTreesX;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//public class DqmBlockSapling extends BlockFlower
public class DqmBlockSapling extends BlockSapling
{
    //public static final String[] WOOD_TYPES = new String[] {"oak", "spruce", "birch", "jungle"};
    //private static final String[] field_94370_b = new String[] {"sapling", "sapling_spruce", "sapling_birch", "sapling_jungle"};
    @SideOnly(Side.CLIENT)
    private Icon[] saplingIcon;

    public DqmBlockSapling(int par1)
    {
        super(par1);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        //this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            super.updateTick(par1World, par2, par3, par4, par5Random);

            if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0)
            {
                this.markOrGrowMarked(par1World, par2, par3, par4, par5Random);
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        //par2 &= 3;
        return this.saplingIcon[par2];
    }


    public void markOrGrowMarked(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4);

        this.growTree(par1World, par2, par3, par4, par5Random);
    }

    public void fertilize(World world, int i, int j, int k, Random l)
    {
        //world.setBlockMetadataWithNotify(i, j, k, this, 2);
    	//world.setBlockMetadataWithNotify(i, j, k, m, 2);
        this.growTree(world, i, j, k, l);
    }

    /**
     * Attempts to grow a sapling into a tree
     */
    /*
    public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4))
        {
            return;
        }

        //int l = par5Random.nextInt(4);
        int l = par5Random.nextInt(4);
        int r = par1World.getBlockMetadata(par2, par3, par4);
        Object object = null;
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;

        if (l == 0)
        {
            object = new WorldGenForestX(true);
        }
        else if (l == 1)
        {
            for (i1 = 0; i1 >= -1; --i1)
            {
                for (j1 = 0; j1 >= -1; --j1)
                {
                    if (this.isSameSapling(par1World, par2 + i1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
                    {
                        object = new WorldGenHugeTreesX(true, 10 + par5Random.nextInt(20), 3, 3);
                        flag = true;
                        break;
                    }
                }

                if (object != null)
                {
                    break;
                }
            }

            if (object == null)
            {
                j1 = 0;
                i1 = 0;
                object = new WorldGenTreesX(true, 4 + par5Random.nextInt(7), 3, 3, false);
            }
        }
        else
        {
            object = new WorldGenTreesX(true);

            if (par5Random.nextInt(10) == 0)
            {
                object = new WorldGenBigTreeX(true);
            }
        }

        if (flag)
        {
            par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
            par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, 0, 0, 4);
            par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, 0, 0, 4);
            par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, 0, 0, 4);
        }
        else
        {
            par1World.setBlock(par2, par3, par4, 0, 0, 4);
        }

        if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
        {
            if (flag)
            {
                par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, l, 4);
                par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this.blockID, l, 4);
                par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this.blockID, l, 4);
                par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this.blockID, l, 4);
            }
            else
            {
                par1World.setBlock(par2, par3, par4, this.blockID, l, 4);
            }
        }
    }
*/
    public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4))
        {
            return;
        }

        //int l = par5Random.nextInt(4);
        int l = par5Random.nextInt(4);
        int r = par1World.getBlockMetadata(par2, par3, par4);
        Object object = null;
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;
        //System.out.println("ファイル名:" + r);
        //System.out.println("ファイル名3:"+ par2 + "/" + par3 + "/" + par4);

        if (l == 0)
        {
            object = new WorldGenForestX(true);
        }
        else if (l == 1)
        {
            for (i1 = 0; i1 >= -1; --i1)
            {
                for (j1 = 0; j1 >= -1; --j1)
                {
                    if (this.isSameSapling(par1World, par2 + i1, par3, par4 + j1, r) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1, r) && this.isSameSapling(par1World, par2 + i1, par3, par4 + j1 + 1, r) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, r))
                    {
                        object = new WorldGenHugeTreesX(true, 10 + par5Random.nextInt(20), r, r);
                        flag = true;
                        break;
                    }
                }

                if (object != null)
                {
                    break;
                }
            }

            if (object == null)
            {
                j1 = 0;
                i1 = 0;
                object = new WorldGenTreesX(true, 4 + par5Random.nextInt(7), r, r, false);
            }
        }
        else
        {
            object = new WorldGenTreesX(true);

            if (par5Random.nextInt(10) == 0)
            {
                object = new WorldGenBigTreeX(true);
            }
        }

        if (flag)
        {
            par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
            par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, 0, 0, 4);
            par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, 0, 0, 4);
            par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, 0, 0, 4);
        }
        else
        {
            par1World.setBlock(par2, par3, par4, 0, 0, 4);
        }

        if(object instanceof WorldGenForestX)
        {
        	WorldGenForestX obj2 = new WorldGenForestX(true);
	        if (!obj2.generate2(par1World, par5Random, par2 + i1, par3, par4 + j1, r))
	        {
	            par1World.setBlock(par2, par3, par4, this.blockID, r, 4);
	        }

        }else if(object instanceof WorldGenHugeTreesX)
        {
        	WorldGenHugeTreesX obj2 = new WorldGenHugeTreesX(true, 10 + par5Random.nextInt(20), r, r);
            if (!obj2.generate2(par1World, par5Random, par2 + i1, par3, par4 + j1, r))
            {
                par1World.setBlock(par2, par3, par4, this.blockID, r, 4);
            }
        }else
        {
        	WorldGenTreesX obj2 = new WorldGenTreesX(true);
            if (!obj2.generate2(par1World, par5Random, par2 + i1, par3, par4 + j1, r))
            {
                par1World.setBlock(par2, par3, par4, this.blockID, r, 4);
            }
        }
        /*
        if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
        {
            par1World.setBlock(par2, par3, par4, this.blockID, r, 4);
        }*/
    }
    /**
     * Determines if the same sapling is present at the given location.
     */
    public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
    {
        return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4)) == par5;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        //return par1 & 3;
    	return this.blockID;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	for (int i = 0; i < 9 ; i++)
    	{
    		par3List.add(new ItemStack(par1, 1, i));
    	}
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.saplingIcon = new Icon[9];

        for (int i = 0; i < this.saplingIcon.length; ++i)
        {
            this.saplingIcon[i] = par1IconRegister.registerIcon("saplingN_" + i);
            this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);
        }
    }
}
