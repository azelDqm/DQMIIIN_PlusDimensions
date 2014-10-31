package DQMIIDim.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import DQMII.DqmTabNextBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DqmDimStone extends Block
{
    public DqmDimStone(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(DqmTabNextBlock.DqmTabNBlock);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.cobblestone.blockID;
    }

    @Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("DqmDimStone");
    }
}
