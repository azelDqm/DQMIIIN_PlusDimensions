package DQMIIDim.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import DQMII.DqmTabNextBlock;
import DQMIIDim.DqmNextDim;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//public class dqb_BlockGrass extends Block
//public class DqmDimBlockGrass extends BlockGrass
public class DqmDimBlockGrass extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon iconGrassTop;
    @SideOnly(Side.CLIENT)
    private Icon iconGrassUnder;
    @SideOnly(Side.CLIENT)
    private Icon iconSnowSide;
    @SideOnly(Side.CLIENT)
    private Icon iconGrassSide;


    public DqmDimBlockGrass(int par1)
    {
        super(par1, Material.grass);
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.6F);
        this.setUnlocalizedName("DqmDimBlockGrasss_" + (par1 - DqmNextDim.cfgDimBlockID1G));
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        //return par1 == 1 ? this.iconGrassTop[par2] : (par1 == 0 ? this.getBlockTextureFromSide(par1) : this.blockIcon[par2]);
    	//return par1 == 1 ? this.iconGrassTop[par2] : (par1 == 0 ? this.getBlockTextureFromSide2(par1 ,par2) : this.blockIcon[par2]);
    	//return par1 == 1 ? this.iconGrassTop[par2] : this.blockIcon[par2];
    	return par1 == 0 ? this.iconGrassUnder : (par1 == 1 ? this.iconGrassTop : this.iconGrassSide);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
            	//int metadata = par1World.getBlockMetadata(par2, par3 , par4);
                par1World.setBlock(par2, par3, par4, this.blockID);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);
                    int m1 = par1World.getBlockMetadata(i1, j1, k1);

                    if (par1World.isAirBlock(i1, j1 + 1, k1) && par1World.getBlockId(i1, j1, k1) == DqmNextDim.cfgDimBlockID1G + (this.blockID - DqmNextDim.cfgDimBlockID1G) && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, this.blockID);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        //return Block.dirt.idDropped(0, par2Random, par3);
    	return this.blockID;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
    	if (par5 == 0)
        {
            return this.iconGrassUnder;
        }
        else if (par5 == 1)
        {
        	return this.iconGrassTop;
        }
        else
        {
            Material material = par1IBlockAccess.getBlockMaterial(par2, par3 + 1, par4);
            return material != Material.snow && material != Material.craftedSnow ? this.iconGrassSide : this.iconSnowSide;
            //return material != Material.snow && material != Material.craftedSnow ? this.blockIcon[metadata] : this.iconSnowSide[metadata];
        	//return this.iconGrassSide[metadata];
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconGrassSide = par1IconRegister.registerIcon("DqmDimBlockGrass_side_" + (this.blockID - DqmNextDim.cfgDimBlockID1G));
        this.iconGrassTop = par1IconRegister.registerIcon("DqmGrass_top");
        this.iconGrassUnder = par1IconRegister.registerIcon("DqmDimBlockDirt_" + (this.blockID - DqmNextDim.cfgDimBlockID1G));
        this.iconSnowSide = par1IconRegister.registerIcon("DqmDimBlockGrass_side_snow_" + (this.blockID - DqmNextDim.cfgDimBlockID1G));
        //this.iconGrassSideOverlay = par1IconRegister.registerIcon("dqm3modExt:grass_side_overlay");
        this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);
    }

    public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
    	return true;
    }
}
