package DQMIIDim.model;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import DQMII.DqmTabNextBlock;
import DQMIIDim.DqmNextDim;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DqmBlockModelStairDim extends BlockContainer
{
    public static String setmodel;
    private String model;
    private boolean field_72156_cr = false;
    private int field_72160_cs = 0;
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    private static final int[][] field_72159_a = new int[][] {{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};

    public DqmBlockModelStairDim(int var1, Material var2)
    {
        super(var1, var2);
        //this.setUnlocalizedName("DqmBlockStairsDim");
        this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);
    }
    private static int getRandom(int max, int min)
    {
        int ret = (int)Math.floor(Math.random() * (max - min + 1)) + min;
        return ret;
    }

    public DqmBlockModelStairDim setmodel(String m)
    {
        model = m;
        return this;
    }
    //光を通す
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    	//return true;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if (this.field_72156_cr)
        {
            this.setBlockBounds(0.5F * (float)(this.field_72160_cs % 2), 0.5F * (float)(this.field_72160_cs / 2 % 2), 0.5F * (float)(this.field_72160_cs / 4 % 2), 0.5F + 0.5F * (float)(this.field_72160_cs % 2), 0.5F + 0.5F * (float)(this.field_72160_cs / 2 % 2), 0.5F + 0.5F * (float)(this.field_72160_cs / 4 % 2));
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void func_82541_d(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {

        //int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
    	DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1IBlockAccess.getBlockTileEntity(par2, par3, par4);

        if (te.getMuki() != 0)
        {
            this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
    }

    public int getRenderType()
    {
    	//return -1;
        //return 10;
    	//return 0;
    	//return -1;
    	return -1;
    }

    public TileEntity createNewTileEntity(World var1)
    {
        try
        {
        	return new DqmTileEntityStairDim();
        }
        catch (Exception var3)
        {
            throw new RuntimeException(var3);
        }
    }

    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
    	//if(!par1World.isRemote)
		//{
	    	DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1World.getBlockTileEntity(par2, par3, par4);
	    	int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

	    	//System.out.println("ファイル名3:" + te.getMuki());

	        if (l == 0)
	        {
	            //par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
	        	te.hougaku = 0;
	        	//te.setHougakuData(0, par1World);
	        }

	        if (l == 1)
	        {
	        	//te.setHougakuData(1, par1World);
	        	te.hougaku = 1;
	            //par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
	        }

	        if (l == 2)
	        {
	        	//te.setHougakuData(2, par1World);
	        	te.hougaku = 2;
	            //par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
	        }

	        if (l == 3)
	        {
	        	//te.setHougakuData(3, par1World);
	        	te.hougaku = 3;
	            //par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
	        }
		//}
    }

    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
    	DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1World.getBlockTileEntity(par2, par3, par4);

    	return par9;
    }

    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.func_82541_d(par1World, par2, par3, par4);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);

        boolean flag = this.func_82542_g(par1World, par2, par3, par4);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        /*

        if (flag && this.func_82544_h(par1World, par2, par3, par4))
        {
            super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
*/
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }


    public boolean func_82544_h(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        //int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
        DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1IBlockAccess.getBlockTileEntity(par2, par3, par4);
        int l = te.getHougakuData();

        int i1 = l & 3;
        float f = 0.5F;
        float f1 = 1.0F;

        if ((l & 4) != 0)
        {
            f = 0.0F;
            f1 = 0.5F;
        }

        float f2 = 0.0F;
        float f3 = 0.5F;
        float f4 = 0.5F;
        float f5 = 1.0F;
        boolean flag = false;
        int j1;
        int k1;
        int l1;

        if (i1 == 0)
        {
            j1 = par1IBlockAccess.getBlockId(par2 - 1, par3, par4);
            k1 = par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                l1 = k1 & 3;

                if (l1 == 3 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 - 1, l))
                {
                    f4 = 0.0F;
                    f5 = 0.5F;
                    flag = true;
                }
                else if (l1 == 2 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 + 1, l))
                {
                    f4 = 0.5F;
                    f5 = 1.0F;
                    flag = true;
                }
            }
        }
        else if (i1 == 1)
        {
            j1 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4);
            k1 = par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                f2 = 0.5F;
                f3 = 1.0F;
                l1 = k1 & 3;

                if (l1 == 3 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 - 1, l))
                {
                    f4 = 0.0F;
                    f5 = 0.5F;
                    flag = true;
                }
                else if (l1 == 2 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 + 1, l))
                {
                    f4 = 0.5F;
                    f5 = 1.0F;
                    flag = true;
                }
            }
        }
        else if (i1 == 2)
        {
            j1 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1);
            k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                f4 = 0.0F;
                f5 = 0.5F;
                l1 = k1 & 3;

                if (l1 == 1 && !this.func_82540_f(par1IBlockAccess, par2 - 1, par3, par4, l))
                {
                    flag = true;
                }
                else if (l1 == 0 && !this.func_82540_f(par1IBlockAccess, par2 + 1, par3, par4, l))
                {
                    f2 = 0.5F;
                    f3 = 1.0F;
                    flag = true;
                }
            }
        }
        else if (i1 == 3)
        {
            j1 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1);
            k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                l1 = k1 & 3;

                if (l1 == 1 && !this.func_82540_f(par1IBlockAccess, par2 - 1, par3, par4, l))
                {
                    flag = true;
                }
                else if (l1 == 0 && !this.func_82540_f(par1IBlockAccess, par2 + 1, par3, par4, l))
                {
                    f2 = 0.5F;
                    f3 = 1.0F;
                    flag = true;
                }
            }
        }

        if (flag)
        {
            this.setBlockBounds(f2, f, f4, f3, f1, f5);
        }

        return flag;
    }


    public boolean func_82542_g(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        //int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
        DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1IBlockAccess.getBlockTileEntity(par2, par3, par4);

        int l = te.getHougakuData();

        int i1 = l;
        //int i1 = l & 3;
        float f = 0.5F;
        float f1 = 1.0F;

        if ((l & 4) != 0)
        {
            f = 0.0F;
            f1 = 0.5F;
        }

        float f2 = 0.0F;
        float f3 = 1.0F;
        float f4 = 0.0F;
        float f5 = 0.5F;
        boolean flag = true;
        int j1;
        int k1;
        int l1;


        //System.out.println("ファイル名3:" + i1);

        //if (i1 == 0)
        if (i1 == 3)
        {
            f2 = 0.5F;
            f5 = 1.0F;
/*
            j1 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4);
            k1 = par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                l1 = k1 & 3;

                if (l1 == 3 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 + 1, l))
                {
                    f5 = 0.5F;
                    flag = false;
                }
                else if (l1 == 2 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 - 1, l))
                {
                    f4 = 0.5F;
                    flag = false;
                }
            }
            */
        }
        else if (i1 == 1)
        {
            f3 = 0.5F;
            f5 = 1.0F;
            /*
            j1 = par1IBlockAccess.getBlockId(par2 - 1, par3, par4);
            k1 = par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                l1 = k1 & 3;

                if (l1 == 3 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 + 1, l))
                {
                    f5 = 0.5F;
                    flag = false;
                }
                else if (l1 == 2 && !this.func_82540_f(par1IBlockAccess, par2, par3, par4 - 1, l))
                {
                    f4 = 0.5F;
                    flag = false;
                }
            }
            */
        }
        //else if (i1 == 2)
        else if (i1 == 0)
        {
            f4 = 0.5F;
            f5 = 1.0F;
/*
            j1 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1);
            k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                l1 = k1 & 3;

                if (l1 == 1 && !this.func_82540_f(par1IBlockAccess, par2 + 1, par3, par4, l))
                {
                    f3 = 0.5F;
                    flag = false;
                }
                else if (l1 == 0 && !this.func_82540_f(par1IBlockAccess, par2 - 1, par3, par4, l))
                {
                    f2 = 0.5F;
                    flag = false;
                }
            }
*/
        }
        //else if (i1 == 3)
        else if (i1 == 2)
        {
/*
            j1 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1);
            k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1);

            if (isBlockStairsID(j1) && (l & 4) == (k1 & 4))
            {
                l1 = k1 & 3;

                if (l1 == 1 && !this.func_82540_f(par1IBlockAccess, par2 + 1, par3, par4, l))
                {
                    f3 = 0.5F;
                    flag = false;
                }
                else if (l1 == 0 && !this.func_82540_f(par1IBlockAccess, par2 - 1, par3, par4, l))
                {
                    f2 = 0.5F;
                    flag = false;
                }
            }
*/
        }

        this.setBlockBounds(f2, f, f4, f3, f1, f5);


        /*
        if(l == 1)
        {
        	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
        }else if(l == 0)
        {
        	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
        }else
        {
        	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
        }
        */
        return flag;
    }

    private boolean func_82540_f(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return isBlockStairsID(i1) && par1IBlockAccess.getBlockMetadata(par2, par3, par4) == par5;
        //debug2
        //return true;
    }

    /**
     * Ray traces through the blocks collision from start vector to end vector returning a ray trace hit. Args: world,
     * x, y, z, startVec, endVec
     */
    public MovingObjectPosition collisionRayTrace(World par1World, int par2, int par3, int par4, Vec3 par5Vec3, Vec3 par6Vec3)
    {
        MovingObjectPosition[] amovingobjectposition = new MovingObjectPosition[8];

        DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1World.getBlockTileEntity(par2, par3, par4);

        //int l = par1World.getBlockMetadata(par2, par3, par4);
        int l = te.getHougakuData();
        int i1 = te.getMuki() == 0? l : 0;
        //int i1 = l & 3;
        boolean flag = te.getMuki() == 1;
        //boolean flag = (l & 4) == 4;
        int[] aint = field_72159_a[i1 + (flag ? 4 : 0)];
        this.field_72156_cr = true;
        int j1;
        int k1;
        int l1;

        for (int i2 = 0; i2 < 8; ++i2)
        {
            this.field_72160_cs = i2;
            int[] aint1 = aint;
            j1 = aint.length;

            for (k1 = 0; k1 < j1; ++k1)
            {
                l1 = aint1[k1];

                if (l1 == i2)
                {
                    ;
                }
            }

            amovingobjectposition[i2] = super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3, par6Vec3);
        }

        int[] aint2 = aint;
        int j2 = aint.length;

        for (j1 = 0; j1 < j2; ++j1)
        {
            k1 = aint2[j1];
            amovingobjectposition[k1] = null;
        }

        MovingObjectPosition movingobjectposition = null;
        double d0 = 0.0D;
        MovingObjectPosition[] amovingobjectposition1 = amovingobjectposition;
        l1 = amovingobjectposition.length;

        for (int k2 = 0; k2 < l1; ++k2)
        {
            MovingObjectPosition movingobjectposition1 = amovingobjectposition1[k2];

            if (movingobjectposition1 != null)
            {
                double d1 = movingobjectposition1.hitVec.squareDistanceTo(par6Vec3);

                if (d1 > d0)
                {
                    movingobjectposition = movingobjectposition1;
                    d0 = d1;
                }
            }
        }

        return movingobjectposition;
    }

    public static boolean isBlockStairsID(int par0)
    {
        return par0 > 0 && Block.blocksList[par0] instanceof DqmBlockModelStairDim;
    	//return true;
        //debug2
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer ep, int par6, float par7, float par8, float par9)
    {
    	DqmTileEntityStairDim te = (DqmTileEntityStairDim)par1World.getBlockTileEntity(par2, par3, par4);
    	if(te.getMuki() == 1)
    	{
    		//te.setMukiData(0, par1World);
    		te.muki = 0;
    	}else
    	{
    		//te.setMukiData(1, par1World);
    		te.muki = 1;
    	}
    	return true;
    }


    @SideOnly(Side.CLIENT)
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	for (int i = 0; i < DqmNextDim.DimName.length ; i++)
    	{
    		par3List.add(new ItemStack(par1, 1, i));
    		//this.setUnlocalizedName("DqmBlockStairsDim_" + i);
    	}
    }

    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[DqmNextDim.DimName.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            //this.iconArray[i] = par1IconRegister.registerIcon("WoodStairN_" + i);
        	this.iconArray[i] = par1IconRegister.registerIcon("WoodStairN");
        	//this.iconArray[i] = par1IconRegister.registerIcon("woodN_" + i);
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        //if (par2 < 0 || par2 >= this.iconArray.length)
        //{
        //    par2 = 0;
        //}
        return this.iconArray[par2];
    }
}
